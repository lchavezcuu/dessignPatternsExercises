package adapter;

/**
 * Created by luis on 10/01/17.
 */
public class EmployeeFromOtherSource {
    /*This class represent the same data as a normal Employee
     but it need to be adapted to work with an Employee object*/

    private int uniqueCode;
    private String initial_name;
    private String initial_lastName;
    private String residence;

    public EmployeeFromOtherSource(int uniqueCode, String initial_name, String initial_lastName, String residence) {
        this.uniqueCode = uniqueCode;
        this.initial_name = initial_name;
        this.initial_lastName = initial_lastName;
        this.residence = residence;
    }

    public int getUniqueCode() {
        return uniqueCode;
    }

    public String getInitialName() {
        return initial_name;
    }

    public String getInitialLastName() {
        return initial_lastName;
    }

    public String getResidence() {
        return residence;
    }
}
