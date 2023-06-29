package com.example.MapPackage;

import com.example.BuildingPackage.Castles.CastleBridgeCastle;
import com.example.BuildingPackage.Doors.CastleBridgeDoor;
import com.example.BuildingPackage.Towers.CastleBridgeTower;
import com.example.ViewPackage.CastleBridgeMapController;
import javafx.scene.image.ImageView;
import java.util.ArrayList;

public class CastleBridgeMap extends Map
{
    CastleBridgeMap()
    {
        super.fxmlPageName = "castle-bridge-map.fxml";
        super.heroLimit = 40;
        super.buildings = new ArrayList<>();
        setBuildings();
    }

    private void setBuildings()
    {
        CastleBridgeMapController castleBridgeMapController = new CastleBridgeMapController();
        ArrayList<ImageView> images = castleBridgeMapController.getImages();

        for (ImageView imageView : images)
        {
            if (imageView.getId().startsWith("tower"))
            {
                CastleBridgeTower castleBridgeTower = new CastleBridgeTower(imageView);
                super.buildings.add(castleBridgeTower);
            }
            else if (imageView.getId().startsWith("door"))
            {
                CastleBridgeDoor castleBridgeDoor = new CastleBridgeDoor(imageView);
                super.buildings.add(castleBridgeDoor);
            }
            else if (imageView.getId().startsWith("castle"))
            {
                CastleBridgeCastle castleBridgeCastle = new CastleBridgeCastle(imageView);
                super.buildings.add(castleBridgeCastle);
            }
        }
    }
}