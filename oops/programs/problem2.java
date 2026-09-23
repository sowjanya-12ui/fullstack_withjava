import java.util.Scanner;
public class problem2{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int marks=sc.nextInt();
        if(marks>=90&&marks<100){
            System.out.println("5 Star");
        }
        if(marks>=80&&marks<90){
            System.out.println("4 Star");
        }
        if(marks>=70&& marks<80){
            System.out.println("3 Star");
        }
        if(marks<50){
            System.out.println("Average Student");
        }
        sc.close();


    }
}