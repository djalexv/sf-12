/**
 * Учебный пример №17
 *
 * @author Ar20L80
 * тут я вернул переменную локального класса через iTemp внешнего класса
 */
public class OuterClass {

    private int iTemp;

    OuterClass() {
        // объявим внутри конструктора класс

    /* здесь мы не можем использовать private, public
    применительно к локальному классу*/
        final class LocalInnerClass01 {
            /* сам локальный класс может содержать
               как private, так и public */
            private static final int INT_FIN = 10;

            LocalInnerClass01() {
                iTemp = Return_INT_FIN();
            }

            int Return_INT_FIN() {
                return INT_FIN;
            }

        }

        class LocalInnerClass02 {
            // public static int i=11; ошибка не может быть не константой внутри
            // локального вложенного класса
        }

        /* создаем локальные объекты  локальных классов в том же конструкторе*/
        LocalInnerClass01 localInnerClass1 = new LocalInnerClass01();
        LocalInnerClass02 localInnerClass2 = new LocalInnerClass02();


    }

    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();

        System.out.println(outerClass.iTemp); // = 10
        //OuterClass.LocalInnerClass1 innerObject = outerClass.new LocalInnerClass1(); ошибка - это не
        // внутренний класс, а локальный. И мы не имеем к нему доступа.
    }


}


/*
class OuterClass {
    class Cyclic {}

    private int someField1;

    void foo1() {
        // Нельзя. Циклическое наследование.
        // Область видимости Cyclic для локального класса
        // включает само объявление класса.
        // class Cyclic extends Cyclic {}

        // Нельзя. Здесь ещё LocalClass не объявлено.
        // LocalClass lc = new LocalClass();

        final int x1 = 100;
        int x2 = 200;
        int x3 = 300;

        // А вот так можно
        class LocalClass {
            private void method1() {
                // Переменная x1  final.
                // Можно обращаться из локального класса
                System.out.println(x1);

                // Переменная x2 не меняется фактически, хотя и
                // не объявлена как final. Можно обращаться.
                System.out.println(x2);

                //System.out.println(x3); НЕЛЬЗЯ!.

                // Внутренние классы имеют доступ ко всем членам
                // своего внешнего класса.
                System.out.println(someField1++);
            }
        }

        class LocalClassB {
            void method2(LocalClass lc) {
                lc.method1(); // Можно. Так как они внутренние классы
                // одного и того же внешнего класса
            }
        }
        x3++;
        LocalClass lc = new LocalClass();
        lc.method1();
    }


    public static void main(String[] args) {
        OuterClass oc = new OuterClass();
        oc.foo1();
//        oc.foo1
    }
}
*/



/*
class OuterClass {
    private static int a1 = 2;
    protected static int a2 = 4;
    static int a3 = 6;
    public static int a4 = 3;

    private int x1 = 40;
    protected int x2 = 20;
    int x3 = 60;
    public int x4 = 100;

    private static void privateStaticOuterMethod1(int v) {
        System.out.println(v + 20);
    }

    static void packagePrivateStaticOuterMethod1(int v) {
        System.out.println(v);
    }

    public void publicInstanceOuterMethod1(int v) {
        System.out.println(a4 * v);
    }

    static class StaticNestedClass {

        public static void main(String[] args) {
            StaticNestedClass s = new StaticNestedClass();
            s.method1();
            s.method2(new OuterClass());
        }

        public void method1() {
            // можно обращаться к приватным статическим членам.
            int y1 = a1;
            int y2 = a2;
            int y3 = a3;
            int y4 = a4;

            privateStaticOuterMethod1(y1 + y2);
            packagePrivateStaticOuterMethod1(y3 + y4);
        }

        public void method2(OuterClass oc) {
            // К членам экземпляров только через ссылку.
            int z1 = oc.x1;
            int z2 = oc.x2;
            int z3 = oc.x3;
            int z4 = oc.x4;

            oc.publicInstanceOuterMethod1(z1 + z2 + z3 + z4);
        }
    }
}*/
