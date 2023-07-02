package com.example.MapPackage;

import com.example.BuildingPackage.Castles.CastleBridgeCastle;
import com.example.BuildingPackage.Doors.CastleBridgeDoor;
import com.example.BuildingPackage.Towers.CastleBridgeTower;
import com.example.ViewPackage.CastleBridgeMapController;
import javafx.scene.image.ImageView;
import java.util.ArrayList;

public class CastleBridgeMap extends Map
{
    public CastleBridgeMap(CastleBridgeMapController castleBridgeMapController)
    {
        super.setFxmlPageName("castle-bridge-map.fxml");
        super.setHeroLimit(40);
        super.setBuildings(new ArrayList<>());
        super.setHeroes(new ArrayList<>());
        setBuildings(castleBridgeMapController);
    }

    private void setBuildings(CastleBridgeMapController castleBridgeMapController)
    {
        ArrayList<ImageView> images = castleBridgeMapController.getImages();

        for (ImageView imageView : images)
        {
            if (imageView.getId().startsWith("tower"))
            {
                CastleBridgeTower castleBridgeTower = new CastleBridgeTower(imageView);
                super.getBuildings().add(castleBridgeTower);
            }
            else if (imageView.getId().startsWith("door"))
            {
                CastleBridgeDoor castleBridgeDoor = new CastleBridgeDoor(imageView);
                super.getBuildings().add(castleBridgeDoor);
            }
            else if (imageView.getId().startsWith("castle"))
            {
                CastleBridgeCastle castleBridgeCastle = new CastleBridgeCastle(imageView);
                super.getBuildings().add(castleBridgeCastle);
            }
        }
    }
}