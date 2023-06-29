package com.example.BuildingPackage.Towers;

import com.example.BuildingPackage.Building;
import javafx.scene.image.ImageView;

public class SkyBridgeTower extends Building
{
    String img_1 = this.getClass().getResource("/com/example/game/Images/SkyBridgeTower1.png").toString();
    String img_2 = this.getClass().getResource("/com/example/game/Images/SkyBridgeTower2.png").toString();
    String img_3 = this.getClass().getResource("/com/example/game/Images/SkyBridgeTower3.png").toString();
    String img_main = this.getClass().getResource("/com/example/game/Images/SkyBridgeTower1.png").toString();

    int multiplier = 2;
    double x , y;

    public SkyBridgeTower(ImageView imageView)
    {
        this.x = imageView.getX();
        this.y = imageView.getY();
        super.health = 600;
        super.damage = 20;
    }
}