public class Person {
    private String surname;
    private String name;
    private String taxCode;
    private String city;

    public Person() {
        surname = null;
        name = null;
        taxCode = null;
        city = null;
    }

    public Person(String s, String n, String t, String c) {
        surname = s;
        name = n;
        taxCode = t;
        city = c;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String s) {
        surname = s;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

    public String getTaxCode() {
        return taxCode;
    }

    public void setTaxCode(String t) {
        taxCode = t;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String c) {
        city = c;
    }

    public int bornYear() {
        String anno = getTaxCode().substring(6, 8);
        int annoInt = Integer.parseInt(anno);
        if (annoInt > 21) {
            anno = "19" + anno;
        } else {
            anno = "20" + anno;
        }
        return Integer.parseInt(anno);
    }

    @Override
    public String toString() {
        return "surname=" + surname + ", name=" + name + ", taxCode=" + taxCode + ", city=" + city;
    }

}