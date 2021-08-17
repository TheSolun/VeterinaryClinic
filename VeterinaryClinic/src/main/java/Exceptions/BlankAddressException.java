package Exceptions;

/**
 *
 * @author mateu
 */
public class BlankAddressException extends Exception{
    
    public BlankAddressException(String address){
        super("Invalid address '"+address+"'. It must not be blank.");
    }
    
}
