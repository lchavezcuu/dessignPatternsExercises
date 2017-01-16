package builder;

/**
 * Created by luis on 8/01/17.
 */
public class Client {

    public static class ClientBuilder {

        private String name;
        private String email;
        private String pet;
        private int age;
        private boolean isHappy;

        public ClientBuilder Name(String name){
            this.name=name;
            return this;
        }

        public ClientBuilder Email(String email){
            this.email=email;
            return this;
        }

        public ClientBuilder pet(String pet){
            this.pet=pet;
            return this;
        }

        public ClientBuilder Age(int age){
            this.age=age;
            return this;
        }

        public ClientBuilder IsHappy(boolean isHappy){
            this.isHappy=isHappy;
            return this;
        }
    }

    private final String name;
    private final String email;
    private final String pet;
    private final int age;
    private final boolean isHappy;


    public Client(ClientBuilder clientBuilder){
        this.name=clientBuilder.name;
        this.email=clientBuilder.email;
        this.pet=clientBuilder.pet;
        this.age=clientBuilder.age;
        this.isHappy=clientBuilder.isHappy;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPet() {
        return pet;
    }

    public int getAge() {
        return age;
    }

    public boolean isHappy() {
        return isHappy;
    }

    @Override
    public String toString() {
        return "builder.Client{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", pet='" + pet + '\'' +
                ", age=" + age +
                ", isHappy=" + isHappy +
                '}';
    }
}
