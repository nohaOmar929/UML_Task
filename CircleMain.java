import java.util.Scanner;

public class CircleMain {
public static void main (String[] args){
	
CircleClass circle= new CircleClass();
Scanner input=new Scanner(System.in);
double input1 = input.nextDouble();
input.close();
System.out.println("Circle area is "+circle.area(input1));
System.out.println("Circle premiter is: " +circle.premiter(input1));

}//end main

}//end class
