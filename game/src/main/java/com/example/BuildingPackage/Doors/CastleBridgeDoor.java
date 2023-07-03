package com.example.BuildingPackage.Doors;

import com.example.BuildingPackage.Building;
import com.example.ViewPackage.CastleBridgeMapController;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class CastleBridgeDoor extends Building
{
    String img_1 = this.getClass().getResource("/com/example/game/Images/CastleBridgeDoor1.png").toString();
    String img_2 = this.getClass().getResource("/com/example/game/Images/CastleBridgeDoor2.png").toString();
    String img_3 = this.getClass().getResource("/com/example/game/Images/CastleBridgeDoor3.png").toString();
    String img_main = this.getClass().getResource("/com/example/game/Images/CastleBridgeDoor1.png").toString();

    int multiplier = 1;
    double x , y;

    public CastleBridgeDoor (ImageView imageView)
    {
        this.x = imageView.getX();
        this.y = imageView.getY();
        super.health = 600;
        super.damage = 0;
    }

    //-----------------CHECK FOR TOWER HEALTH FUNCTION--------------------


    public void checkForHealth(CastleBridgeMapController castleBridgeMapController)
    {
        if (this.getHealth() <= 200)
        {
            if (this.getHealth() == 0)
            {
                for (ImageView imageView : castleBridgeMapController.getImages())
                {
                    if (imageView.getTranslateX() == this.getTranslateX() && imageView.getTranslateY() == this.getTranslateY())
                    {
                        Image image = new Image(img_3);
                        imageView.setImage(image);
                    }
                }
            }
            else
            {
                for (ImageView imageView : castleBridgeMapController.getImages())
                {
                    if (imageView.getTranslateX() == this.getTranslateX() && imageView.getTranslateY() == this.getTranslateY())
                    {
                        Image image = new Image(img_2);
                        imageView.setImage(image);
                    }
                }
            }
        }
    }
}