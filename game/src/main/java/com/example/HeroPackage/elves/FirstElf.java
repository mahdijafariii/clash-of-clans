package com.example.HeroPackage.elves;

import com.example.HeroPackage.Heroes;
import javafx.scene.image.Image;

public class FirstElf extends Heroes {

    String img_walk1 = this.getClass().getResource("/com/example/game/Images/Elf_01__WALK_000.png").toString();
    String img_walk2 = this.getClass().getResource("/com/example/game/Images/Elf_01__WALK_005.png").toString();

    String img_Attack1 = this.getClass().getResource("/com/example/game/Images/Elf_01__ATTACK_001.png").toString();
    String img_Attack2 = this.getClass().getResource("/com/example/game/Images/Elf_01__ATTACK_002.png").toString();
    String img_Attack3 = this.getClass().getResource("/com/example/game/Images/Elf_01__ATTACK_007.png").toString();
    String img_main = this.getClass().getResource("/com/example/game/Images/Elf_01__Main.png").toString();
    int action = 1;
    public FirstElf(double x , double y) {
        super.health=50;

        super.power=8 ;

        super.speed = 3;

        setImage(new Image(img_main));

        setFitWidth(200);
        setFitHeight(100);

        setTranslateX(x);
        setTranslateY(y);
    }


}
