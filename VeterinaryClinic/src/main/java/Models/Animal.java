package Models;

/**
 *
 * @author mateu
 */
public class Animal {
    
    private int id;
    private String name;
    private int age;
    private Gender gender;
    private Client owner;

    public Animal(int id, String name, int age, Gender gender, Client owner) throws Exception {
        this.setId(id);
        this.setName(name);
        this.setAge(age);
        this.gender = gender;
        this.owner = owner;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) throws Exception {
        if(id < 0)
            throw new Exception("Invalid id '" + id + "'. It must be a positive number");
        this.id = id;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) throws Exception {
        if(name.isBlank())
            throw new Exception("Invalid name '" + name + "'. It must not be blank.");
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws Exception {
        if(age < 0)
            throw new Exception("Invalid age '" + age + "'. Is must be a positive number.");
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
    
}
