package Models;

import java.util.Arrays;

/**
 *
 * @author mateu
 */
public class Client {
    
    private int id;
    private String name;
    private String address;
    private String telephone;
    private String zipCode;
    private String email;

    public Client(int id, String name, String address, String telephone, String zipCode, String email) throws Exception {
        this.setId(id);
        this.setName(name);
        this.setAddress(address);
        this.setTelephone(telephone);
        this.setZipCode(zipCode);
        this.setEmail(email);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) throws Exception {
        if(id < 0)
            throw new Exception("Invalid id '" + id + "'. It must be a positive number");
        this.id = id;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) throws Exception {
        if(name.isBlank())
            throw new Exception("Invalid name '" + name + "'. It must not be blank.");
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) throws Exception {
        if(address.isBlank())
            throw new Exception("Invalid address '" + address + "'. It must not be blank.");
        this.address = address;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) throws Exception {
        if (telephone.length() != 11)
            throw new Exception("Invalid telephone '" + telephone + "'. It must have 11 chars, but it has " + telephone.length() + " chars.");
        try {
            Long.parseLong(telephone);
            if(telephone.contains("-"))
                throw new Exception();
        } catch (Exception ex) {
            throw new Exception("Invalid telephone '" + telephone + "'. It must have only numbers");
        }
        this.telephone = telephone;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) throws Exception {
        if(zipCode.length() != 8)
            throw new Exception("Invalid zip code '" + zipCode + "'. It must have 8 chars.");
        try {
            Long.parseLong(zipCode);
            if(zipCode.contains("-"))
                throw new Exception();
        } catch (Exception ex) {
            throw new Exception("Invalid zip code '" + zipCode + "'. It must have only numbers");
        }
        this.zipCode = zipCode;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) throws Exception {
        String emailLocalPart = email.substring(0, email.lastIndexOf("@"));
        if(Arrays.stream(new String[]{"\"","(",")",",",":",";","<",">","@","[","\\","]"}).parallel().anyMatch(emailLocalPart::contains))
            throw new Exception("Invalid email '" + email + "'. It must not have any of the '\"(),:;<>@[\\]' characters in its local part");
        this.email = email;
    }
    
}
