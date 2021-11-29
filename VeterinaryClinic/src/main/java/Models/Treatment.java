package Models;

import Exceptions.BlankNameException;
import Exceptions.NotPositiveIdException;
import Exceptions.StartAndEndDatesNotInChronologicalOrderException;
import java.time.LocalDate;

/**
 *
 * @author mateu
 */
public class Treatment {

    private Integer id = null;
    private String name;
    private LocalDate endDay;
    private LocalDate startDay;
    private boolean finished;
    private Animal animal;

    public Treatment(int id, String name, LocalDate startDay, LocalDate endDay, Animal animal) throws NotPositiveIdException, StartAndEndDatesNotInChronologicalOrderException, BlankNameException {
        this.setId(id);
        this.setName(name);
        this.setStartDay(startDay);
        this.setEndDay(endDay);
        this.animal = animal;
    }
    
    public Treatment(String name, LocalDate startDay, LocalDate endDay, Animal animal) throws StartAndEndDatesNotInChronologicalOrderException, BlankNameException {
        this.setName(name);
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
    
    public String getName() {
        return name;
    }

    public void setName(String name) throws BlankNameException {
        if(name.isBlank())
            throw new BlankNameException(name);
        this.name = name;
    }
    
    public LocalDate getEndDay() {
        return endDay;
    }

    public void setEndDay(LocalDate endDay) throws StartAndEndDatesNotInChronologicalOrderException {
        if(this.startDay != null)
            if(endDay.isBefore(this.startDay))
                throw new StartAndEndDatesNotInChronologicalOrderException(this.startDay, endDay);
        this.endDay = endDay;
        this.setFinished();
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
    
    public boolean isFinished(){
        return this.finished;
    }
    
    private void setFinished() {
        this.finished = !(this.endDay.isAfter(LocalDate.now()));
    }

    @Override
    public String toString() {
        return "Treatment{" + "id=" + id + ", name=" + name + ", endDay=" + endDay + ", startDay=" + startDay + ", finished=" + finished + ", animal=" + animal + '}';
    }
    
}
