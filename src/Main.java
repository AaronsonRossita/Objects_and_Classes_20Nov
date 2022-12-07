import java.io.File;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    static String name = "Rossita";
    static Scanner scanner;

    public static void main(String[] args){

        scanner = new Scanner(System.in);
//        String answer = scanner.nextLine();
//        scanner = new Scanner(new File(""));

        int[] numbers = {-7,-5,-3,-2,0,10,12,13,15,16,18,19,20,25,26,29,30};
        String s = "  \" \\ \n ";

        //System.out.println(name);

        Person person1 = new Person();
        Person person2 = new Person("Rossita",33);
        Person person3 = new Person("Hatool",9);
        //System.out.println(student2.name);
//        System.out.println(person1.getAge());
        person1.setAge(-1);

        Employee employee1 = new Employee(1,"Rossita","@1",true);
        Employee employee2 = new Employee(2,"Hatool","@2",false);
        //employee2.printName();
        employee2.phone = "78798";
        employee1.newMethod();
        employee2.newMethod();

        Fruit banana = new Fruit();

        Student student1 = new Student(1,"Adi","Bushari",30,true);
//        student1.printId();
//        student1.printAge();
//        student1.printLastname();
//        student1.printName();
//        student1.printIfEnrolled();
//
//        student1.printStudent();

        //System.out.println(employee1);
        //System.out.println(employee2);

        Person person4 = new Person("A",2);

//        recursion(5);
//        int x = 5;
//        while (x < 6){
//            System.out.println(x);
//            x--;
//        }
//        System.out.println(findX(99,numbers));
//        System.out.println(findXBinary(67,numbers,0, numbers.length-1));
//        findXBinaryPrint(16,numbers,0,numbers.length-1);
//        System.out.println(blanket(67, numbers));

        Helper helper = new Helper();
        //System.out.println(Helper.google);
        //Helper.printSomething();
        double random = Math.random();

//        multRecursion(2,7);

        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        LocalDateTime localDateTime = LocalDateTime.now();
        //System.out.println(localDateTime);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy HH:mm.ms");
        // day = dd
        // month = MM or MMM
        // year = yy or yyyy
        // hour = HH
        // minutes = mm
        // seconds = ss
        // miliseconds = ms
        String date = localDateTime.format(formatter);
        //System.out.println(date);

        //continueFunc();
//
//        System.out.println(Helper.defaultInt);
//        System.out.println(Helper.protectedInt);
//        System.out.println(Helper.publicInt);
//        System.out.println(Helper.privateInt);

//        try{
//            System.out.println(numbers[68]);
//        }catch (Exception e){
//            System.out.println("index is wrong");
//        }


//        try{
//            int index = scanner.nextInt();
//            System.out.println(numbers[index]);
//        }catch (Exception e){
//            System.out.println(e);
//        }
        int index = 0;

//        try{
//            index = scanner.nextInt();
//            System.out.println(numbers[index]);
//        }catch (ArrayIndexOutOfBoundsException e){
//            System.out.println("index out of bounds");
//        }catch (InputMismatchException e){
//            System.out.println("mismatch");
//        }catch (Exception e){
//            System.out.println("something else");
//        }finally {
//            System.out.println("finally");
//        }

//        System.out.println(index);

        String stam = null;
        if (stam == null){
            System.out.println("empty string");
        }else{
            System.out.println(stam.charAt(5));
        }


//        try{
//            index = scanner.nextInt();
//            System.out.println(numbers[index]);
//        }catch (Exception e){
//            throw new RuntimeException("this code is wrong");
//        }

        //System.out.println(stam.charAt(8));


//        try {
//            exceptionMethod(78,0);
//        } catch (Exception e) {
//
//        }

        try {
            salary("ttt");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }

    public static void breakFunc(){
        for (int i = 0; i < 10; i++) {
            if (i == 5){
                break;
            }
            System.out.println("i = " + i);
        }
        System.out.println("hello");
    }

    public static void continueFunc(){
        for (int i = 0; i < 10; i++) {
            if (i == 5){
                continue;
            }
            System.out.println("i = " + i);
        }
        System.out.println("hello");
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

    public static void printXmasTreeDif(int size, int base){
        for (int i = size; i > 0; i--) {
            for (int j = base; j > 0; j--) {
                for (int k = j; k > 0; k--) {
                    System.out.print(" ");
                }
                for (int k = 0; k < i+1; k++) {
                    System.out.print(" ");
                }
                for (int k = -1; k < base - j; k++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
            base++;
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

    public static int multRecursion(int a, int b){
        System.out.println("this time a = " + a);
        if (a == b){
            return b;
        }else{
            return a * multRecursion(a + 1, b);
        }

    }

    public static void exceptionMethod(int a, int b) throws Exception{
        try{
            System.out.println(a/b);
        }catch (Exception e){
            throw new Exception("something wrong");
        }
    }

    public static void salary(String jobName) throws Exception{
        switch (jobName.toLowerCase()){
            case "fullstack":
                System.out.println(22000);
                break;
            case "backend":
                System.out.println(20000);
                break;
            case "frontend":
                System.out.println(18000);
                break;
            default:
                throw new RuntimeException("job not found");
        }
    }

}
