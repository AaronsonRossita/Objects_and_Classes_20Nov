public class Course {

    String name;
    int size;
    private Student[] list;
    private int counter;

    public Course(String name, int size) {
        this.name = name;
        this.size = size;
        list = new Student[size];
        counter = 0;
    }

    public void register(Student s){
        if(counter < size){
            list[counter] = s;
            System.out.println("Congrats " + s.getName() + ", you have successfully registered");
            counter++;
        }else{
            System.out.println("Sorry the course is full");
        }
    }

    public void printStudentList(){
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i].getId() + " " + list[i].getName());
        }
    }


}
