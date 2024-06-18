package employee;

public class DeliveryEmployee extends Employee {
    private String transport;

    public DeliveryEmployee(int id, String name, String phone, String position, String transport) {
        super(id, name, phone, position);
        this.transport = transport;
    }

    public String getTransport() {
        return transport;
    }

    public void setTransport(String transport) {
        this.transport = transport;
    }

    @Override
    public String toString() {
        return super.toString() +  "DeliveryEmployee{" +
                "transport='" + transport + '\'' +
                '}';
    }
}
