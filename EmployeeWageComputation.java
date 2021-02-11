public class EmployeeWageComputation {
    public static final int PRESENT_FULL_TIME = 2;
    public static final int PRESENT_PART_TIME = 1;
    public static final int IS_FULL_TIME = 8;
    public static final int IS_PART_TIME = 4;
    public static final int PER_HOUR_WAGE = 20;

    public static void main(String[] args) {
        int working_hr = 0;
        double salary = 0;
        for (int i = 0; i <= 20; i++) {
            double empcheck = Math.floor(Math.random() * 10) % 3;
            int check = (int) empcheck;
            switch (check) {
                case PRESENT_FULL_TIME:
                    working_hr += IS_FULL_TIME;
                    break;
                case PRESENT_PART_TIME:
                    working_hr += IS_PART_TIME;
                    break;
                default:
                    working_hr += 0;
            }
        }
        salary = PER_HOUR_WAGE * working_hr;
        System.out.println("salary : " + salary);
    }
}
