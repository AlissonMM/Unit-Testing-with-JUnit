import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Person {
    private String name;

    private LocalDateTime birthday;

    public Person(String name, LocalDateTime birthday){
        this.name = name;
        this.birthday = birthday;
    }

    public int getAge(){
        //ChronoUnit.YEARS.between is used to provide how many years the
        // subject is between two parameters
        return (int) ChronoUnit.YEARS.between(birthday, LocalDateTime.now());
    }

    public boolean isLegalAge(){
        return getAge() >=18;
    }
}
