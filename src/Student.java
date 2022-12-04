public class Student {

    private String name;
    private int age;

    public Student(){
        this.age = 1;
    }

    public Student(String name, int age) {
        this.name = name;
        if (age <= 0){
            this.age = 1;
        }else{
            this.age = age;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age <= 0){
            System.out.println("no way");
        }else{
            this.age = age;
        }
    }
}


