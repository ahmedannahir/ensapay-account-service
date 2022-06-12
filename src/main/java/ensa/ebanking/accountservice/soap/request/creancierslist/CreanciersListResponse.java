//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.06.12 at 01:55:20 AM WEST 
//


package ensa.ebanking.accountservice.soap.request.creancierslist;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="creancier" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="creancierCategory" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="serviceProvider">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *                             &lt;element name="image" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="surname" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="phoneNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "creancier"
})
@XmlRootElement(name = "CreanciersListResponse")
public class CreanciersListResponse {

    protected List<CreanciersListResponse.Creancier> creancier;

    /**
     * Gets the value of the creancier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the creancier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCreancier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CreanciersListResponse.Creancier }
     * 
     * 
     */
    public List<CreanciersListResponse.Creancier> getCreancier() {
        if (creancier == null) {
            creancier = new ArrayList<CreanciersListResponse.Creancier>();
        }
        return this.creancier;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}long"/>
     *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="creancierCategory" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="serviceProvider">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}long"/>
     *                   &lt;element name="image" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="surname" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="phoneNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "code",
        "name",
        "creancierCategory",
        "serviceProvider"
    })
    public static class Creancier {

        protected long code;
        @XmlElement(required = true)
        protected String name;
        @XmlElement(required = true)
        protected String creancierCategory;
        @XmlElement(required = true)
        protected CreanciersListResponse.Creancier.ServiceProvider serviceProvider;

        /**
         * Gets the value of the code property.
         * 
         */
        public long getCode() {
            return code;
        }

        /**
         * Sets the value of the code property.
         * 
         */
        public void setCode(long value) {
            this.code = value;
        }

        /**
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getName() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setName(String value) {
            this.name = value;
        }

        /**
         * Gets the value of the creancierCategory property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCreancierCategory() {
            return creancierCategory;
        }

        /**
         * Sets the value of the creancierCategory property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCreancierCategory(String value) {
            this.creancierCategory = value;
        }

        /**
         * Gets the value of the serviceProvider property.
         * 
         * @return
         *     possible object is
         *     {@link CreanciersListResponse.Creancier.ServiceProvider }
         *     
         */
        public CreanciersListResponse.Creancier.ServiceProvider getServiceProvider() {
            return serviceProvider;
        }

        /**
         * Sets the value of the serviceProvider property.
         * 
         * @param value
         *     allowed object is
         *     {@link CreanciersListResponse.Creancier.ServiceProvider }
         *     
         */
        public void setServiceProvider(CreanciersListResponse.Creancier.ServiceProvider value) {
            this.serviceProvider = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}long"/>
         *         &lt;element name="image" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="surname" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="phoneNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "code",
            "image",
            "name",
            "surname",
            "phoneNumber"
        })
        public static class ServiceProvider {

            protected long code;
            @XmlElement(required = true)
            protected String image;
            @XmlElement(required = true)
            protected String name;
            @XmlElement(required = true)
            protected String surname;
            @XmlElement(required = true)
            protected String phoneNumber;

            /**
             * Gets the value of the code property.
             * 
             */
            public long getCode() {
                return code;
            }

            /**
             * Sets the value of the code property.
             * 
             */
            public void setCode(long value) {
                this.code = value;
            }

            /**
             * Gets the value of the image property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getImage() {
                return image;
            }

            /**
             * Sets the value of the image property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setImage(String value) {
                this.image = value;
            }

            /**
             * Gets the value of the name property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getName() {
                return name;
            }

            /**
             * Sets the value of the name property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setName(String value) {
                this.name = value;
            }

            /**
             * Gets the value of the surname property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSurname() {
                return surname;
            }

            /**
             * Sets the value of the surname property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSurname(String value) {
                this.surname = value;
            }

            /**
             * Gets the value of the phoneNumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPhoneNumber() {
                return phoneNumber;
            }

            /**
             * Sets the value of the phoneNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPhoneNumber(String value) {
                this.phoneNumber = value;
            }

        }

    }

}
