package structure.adapter.advancedPlayer;

public class VLCPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVLC(String fileName) {
        System.out.println("Playing VLC file. Name: "+fileName);
    }

    @Override
    public void playMP4(String fileName) {
        System.out.println("Do nothing");
    }
}
