package com.example.MapPackage.Towers;

import com.example.MapPackage.Building;
import javafx.scene.image.ImageView;

public class JungleTower extends Building
{
    String img_1 = this.getClass().getResource("/com/example/game/Images/JungleTower1.png").toString();
    String img_2 = this.getClass().getResource("/com/example/game/Images/JungleTower2.png").toString();
    String img_3 = this.getClass().getResource("/com/example/game/Images/JungleTower3.png").toString();
    String img_main = this.getClass().getResource("/com/example/game/Images/JungleTower1.png").toString();

    double x , y;

    JungleTower (ImageView imageView)
    {
        this.x = imageView.getX();
        this.y = imageView.getY();
        super.health = 1000;
        super.damage = 30;
    }
}