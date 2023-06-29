package com.example.HeroPackage.Knight;

import com.example.HeroPackage.Heroes;
import javafx.scene.image.Image;

public class ThirdKnight extends Heroes {
    String img_walk1 = this.getClass().getResource("/com/example/game/Images/Knight_03__WALK_000.png").toString();
    String img_walk2 = this.getClass().getResource("/com/example/game/Images/Knight_03__WALK_005.png").toString();

    String img_Attack1 = this.getClass().getResource("/com/example/game/Images/Knight_03__ATTACK_004.png").toString();
    String img_Attack2 = this.getClass().getResource("/com/example/game/Images/Knight_03__ATTACK_005.png").toString();
    String img_Attack3 = this.getClass().getResource("/com/example/game/Images/Knight_03__ATTACK_006.png").toString();
    String img_main = this.getClass().getResource("/com/example/game/Images/Knight_03__Main.png").toString();
    int action = 1;
    public ThirdKnight(double x , double y) {
        super.health=180;

        super.power=10 ;

        super.speed = 1;

        setImage(new Image(img_main));

        setFitWidth(200);
        setFitHeight(100);

        setTranslateX(x);
        setTranslateY(y);
    }
}
