package remote;

// 1. RemoteControl: 인보커 역할로 리모컨에 해당(웨이터) > 커맨드를 세팅, 캡슐화된 커맨드 행동을 실행시킴
public class RemoteControl {
    Command[] onCommands;
    Command[] offCommands;

    public RemoteControl(){
        onCommands = new Command[7];
        offCommands = new Command[7];

        Command noCommand = new NoCommand();
        for (int i =0; i<7; i++){
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }
    // setCommand : slot 번호와 그 슬롯에 세팅할 커맨드를 전달받음
    public void setCommand(int slot, Command onCommand, Command offCommand){
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    // onButtonWasPushed, offButtonWasPushed: 실제 커맨드를 실행
    public void onButtonWasPushed(int slot){
        onCommands[slot].execute();
    }

    public void offButtonWasPushed(int slot){
        offCommands[slot].execute();
    }

    // toString: 오바라이드하여 슬롯별 출력
    public String toString() {
        StringBuffer stringBuff = new StringBuffer();
        stringBuff.append("\n------ Remote Control -------\n");
        for (int i = 0; i < onCommands.length; i++) {
            stringBuff.append("[slot " + i + "] " + onCommands[i].getClass().getName()
                    + "    " + offCommands[i].getClass().getName() + "\n");
        }
        return stringBuff.toString();
    }
}
