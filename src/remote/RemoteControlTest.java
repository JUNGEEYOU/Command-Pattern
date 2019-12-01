package remote;

public class RemoteControlTest {

    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();  // 리모컨: 인보커
        Light light = new Light();   // 조명: 리시버
        LightOnCommand lighton = new LightOnCommand(light);  // 커맨드 객체 - 리시버를 전달

        remote.setCommand(lighton);       // 커맨드 객체를 인보커에게 전달
        remote.buttonWasPressed();        // 실제 작업 실행 요청

    }
}
