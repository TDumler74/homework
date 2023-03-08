
public class Voter {

    private String name;
    private String address;
    int age;

    public Voter(String name, String address, int age) {
        this.name = name;
        this.address = address;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        if (address != address) {
            System.out.println("Welcome!");
            this.address = address;
        } else {
            System.out.println("Sorry, you are in wrong voter district!");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age <= 16) {
            this.age = age;
            System.out.println("The voter is to young!");
        } else {
            System.out.println("Welcome!");
        }
    }

    void reaction() {
        System.out.println("You have to leave.");
        System.out.println(name + ": Ok, buy.");
    }
}
