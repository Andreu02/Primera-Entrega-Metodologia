package ent1.ejb.e2;

public class Customer {
    //ZONA DE ATRIBUTOS
    private int id;
    private String name;
    private int discount;

    //ZONA DE METODOS
    public Customer(int id, String name, int discount) {
        this.id = id;
        this.name = name;
        this.discount = discount;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }
    @Override
    public String toString() {
        return "name=" + name + "(" + id +")(" + discount + "%)";
    }
}
