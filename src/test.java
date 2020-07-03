public class test {
    public static void main(String[] args) {
        Cat bigCat = new Cat(5500, "Murka", 2, "Black");
        Cat smallCat = new Cat(1000, "Kuzya", 1, "White");
        bigCat.setWeight(bigCat.getWeight()+100);
        smallCat.setWeight(smallCat.getWeight()+1000);
        System.out.println("Вес большой кошки = " + bigCat.getWeight());
        System.out.println("Вес маленькой кошки = " + smallCat.getWeight());
    }
}
