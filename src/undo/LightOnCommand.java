package undo;

public class LightOnCommand implements Command {
    Light light ;    // 리시버: 실제 동작을 하는 객체

    public LightOnCommand(Light light){    // 생성자에서 어떤 객체를 제어할지 전달
        this.light = light;
    }

    public void execute(){   // 리시버 객체가 실제 작업을 하도록 하는 메소드
        light.on();
    }

    public void undo(){
        light.off();
    }
}
