package com.typicon.demo;


public class Vespers {

    private Kathisma kathisma;

    private ToneOfTheWeek toneOfTheWeek;

    private SticheraHymns sticheraHymns;

    private Aposticha aposticha;

    private Apolytikia apolytikia;

    public Vespers(Kathisma kathisma, ToneOfTheWeek toneOfTheWeek, SticheraHymns sticheraHymns, Aposticha aposticha, Apolytikia apolytikia){
        this.kathisma = kathisma;
        this.toneOfTheWeek = toneOfTheWeek;
        this.sticheraHymns = sticheraHymns;
        this.aposticha = aposticha;
        this.apolytikia = apolytikia;
    }

    public Vespers(){};

    public Kathisma getKathisma() {
        return kathisma;
    }

    public void setKathisma(Kathisma kathisma) {
        this.kathisma = kathisma;
    }

    public ToneOfTheWeek getToneOfTheWeek() {
        return toneOfTheWeek;
    }

    public void setToneOfTheWeek(ToneOfTheWeek toneOfTheWeek) {
        this.toneOfTheWeek = toneOfTheWeek;
    }

    public SticheraHymns getSticheraHymns() {
        return sticheraHymns;
    }

    public void setSticheraHymns(SticheraHymns sticheraHymns) {
        this.sticheraHymns = sticheraHymns;
    }

    public Aposticha getAposticha() {
        return aposticha;
    }

    public void setAposticha(Aposticha aposticha) {
        this.aposticha = aposticha;
    }

    public Apolytikia getApolytikia() {
        return apolytikia;
    }

    public void setApolytikia(Apolytikia apolytikia) {
        this.apolytikia = apolytikia;
    }
}
