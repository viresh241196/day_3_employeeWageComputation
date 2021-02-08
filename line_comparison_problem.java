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
		double length = Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));

		System.out.println( length);
        }
}
