import java.util.Scanner;
class student {
    String name;
    int age;
    String major;
    void displayinfo(){
        System.out.println("name"+name);
        System.out.println("age"+age);
        System.out.println("major"+major);
    }
}
public class main2{
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        student s1=new student();
        System.out.print("enter name 1");
        s1.name=input.nextLine();
        System.out.print("enter age 1");
        s1.age=input.nextInt();
        System.out.print("enter major 1");
        s1.major=input.nextLine();
        student s2=new student();
        System.out.print("enter name 2");
        s2.name=input.nextLine();
        System.out.print("enter age 2");
        s2.age=input.nextInt();
        System.out.print("enter major 2");
        s2.major=input.nextLine();
        s1.displayinfo();
        s2.displayinfo();
    }
}