public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setName("Бакс");
    }
}

class Cat {
    private String name = "безымянный кот";

    public void setName(String name) {
        System.out.println("Прежняя кличка кота - "+this.name);
        this.name = name;
        System.out.println("Новая кличка кота - "+this.name);

    }
}
