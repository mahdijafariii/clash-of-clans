package com.example.MapPackage;

import com.example.BuildingPackage.Building;
import com.example.BuildingPackage.Castles.JungleCastle;
import com.example.BuildingPackage.Doors.JungleDoor;
import com.example.BuildingPackage.Towers.JungleTower;
import com.example.ViewPackage.JungleMapController;
import javafx.scene.image.ImageView;
import java.util.ArrayList;

public class JungleMap extends Map
{
    public JungleMap(JungleMapController jungleMapController)
    {
        super.setFxmlPageName("jungle-map.fxml");
        super.setHeroLimit(25);
        super.setBuildings(new ArrayList<>());
        super.setHeroes(new ArrayList<>());
        setBuildings(jungleMapController);
    }

    private void setBuildings(JungleMapController jungleMapController)
    {
        ArrayList<ImageView> images = jungleMapController.getImages();

        for (ImageView imageView : images)
        {
            if (imageView.getId().startsWith("tower"))
            {
                JungleTower jungleTower = new JungleTower(imageView);
                super.getBuildings().add(jungleTower);
            }
            else if (imageView.getId().startsWith("door"))
            {
                JungleDoor jungleDoor = new JungleDoor(imageView);
                super.getBuildings().add(jungleDoor);
            }
            else if (imageView.getId().startsWith("castle"))
            {
                JungleCastle jungleCastle = new JungleCastle(imageView);
                super.getBuildings().add(jungleCastle);
            }
        }
    }
}