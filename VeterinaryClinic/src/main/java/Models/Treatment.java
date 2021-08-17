package Models;

import Exceptions.NotPositiveIdException;
import Exceptions.StartAndEndDatesNotInChronologicalOrderException;
import java.time.LocalDate;

/**
 *
 * @author mateu
 */
public class Treatment {

    private Integer id = null;
    private LocalDate endDay;
    private LocalDate startDay;
    private Animal animal;

    public Treatment(int id, LocalDate startDay, LocalDate endDay, Animal animal) throws NotPositiveIdException, StartAndEndDatesNotInChronologicalOrderException {
        this.setId(id);
        this.setStartDay(startDay);
        this.setEndDay(endDay);
        this.animal = animal;
    }
    
    public Treatment(LocalDate startDay, LocalDate endDay, Animal animal) throws StartAndEndDatesNotInChronologicalOrderException {
        this.setStartDay(startDay);
        this.setEndDay(endDay);
        this.animal = animal;
    }

    public int getId() {
        return id;
    }

    private void setId(Integer id) throws NotPositiveIdException {
        if(id < 0)
            throw new NotPositiveIdException(id);
        this.id = id;
    }
    
    public LocalDate getEndDay() {
        return endDay;
    }

    public void setEndDay(LocalDate endDay) throws StartAndEndDatesNotInChronologicalOrderException {
        if(this.startDay != null)
            if(endDay.isBefore(this.startDay))
                throw new StartAndEndDatesNotInChronologicalOrderException(this.startDay, endDay);
        this.endDay = endDay;
    }

    public LocalDate getStartDay() {
        return startDay;
    }

    public void setStartDay(LocalDate startDay) throws StartAndEndDatesNotInChronologicalOrderException {
        if(this.endDay != null)
            if(startDay.isAfter(this.endDay))
                throw new StartAndEndDatesNotInChronologicalOrderException(startDay, this.endDay);
        this.startDay = startDay;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }
    
}
