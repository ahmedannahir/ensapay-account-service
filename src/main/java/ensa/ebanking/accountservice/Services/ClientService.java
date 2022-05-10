package ensa.ebanking.accountservice.Services;

import ensa.ebanking.accountservice.DAO.ClientProfileDAO;
import ensa.ebanking.accountservice.DAO.UserDAO;
import ensa.ebanking.accountservice.DTO.ClientProfileDTO;
import ensa.ebanking.accountservice.Entities.ClientProfile;
import ensa.ebanking.accountservice.Entities.User;
import ensa.ebanking.accountservice.Utilities.JWTUtil;
import net.bytebuddy.utility.RandomString;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.security.Principal;

import static org.springframework.http.HttpStatus.FORBIDDEN;

@Service
public class ClientService {
    private ClientProfileDAO profileDAO;
    private UserDAO userDAO;
    private EmailSenderService emailSenderService;
    private final PasswordEncoder passwordEncoder;

    public ClientService(PasswordEncoder passwordEncoder, EmailSenderService emailSenderService) {
        this.passwordEncoder = passwordEncoder;
        this.emailSenderService = emailSenderService;
    }

    @Autowired
    public void setProfileDAO(ClientProfileDAO profileDAO) {
        this.profileDAO = profileDAO;
    }

    @Autowired
    public void setClientDAO(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    public void registerClient(ClientProfileDTO cpdto) {
        String generatedPassword = RandomString.make(10);
        String encodedPassword = this.passwordEncoder.encode(generatedPassword);
        System.out.println("Client password: " + generatedPassword);
            JSONObject email = this.emailSenderService.parseJsonFile("EmailDictionary.json");
            this.emailSenderService.sendEmail(cpdto.getEmail(),
                    email.getJSONObject("subject").getString("creation"),
                    email.getJSONObject("body").getString("creation") + generatedPassword);
        ClientProfile clientProfile = new ClientProfile(cpdto.getProductType(), cpdto.getName(), cpdto.getSurname(), cpdto.getEmail());
        User client = new User(cpdto.getPhone(), encodedPassword, clientProfile, true);

        profileDAO.save(clientProfile);
        userDAO.save(client);
    }

    public User getClient(String phoneNumber) {
        return userDAO.findByPhoneNumber(phoneNumber);
    }

    public void changePassword(String json, String phoneNumber) {
            User user = userDAO.findByPhoneNumber(phoneNumber);
            String password = (String) new JSONObject(json).get("password");
            user.setPassword(this.passwordEncoder.encode(password));
            if (user.isFirstLogin()) user.setFirstLogin(false);
            userDAO.save(user);
    }

}
