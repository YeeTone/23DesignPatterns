package structure.adapter.adapter;

import structure.adapter.interface0.AdvancedMediaPlayer;
import structure.adapter.interface0.MediaPlayer;
import structure.adapter.advancedPlayer.MP4Player;
import structure.adapter.advancedPlayer.VLCPlayer;

public class MediaAdapter implements MediaPlayer {

    AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String audioType){
        if(audioType.equalsIgnoreCase("vlc")){
            advancedMediaPlayer = new VLCPlayer();
        }else if(audioType.equalsIgnoreCase("mp4")){
            advancedMediaPlayer = new MP4Player();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("vlc")){
            advancedMediaPlayer.playVLC(fileName);
        }else if(audioType.equalsIgnoreCase("mp4")){
            advancedMediaPlayer.playMP4(fileName);
        }
    }
}
