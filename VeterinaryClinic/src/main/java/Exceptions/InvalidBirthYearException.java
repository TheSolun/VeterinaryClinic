package Exceptions;

/**
 *
 * @author mateu
 */
public class InvalidBirthYearException extends Exception {
    
    public InvalidBirthYearException(String birthYear) {
        super("Invalid birth year '" + birthYear + "'. It must be 4 characters long and cannot be greater than the current year.");
    }
    
}
