package day10.problem03.bean;

import day10.problem03.service.Fitter;

public abstract class Receptionist {
    private Fitter fitter;

    public Receptionist() {

    }

    public Receptionist(Fitter fitter) {
        this.fitter = fitter;
    }

    public Fitter getFitter() {
        return fitter;
    }

    public void setFitter(Fitter fitter) {
        this.fitter = fitter;
    }

    public abstract void recept();
}
