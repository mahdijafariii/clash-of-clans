package com.example.MapPackage;

import com.example.BuildingPackage.Castles.JungleCastle;
import com.example.BuildingPackage.Castles.SkyBridgeCastle;
import com.example.BuildingPackage.Doors.JungleDoor;
import com.example.BuildingPackage.Doors.SkyBridgeDoor;
import com.example.BuildingPackage.Towers.JungleTower;
import com.example.BuildingPackage.Towers.SkyBridgeTower;
import com.example.ViewPackage.JungleMapController;
import com.example.ViewPackage.SkyBridgeMapController;
import javafx.scene.image.ImageView;

import java.util.ArrayList;

public class SkyBridgeMap extends Map
{
    public SkyBridgeMap(SkyBridgeMapController skyBridgeMapController)
    {
        super.setFxmlPageName("sky-bridge-map.fxml");
        super.setHeroLimit(25);
        super.setBuildings(new ArrayList<>());
        super.setHeroes(new ArrayList<>());
        setBuildings(skyBridgeMapController);
    }

    private void setBuildings(SkyBridgeMapController skyBridgeMapController)
    {
        ArrayList<ImageView> images = skyBridgeMapController.getImages();

        for (ImageView imageView : images)
        {
            if (imageView.getId().startsWith("tower"))
            {
                SkyBridgeTower skyBridgeTower = new SkyBridgeTower(imageView);
                super.getBuildings().add(skyBridgeTower);
            }
            else if (imageView.getId().startsWith("door"))
            {
                SkyBridgeDoor skyBridgeDoor = new SkyBridgeDoor(imageView);
                super.getBuildings().add(skyBridgeDoor);
            }
            else if (imageView.getId().startsWith("castle"))
            {
                SkyBridgeCastle skyBridgeCastle = new SkyBridgeCastle(imageView);
                super.getBuildings().add(skyBridgeCastle);
            }
        }
    }
}