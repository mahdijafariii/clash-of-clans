package com.example.BuildingPackage.Castles;

import com.example.BuildingPackage.Building;
import com.example.MapPackage.JungleMap;
import com.example.MapPackage.Map;
import com.example.UserPackage.Administrator;
import com.example.ViewPackage.DarkJungleMapController;
import com.example.ViewPackage.JungleMapController;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class JungleCastle extends Building
{
    String img_1 = this.getClass().getResource("/com/example/game/Images/JungleCastle1.png").toString();
    String img_2 = this.getClass().getResource("/com/example/game/Images/JungleCastle2.png").toString();
    String img_3 = this.getClass().getResource("/com/example/game/Images/JungleCastle3.png").toString();
    String img_main = this.getClass().getResource("/com/example/game/Images/JungleCastle1.png").toString();

    double x , y;

    public JungleCastle(ImageView imageView)
    {
        super.setX(imageView.getLayoutX());
        super.setY(imageView.getLayoutY());
        super.setMultiplier(1);
        super.isDestroyed = false;
        super.health = 1000;
        super.damage = 0;
    }

    public void checkForHealth()
    {
        if (Administrator.getCurrentMap() instanceof JungleMap)
        {
            if (this.getHealth() <= 200)
            {
                if (this.getHealth() == 0)
                {
                    for (ImageView imageView : Administrator.getJungleMapController().getImages())
                    {
                        if (imageView.getLayoutX() == this.getX() && imageView.getLayoutY() == this.getY())
                        {
                            Image image = new Image(img_3);
                            imageView.setImage(image);
                        }
                    }
                }
                else
                {
                    for (ImageView imageView : Administrator.getJungleMapController().getImages())
                    {
                        if (imageView.getLayoutX() == this.getX() && imageView.getLayoutY() == this.getY())
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
                    for (ImageView imageView : Administrator.getDarkJungleMapController().getImages())
                    {
                        if (imageView.getLayoutX() == this.getX() && imageView.getLayoutY() == this.getY())
                        {
                            Image image = new Image(img_3);
                            imageView.setImage(image);
                        }
                    }
                }
                else
                {
                    for (ImageView imageView : Administrator.getDarkJungleMapController().getImages())
                    {
                        if (imageView.getLayoutX() == this.getX() && imageView.getLayoutY() == this.getY())
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