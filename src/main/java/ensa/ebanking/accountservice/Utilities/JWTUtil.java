package ensa.ebanking.accountservice.Utilities;

public class JWTUtil {
    public static final String SECRET = "secret";
    public static final String AUTH_HEADER = "Authorization";
    public static final String PREFIX = "Bearer ";
    public static final long EXPIRATION_ACCESS_TOKEN = 60 * 60 * 1000;
    public static final long EXPIRATION_REFRESH_TOKEN = 120 * 60 * 1000;

}
