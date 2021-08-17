package Exceptions;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author mateu
 */
public class StartAndEndDatesNotInChronologicalOrderException extends Exception {

    private final static DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy/MM/dd");
    
    public StartAndEndDatesNotInChronologicalOrderException(LocalDate startDate, LocalDate endDate) {
        super("Invalid start and end dates '"+dateFormat.format(startDate)+"' and '"+dateFormat.format(endDate)+"'. They are not in chronological order.");
    }
    
}
