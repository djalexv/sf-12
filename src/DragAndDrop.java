public class DragAndDrop extends Task implements Autochecked {
 String [][] varArray;
    public DragAndDrop(int taskNumber) {
        super(taskNumber,"DragAndDrop");
        this.varArray = new String[][] {{"1","2", "3"},{"a", "b", "c"}} ;
    }

    @Override
    public boolean isCheckAutomatically() {
        return true;
    }
}
