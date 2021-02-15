public class CompanyEmpWage {
    public String company;
    public int per_hours_wage;
    public int max_work_days;
    public int max_work_hours;
    public int salary;

    public CompanyEmpWage(String company, int per_hour_wage, int max_work_days, int max_work_hours) {
        this.company = company;
        this.per_hours_wage = per_hour_wage;
        this.max_work_days = max_work_days;
        this.max_work_hours = max_work_hours;
    }

    public void setTotalEmpWage(int salary){
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Total salary for company " + company + " is : " + this.salary;
    }
}
