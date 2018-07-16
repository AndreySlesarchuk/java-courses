public class TestEmployee {
    public static void main(String[] args) {
        Employee emp = new Employee("Tom");
        System.out.println(emp.getTitle());
        emp.promoteToManager();
        System.out.println(emp.getTitle());
        emp.promoteToCEO();
        System.out.println(emp.getTitle());
    }
}
