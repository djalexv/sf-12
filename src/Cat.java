import java.util.Objects;

public class Cat implements Cloneable {
//    public static String catCount;
    //Ниже идут поля класса
    private double weight;
    private String name;
    private int age;
    private String color;
    private static int catCount;

    public Cat() {
        this(3000, "Barsik", 1, "Grey");
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
        catCount++; //Увеличиваем счётчик кошек
    }
    @Override
    public int hashCode() {
        return Objects.hash(weight, name, age, color);
    }
    public   static int getCatCount() {
        return catCount;
    }

    public static void setCatCount(int catCount) {
        Cat.catCount = catCount;
    }

    public void feed(double foodAmount) {
        if (foodAmount < 1000) {
            System.out.println("Кошку покормили! Она довольна!");
        } else {
            System.out.println("Кошку перекормили и она лопнула.");
            catCount--;
        }
    }

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

    public Object clone() throws CloneNotSupportedException {
        // Мы должны вызвать метод базового класса,
        // чтобы гарантировать, что возвращаемое значение
        // будет именно того типа, у экземпляра которого
        // вызван метод clone().
        Object result = (Cat) super.clone(); //Приведение типов
        return result;
    }


}