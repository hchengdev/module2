package manager;
import employee.*;

public class EmployeeManager {
    private int numberOfEmployees = 0;
    private int numberOfDeliveryEmployee = 0;
    private int numberOfFactoryEmployee = 0;
    private int numberOfOfficeEmployee = 0;
    private final Employee[] employees;
    private final int limit;

    public EmployeeManager(int limit) {
        this.employees = new Employee[limit];
        this.limit = limit;
    }

    private void updateNumberOfEmployee(Employee employee, int amount) {
        if(employee instanceof DeliveryEmployee) {
            numberOfDeliveryEmployee += amount;
        }
        if(employee instanceof FactoryEmployee) {
            numberOfFactoryEmployee += amount;
        }
        if(employee instanceof OfficeEmployee) {
            numberOfOfficeEmployee += amount;
        }
        this.numberOfEmployees = this.numberOfEmployees + this.numberOfFactoryEmployee + this.numberOfOfficeEmployee;
    }

    public void addEmployee(Employee employee) {
        if (this.numberOfEmployees >= this.limit) {
            return;
        }
        this.employees[this.numberOfEmployees] = employee;
        this.updateNumberOfEmployee(employee, 1);
    }

    public void removeEmployee(Employee employee) {
        Employee[] newEmployees = new Employee[this.limit];

        for (int i = 0, j = 0; i < this.numberOfEmployees; i++, j++) {
            if(employee.getId() == this.employees[i].getId()) {
                j--;
                continue;
            }
            newEmployees[i] = this.employees[j];
        }
        System.arraycopy(newEmployees, 0, this.employees, 0, this.numberOfEmployees);
        this.updateNumberOfEmployee(employee, -1);
    }

    public Employee getEmployeeById(int id) {
        for (int i = 0; i < this.numberOfEmployees; i++) {
            if(this.employees[i].getId() == id) {
                return this.employees[i];
            }
        }
        return null;
    }

    public void showAllEmployee() {
        System.out.println("Employees: " + this.numberOfEmployees);
        for (int i = 0; i < this.numberOfEmployees; i++) {
            System.out.println(this.employees[i]);
        }
    }

    public void showOfficeEmployee() {
        System.out.println("Office Employee: " + this.numberOfOfficeEmployee);
        for (int i = 0; i < this.numberOfOfficeEmployee; i++) {
            if(employees[i] instanceof OfficeEmployee) {
                System.out.println(this.employees[i]);
            }
        }
    }
    public void showFactoryEmployee() {
        System.out.println("Factory Employee: " + this.numberOfFactoryEmployee);
        for (int i = 0; i < this.numberOfFactoryEmployee; i++) {
            if(employees[i] instanceof FactoryEmployee) {
                System.out.println(this.employees[i]);
            }
        }
    }
    public void showDeliveryEmployee() {
        System.out.println("Delivery Employee: " + this.numberOfDeliveryEmployee);
        for (int i = 0; i < this.numberOfDeliveryEmployee; i++) {
            if(employees[i] instanceof DeliveryEmployee) {
                System.out.println(this.employees[i]);
            }
        }
    }
}
