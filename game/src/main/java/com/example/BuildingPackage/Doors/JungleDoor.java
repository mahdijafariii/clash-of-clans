package com.example.BuildingPackage.Doors;

import com.example.BuildingPackage.Building;
import javafx.scene.image.ImageView;

public class JungleDoor extends Building
{
    String img_1 = this.getClass().getResource("/com/example/game/Images/JungleDoor1.png").toString();
    String img_2 = this.getClass().getResource("/com/example/game/Images/JungleDoor2.png").toString();
    String img_3 = this.getClass().getResource("/com/example/game/Images/JungleDoor3.png").toString();
    String img_main = this.getClass().getResource("/com/example/game/Images/JungleDoor1.png").toString();

    int multiplier = 1;
    double x , y;

    public JungleDoor(ImageView imageView)
    {
        this.x = imageView.getX();
        this.y = imageView.getY();
        super.health = 600;
        super.damage = 20;
    }
}
