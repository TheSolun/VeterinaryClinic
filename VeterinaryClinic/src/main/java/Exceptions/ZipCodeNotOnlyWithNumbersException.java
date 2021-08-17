package Exceptions;

/**
 *
 * @author mateu
 */
public class ZipCodeNotOnlyWithNumbersException extends Exception {
    
    public ZipCodeNotOnlyWithNumbersException(String zipCode) {
        super("Invalid zip code '" +zipCode+ "'. It must have only numbers");
    }
    
}
