package Exceptions;

/**
 *
 * @author mateu
 */
public class BlankNameException extends Exception{
    
    public BlankNameException(String name){
        super("Invalid name '"+name+"'. It must not be blank.");
    }
    
}
