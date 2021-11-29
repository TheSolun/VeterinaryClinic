package Models;

import Exceptions.NotPositiveIdException;
import java.time.LocalDateTime;

/**
 *
 * @author mateu
 */
public class Consultation {

    private Integer id = null;
    private LocalDateTime dateTime;
    private String comment;
    private boolean finished;
    private Treatment treatment;
    private Vet vet;

    public Consultation(int id, LocalDateTime dateTime, String comment, Treatment treatment, Vet vet) throws NotPositiveIdException {
        this.setId(id);
        this.dateTime = dateTime;
        this.comment = comment;
        this.treatment = treatment;
        this.vet = vet;
    }
    
    public Consultation(LocalDateTime dateTime, String comment, Treatment treatment, Vet vet) {
        this.dateTime = dateTime;
        this.comment = comment;
        this.treatment = treatment;
        this.vet = vet;
    }

    public Integer getId() {
        return id;
    }

    private void setId(Integer id) throws NotPositiveIdException {
        if(id < 0)
            throw new NotPositiveIdException(id);
        this.id = id;
    }

    public LocalDateTime getDateTime(){
        return dateTime;
    }
    
    public void setDateTime(LocalDateTime dateTime){
        this.dateTime = dateTime;
        this.setFinished();
    }
    
    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
    
    public Treatment getTreatment() {
        return treatment;
    }

    public void setTreatment(Treatment treatment) {
        this.treatment = treatment;
    }

    public Vet getVet() {
        return vet;
    }

    public void setVet(Vet vet) {
        this.vet = vet;
    }
    
    public boolean isFinished(){
        return finished;
    }
    
    private void setFinished() {
        this.finished = LocalDateTime.now().compareTo(this.dateTime) > 0;
    }

    @Override
    public String toString() {
        return "Consultation{" + "id=" + id + ", dateTime=" + dateTime + ", comment=" + comment + ", finished=" + finished + ", treatment=" + treatment + ", vet=" + vet + '}';
    }
    
}
