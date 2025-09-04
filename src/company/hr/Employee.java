package hr;
public class Employee {
    public String name;
    private int salary;
    protected String role;

    public String getName() {
        return name;
      }
    
    public int getSalary() {
        return salary;
    }

    public String getRole() {
        return role;
    }

    public void setSalary(int newSalary) {
        if (newSalary > 0) {
            this.salary = newSalary;
        }
    }

    public void setRole(String newRole) {
        this.role = newRole;
    }
  }