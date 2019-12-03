package remote;

public class StereoOnWithCDCommand implements Command {
    Stereo stereo;

    public StereoOnWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    public void execute() {
        // cd 전원을 켜고, cd를 재생하고, 볼륨을 맞춥니다.
        stereo.on();
        stereo.setCD();
        stereo.setVolume(11);
    }
}