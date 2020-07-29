import java.util.Objects;

public class Student extends Person {
    int taskCount;
    static int taskCountForAll;
    Mentor mentor;
    boolean allTaskSolved;
//    public static final int MAX_MODULES_COUNT = 20;
//    public Discipline discipline;


    Student(String name, int age, Mentor mentor) {
        super(name, age);
        this.taskCount = 0;
        this.mentor = mentor;
        this.allTaskSolved = false;
//        this.discipline = Discipline.JAVA;
    }

    public void setTaskCount(int taskCount) {
        this.taskCount = taskCount;
    }

    int getTaskCount() {
        return taskCount;
    }

    public void solveTaskS(Task[] tasksArray, int tasksForSolve) {
        String outStr= "Все задания из массива были решены";
        if (allTaskSolved) {    // проверка на поаторное выполнение
            System.out.println("У данного студента к текущему моменту " + outStr.toLowerCase());
            return;
        }
        int startTaskIndx = taskCount;
        int endTaskIndx = Math.min(startTaskIndx + tasksForSolve, tasksArray.length);

        for (int i = startTaskIndx; i < endTaskIndx; i++) solveTask(tasksArray[i]);

        if (taskCount == tasksArray.length) {
            System.out.println(outStr);
            allTaskSolved = true;
        }else {
            System.out.println("НЕ "+ outStr.toLowerCase());
            allTaskSolved = false;
        }

    }

    private void solveTask(Task currentTasks) {
//       currentTasks.
        System.out.println("Задание завершено");
        taskCount++;
        taskCountForAll++;
    }

    boolean isAllTaskSolved() {
        return allTaskSolved;
    }


    public void completeTheTask() {

    }

    public void askTheQuestion() {

    }


    public void talkWithTheCurator(String nameOfCurator) {

    }

}
