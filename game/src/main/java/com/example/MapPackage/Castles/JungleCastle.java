package com.example.MapPackage.Castles;

import com.example.MapPackage.Building;
import javafx.scene.image.ImageView;

public class JungleCastle extends Building
{
    String img_1 = this.getClass().getResource("/com/example/game/Images/JungleCastle1.png").toString();
    String img_2 = this.getClass().getResource("/com/example/game/Images/JungleCastle2.png").toString();
    String img_3 = this.getClass().getResource("/com/example/game/Images/JungleCastle3.png").toString();
    String img_main = this.getClass().getResource("/com/example/game/Images/JungleCastle1.png").toString();

    double x , y;

    JungleCastle (ImageView imageView)
    {
        this.x = imageView.getX();
        this.y = imageView.getY();
        super.health = 1000;
        super.damage = 30;
    }
}