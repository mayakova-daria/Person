package app;

public class Main {
    public static void main(String[] args) {

        Person person1 = new Person("Иван Иванов", 35, "Инженер");
        Person person2 = new Person("Мария Петрова", 28, "Бухгалтер");
        Person person3 = new Person("Михаил Сидоров", 42, "Менеджер");

        System.out.println("Информация о первом человеке:");
        person1.showInfo();
        System.out.println();

        System.out.println("Информация о втором человеке:");
        person2.showInfo();
        System.out.println();

        System.out.println("Информация о третьем человеке:");
        person3.showInfo();
        System.out.println();


        person2.changeJob("Разработчик ПО");
        System.out.println("Обновленная информация о втором человеке:");
        person2.showInfo();
    }
}