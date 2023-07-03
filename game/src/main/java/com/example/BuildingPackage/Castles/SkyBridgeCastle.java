package com.example.BuildingPackage.Castles;

import com.example.BuildingPackage.Building;
import com.example.MapPackage.TwoPlayerMap;
import com.example.ViewPackage.SkyBridgeMapController;
import com.example.ViewPackage.TwoPlayerMapController;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.util.Map;

public class SkyBridgeCastle extends Building
{
    String img_1 = this.getClass().getResource("/com/example/game/Images/SkyBridgeCastle1.png").toString();
    String img_2 = this.getClass().getResource("/com/example/game/Images/SkyBridgeCastle2.png").toString();
    String img_3 = this.getClass().getResource("/com/example/game/Images/SkyBridgeCastle3.png").toString();
    String img_main = this.getClass().getResource("/com/example/game/Images/SkyBridgeCastle1.png").toString();

    int multiplier = 3;
    double x , y;

    public SkyBridgeCastle(ImageView imageView)
    {
        this.x = imageView.getX();
        this.y = imageView.getY();
        super.health = 1000;
        super.damage = 0;
    }

    //-----------------CHECK FOR TOWER HEALTH FUNCTION--------------------

    public void checkForHealth(SkyBridgeMapController skyBridgeMapController , TwoPlayerMapController twoPlayerMapController , Map map)
    {
        if (map instanceof TwoPlayerMap)
        {
            if (this.getHealth() <= 200)
            {
                if (this.getHealth() == 0)
                {
                    for (ImageView imageView : twoPlayerMapController.getImages())
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
                    for (ImageView imageView : twoPlayerMapController.getImages())
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
        else
        {
            if (this.getHealth() <= 200)
            {
                if (this.getHealth() == 0)
                {
                    for (ImageView imageView : skyBridgeMapController.getImages())
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
                    for (ImageView imageView : skyBridgeMapController.getImages())
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

}