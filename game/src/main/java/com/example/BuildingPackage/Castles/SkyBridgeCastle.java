package com.example.BuildingPackage.Castles;

import com.example.BuildingPackage.Building;
import javafx.scene.image.ImageView;

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
        super.damage = 30;
    }
}