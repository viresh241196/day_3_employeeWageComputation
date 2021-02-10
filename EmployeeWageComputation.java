public class EmployeeWageComputation {
    public static final int present_fullTime = 2;
    public static final int present_partTime = 1;
    public static final int is_full_time = 8;
    public static final int is_part_time = 4;
    public static final int per_hour_wage = 20;
        public static void main(String[] args) {
		double salary = 0;
		for (int i=0; i<=20; i++ ){
                	double empcheck = Math.floor(Math.random() * 10 ) % 3;
			int check=(int)empcheck;
			switch (check) {
				case present_fullTime:
					salary += per_hour_wage * is_full_time;
					break;
				case present_partTime:
					salary += per_hour_wage * is_part_time;
					break;
				default:
					i--;
			}
		}
		System.out.println("salary : " + salary);
        }
}

