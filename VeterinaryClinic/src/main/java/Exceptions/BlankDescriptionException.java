package Exceptions;

/**
 *
 * @author mateu
 */
public class BlankDescriptionException extends Exception{
    
    public BlankDescriptionException(String description){
        super("Invalid description '"+description+"'. It must not be blank.");
    }
    
}
