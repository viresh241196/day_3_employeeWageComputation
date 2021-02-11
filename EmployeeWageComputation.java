public class EmployeeWageComputation {
    public static final int present_fullTime = 2;
    public static final int present_partTime = 1;
    public static final int is_full_time = 8;
    public static final int is_part_time = 4;
    public static final int per_hour_wage = 20;

    public static void main(String[] args) {
        int work_hours = 0, work_days = 0;
        double salary = 0;
        while (work_hours < 100 && work_days < 20) {
            work_days++;
            double empcheck = Math.floor(Math.random() * 10) % 3;
            int check = (int) empcheck;
            switch (check) {
                case present_fullTime:
                    work_hours += is_full_time;
                    break;
                case present_partTime:
                    work_hours += is_part_time;
                    break;
                default:
                    work_hours += 0;
            }
            System.out.println("Day"+work_days + " Total working hrs "+work_hours);
        }
        salary = work_hours * per_hour_wage;
        System.out.println("total working hours " + work_hours + " total working days " + work_days);
        System.out.println("salary : " + salary);
    }
}

