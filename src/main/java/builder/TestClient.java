package builder;

/**
 * Created by luis on 8/01/17.
 */
public class TestClient {

    public static void main(String[] args) {

        Client.ClientBuilder myClientBuilder=new Client.ClientBuilder();
        myClientBuilder.Name("hola").Age(14).IsHappy(false);
        Client myClient=new Client(myClientBuilder);
        System.out.println(myClient.toString());
    }
}
