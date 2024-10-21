//import org.w3c.dom.ls.LSOutput;
//
//public class Main{
//    public static void main(String[] args){
//        System.out.println("Hello World");
//    }
//}
//-------------------------------------------------
//public class Main{
//    public static void main(String[] args){
//        String name= "Aditya";
//        String name2= "Adi";
//        int age= 21;
//        String friend;
//        friend = name2;
//        System.out.println(name + name2);
//    }
//    }
//--------------------------------------------------
//Data Types
//1) primitive data types
//name    SPACE   RANGE
//byte    1       [-128 TTO 127]
//Short   2
//int     4
//long    8
//float   4
//double  8
//char    2
//boolean     1       true/false
//......................................................
//public class Main{
//    public static void main(String[] args){
//        byte age=30;
//        int phone = 1234567890;
//        long phone2= 12345678900L;
//        float pi=5.14F;
//        char letter= '@';
//        boolean isAdult= true;
//
//    }
//}
//......................................................
// Non- primitive data types
//public class Main{
//    public static void main(String[] args){
//        String name="Aditya Raina";
//        System.out.println(name.length());
//    }
//}
//.......................................................
// String operations
//public class Main{
//    public static void main(String[] args){
//        String name1= "Aditya";
//        String name2="Raina";
//        String name3= name1+ name2;
//        System.out.println(name3);
//        System.out.println(name3.charAt(0));
//        System.out.println(name3.length());
//        String name4= name1.replace('a', 'r');
//        System.out.println(name4);
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//        String naam = "Aditya Raina is the best";
//        System.out.println(naam.substring(0, 4));
//    }
//}
//strings are immutable, if changes are required you need to create a seperate variable
//public class Main {
//    public static void main(String[] args) {
//        int[] marks = new int[3];
//        marks[0] = 97;
//        marks[1] = 99;
//        marks[2] = 100;
//        System.out.println(marks[0]);
//    }
//}
//import java.util.Arrays;
//public class Main {
//    public static void main(String[] args) {
//        int[] marks = new int[3];
//        marks[0] = 97;
//        marks[1] = 99;
//        marks[2] = 100;
//        System.out.println(marks.length);
//        Arrays.sort(marks); //sort
//        System.out.println(marks[0]);
//    }
//}
// 2D ARRAYS.............................
//public class Main {
//    public static void main(String[] args) {
//        int[] marks = {99, 98, 99};
//        int[][] finalMarks= {{97,98,99},{98,99,90}};
//        System.out.println(finalMarks[0][0]);
//    }
//}
//...................CASTING....................
//IMPLICIT CASTING
//public class Main {
//    public static void main(String[] args){
//        double price=100.00;
//        double finalPrice= price + 19;
//        System.out.println(finalPrice);//Integer stores itself in double and is allowed by
//        // Java because double has eight bytes and integer has 4
//    }
//}
//EXPLICIT CASTING
//public class Main {
//    public static void main(String[] args) {
//        int price = 100;
//        int finalPrice = price + (int) 19.00;
//        System.out.println(finalPrice);
//    }
//}
//final- keyword used if constants needs to be defined and should not be changed in future
