public class employeeWageComputation {
        public static void main(String[] args) {
                // constants
                int is_full_time = 8;
		int per_hour_wage = 20;
		int present = 1;
		double salary = 0;
                // computation
                double empcheck = Math.floor(Math.random() * 10 ) % 2;
                if ( empcheck == present ){
			salary = per_hour_wage * is_full_time;
                        System.out.println("employee is present ");
			System.out.println(salary);
                }else{
                        System.out.println("employee is abscent ");
			System.out.println(salary);
		}
        }
}

