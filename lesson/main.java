public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        System.out.println("Кличка собаки - "+dog.getName()+" \n Возраст собаки - "+dog.getAge());
        dog.setName("Наполеон");
        dog.setAge(5);
        System.out.println("Новая кличка собаки - "+dog.getName()+" \n Новый возраст собаки - "+dog.getAge());
    }
}

class Dog {
    private String name = "Купе";
    private int age = 6;
    public String getName() {return name; }
    public void setName(String name) { this.name = name; }
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
}
