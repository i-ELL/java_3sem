package package_12;

public interface Command {
    void execute(String str, int...args);
    void undo();
}
