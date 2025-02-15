package ent1.eja;//Importamos las distintas clases
import ent1.eja.e2.Circle;
import ent1.eja.e3.Rectangle;
import ent1.eja.e4.Employee;
import ent1.eja.e5.InvoiceItem;
import ent1.eja.e6.Account;
import ent1.eja.e7.Date;
import ent1.eja.e8.Time;
import ent1.eja.e9.Ball;


public class Main {
    public static void main(String[] args) {
        // Llamamos a la función de la clase que queramos ejecutar
        ent1_eja_e2();
    }

    // función del círculo
    static public void ent1_eja_e2() {

        // creas un círculo de radio 1.1 y lo muestra por pantalla
        Circle c1 = new Circle(1.1);
        System.out.println(c1);

        // creas otro círculo con el constructor por defecto
        Circle c2 = new Circle();
        System.out.println(c2);

        // eliges un nuevo radio para el círculo y muestras por pantalla los nuevos datos
        c1.setRadius(2.2);
        System.out.println(c1);
        System.out.println("radius is: " + c1.getRadius());

        // calculas área y lo muestras pantalla
        System.out.printf("area is: %.2f%n", c1.getArea());

        // calculas perímetro y lo muestras por pantalla
        System.out.printf("circumference is: %.2f%n", c1.getCircumference());

    }

    // función del rectángulo
    static public void ent1_eja_e3() {

        // creas un rectángulo de altura 1.2 y anchura 3.4,después lo muestras por pantalla
        Rectangle r1 = new Rectangle(1.2f, 3.4f);
        System.out.println(r1);

        // creas otro rectángulo con el constructor por defecto
        Rectangle r2 = new Rectangle();
        System.out.println(r2);

        // eliges una nueva altura y anchura para el rectángulo y muestras los datos por pantalla
        r1.setLength(5.6f);
        r1.setWidth(7.8f);
        System.out.println(r1);
        System.out.println("length is: " + r1.getLength());
        System.out.println("width is: " + r1.getWidth());

        // calculas área y lo muestras pantalla
        System.out.printf("area is: %.2f%n", r1.getArea());

        // calculas perímetro y lo muestras por pantalla
        System.out.printf("perimeter is: %.2f%n", r1.getPerimeter());

    }

    // función del empleado
    static public void ent1_eja_e4() {

        // creas a un empleado introduciendo su número de identidad, su nombre y apellido y por último su salario
        Employee e1 = new Employee(8, "Peter", "Tan", 2500);

        // muestras por pantalla los datos del empleado
        System.out.println(e1);

        // le da un nuevo salario al empleado
        e1.setSalary(999);

        // saca por pantalla los nuevos datos del empleado
        System.out.println(e1);
        System.out.println("id is: " + e1.getId());
        System.out.println("firstname is: " + e1.getFirstName());
        System.out.println("lastname is: " + e1.getLastName());
        System.out.println("salary is: " + e1.getSalary());

        // junta el nombre con el apellido para dar el nombre completo
        System.out.println("name is: " + e1.getName());

        // calcula el salario anual del empleado
        System.out.println("annual salary is: " + e1.getAnnualSalary());

        // establece el porcentaje de salario que le sumas al sueldo, ejecuta el aumento de sueldo y saca por pantalla el salario actual
        System.out.println(e1.raiseSalary(10));

        // saca por pantalla los nuevos datos del empleado con el aumento de sueldo
        System.out.println(e1);
    }

    // función del objeto de venta
    static public void ent1_eja_e5() {

        // creas un objeto con número de identidad, descripción, cantidad del objeto y precio por unidad
        InvoiceItem inv1 = new InvoiceItem("A101", "Pen Red", 888, 0.08);

        // muestras por pantalla los datos de dicho objeto
        System.out.println(inv1);

        // estableces una nueva cantidad y precio por unidad para el objeto
        inv1.setQty(999);
        inv1.setUnitPrice(0.99);

        // muestras por pantalla los nuevos datos del objeto
        System.out.println(inv1);
        System.out.println("id is: " + inv1.getId());
        System.out.println("desc is: " + inv1.getDesc());
        System.out.println("qty is: " + inv1.getQty());
        System.out.println("unitPrice is: " + inv1.getUnitPrice());

        // calculas multiplicando la cantidad por el precio/unidad el total de dinero y lo muestras por pantalla
        System.out.println("The total is: " + inv1.getTotal());

    }

    // función de la cuenta
    static public void ent1_eja_e6() {

        // creas una nueva cuenta con número de identidad, nombre y saldo
        Account a1 = new Account("A101", "Tan Ah Teck", 88);

        // muestras por pantalla los datos de la cuenta por pantalla
        System.out.println(a1);

        // creas una nueva cuenta con otro número de identidad y nombre pero sin saldo
        Account a2 = new Account("A102", "Kumar");

        // muestras por pantalla los datos de esta otra cuenta
        System.out.println(a2);

        // muestras la información de la primera cuenta
        System.out.println("ID: " + a1.getId());
        System.out.println("Name: " + a1.getName());
        System.out.println("Balance: " + a1.getBalance());

        // establece la cantidad de dinero que quiere añadirle al saldo de su cuenta y muestra por pantalla el nuevo saldo
        a1.credit(100);
        System.out.println(a1);

        // establece la cantidad de dinero que quiere retirar del saldo de su cuenta y muestra por pantalla el nuevo saldo
        a1.debit(50);
        System.out.println(a1);

        // vuelve a establecer la cantidad de dinero que quiere retirar, pero como en este caso hay menos saldo que dinero que quiere retirar le muestra error por pantalla
        a1.debit(500);
        System.out.println(a1);

        // establece la cantidad de dinero que quiere transferir de la primera cuenta a la segunda y muestra por pantalla la información inicial de la primera cuenta antes de transferir
        a1.transferTo(a2, 100);

        // muestra por pantalla la nueva información de las cuentas tras la transferencia
        System.out.println(a1);
        System.out.println(a2);

    }

    // función de la fecha
    static public void ent1_eja_e7() {

        // crea una fecha con día, mes y año
        Date d1 = new Date(1, 2, 2014);

        // muestra por pantalla la información
        System.out.println(d1);

        // establece un nuevo día, mes y año
        d1.setMonth(12);
        d1.setDay(9);
        d1.setYear(2099);

        // muestras por pantalla la nueva información
        System.out.println(d1);
        System.out.println("Month: " + d1.getMonth());
        System.out.println("Day: " + d1.getDay());
        System.out.println("Year: " + d1.getYear());

        // establece un nuevo día, mes y año para mostrar por pantalla la fecha con este formato "dd/mm/yyyy"
        // en caso de que el día o mes sea menor de 10 le pone el 0 delante al establecer la fecha
        d1.setDate(3, 4, 2016);

        // muestra por pantalla la fecha
        System.out.println(d1);

    }

    //función de la hora
    static public void ent1_eja_e8() {

        // crea una hora con hora, minutos y segundos
        Time t1 = new Time(1, 2, 3);

        // muestra por pantalla la información
        System.out.println(t1);

        // establece nueva hora, minuto y segundo
        t1.setHour(4);
        t1.setMinute(5);
        t1.setSecond(6);

        // muestra la información por pantalla
        System.out.println(t1);
        System.out.println("Hour: " + t1.getHour());
        System.out.println("Minute: " + t1.getMinute());
        System.out.println("Second: " + t1.getSecond());

        // establece una nueva información y se junta en el formato de la hora
        // si las horas, minutos o segundos son menores de 10 se pone un 0 delante
        t1.setTime(23, 59, 58);

        // muestras por pantalla la hora
        System.out.println(t1);

        // esta función le suma un segundo a la hora que has establecido (si son 59 segundos al pasar de segundo cambia también los minutos)
        // muestras por pantalla la nueva hora
        System.out.println(t1.nextSecond());

        // haces lo mismo que antes, pero esta vez le sumas dos segundos, uno por cada función
        // muestras por pantalla la nueva hora
        System.out.println(t1.nextSecond().nextSecond());

        // esta función le resta un segundo a la hora
        // muestras por pantalla la nueva hora
        System.out.println(t1.previousSecond());

        // haces lo mismo que antes, pero esta vez le restas dos segundos, uno por cada función
        // muestras por pantalla la nueva hora
        System.out.println(t1.previousSecond().previousSecond());

    }

    //función de la pelota
    static public void ent1_eja_e9() {

        // creas una pelota con posición x e y, radio y velocidades en x e y
        Ball ball = new Ball(1.1f, 2.2f, 10, 3.3f, 4.4f);

        // muestras por pantalla la información
        System.out.println(ball);

        // estableces nueva información para la pelota
        ball.setX(80.0f);
        ball.setY(35.0f);
        ball.setRadius(5);
        ball.setxDelta(4.0f);
        ball.setyDelta(6.0f);

        // muestras por pantalla esa nueva información
        System.out.println(ball);
        System.out.println("x is: " + ball.getX());
        System.out.println("y is: " + ball.getY());
        System.out.println("radius is: " + ball.getRadius());
        System.out.println("xDelta is: " + ball.getxDelta());
        System.out.println("yDelta is: " + ball.getyDelta());

        // estableces los límites máximos en los que la pelota puede estar
        float xMin = 0.0f;
        float xMax = 100.0f;
        float yMin = 0.0f;
        float yMax = 50.0f;

        // estableces un bucle con 15 movimientos de la pelota sin salirse
        for (int i = 0; i < 15; i++) {

            // mueves la pelota según la velocidad que tenga
            ball.move();

            // muestras por pantalla la posición en cada momento de la pelota
            System.out.println(ball);
            float xNew = ball.getX();
            float yNew = ball.getY();
            int radius = ball.getRadius();

            // si la pelota llega a los límites del eje "x" se invierte su dirección para que no se salga
            if ((xNew + radius) > xMax || (xNew - radius) < xMin) {
                ball.reflectHorizontal();
            }

            // si la pelota llega a los límites del eje "y" se invierte su dirección para que no se salga
            if ((yNew + radius) > yMax || (yNew - radius) < yMin) {
                ball.reflectVertical();
            }
        }
    }

}


