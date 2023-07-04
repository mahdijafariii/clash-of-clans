package com.example.BuildingPackage;

import com.example.HeroPackage.Heroes;
import com.example.ViewPackage.SkyBridgeMapController;
import javafx.scene.image.ImageView;
import java.lang.Math;

import java.util.ArrayList;

public abstract class Building
{
     public int health;
     public int damage;
     public double x , y;
     public boolean isDestroyed;
     public int multiplier;

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
    public double getY()
    {
        return y;
    }
    public void setY(double y)
    {
        this.y = y;
    }
    public double getX()
    {
        return x;
    }
    public void setX(double x)
    {
        this.x = x;
    }
    public int getMultiplier()
    {
        return multiplier;
    }
    public void setMultiplier(int multiplier)
    {
        this.multiplier = multiplier;
    }

    public abstract void checkForHealth();
}
