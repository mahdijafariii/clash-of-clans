package com.example.MapPackage;

import com.example.BuildingPackage.Building;
import com.example.HeroPackage.Heroes;
import java.util.ArrayList;

public abstract class Map
{
    private ArrayList<Heroes> heroes;
    private String fxmlPageName;
    private int heroLimit;
    private ArrayList<Building> buildings;

    public ArrayList<Heroes> getHeroes()
    {
        return heroes;
    }
    public ArrayList<Building> getBuildings()
    {
        return buildings;
    }
    public String getFxmlPageName()
    {
        return fxmlPageName;
    }
    public int getHeroLimit()
    {
        return heroLimit;
    }
    public void setHeroLimit(int heroLimit)
    {
        this.heroLimit = heroLimit;
    }
    public void setHeroes(ArrayList<Heroes> heroes)
    {
        this.heroes = heroes;
    }
    public void setBuildings(ArrayList<Building> buildings)
    {
        this.buildings = buildings;
    }
    public void setFxmlPageName(String fxmlPageName)
    {
        this.fxmlPageName = fxmlPageName;
    }

}