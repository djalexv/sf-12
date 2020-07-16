public class Test extends Task {
    public Test(boolean solved) {
        super(solved);
    }

    @Override
    public String getTypeOfTask() {
        return "Test";
    }

    @Override
    public void setTypeOfTask(String typeOfTask) {
        this.typeOfTask = this.getTypeOfTask();
    }

    @Override
    public boolean checkAutomatically() {
        return true;
    }
}
