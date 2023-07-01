package com.example.MapPackage;

import com.example.BuildingPackage.Building;
import com.example.HeroPackage.Heroes;

import java.util.ArrayList;

public abstract class Map
{
    ArrayList<Heroes> heroes;
    String fxmlPageName;
    int heroLimit;
    ArrayList<Building> buildings;
}