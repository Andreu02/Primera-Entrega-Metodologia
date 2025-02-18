package ent1.eja.e4;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {
    @Test
    void testConstructor() {
        Employee employee = new Employee(1, "John", "Doe", 5000);
        assertEquals(1, employee.getId(), "El id debe ser 1");
        assertEquals("John", employee.getFirstName(), "El primer nombre debe ser John");
        assertEquals("Doe", employee.getLastName(), "El apellido debe ser Doe");
        assertEquals(5000, employee.getSalary(), "El salario debe ser 5000");
    }

    @Test
    void testGetName() {
        Employee employee = new Employee(2, "Jane", "Smith", 6000);
        assertEquals("Jane Smith", employee.getName(), "El nombre completo debe ser Jane Smith");
    }

    @Test
    void testSetSalary() {
        Employee employee = new Employee(3, "Alice", "Brown", 7000);
        employee.setSalary(8000);
        assertEquals(8000, employee.getSalary(), "El salario debe ser 8000");
    }

    @Test
    void testGetAnnualSalary() {
        Employee employee = new Employee(4, "Bob", "White", 4000);
        assertEquals(48000, employee.getAnnualSalary(), "El salario anual debe ser 48000");
    }

    @Test
    void testRaiseSalary() {
        Employee employee = new Employee(5, "Charlie", "Green", 10000);
        assertEquals(11000, employee.raiseSalary(10), "El salario después del aumento debe ser 11000");
    }

    @Test
    void testToString() {
        Employee employee = new Employee(6, "David", "Black", 9000);
        assertEquals("Employee [id=6,name=David Black, salary=9000]", employee.toString(), "El toString debe devolver la representación correcta");
    }

}