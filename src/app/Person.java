package app;

class Person {
    String name;
    int age;
    String job;

    public Person(String n, int a, String j) {
        name = n;
        age = a;
        job = j;
    }

    public void showInfo() {
        System.out.println("Имя: " + name);
        System.out.println("Возраст: " + age);
        System.out.println("Профессия: " + job);
    }

    public void changeJob(String newJob) {
        job = newJob;
    }
}
