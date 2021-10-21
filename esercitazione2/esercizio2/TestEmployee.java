public class TestEmployee {
    public static void main(String[] args) {
        // Rossi Mario nato a Genova (GE) il 10/10/1980
        Employee e1 = new Employee("Rossi", "Mario", "MRARSS80R10D969H", "Genova", 2010, 2000.0);
        // Bianchi Giuseppe nato a Roma (RM) il 20/05/1985
        Employee e2 = new Employee("Bianchi", "Giuseppe", "GSPBCH85E20H501B", "Roma", 2011, 1500.0);
        // Esposito Andrea nato a Padova (PD) il 30/09/2001
        Employee e3 = new Employee("Esposito", "Andrea", "SPSNDR01P30G224D", "Padova", 2015, 2100.0);

        if (e1.gainsMore(e2)) {
            if (e2.gainsMore(e3)) {
                System.out.println(e1.toString());
                System.out.println(e2.toString());
                System.out.println(e3.toString());
            } else if (e1.gainsMore(e3)) {
                System.out.println(e1.toString());
                System.out.println(e3.toString());
                System.out.println(e2.toString());
            } else {
                System.out.println(e3.toString());
                System.out.println(e1.toString());
                System.out.println(e2.toString());
            }
        } else if (e2.gainsMore(e3)) {
            if (e1.gainsMore(e3)) {
                System.out.println(e2.toString());
                System.out.println(e1.toString());
                System.out.println(e3.toString());
            } else {
                System.out.println(e2.toString());
                System.out.println(e3.toString());
                System.out.println(e1.toString());
            }
        } else {
            System.out.println(e3.toString());
            System.out.println(e2.toString());
            System.out.println(e1.toString());
        }
    }
}
