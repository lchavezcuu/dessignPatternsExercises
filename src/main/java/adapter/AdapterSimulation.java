package adapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by luis on 9/01/17.
 */
public class AdapterSimulation {

    public static void main(String[] args) {

        List<Employee> myList=new ArrayList<Employee>();

        Employee employee= new Employee(1,"Alonso", "Chavez", "Parral");
        EmployeeFromOtherSource employeeFromOtherSource= new EmployeeFromOtherSource(4, "Marcos", "Escudero", "Chihuahua");

        myList.add(employee);
        //Here we are adapting an distinct employee to an Employee object
        myList.add(new AdapterToEmployee(employeeFromOtherSource));
        System.out.println(myList);


    }
}
