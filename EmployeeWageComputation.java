public class EmployeeWageComputation {
    	public static final int present_fullTime = 2;
    	public static final int present_partTime = 1;
    	public static final int is_full_time = 8;
    	public static final int is_part_time = 4;
    	public static final int per_hour_wage = 20;
	public static void main(String[] args) {
		int work_hours = 0;
		int work_days = 0;
		double salary = 0;
		while ( work_hours < 100 && work_days < 20 ){
                	double empcheck = Math.floor(Math.random() * 10 ) % 3;
			int check=(int)empcheck;
			switch (check) {
				case present_fullTime:
					salary += per_hour_wage * is_full_time;
					work_hours += is_full_time;
					work_days += 1;
					break;
				case present_partTime:
					salary += per_hour_wage * is_part_time;
					work_hours += is_part_time;
					work_days += 1;
					break;
				default:
			}
		}
		System.out.println("salary : " + salary);
        }
}

