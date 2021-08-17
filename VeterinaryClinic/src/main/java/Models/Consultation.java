package Models;

import Exceptions.NotPositiveIdException;
import java.time.LocalDate;

/**
 *
 * @author mateu
 */
public class Consultation {

    private Integer id = null;
    private LocalDate date;
    private String historic;
    private Treatment treatment;
    private Vet vet;

    public Consultation(int id, LocalDate date, String historic, Treatment treatment, Vet vet) throws NotPositiveIdException {
        this.setId(id);
        this.date = date;
        this.historic = historic;
        this.treatment = treatment;
        this.vet = vet;
    }
    
    public Consultation(LocalDate date, String historic, Treatment treatment, Vet vet) {
        this.date = date;
        this.historic = historic;
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

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getHistoric() {
        return historic;
    }

    public void setHistoric(String historic) {
        this.historic = historic;
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
    
}
