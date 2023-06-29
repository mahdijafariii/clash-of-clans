package com.example.MapPackage.Towers;

import com.example.MapPackage.Building;
import javafx.scene.image.ImageView;

public class CastleBridgeTower extends Building
{
    String img_1 = this.getClass().getResource("/com/example/game/Images/CastleBridgeTower1.png").toString();
    String img_2 = this.getClass().getResource("/com/example/game/Images/CastleBridgeTower2/.png").toString();
    String img_3 = this.getClass().getResource("/com/example/game/Images/CastleBridgeTower3.png").toString();
    String img_main = this.getClass().getResource("/com/example/game/Images/CastleBridgeTower1.png").toString();

    double x , y;

    CastleBridgeTower (ImageView imageView)
    {
        this.x = imageView.getX();
        this.y = imageView.getY();
        super.health = 1000;
        super.damage = 30;
    }
}