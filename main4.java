import java.util.Scanner;
class rectangle {
    double length;
    double width;
    void setDimesions(double wid,double len){
        width = wid;
        length = len;
    }
    double getarea(){
        return length*width;
    }
    double getperimeter(){
        return 2*(length + width);
    }
}
public class main4{
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        rectangle rec=new rectangle();
        System.out.print("lenght");
        double len = input.nextDouble();
        System.out.print("width");
        double wid = input.nextDouble();
        rec.setDimesions(wid,len);
        System.out.println("area"+rec.getarea());
        System.out.println("perimeter"+rec.getperimeter());
        input.close();

    }
}