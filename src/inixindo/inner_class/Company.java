package inixindo.inner_class;

// outer class (Company)
public class Company {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // inner class (Employee)
    public class Employee {

        private String name;

        // keuntungan dari inner class adalah tidak perlu membuat objek baru
        public String getCompany() {
            return Company.this.getName();
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
