package undo2;

public interface Command {
    public void execute();
    public void undo();
}
