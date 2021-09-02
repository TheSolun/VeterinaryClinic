package Exceptions;

/**
 *
 * @author mateu
 */
public class InvalidFinishedIntValueException extends Exception {
    
    public InvalidFinishedIntValueException(int finishedValue) {
        super("Invalid finished int value '"+finishedValue+"'. It must be equals to '0' or '1'.");
    }
    
}
