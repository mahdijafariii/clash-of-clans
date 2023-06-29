package com.example.HeroPackage.Knight;

import com.example.HeroPackage.Heroes;
import javafx.scene.image.Image;

public class FirstKnight extends Heroes {
    String img_walk1 = this.getClass().getResource("/com/example/game/Images/Knight_01__WALK_000.png").toString();
    String img_walk2 = this.getClass().getResource("/com/example/game/Images/Knight_01__WALK_005.png").toString();

    String img_Attack1 = this.getClass().getResource("/com/example/game/Images/Knight_01__ATTACK_006.png").toString();
    String img_Attack2 = this.getClass().getResource("/com/example/game/Images/Knight_01__ATTACK_007.png").toString();
    String img_Attack3 = this.getClass().getResource("/com/example/game/Images/Knight_01__ATTACK_008.png").toString();
    String img_main = this.getClass().getResource("/com/example/game/Images/Knight_01__Main.png").toString();

    int action = 1;
    public FirstKnight(double x , double y) {
        super.health=200;

        super.power=10 ;

        super.speed = 1;

        setImage(new Image(img_main));

        setFitWidth(200);
        setFitHeight(100);

        setTranslateX(x);
        setTranslateY(y);
    }




}
