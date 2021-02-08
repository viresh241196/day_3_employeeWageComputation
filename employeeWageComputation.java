public class employeeWageComputation {
        public static void main(String[] args) {
                // constants
                int is_full_time = 1;
                // computation
                double empcheck = Math.floor(Math.random() * 10 ) % 2;
                if ( empcheck == is_full_time )
                        System.out.println("employee is present");
                else
                        System.out.println("employee is abscent ");
        }
}

