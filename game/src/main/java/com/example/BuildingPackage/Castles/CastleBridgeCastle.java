package com.example.BuildingPackage.Castles;

import com.example.BuildingPackage.Building;
import com.example.ViewPackage.CastleBridgeMapController;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class CastleBridgeCastle extends Building
{
    String img_1 = this.getClass().getResource("/com/example/game/Images/CastleBridgeCastle1.png").toString();
    String img_2 = this.getClass().getResource("/com/example/game/Images/CastleBridgeCastle2.png").toString();
    String img_3 = this.getClass().getResource("/com/example/game/Images/CastleBridgeCastle3.png").toString();
    String img_main = this.getClass().getResource("/com/example/game/Images/CastleBridgeCastle1.png").toString();

    int multiplier = 3;
    double x , y;

    public CastleBridgeCastle (ImageView imageView)
    {
        this.x = imageView.getX();
        this.y = imageView.getY();
        super.health = 1000;
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
                    if (imageView.getTranslateX() == this.getX() && imageView.getTranslateY() == this.getY())
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
                    if (imageView.getTranslateX() == this.getX() && imageView.getTranslateY() == this.getY())
                    {
                        Image image = new Image(img_2);
                        imageView.setImage(image);
                    }
                }
            }
        }
    }
}