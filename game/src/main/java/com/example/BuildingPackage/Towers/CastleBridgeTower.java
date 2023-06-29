package com.example.BuildingPackage.Towers;

import com.example.BuildingPackage.Building;
import javafx.scene.image.ImageView;

public class CastleBridgeTower extends Building
{
    String img_1 = this.getClass().getResource("/com/example/game/Images/CastleBridgeTower1.png").toString();
    String img_2 = this.getClass().getResource("/com/example/game/Images/CastleBridgeTower2/.png").toString();
    String img_3 = this.getClass().getResource("/com/example/game/Images/CastleBridgeTower3.png").toString();
    String img_main = this.getClass().getResource("/com/example/game/Images/CastleBridgeTower1.png").toString();

    int multiplier = 2;
    double x , y;

    public CastleBridgeTower (ImageView imageView)
    {
        this.x = imageView.getX();
        this.y = imageView.getY();
        super.health = 600;
        super.damage = 20;
    }
}