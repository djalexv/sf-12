public class Student {
    public String firstName;
    public String surName;
    public int age;
    public boolean ixPerience;
    public String trainingPurpose;
    public int groupNumber;
    public int closedModules;
    public int closedTasks;

    public Student(String firstName, String surName, int age) {
        this(firstName, surName, age, false, "", 0, 0, 0);
    }

    public Student(String firstName, String surName, int age, boolean ixPerience, String trainingPurpose,
                   int groupNumber, int closedModules, int closedTasks) {
        this.ixPerience = ixPerience;
        this.firstName = firstName;
        this.surName = surName;
        this.age = age;
        this.trainingPurpose = trainingPurpose;
        this.groupNumber = groupNumber;
        this.closedModules = closedModules;
        this.closedTasks = closedTasks;
    }

    public boolean isIxPerience() {
        return ixPerience;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getTrainingPurpose() {
        return trainingPurpose;
    }

    public String getSurName() {
        return surName;
    }

    public int getAge() {
        return age;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public int getClosedModules() {
        return closedModules;
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

}
