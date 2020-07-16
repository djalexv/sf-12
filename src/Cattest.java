public class Cattest {
    public static void main(String[] args) {

        Cat cat;
        for (int i = 0; i < 10; i++) {

            cat = new Cat();
            if (i % 3 == 0) {
                cat.feed(1100);
            }
        }
        System.out.println("Количество кошек: " + Cat.getCatCount());
    }

    /*    public static void main(String[] args) {
        Cat bigCat = new Cat(5500, "Murka", 2, "Black");
        Cat smallCat = new Cat(1000, "Kuzya", 1, "White");
        bigCat.setWeight(bigCat.getWeight()+100);
        smallCat.setWeight(smallCat.getWeight()+1000);
        System.out.println("Вес большой кошки = " + bigCat.getWeight());
        System.out.println("Вес маленькой кошки = " + smallCat.getWeight());
    }*/
}
