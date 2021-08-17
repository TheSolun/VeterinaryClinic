package Exceptions;

/**
 *
 * @author mateu
 */
public class PhoneNotOnlyWithNumbersException extends Exception {
    
    public PhoneNotOnlyWithNumbersException(String phone) {
        super("Invalid phone '" +phone+ "'. It must have only numbers");
    }
    
}
