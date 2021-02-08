import java.util.Scanner;
public class line_comparison_problem {
        public static void main(String[] args) {
		Scanner myobj = new Scanner(System.in);
		System.out.println("enter x1 and y1 values");
		int x1 = myobj.nextInt();
		int y1 = myobj.nextInt();
		System.out.println("enter x2 and y2 values");
                int x2 = myobj.nextInt();
                int y2 = myobj.nextInt();
		double length1 = Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
		System.out.println("length1: "+length1);


		System.out.println("enter a1 and b1 values");
                int a1 = myobj.nextInt();
                int b1 = myobj.nextInt();
                System.out.println("enter a2 and b2 values");
                int a2 = myobj.nextInt();
                int b2 = myobj.nextInt();
		double length2 = Math.sqrt(Math.pow(a2-a1,2)+Math.pow(b2-b1,2));
		System.out.println("length2: "+length2);
		if ( length1==length2)
			System.out.println("length1 is equal to length2");
		else if (length1 > length2)
			System.out.println("length1 is greater than length2");
		else
			 System.out.println("length1 is greater than length2");
        }
}
