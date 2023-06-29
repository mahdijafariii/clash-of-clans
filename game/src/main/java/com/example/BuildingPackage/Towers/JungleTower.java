package com.example.BuildingPackage.Towers;

import com.example.BuildingPackage.Building;
import javafx.scene.image.ImageView;

public class JungleTower extends Building
{
    String img_1 = this.getClass().getResource("/com/example/game/Images/JungleTower1.png").toString();
    String img_2 = this.getClass().getResource("/com/example/game/Images/JungleTower2.png").toString();
    String img_3 = this.getClass().getResource("/com/example/game/Images/JungleTower3.png").toString();
    String img_main = this.getClass().getResource("/com/example/game/Images/JungleTower1.png").toString();

    int multiplier = 2;
    double x , y;

    public JungleTower(ImageView imageView)
    {
        this.x = imageView.getX();
        this.y = imageView.getY();
        super.health = 400;
        super.damage = 20;
    }
}