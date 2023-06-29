package com.example.HeroPackage;

import javafx.scene.image.ImageView;

abstract public class Heroes {
    public int power;
    public int speed ;
    public ImageView character;
    public int health ;


    //Getter and Setter ------------------------------------------------


    public ImageView getCharacter() {
        return character;
    }

    public int getHealth() {
        return health;
    }

    public int getPower() {
        return power;
    }

    public int getSpeed() {
        return speed;
    }

    public void setCharacter(ImageView character) {
        this.character = character;
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
}
