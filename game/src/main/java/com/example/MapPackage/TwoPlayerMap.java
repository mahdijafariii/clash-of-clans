package com.example.MapPackage;

import com.example.BuildingPackage.Castles.SkyBridgeCastle;
import com.example.BuildingPackage.Doors.SkyBridgeDoor;
import com.example.BuildingPackage.Towers.SkyBridgeTower;
import com.example.ViewPackage.TwoPlayerMapController;
import javafx.scene.image.ImageView;
import java.util.ArrayList;

public class TwoPlayerMap extends Map
{
    public TwoPlayerMap(TwoPlayerMapController twoPlayerMapController)
    {
        super.setFxmlPageName("two-player-map.fxml");
        super.setHeroLimit(50);
        super.setBuildings(new ArrayList<>());
        super.setHeroes(new ArrayList<>());
        setBuildings(twoPlayerMapController);
    }

    private void setBuildings(TwoPlayerMapController twoPlayerMapController)
    {
        ArrayList<ImageView> images = twoPlayerMapController.getImages();

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