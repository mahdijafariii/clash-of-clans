package com.example.HeroPackage;

import javafx.scene.image.ImageView;

abstract public class Heroes extends ImageView {
    public int power;
    public int speed ;
    public int health ;
    public String info;


    //Getter and Setter ------------------------------------------------



    public int getHealth() {
        return health;
    }

    public int getPower() {
        return power;
    }

    public int getSpeed() {
        return speed;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
