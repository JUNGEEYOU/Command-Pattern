package macro;

// NoCommand : 널 객체로 딱히 리턴할 객체는 없지만, 클라이언트 쪽에 null처리를 하고 싶지 않을 때 사용한다.
public class NoCommand implements Command {
    public void execute() { }
    public void undo(){}
}