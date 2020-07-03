public class Cat {
    //Ниже идут поля класса
    private double weight;
    private String name;
    private int age;
    private String color;

    public Cat() {
        this(3000,"Barsik", 1, "Grey");
    }
    //Конструктор
    public Cat(double weight,
               String name,
               int age,
               String color) {
        this.weight = weight;
        this.name = name;
        this.age = age;
        this.color = color;
    }

    //Ниже идут методы
    public void meow() {
        System.out.println("Meow");
    }

    public void pee() {
        weight -= 20;
    }

    public void eat() {
        weight += 50;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}