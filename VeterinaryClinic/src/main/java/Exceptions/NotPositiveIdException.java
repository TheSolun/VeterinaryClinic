package Exceptions;

/**
 *
 * @author mateu
 */
public class NotPositiveIdException extends Exception {

    public NotPositiveIdException(int id){
        super("Invalid id '"+id+"'. It must be a positive number.");
    }
    
}
