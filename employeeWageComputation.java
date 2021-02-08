public class employeeWageComputation {
        public static void main(String[] args) {
                // constants
                int is_full_time = 8;
		int is_part_time = 4;
		int per_hour_wage = 20;
		final int present_fullTime = 2;
		final int present_partTime = 1;
		double salary = 0;
                // computation
                double empcheck = Math.floor(Math.random() * 10 ) % 3;
		int check=(int)empcheck;
		switch (check) {
			case present_fullTime:
				salary = per_hour_wage * is_full_time;
                        	System.out.println("employee is present ");
				break;
			case present_partTime:
				salary = per_hour_wage * is_part_time;
        	                System.out.println("employee is present ");
				break;
			default:
                        System.out.println("employee is abscent ");
		}
		System.out.println("salary : " + salary);

        }
}

