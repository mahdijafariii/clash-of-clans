package com.example.MapPackage;

import com.example.BuildingPackage.Castles.JungleCastle;
import com.example.BuildingPackage.Doors.JungleDoor;
import com.example.BuildingPackage.Towers.JungleTower;
import com.example.ViewPackage.JungleMapController;
import javafx.fxml.FXML;
import javafx.scene.image.ImageView;

import java.util.ArrayList;

public class JungleMap extends Map
{
    JungleMap()
    {
        super.fxmlPageName = "jungle-map.fxml";
        super.heroLimit = 25;
        super.buildings = new ArrayList<>();
        setBuildings();
    }

    private void setBuildings()
    {
        JungleMapController jungleMapController = new JungleMapController();
        ArrayList<ImageView> images = jungleMapController.getImages();

        for (ImageView imageView : images)
        {
            if (imageView.getId().startsWith("tower"))
            {
                JungleTower jungleTower = new JungleTower(imageView);
                super.buildings.add(jungleTower);
            }
            else if (imageView.getId().startsWith("door"))
            {
                JungleDoor jungleDoor = new JungleDoor(imageView);
                super.buildings.add(jungleDoor);
            }
            else if (imageView.getId().startsWith("castle"))
            {
                JungleCastle jungleCastle = new JungleCastle(imageView);
                super.buildings.add(jungleCastle);
            }
        }
    }
}