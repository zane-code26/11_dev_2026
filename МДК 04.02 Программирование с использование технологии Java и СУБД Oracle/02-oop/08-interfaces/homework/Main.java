// Интерфейс экспорта данных
interface Exportable {
    String export();
}

// Реализация счета на оплату
class Invoice implements Exportable {
    private int id;
    private double amount;
    private String client;

    public Invoice(int id, double amount, String client) {
        this.id = id;
        this.amount = amount;
        this.client = client;
    }

    @Override
    public String export() {
        return "Счёт №" + id + " | Клиент: " + client + " | Сумма: " + amount + " руб.";
    }
}

// Реализация отчета по продукции
class ProductReport implements Exportable {
    private String category;
    private int count;

    public ProductReport(String category, int count) {
        this.category = category;
        this.count = count;
    }

    @Override
    public String export() {
        return "Отчёт по продукции | Категория: " + category + " | Количество: " + count + " шт.";
    }
}

// Точка входа
public class Main {
    public static void main(String[] args) {
        // Массив интерфейсного типа Exportable
        Exportable[] items = {
            new Invoice(101, 15400.0, "ООО Вектор"),
            new Invoice(102, 8250.0, "ИП Смирнов"),
            new ProductReport("Ноутбуки", 14),
            new ProductReport("Мониторы", 25)
        };

        // Полиморфная обработка объектов
        System.out.println("=== Экспорт документов ===");
        for (Exportable item : items) {
            System.out.println(item.export());
        }
    }
}
