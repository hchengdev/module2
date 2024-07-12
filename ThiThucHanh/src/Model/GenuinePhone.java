package Model;

import Interface.TelephoneAbstract;

public class GenuinePhone extends TelephoneAbstract {
    private String warrantyPeriod;
    private String warrantyCoverage;

    @Override
    public String toString() {
        return "GenuinePhone{" +
                "warrantyPeriod='" + warrantyPeriod + '\'' +
                ", warrantyCoverage='" + warrantyCoverage + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }

    public GenuinePhone(int id, String name, double price, int quantity, String manufacturer, String warrantyPeriod, String warrantyCoverage) {
        super(id, name, price, quantity, manufacturer);
        this.warrantyPeriod = warrantyPeriod;
        this.warrantyCoverage = warrantyCoverage;
    }


    public String getWarrantyPeriod() {
        return warrantyPeriod;
    }

    public void setWarrantyPeriod(String warrantyPeriod) {
        this.warrantyPeriod = warrantyPeriod;
    }

    public String getWarrantyCoverage() {
        return warrantyCoverage;
    }

    public void setWarrantyCoverage(String warrantyCoverage) {
        this.warrantyCoverage = warrantyCoverage;
    }
}
