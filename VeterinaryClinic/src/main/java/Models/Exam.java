package Models;

import Exceptions.BlankNameException;
import Exceptions.NotPositiveIdException;

/**
 *
 * @author mateu
 */
public class Exam {
   
    private Integer id = null;
    private String name;
    private Consultation consultation;

    public Exam(int id, String name, Consultation consultation) throws NotPositiveIdException, BlankNameException {
        this.setId(id);
        this.setName(name);
        this.consultation = consultation;
    }
    
    public Exam(String name, Consultation consultation) throws BlankNameException {
        this.setName(name);
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
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) throws BlankNameException {
        if(name.isBlank())
            throw new BlankNameException(name);
        this.name = name;
    }

    public Consultation getConsultation() {
        return consultation;
    }

    public void setConsultation(Consultation consultation) {
        this.consultation = consultation;
    }

    @Override
    public String toString() {
        return "Exam{" + "id=" + id + ", name=" + name + ", consultation=" + consultation + '}';
    }
    
}
