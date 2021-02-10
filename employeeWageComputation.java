public class EmployeeWageComputation {
    public static final int present_fullTime = 2;
    public static final int present_partTime = 1;

    static double calulate_salary(double salary, int per_hour_wage, int work_time) {
        salary += per_hour_wage * work_time;
        return salary;
    }

    static int calulate_work_hours(int work_hours, int full_or_part_time) {
        work_hours += full_or_part_time;
        return work_hours;
    }

    public static void main(String[] args) {
        // constants
        int is_full_time = 8, is_part_time = 4, per_hour_wage = 20, work_hours = 0, work_days = 0;
        double salary = 0;
        // computation
        while (work_hours < 100 && work_days < 20) {
            double empcheck = Math.floor(Math.random() * 10) % 3;
            int check = (int) empcheck;
            switch (check) {
                case present_fullTime:
                    salary = calulate_salary(salary, per_hour_wage, is_full_time);
                    work_hours = calulate_work_hours(work_hours, is_full_time);
                    work_days += 1;
                    break;
                case present_partTime:
                    salary = calulate_salary(salary, per_hour_wage, is_part_time);
                    work_hours = calulate_work_hours(work_hours, is_part_time);
                    work_days += 1;
                    break;
            }
        }
        System.out.println("hours " + work_hours + " days " + work_days);
        System.out.println("salary : " + salary);
    }
}

