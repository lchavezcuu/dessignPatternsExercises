package adapter;

/**
 * Created by luis on 10/01/17.
 */
public class Employee implements IEmploye {

    private int idUser;
    private String name;
    private String lastName;
    private String city;

    public Employee(int idUser, String name, String lastName, String city) {
        this.idUser = idUser;
        this.name = name;
        this.lastName = lastName;
        this.city = city;
    }

    public int GetId() {
        return idUser;
    }

    public String GetName() {
        return name;
    }

    public String GetLastName() {
        return lastName;
    }

    public String GetCity() {
        return city;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "idUser=" + idUser +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
