abstract public class Task implements Autochecked{
    public boolean solved;
    public String typeOfTask;

    public Task(boolean solved) {
        this.solved = solved;
    }

    abstract public String getTypeOfTask();

    abstract public void setTypeOfTask(String typeOfTask);

//    public boolean isSolved() {
//        return solved;
//    }
//
//    public void setSolved(boolean solved) {
//        this.solved = solved;
//    }
}
