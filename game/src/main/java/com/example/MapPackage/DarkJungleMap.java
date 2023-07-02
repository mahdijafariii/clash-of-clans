package com.example.MapPackage;

import com.example.BuildingPackage.Castles.JungleCastle;
import com.example.BuildingPackage.Doors.JungleDoor;
import com.example.BuildingPackage.Towers.JungleTower;
import com.example.ViewPackage.DarkJungleMapController;
import javafx.scene.image.ImageView;
import java.util.ArrayList;

public class DarkJungleMap extends Map
{
    public DarkJungleMap(DarkJungleMapController darkJungleMapController)
    {
        super.setFxmlPageName("dark-jungle-map.fxml");
        super.setHeroLimit(40);
        super.setBuildings(new ArrayList<>());
        super.setHeroes(new ArrayList<>());
        setBuildings(darkJungleMapController);
    }

    private void setBuildings(DarkJungleMapController darkJungleMapController)
    {
        ArrayList<ImageView> images = darkJungleMapController.getImages();

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