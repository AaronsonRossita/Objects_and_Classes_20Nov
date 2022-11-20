import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Student student1 = new Student();
        Student student2 = new Student("Rossita",33);
        Student student3 = new Student("Hatool",9);
        //System.out.println(student2.name);

        Employee employee1 = new Employee(1,"Rossita","@1",true);
        Employee employee2 = new Employee(2,"Hatool","@2",false);
        //employee2.printName();

        System.out.println(employee1);
        System.out.println(employee2);
        //This employee's name is ____ and their email is _____



    }
    // overload
    public static void print(String s){
        System.out.println(s);
    }

    public static void print(int number){
        System.out.println(number);
    }

    public static void print(boolean x){
        System.out.println(x);
    }


    public static void printSymbol(int times, char symbol){
        for (int i = 0; i < times; i++) {
            System.out.print(symbol);
        }
    }

    public static void printSquare(int side, char symbol){
        for (int i = 0; i < side; i++) {
            for (int j = 0; j < side; j++) {
                System.out.print(symbol + " ");
            }
            System.out.println();
        }
    }

    public static void printEmptySquare(int side, char symbol){
        for (int i = 0; i < side; i++) {
            for (int j = 0; j < side; j++) {
                if (i == 0 || i == side - 1 || j == 0 || j == side -1){
                    System.out.print(" " + symbol);
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void printTriangle(int base){
        for (int i = 0; i < base; i++) {
            for (int j = -1; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    public static void printReverseTriangle(int base){
        for (int i = base; i >= 0; i--) {
            for (int j = i; j > 0 ; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void printRightTriangle(int base){
        for (int i = base; i >= 0; i--) {
            for (int j = i; j > 0 ; j--) {
                System.out.print(" ");
            }
            for (int j = -1; j < base - i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
