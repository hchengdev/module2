package employee;

public class OfficeEmployee extends Employee {
    public OfficeEmployee(int id, String name, String phone, String position) {
        super(id, name, phone, position);
    }

    public OfficeEmployee(int id, String name) {
        super(id, name, null, null);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
