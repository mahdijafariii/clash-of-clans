package com.example.BuildingPackage;

import javafx.scene.image.ImageView;

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
