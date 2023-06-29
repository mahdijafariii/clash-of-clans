package com.example.MapPackage;

import com.example.ViewPackage.JungleMapController;
import javafx.fxml.FXML;
import javafx.scene.image.ImageView;

public class JungleMap extends Map
{
    JungleMap(String fxmlPageName)
    {
        super.fxmlPageName = fxmlPageName;
        super.heroLimit = 25;
    }

    private void addBuildings()
    {
        JungleMapController jungleMapController = new JungleMapController();
        for (int i = 0 ; i < jungleMapController.getImages().size() ; i++)
        {
            if (jungleMapController.getImages().get(i) instanceof ImageView)
            {
                if (jungleMapController.getImages().get(i).getId().startsWith("castle") || jungleMapController.getImages().get(i).getId().startsWith("tower"))
                {
                    ImageView imageView = (ImageView) jungleMapController.getImages().get(i);
                }
            }
        }
    }
}