public class Employee {
    private String name;
    private Role role;
    
    public Employee(String name) {
        this.name = name;
    }
    
    public void promoteToManager() {
        role = new Manager();
    }
    
    public void promoteToCEO() {
        role = new CEO();
    }
    
    public String getTitle() {
        if(role == null) {
            return "Employee";
        } else {
            return role.getRoleName();
        }
    }
}
