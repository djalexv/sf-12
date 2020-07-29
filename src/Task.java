import java.awt.print.Printable;

abstract public class Task {
    int taskNumber;
    String typeOfTask;
    String textOffTask;

    public Task(int taskNumber, String typeOfTask) {
        this.taskNumber = taskNumber;
        this.textOffTask = typeOfTask;
        this.textOffTask = taskNumber + ") "+typeOfTask + " - Текст задания ";
    }

    @Override
    public String toString() {
        return "Task{" +
                "taskNumber=" + taskNumber +
                ", typeOfTask='" + typeOfTask + '\'' +
                ", textOffTask='" + textOffTask + '\'' +
                '}';
    }
}
