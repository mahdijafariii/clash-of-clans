package com.example.HeroPackage.Warrior;

import com.example.HeroPackage.Heroes;
import javafx.scene.image.Image;

public class SecondWarrior extends Heroes {
    String img_walk1 = this.getClass().getResource("/com/example/game/Images/Warrior_02__WALK_000.png").toString();
    String img_walk2 = this.getClass().getResource("/com/example/game/Images/Warrior_02__WALK_005.png").toString();

    String img_Attack1 = this.getClass().getResource("/com/example/game/Images/Warrior_02__ATTACK_005.png").toString();
    String img_Attack2 = this.getClass().getResource("/com/example/game/Images/Warrior_02__ATTACK_006.png").toString();
    String img_Attack3 = this.getClass().getResource("/com/example/game/Images/Warrior_02__ATTACK_007.png").toString();
    String img_main = this.getClass().getResource("/com/example/game/Images/Warrior_02__Main.png").toString();
    int action = 1;
    public SecondWarrior(double x , double y) {
        super.health=140;

        super.power=7 ;

        super.speed = 2;

        setImage(new Image(img_main));

        setFitWidth(200);
        setFitHeight(100);

        setTranslateX(x);
        setTranslateY(y);
    }
}
