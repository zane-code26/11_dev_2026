interface Printable {
    void print();
}

class Invoice implements Printable {
    @Override
    public void print() {
        System.out.println("Счёт №101. Сумма: 4200 руб.");
    }
}

class ShippingLabel implements Printable {
    @Override
    public void print() {
        System.out.println("Этикетка доставки. Посылка №25, город Иркутск.");
    }
}

public class Main {
    public static void main(String[] args) {
        Printable[] documents = {new Invoice(), new ShippingLabel()};
        for (Printable document : documents) {
            document.print();
        }
    }
}
