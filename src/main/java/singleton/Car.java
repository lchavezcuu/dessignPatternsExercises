package singleton; /**
 * Created by luis on 10/01/17.
 */
public class Car {

    private Car instance;

    private Car(){}

    public Car getInstance(){
        if(instance == null){
            return instance=new Car();

        }
        return instance;
    }
}
