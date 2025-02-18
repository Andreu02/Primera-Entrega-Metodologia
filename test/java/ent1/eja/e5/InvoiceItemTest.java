package ent1.eja.e5;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class InvoiceItemTest {

    @Test
    void testConstructor() {
        InvoiceItem item = new InvoiceItem("A001", "Laptop", 3, 1200.50);
        assertEquals("A001", item.getId(), "El id debe ser A001");
        assertEquals("Laptop", item.getDesc(), "La descripción debe ser Laptop");
        assertEquals(3, item.getQty(), "La cantidad debe ser 3");
        assertEquals(1200.50, item.getUnitPrice(), 0.0001, "El precio unitario debe ser 1200.50");
    }

    @Test
    void testSetQty() {
        InvoiceItem item = new InvoiceItem("A002", "Tablet", 5, 300.00);
        item.setQty(10);
        assertEquals(10, item.getQty(), "La cantidad debe ser 10");
    }

    @Test
    void testSetUnitPrice() {
        InvoiceItem item = new InvoiceItem("A003", "Monitor", 2, 150.00);
        item.setUnitPrice(200.00);
        assertEquals(200.00, item.getUnitPrice(), 0.0001, "El precio unitario debe ser 200.00");
    }

    @Test
    void testGetTotal() {
        InvoiceItem item = new InvoiceItem("A004", "Keyboard", 4, 50.00);
        assertEquals(200.00, item.getTotal(), 0.0001, "El total debe ser 200.00");
    }

    @Test
    void testToString() {
        InvoiceItem item = new InvoiceItem("A005", "Mouse", 1, 25.00);
        assertEquals("InvoiceItem [id=A005,desc=Mouse, qty=1, unitPrice=25.0]", item.toString(), "El toString debe devolver la representación correcta");
    }
}