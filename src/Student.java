public class Student {

    private int id ;
    private String name;
    private String lastname;
    private int age;
    private boolean enrolled;

    private static int counter = 1;

    public Student(){

    }

    public Student(String name){
        this.id = counter++;
        this.name = name;
    }

    public Student(int id, String name, String lastname, int age, boolean enrolled) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        if (age <= 0){
            this.age = 1;
        }else{
            this.age = age;
        }

        this.enrolled = enrolled;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == ""){
            System.out.println("name not updated");
        }else{
            this.name = name;
        }

    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isEnrolled() {
        return enrolled;
    }

    public void setEnrolled(boolean enrolled) {
        this.enrolled = enrolled;
    }

    public void printId(){
        System.out.println("This student's id is " + id);
    }

    public void printName(){
        System.out.println("This student's name is " + name);
    }

    public void printLastname(){
        System.out.println("This student's lastname is " + lastname);
    }

    public void printAge(){
        System.out.println("This student's age is " + age);
    }

    public void printIfEnrolled(){
        if (enrolled){
            System.out.println("This student is enrolled");
        }else{
            System.out.println("This students is not enrolled");
        }
    }

    public void printStudent(){
        System.out.println("This student's name is " + name + " " + lastname
                + ", they are " + age + " years old");
    }

    @Override
    public String toString() {
        return super.toString() + " This student's name is " + name + " " + lastname
                + ", they are " + age + " years old";
    }
}
