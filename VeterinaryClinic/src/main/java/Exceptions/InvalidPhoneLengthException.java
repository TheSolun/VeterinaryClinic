package Exceptions;

/**
 *
 * @author mateu
 */
public class InvalidPhoneLengthException extends Exception {
    
    public InvalidPhoneLengthException(int expectedLength, String phone) {
        super("Invalid phone '"+phone+"'. It must have "+expectedLength+" chars, but it has "+phone.length()+" chars.");
    }
    
}
