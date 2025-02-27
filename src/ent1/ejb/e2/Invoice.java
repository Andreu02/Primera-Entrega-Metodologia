package ent1.ejb.e2;

public class Invoice {
    //ZONA DE ATRIBUTOS
    private int id;
    private Customer customer;
    private double amount;

    //ZONA DE METODOS
    public Invoice(int id, Customer customer, double amount) {
        this.id = id;
        this.customer = customer;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
    public int getCustomerId() {
        return customer.getId();
    }
    public String getCustomerName() {
        return customer.getName();
    }
    public int getCustomerDiscount() {
        return customer.getDiscount();
    }
    public double getAmountAfterDiscount() {
        return amount - (customer.getDiscount()*amount)/100 ;
    }

    @Override
    public String toString() {
        return "Invoice [id=" + id + ", customer=" + customer + ", amount=" + amount + "]";
    }
}
