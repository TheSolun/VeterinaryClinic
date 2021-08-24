package Models;

import Exceptions.BlankNameException;
import Exceptions.InvalidBirthYearException;
import Exceptions.NotPositiveAgeException;
import Exceptions.NotPositiveIdException;
import java.util.Calendar;
import java.util.Locale;

/**
 *
 * @author mateu
 */
public class Animal {
    
    private Integer id = null;
    private String name;
    private String birthYear;
    private Gender gender;
    private Client owner;
    private Species species;

    public Animal(int id, String name, String birthYear, Gender gender, Client owner, Species species) throws NotPositiveIdException, BlankNameException, InvalidBirthYearException {
        this.setId(id);
        this.setName(name);
        this.setBirthYear(birthYear);
        this.gender = gender;
        this.owner = owner;
        this.species = species;
    }
    
    public Animal(String name, String birthYear, Gender gender, Client owner, Species species) throws BlankNameException, InvalidBirthYearException {
        this.setName(name);
        this.setBirthYear(birthYear);
        this.gender = gender;
        this.owner = owner;
        this.species = species;
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

    public String getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(String birthYear) throws InvalidBirthYearException {
        try {
            int intBirthYear = Integer.parseInt(birthYear);
            if(intBirthYear > Calendar.getInstance().get(Calendar.YEAR) || intBirthYear < 1000)
                throw new InvalidBirthYearException(birthYear);
        } catch (NumberFormatException ex){
            throw new InvalidBirthYearException(birthYear);
        }
        this.birthYear = birthYear;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Client getOwner() {
        return owner;
    }

    public void setOwner(Client owner) {
        this.owner = owner;
    }

    public Species getSpecies() {
        return species;
    }

    public void setSpecies(Species species) {
        this.species = species;
    }

    @Override
    public String toString() {
        return "Animal{" + "id=" + id + ", name=" + name + ", birthYear=" + birthYear + ", gender=" + gender + ", owner=" + owner + ", species=" + species + '}';
    }
    
}
