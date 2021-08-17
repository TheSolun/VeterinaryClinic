package Models;

import Exceptions.BlankDescriptionException;
import Exceptions.NotPositiveIdException;

/**
 *
 * @author mateu
 */
public class Exam {
   
    private Integer id = null;
    private String description;
    private Consultation consultation;

    public Exam(int id, String description, Consultation consultation) throws NotPositiveIdException, BlankDescriptionException {
        this.setId(id);
        this.setDescription(description);
        this.consultation = consultation;
    }
    
    public Exam(String description, Consultation consultation) throws BlankDescriptionException {
        this.setDescription(description);
        this.consultation = consultation;
    }
    
    public int getId() {
        return id;
    }

    private void setId(int id) throws NotPositiveIdException {
        if(id < 0)
            throw new NotPositiveIdException(id);
        this.id = id;
    }
    
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) throws BlankDescriptionException {
        if(description.isBlank())
            throw new BlankDescriptionException(description);
        this.description = description;
    }

    public Consultation getConsultation() {
        return consultation;
    }

    public void setConsultation(Consultation consultation) {
        this.consultation = consultation;
    }
    
}
