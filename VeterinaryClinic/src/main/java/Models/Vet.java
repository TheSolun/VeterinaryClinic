package Models;

import Exceptions.BlankAddressException;
import Exceptions.BlankNameException;
import Exceptions.InvalidPhoneLengthException;
import Exceptions.NotPositiveIdException;
import Exceptions.PhoneNotOnlyWithNumbersException;

/**
 *
 * @author mateu
 */
public class Vet {
    
    private Integer id = null;
    private String name;
    private String address;
    private String phone;

    public Vet(int id, String name, String address, String phone) throws NotPositiveIdException, BlankNameException, BlankAddressException, InvalidPhoneLengthException, PhoneNotOnlyWithNumbersException {
        this.setId(id);
        this.setName(name);
        this.setAddress(address);
        this.setPhone(phone);
    }
    
    public Vet(String name, String address, String phone) throws BlankNameException, BlankAddressException, InvalidPhoneLengthException, PhoneNotOnlyWithNumbersException {
        this.setName(name);
        this.setAddress(address);
        this.setPhone(phone);
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
    
}
