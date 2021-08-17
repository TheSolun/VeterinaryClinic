package Exceptions;

/**
 *
 * @author mateu
 */
public class EmailWithInvalidCharInItsLocalPartException extends Exception {
    
    public EmailWithInvalidCharInItsLocalPartException(String email, String invalidCharsText) {
        super("Invalid email '"+email+"'. It must not have any of the '"+invalidCharsText+"' characters in its local part");
    }
    
}
