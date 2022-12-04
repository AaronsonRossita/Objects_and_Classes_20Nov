public class Employee {

    int id;
    String name;
    String email;
    boolean currentlyWorking;

    public Employee(int id, String name, String email, boolean currentlyWorking) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.currentlyWorking = currentlyWorking;
    }

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Employee(String email, int id) {
        this.id = id;
        this.email = email;
    }

    public void printName(){
        System.out.println(name);
    }

    public void printEmail(){
        System.out.println("This employee's email is " + email);
    }

    @Override
    public String toString(){
        return "This employee's name is " + name + " and their email is " + email + " \n " + super.toString();
    }
}
