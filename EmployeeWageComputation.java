public class EmployeeWageComputation {
    public static final int PRESENT_FULL_TIME = 2;
    public static final int PRESENT_PART_TIME = 1;
    public static final int IS_FULL_TIME = 8;
    public static final int IS_PART_TIME = 4;

    private String company;
    private int per_hours_wage;
    private int max_work_days;
    private int max_work_hours;

    public EmployeeWageComputation(String company, int per_hour_wage, int max_work_days, int max_work_hours) {
        this.company = company;
        this.per_hours_wage = per_hour_wage;
        this.max_work_days = max_work_days;
        this.max_work_hours = max_work_hours;
    }

    public static double calulateSalary(EmployeeWageComputation obj) {
        int work_hours = 0, work_days = 0;
        double salary = 0;
        while (work_hours < obj.max_work_hours && work_days < obj.max_work_days) {
            work_days++;
            double empcheck = Math.floor(Math.random() * 10) % 3;
            int check = (int) empcheck;
            switch (check) {
                case PRESENT_FULL_TIME:
                    work_hours += IS_FULL_TIME;
                    break;
                case PRESENT_PART_TIME:
                    work_hours += IS_PART_TIME;
                    break;
                default:
                    work_hours += 0;
            }
            System.out.println("Day" + work_days + " Total working hrs " + work_hours);
        }
        salary = work_hours * obj.per_hours_wage;
        System.out.println("company " + obj.company + " total working hours " + work_hours + " total working days " + work_days);
        System.out.println("salary : " + salary);
        return salary;
    }

    public static void main(String[] args) {
        EmployeeWageComputation dMart = new EmployeeWageComputation("DMart", 20, 25, 100);
        calulateSalary(dMart);
    }
}
