package Models;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mateu
 */
public enum Gender {
    FEMALE,
    MALE;
    
    static public List<String> getValuesStringList() {
        List<String> values = new ArrayList<String>();
        for(Gender gender : Gender.values()) {
            values.add(gender.toString());
        }
        return values;
    }
}
