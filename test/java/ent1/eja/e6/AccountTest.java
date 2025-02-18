package ent1.eja.e6;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @Test
    void testConstructorWithTwoParams() {
        Account account = new Account("123", "John Doe");
        assertEquals("123", account.getId(), "El id debe ser 123");
        assertEquals("John Doe", account.getName(), "El nombre debe ser John Doe");
        assertEquals(0, account.getBalance(), "El saldo inicial debe ser 0");
    }

    @Test
    void testConstructorWithThreeParams() {
        Account account = new Account("456", "Jane Doe", 500);
        assertEquals("456", account.getId(), "El id debe ser 456");
        assertEquals("Jane Doe", account.getName(), "El nombre debe ser Jane Doe");
        assertEquals(500, account.getBalance(), "El saldo inicial debe ser 500");
    }

    @Test
    void testCredit() {
        Account account = new Account("789", "Alice", 1000);
        account.credit(500);
        assertEquals(1500, account.getBalance(), "El saldo después del crédito debe ser 1500");
    }

    @Test
    void testDebitSufficientBalance() {
        Account account = new Account("101", "Bob", 1000);
        account.debit(500);
        assertEquals(500, account.getBalance(), "El saldo después del débito debe ser 500");
    }

    @Test
    void testDebitInsufficientBalance() {
        Account account = new Account("202", "Eve", 300);
        account.debit(500);
        assertEquals(300, account.getBalance(), "El saldo no debe cambiar si el débito excede el saldo");
    }

    @Test
    void testTransferToSufficientBalance() {
        Account sender = new Account("303", "Charlie", 1000);
        Account receiver = new Account("404", "Dave", 500);
        sender.transferTo(receiver, 300);
        assertEquals(700, sender.getBalance(), "El saldo del remitente debe ser 700");
        assertEquals(800, receiver.getBalance(), "El saldo del destinatario debe ser 800");
    }

    @Test
    void testTransferToInsufficientBalance() {
        Account sender = new Account("505", "Frank", 200);
        Account receiver = new Account("606", "Grace", 500);
        sender.transferTo(receiver, 300);
        assertEquals(200, sender.getBalance(), "El saldo del remitente no debe cambiar si el saldo es insuficiente");
        assertEquals(500, receiver.getBalance(), "El saldo del destinatario no debe cambiar si la transferencia falla");
    }

    @Test
    void testToString() {
        Account account = new Account("707", "Henry", 1200);
        assertEquals("Account [id=707,name=Henry, balance=1200]", account.toString(), "El toString debe devolver la representación correcta");
    }
}
