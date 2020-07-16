public class WriteCode extends Task {
    public WriteCode(boolean solved) {
        super(solved);
    }

    @Override
    public String getTypeOfTask() {
        return "WriteCode";
    }

    @Override
    public void setTypeOfTask(String typeOfTask) {
        this.typeOfTask = this.getTypeOfTask();
    }

    @Override
    public boolean checkAutomatically() {
        return false;
    }
}
