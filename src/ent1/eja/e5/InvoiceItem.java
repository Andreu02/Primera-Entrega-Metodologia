package ent1.eja.e5;

public class InvoiceItem {
    //ZONA DE ATRIBUTOS
    private String id;
    private String desc;
    private int qty;
    private double unitPrice;

    //ZONA DE METODOS
        //constructores
    public InvoiceItem(String id, String desc, int qty, double unitPrice) {
        this.id = id;
        this.desc = desc;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }

        //getters y setters
    public String getId() {
        return id;
    }
    public String getDesc() {
        return desc;
    }
    public int getQty() {
        return qty;
    }
    public void setQty(int qty) {
        this.qty = qty;
    }
    public double getUnitPrice() {
        return unitPrice;
    }
    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

        //otros
    public double getTotal(){
        return qty * unitPrice;
    }
    @Override
    public String toString() {
        return "InvoiceItem [id=" + id + ",desc=" + desc  + ", qty=" + qty + ", unitPrice=" + unitPrice + "]";
    }
}
