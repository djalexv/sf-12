import java.util.Random;

public class skillfactory {
    public static void main(String[] args) {


        }

/*        Student student1 = new Student("AAA", "BBB",100);
//        printName();



        System.out.println(student1.hashCode());
        System.out.println(student1.name);
        System.out.println(student1.getClass());
        student1.discipline = Discipline.PYTHON;
//        student1.discipline.name() = Discipline.WEB;
//        System.out.println(student1.discipline.);
        System.out.println(student1.discipline.name());
        System.out.println(Discipline.valueOf("Web"));*/


    private static Task[] creatTaskArray(int taskNumber) {
        Task[] taskArray = new Task[taskNumber];
        Random random = new Random();
        for (int i = 0; i < taskNumber; i++) {
            int randN = random.nextInt(3) + 1; //случайное число не больше 5
            if (randN == 1) taskArray[i] = new Test(i);
            else if (randN == 2) taskArray[i] = new DragAndDrop(i);
            else taskArray[i] = new DragAndDrop(i);
        }
        return taskArray;
    }
//    public static void printName(){
////        System.out.println(this.getClass().getName());
////        System.out.println(MyClass.class.getSimpleName());
//    }

}
