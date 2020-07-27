import java.util.Objects;

public class Student extends Person  implements Cloneable {
    private boolean expirienced;
    private String trainingPurpose;
    private int groupNumber;
    private int passedModuleCount;
    private int taskCount;
    private String about;
    public static int taskCountForAll;
    public static int maxClosedModuls;
    public static final int MAX_MODULES_COUNT = 20;
    public Discipline discipline;

    public Student(String name, String surName, int age) {
        this(name, surName, age, false, "", 0, 0, 0);
    }

    @Override
    public void setAbout() {
        this.about = "";
    }

    public Student(String name, String surName, int age, boolean expirienced, String trainingPurpose,
                   int groupNumber, int passedModuleCount, int taskCount) {
        super(name, surName, age);
        this.expirienced = expirienced;
        this.trainingPurpose = trainingPurpose;
        this.groupNumber = groupNumber;
        this.passedModuleCount = passedModuleCount;
        this.taskCount = taskCount;
        this.discipline = Discipline.JAVA;
    }

    public void solveTask() {
        System.out.println("Задание завершено");
        taskCount++;
        taskCountForAll++;
    }

    public void solveModule() {
        if (passedModuleCount < MAX_MODULES_COUNT) {
            System.out.println("Модуль завершен");
            passedModuleCount++;
            if (passedModuleCount > maxClosedModuls) {
                maxClosedModuls = passedModuleCount;
            } else {
                System.out.println("Все модули пройдены!");
            }

        }
    }

    public boolean isExpirienced() {
        return expirienced;
    }

    public String getTrainingPurpose() {
        return trainingPurpose;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public int getPassedModuleCount() {
        return passedModuleCount;
    }

    public int getTaskCount() {
        return taskCount;
    }

    public void completeTheTask() {

    }

    public void askTheQuestion() {

    }

    public void closeTheModule(int number) {

    }

    public void talkWithTheCurator(String nameOfCurator) {

    }

    public void setExpirienced(boolean expirienced) {
        this.expirienced = expirienced;
    }

    public void setTrainingPurpose(String trainingPurpose) {
        this.trainingPurpose = trainingPurpose;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    public void setPassedModuleCount(int passedModuleCount) {
        this.passedModuleCount = passedModuleCount;
    }

    public void setTaskCount(int taskCount) {
        this.taskCount = taskCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return name.equals(student.name) &&
                surName.equals(student.surName) &&
                age == student.age &&
                passedModuleCount == student.passedModuleCount &&
                taskCount == student.taskCount;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surName, age, passedModuleCount, taskCount);
    }

    @Override
    public String toString() {
        return "Student{" +
                "expirienced=" + expirienced +
                ", trainingPurpose='" + trainingPurpose + '\'' +
                ", groupNumber=" + groupNumber +
                ", passedModuleCount=" + passedModuleCount +
                ", taskCount=" + taskCount +
                ", about='" + about + '\'' +
                ", name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", age=" + age +
                '}';
    }


}
