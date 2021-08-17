package Exceptions;

/**
 *
 * @author mateu
 */
public class InvalidZipCodeLengthException extends Exception {
    
    public InvalidZipCodeLengthException(int expectedLength, String zipCode) {
        super("Invalid zip code '"+zipCode+"'. It must have "+expectedLength+" chars, but it has "+zipCode.length()+" chars.");
    }
    
}
