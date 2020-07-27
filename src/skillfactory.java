public class skillfactory {
    public static void main(String[] args) {
        Student student1 = new Student("AAA", "BBB",100);
//        printName();



        System.out.println(student1.hashCode());
        System.out.println(student1.name);
        System.out.println(student1.getClass());
        student1.discipline = Discipline.PYTHON;
//        student1.discipline.name() = Discipline.WEB;
//        System.out.println(student1.discipline.);
        System.out.println(student1.discipline.name());
        System.out.println(Discipline.valueOf("Web"));

    }

    public static void printName(){
//        System.out.println(this.getClass().getName());
//        System.out.println(MyClass.class.getSimpleName());
    }

}
