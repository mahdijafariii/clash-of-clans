package com.example.BuildingPackage;

import com.example.HeroPackage.Heroes;
import javafx.scene.image.ImageView;
import java.lang.Math;

import java.util.ArrayList;

public abstract class Building extends ImageView
{
     public int health;
     public int damage;

    //-----------------GETTER AND SETTER--------------------

    public int getHealth()
    {
        return health;
    }
    public int getDamage()
    {
        return damage;
    }
    public void setHealth(int health)
    {
        this.health = health;
    }
    public void setDamage(int damage)
    {
        this.damage = damage;
    }
}
