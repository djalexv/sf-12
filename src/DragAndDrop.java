public class DragAndDrop extends  Task {
    public DragAndDrop(boolean solved) {
        super(solved);
    }

    @Override
    public String getTypeOfTask() {
        return "DragAndDrop";
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
