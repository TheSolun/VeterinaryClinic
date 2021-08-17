package Models;

import Exceptions.BlankNameException;
import Exceptions.NotPositiveIdException;

/**
 *
 * @author mateu
 */
public class Species {

    private Integer id = null;
    private String name;

    public Species(int id, String name) throws NotPositiveIdException, BlankNameException {
        this.setId(id);
        this.setName(name);
    }
    
    public Species(String name) throws BlankNameException {
        this.setName(name);
    }

    public Integer getId() {
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
    
}
