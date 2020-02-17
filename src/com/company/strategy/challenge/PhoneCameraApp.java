package com.company.strategy.challenge;

public abstract class PhoneCameraApp {
    Share share;

    public Share getShare() {
        return share;
    }

    public void setShare(Share share) {
        this.share = share;
    }

    public abstract void edit();

    public void take(){
        System.out.println("Took a picture!");
    }

    public void save(){
        System.out.println("Saved a picture!");
    }

}
