package com.springinaction.springidol;



/**
 * Created by weixiao on 2019/2/22 15:02
 */
public class Instrumentalist implements Performer {
    public Instrumentalist(){

    }
    public void perform() throws PerformanceException {
        System.out.println("Playing "+ song +" : ");
        instrument.play();
    }

    private String song;
    //注入歌曲
    public void setSong(String song){
        this.song = song;
    }

    public String getSong(){
        return song;
    }
    public String screamSong(){
        return song;
    }
    private Instrument instrument;

    public void setInstrument(Instrument instrument){
        this.instrument = instrument;
    }
}
