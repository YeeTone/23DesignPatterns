package structure.adapter.advancedPlayer;

import structure.adapter.interface0.AdvancedMediaPlayer;

public class MP4Player implements AdvancedMediaPlayer {
    @Override
    public void playVLC(String fileName) {
        System.out.println("Do nothing");
    }

    @Override
    public void playMP4(String fileName) {
        System.out.println("Playing mp4 file. Name: "+fileName);
    }
}
