public class Student {
    private String firstName;
    private String surName;
    private int age;
    private boolean ixPerience;
    private String trainingPurpose;
    private int groupNumber;
    private int passedModuleCount;
    private int closedTasks;
    public static int taskCountForAll;
    public static int maxClosedModuls;
    public static final int MAX_MODULES_COUNT = 20;

    public Student(String firstName, String surName, int age) {
        this(firstName, surName, age, false, "", 0, 0, 0);
    }

    public Student(String firstName, String surName, int age, boolean ixPerience, String trainingPurpose,
                   int groupNumber, int passedModuleCount, int closedTasks) {
        this.firstName = firstName;
        this.surName = surName;
        this.age = age;
        this.ixPerience = ixPerience;
        this.trainingPurpose = trainingPurpose;
        this.groupNumber = groupNumber;
        this.passedModuleCount = passedModuleCount;
        this.closedTasks = closedTasks;
    }

    public void solveTask() {
        System.out.println("Задание завершенщ");
        closedTasks++;
        taskCountForAll++;
    }

    public void solveModule() {
        if (passedModuleCount < MAX_MODULES_COUNT) {
            System.out.println("Модуль завершен");
            passedModuleCount++;
            if (passedModuleCount > maxClosedModuls) {
                maxClosedModuls = passedModuleCount;
            }else {
                System.out.println("Все модули пройдены!");
            }

        }
    }

    public String getSurName() {
        return surName;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getAge() {
        return age;
    }

    public boolean isIxPerience() {
        return ixPerience;
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

    public int getClosedTasks() {
        return closedTasks;
    }

    public void completeTheTask() {

    }

    public void askTheQuestion() {

    }

    public void closeTheModule(int number) {

    }

    public void talkWithTheCurator(String nameOfCurator) {

    }

    public void setIxPerience(boolean ixPerience) {
        this.ixPerience = ixPerience;
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

    public void setClosedTasks(int closedTasks) {
        this.closedTasks = closedTasks;
    }
}
