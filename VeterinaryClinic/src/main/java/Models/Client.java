package Models;

import Exceptions.BlankAddressException;
import Exceptions.BlankNameException;
import Exceptions.EmailWithInvalidCharInItsLocalPartException;
import Exceptions.InvalidPhoneLengthException;
import Exceptions.InvalidZipCodeLengthException;
import Exceptions.NotPositiveIdException;
import Exceptions.PhoneNotOnlyWithNumbersException;
import Exceptions.ZipCodeNotOnlyWithNumbersException;
import java.util.Arrays;

/**
 *
 * @author mateu
 */
public class Client {
    
    private Integer id = null;
    private String name;
    private String address;
    private String phone;
    private String zipCode;
    private String email;

    public Client(int id, String name, String address, String telephone, String zipCode, String email) throws NotPositiveIdException, BlankNameException, BlankAddressException, InvalidPhoneLengthException, PhoneNotOnlyWithNumbersException, InvalidZipCodeLengthException, ZipCodeNotOnlyWithNumbersException, EmailWithInvalidCharInItsLocalPartException, EmailWithInvalidCharInItsLocalPartException {
        this.setId(id);
        this.setName(name);
        this.setAddress(address);
        this.setPhone(telephone);
        this.setZipCode(zipCode);
        this.setEmail(email);
    }
    
    public Client(String name, String address, String telephone, String zipCode, String email) throws BlankNameException, BlankAddressException, InvalidPhoneLengthException, PhoneNotOnlyWithNumbersException, InvalidZipCodeLengthException, ZipCodeNotOnlyWithNumbersException, EmailWithInvalidCharInItsLocalPartException, EmailWithInvalidCharInItsLocalPartException {
        this.setName(name);
        this.setAddress(address);
        this.setPhone(telephone);
        this.setZipCode(zipCode);
        this.setEmail(email);
    }

    public int getId() {
        return id;
    }

    private void setId(int id) throws NotPositiveIdException {
        if(id < 0)
            throw new NotPositiveIdException(id);
        this.id = id;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) throws BlankNameException {
        if(name.isBlank())
            throw new BlankNameException(name);
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) throws BlankAddressException {
        if(address.isBlank())
            throw new BlankAddressException(address);
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) throws InvalidPhoneLengthException, PhoneNotOnlyWithNumbersException {
        int expectedLength = 11;
        if (phone.length() != expectedLength)
            throw new InvalidPhoneLengthException(expectedLength, phone);
        try {
            Long.parseLong(phone);
            if(phone.contains("-"))
                throw new Exception();
        } catch (Exception ex) {
            throw new PhoneNotOnlyWithNumbersException(phone);
        }
        this.phone = phone;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) throws InvalidZipCodeLengthException, ZipCodeNotOnlyWithNumbersException {
        int expectedLength = 8;
        if(zipCode.length() != expectedLength)
            throw new InvalidZipCodeLengthException(expectedLength, zipCode);
        try {
            Long.parseLong(zipCode);
            if(zipCode.contains("-"))
                throw new Exception();
        } catch (Exception ex) {
            throw new ZipCodeNotOnlyWithNumbersException(zipCode);
        }
        this.zipCode = zipCode;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) throws EmailWithInvalidCharInItsLocalPartException {
        String emailLocalPart = email.substring(0, email.lastIndexOf("@"));
        String[] invalidChars = new String[] {"\"","(",")",",",":",";","<",">","@","[","\\","]"};
        if(Arrays.stream(invalidChars).parallel().anyMatch(emailLocalPart::contains)){
            String invalidCharsText = invalidChars.toString();
            throw new EmailWithInvalidCharInItsLocalPartException(email, invalidCharsText.substring(1, invalidCharsText.length()-2));
        }
        this.email = email;
    }
    
}
