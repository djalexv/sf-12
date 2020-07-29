class Test extends Task implements Autochecked{
    String[] answerArray;
    public Test(int taskNumber) {
        super(taskNumber, "Test");
        this.answerArray = new String[] {"a", "b", "c"};
    }

    @Override
    public boolean isCheckAutomatically() {
        return true;
    }
}
