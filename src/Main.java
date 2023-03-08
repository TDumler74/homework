public class Main {
    public static void main(String[] args) {
        Voter person1= new Voter("John", "Berlin",21);
        System.out.println(person1.getName()+" "+person1.getAddress()+" "+person1.getAge());
        System.out.println();


        Voter person2= new Voter("Phil","Dresden",15);
        System.out.println(person2.getName()+" "+person2.getAddress()+ " " +person2.getAge());
        person2.setAge(15);
        person2.reaction();
        System.out.println();



        Voter person3= new Voter("Jane","Berlin",50);
        System.out.println(person3.getName()+" "+person3.getAddress()+" "+person3.getAge());

        person3.setAddress("Dresden");//  another city
        person3.reaction();



    }
}