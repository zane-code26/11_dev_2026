class Employee {
    String name;

    Employee(String name) {
        this.name = name;
    }

    void showInfo() {
        System.out.println("Имя: " + name);
    }
}

class Developer extends Employee {
    String language;

    Developer(String name, String language) {
        super(name);
        this.language = language;
    }

    @Override
    void showInfo() {
        super.showInfo();
        System.out.println("Язык программирования: " + language);
    }
}

class Manager extends Employee {
    int teamSize;

    Manager(String name, int teamSize) {
        super(name);
        this.teamSize = teamSize;
    }

    @Override
    void showInfo() {
        super.showInfo();
        System.out.println("Размер команды: " + teamSize);
    }
}

public class Main {
    public static void main(String[] args) {
        Developer developer = new Developer("Алексей", "Java");
        Manager manager = new Manager("Мария", 5);

        developer.showInfo();
        System.out.println();
        manager.showInfo();
    }
}
