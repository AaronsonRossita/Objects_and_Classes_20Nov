public class Student {

    int id;
    String name;
    String lastname;
    int age;
    boolean enrolled;

    public Student(){

    }

    public Student(int id, String name, String lastname, int age, boolean enrolled) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.age = age;
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
}
