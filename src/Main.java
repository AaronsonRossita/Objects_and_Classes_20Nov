import javax.swing.plaf.basic.BasicTabbedPaneUI;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int[] numbers = {-7,-5,-3,-2,0,10,12,13,15,16,18,19,20,25,26,29,30};

        Student student1 = new Student();
        Student student2 = new Student("Rossita",33);
        Student student3 = new Student("Hatool",9);
        //System.out.println(student2.name);

        Employee employee1 = new Employee(1,"Rossita","@1",true);
        Employee employee2 = new Employee(2,"Hatool","@2",false);
        //employee2.printName();

        //System.out.println(employee1);
        //System.out.println(employee2);

        Student student4 = new Student("A",2);

//        recursion(5);
//        int x = 5;
//        while (x < 6){
//            System.out.println(x);
//            x -= 1;
//        }
//        System.out.println(findX(99,numbers));
//        System.out.println(findXBinary(67,numbers,0, numbers.length-1));
//        findXBinaryPrint(16,numbers,0,numbers.length-1);
//        System.out.println(blanket(67, numbers));

        Helper helper = new Helper();
        //System.out.println(Helper.google);
        //Helper.printSomething();
        double random = Math.random();
        Date date = new Date();

        System.out.println(date.getTime());

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
        for (int i = base; i > 0; i--) {
            for (int j = i; j > 0 ; j--) {
                System.out.print(" ");
            }
            for (int j = -1; j < base - i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void printXmasTree(int size, int base){
        for (int i = 0; i < size; i++) {
            printRightTriangle(base);
        }
    }

    public static void recursion(int x){
        System.out.println(x);
        recursion(x - 1);
    }

    public static boolean findX(int x, int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x){
                return true;
            }
        }
        return false;
    }

    public static boolean blanket(int x, int[] arr){
        return findXBinary(x, arr, 0, arr.length-1);
    }

    public static boolean findXBinary(int x, int[] arr, int start, int end){
        System.out.println("i'm running");
        if (start > end){
            return false;
        }
        int middle = start + (end - start)/2;
        if (arr[middle] == x){
            return true;
        }else if(arr[middle] < x){
            return findXBinary(x, arr, middle + 1, end);
        }else{
            return findXBinary(x, arr, start, middle - 1);
        }
    }

    public static void findXBinaryPrint(int x, int[] arr, int start, int end){
        if (start > end || start < 0 || end > arr.length-1){
            System.out.println("didn't find it");
        }else{
            int middle = start + (end - start)/2;
            System.out.println("the middle now is " + middle);
            if (arr[middle] == x){
                System.out.println("found it, the index is " + middle);
            }else if(arr[middle] > x){
                findXBinaryPrint(x, arr, start, middle - 1);
            }else{
                findXBinaryPrint(x, arr, middle + 1, end);
            }
        }
    }

}
