public class Cod extends Task{
    String codText;
    public Cod(int taskNumber) {
        super(taskNumber,"Cod");
        codText = taskNumber+ ") - Текст кода";

    }
}
