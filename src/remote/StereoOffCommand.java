package remote;

public class StereoOffCommand implements Command {
    Stereo stereo;

    public StereoOffCommand(Stereo stereo){
        this.stereo = stereo;
    }

    public void execute(){
        // cd 전원을 켜고, cd를 재생하고, 볼륨을 맞춥니다.
        stereo.off();
    }
}
