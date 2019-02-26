package com.springinaction.springidol;

import java.util.Collection;

/**
 * Created by weixiao on 2019/2/25 14:39
 */
public class OneManBand implements Performer {
    private Collection<Instrument> instruments;
    public OneManBand(){}
    public void perform() throws PerformanceException {
        for(Instrument instrument :instruments){
            instrument.play();
        }
    }
    //注入instrument 集合
    public void setInstruments(Collection<Instrument> instruments){
        this.instruments = instruments;
    }
}
