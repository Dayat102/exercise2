import java.util.Scanner;

public class Lala {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		printexercise1();
		printexercise2();
		printexercise3();
		printexercise4();
		printexercise5();
		printexercise6();
		printexercise7();
		printexercise8();
		printexercise9();
		printexercise10();
	}
	public static void printexercise1() {
		System.out.println("******EXERCISE 1******");
		Scanner sc= new Scanner(System.in);
		double num1,num2;
		System.out.print("Input first number: ");
        num1 = sc.nextDouble();
        System.out.print("Input second number: ");
        num2 = sc.nextDouble();
		System.out.println(num1 > 0 && num1 < 1 && num2 > 0 && num2 < 1);
	}
	public static void printexercise2() {
		System.out.println("******EXERCISE 2******");
		Scanner sc= new Scanner(System.in);
		int num1,num2,num3,num4;
		System.out.print("Input first number: ");
        num1 = sc.nextInt();
        System.out.print("Input second number: ");
        num2 = sc.nextInt();
		System.out.print("Input third number: ");
        num3 = sc.nextInt();
        System.out.print("Input fourth number: ");
        num4 = sc.nextInt();		
		
		if (num1 == num2 && num2 == num3 && num3 == num4) 
		  {
			System.out.println("Numbers are equal.");
                              }
		else
			{
			System.out.println("Numbers are not equal!");
		}
	}
	public static void printexercise3() {
		System.out.println("******EXERCISE 3******");
		Scanner sc = new Scanner(System.in);
		int w,x,y,z;
		w = -5 + 8 * 6;
		x = (55 + 9) % 9;
		y = 20 + (-3 * 5 / 8);
		z = 5 + 15 / 3 * 2 - 8 % 3;
		   System.out.print(w + "\n" + x + "\n" + y + "\n" + z);
	}
	public static void printexercise4() {
		System.out.println("******EXERCISE 4******");
		Scanner sc = new Scanner(System.in);
		int a,b,divided,result;
		System.out.print("Input the first number : ");
        a = sc.nextInt();  
		System.out.print("Input the second number: ");
		b = sc.nextInt(); 
		divided = a / b;
		result = a - (divided * b);
		System.out.println(result); 
	}
	public static void printexercise5() {
		System.out.println("******EXERCISE 5******");
		Scanner sc = new Scanner(System.in);
		int a,b,d;
		System.out.print("Input the first number: ");
		a = sc.nextInt();
		System.out.print("Input the second number: ");
		b = sc.nextInt();
		d = (a/b);
		System.out.println();
		System.out.println("The division of a and b is:" +d);
	}
	public static void printexercise6() {
		System.out.println("******EXERCISE 6******");
		Scanner sc = new Scanner(System.in);
		int num1,num2,sum;
		System.out.print("Input the first number: ");
		num1 = sc.nextInt();
		System.out.print("Input the second number: ");
		num2 = sc.nextInt();
		sum = num1 + num2;
		System.out.println("Sum: "+sum);
  }
	public static void printexercise7() {
		System.out.println("******EXERCISE 7******");
		Scanner sc = new Scanner(System.in);
		int num1,num2;
		System.out.print("Input first number: ");
		num1 = sc.nextInt(); 
		System.out.print("Input second number: ");
		num2 = sc.nextInt(); 
		System.out.println(num1 + " x " + num2 + " = " + num1 * num2);
	 }
	public static void printexercise8() {
		System.out.println("******EXERCISE 8******");
		Scanner sc = new Scanner(System.in);
		double radius;
		System.out.println("Input the radius of the circle: ");
		radius = sc.nextDouble();
		System.out.println("Perimeter is = " + (2 * radius * Math.PI));
		System.out.println("Area is = " + (Math.PI * radius * radius));
	}
	public static void printexercise9() {
		System.out.println("******EXERCISE 9******");
		int w,x,y,z;
		w = -5 + 8 * 6;
		x = (55 + 9) % 9;
		y = 20 + (-3 * 5 / 8);
		z = 5 + 15 / 3 * 2 - 8 % 3;
		System.out.print(w + "\n" + x + "\n" + y + "\n" + z);
	}
	public static void printexercise10() {
		System.out.println("******EXERCISE 10******");
		double multiply = 4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11));
	    System.out.println(multiply); //
	}
}
