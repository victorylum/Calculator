import java.util.Scanner;
public class Example{
static int age;
static int id;

public static void main(String[]args){
Scanner s =new Scanner(System.in);
System.out.println("enter age");
age=s.nextInt();
System.out.println("enter id");
id=s.nextInt();

System.out.println(age + ":" + id);
}
}


