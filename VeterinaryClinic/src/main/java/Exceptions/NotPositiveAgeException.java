package Exceptions;

/**
 *
 * @author mateu
 */
public class NotPositiveAgeException extends Exception {

    public NotPositiveAgeException(int age){
        super("Invalid age '"+age+"'. It must be a positive number.");
    }
    
}
