public class EmployeeWageBuilder {
    public static final int present_fullTime = 2;
    public static final int present_partTime = 1;
    public static final int is_full_time = 8;
    public static final int is_part_time = 4;

    private String company;
    private int per_hours_wage;
    private int max_work_days;
    private int max_work_hours;

    public EmployeeWageBuilder(String company, int per_hour_wage, int max_work_days, int max_work_hours) {
        this.company = company;
        this.per_hours_wage = per_hour_wage;
        this.max_work_days = max_work_days;
        this.max_work_hours = max_work_hours;
    }

    public static void main(String[] args) {
        EmployeeWageBuilder dMart = new EmployeeWageBuilder("DMart", 20, 25, 100);
        int work_hours = 0, work_days = 0;
        double salary = 0;
        while (work_hours < dMart.max_work_hours && work_days < dMart.max_work_days) {
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
            System.out.println("Day" + work_days + " Total working hrs " + work_hours);
        }
        salary = work_hours * dMart.per_hours_wage;
        System.out.println("company " + dMart.company + " total working hours " + work_hours + " total working days " + work_days);
        System.out.println("salary : " + salary);
    }
}
