package Model;

import Interface.TelephoneAbstract;

public class PortablePhones extends TelephoneAbstract {
    private String portableCountry;
    private String status;

    @Override
    public String toString() {
        return "PortablePhones{" +
                "portableCountry='" + portableCountry + '\'' +
                ", status=" + status +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }

    public PortablePhones(int id, String name, double price, int quantity, String manufacturer, String portableCountry, String status) {
        super(id, name, price, quantity, manufacturer);
        this.portableCountry = portableCountry;
        this.status = status;
    }

    public String getPortableCountry() {
        return portableCountry;
    }

    public void setPortableCountry(String portableCountry) {
        this.portableCountry = portableCountry;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
