package Models;

import Exceptions.BlankNameException;
import Exceptions.NotPositiveAgeException;
import Exceptions.NotPositiveIdException;

/**
 *
 * @author mateu
 */
public class Animal {
    
    private Integer id = null;
    private String name;
    private int age;
    private Gender gender;
    private Client owner;
    private Species species;

    public Animal(int id, String name, int age, Gender gender, Client owner, Species species) throws NotPositiveIdException, BlankNameException, NotPositiveAgeException {
        this.setId(id);
        this.setName(name);
        this.setAge(age);
        this.gender = gender;
        this.owner = owner;
        this.species = species;
    }
    
    public Animal(String name, int age, Gender gender, Client owner) throws BlankNameException, NotPositiveAgeException {
        this.setName(name);
        this.setAge(age);
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws NotPositiveAgeException {
        if(age < 0)
            throw new NotPositiveAgeException(age);
        this.age = age;
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
    
}
