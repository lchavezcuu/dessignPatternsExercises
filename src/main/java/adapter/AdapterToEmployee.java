package adapter;

/**
 * Created by luis on 10/01/17.
 */
public class AdapterToEmployee extends Employee {

    public AdapterToEmployee(EmployeeFromOtherSource employee) {
        super(employee.getUniqueCode(), employee.getInitialName(), employee.getInitialLastName(), employee.getResidence());
    }
}
