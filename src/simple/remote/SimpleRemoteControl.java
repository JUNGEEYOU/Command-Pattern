package simple.remote;

public class SimpleRemoteControl {
    Command slot;

    public SimpleRemoteControl(){}

    public void setCommand(Command command){
        slot = command;
    }

    public void buttonWasPressed(){   // 해당 버튼을 클릭할 경우
        slot.execute();
    }
}
