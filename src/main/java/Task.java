public class Task {
    protected String description;
    protected boolean isDone;
    private final char TICK = '\u2713';
    private final char CROSS = '\u2718';

    public Task(String description) {
        this.description = description;
        this.isDone = false;
    }

    public char getStatusIcon() {
        return (isDone?TICK:CROSS);
    }

    public void markAsDone() {
        isDone = true;
    }
}