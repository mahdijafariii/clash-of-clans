package com.example.MapPackage;

import com.example.BuildingPackage.Castles.JungleCastle;
import com.example.BuildingPackage.Doors.JungleDoor;
import com.example.BuildingPackage.Towers.JungleTower;
import com.example.ViewPackage.DarkJungleMapController;
import javafx.scene.image.ImageView;
import java.util.ArrayList;

public class DarkJungleMap extends Map
{
    DarkJungleMap()
    {
        super.fxmlPageName = "dark-jungle-map.fxml";
        super.heroLimit = 40;
        super.buildings = new ArrayList<>();
        super.heroes = new ArrayList<>();
        setBuildings();
    }

    private void setBuildings()
    {
        DarkJungleMapController darkJungleMapController = new DarkJungleMapController();
        ArrayList<ImageView> images = darkJungleMapController.getImages();

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