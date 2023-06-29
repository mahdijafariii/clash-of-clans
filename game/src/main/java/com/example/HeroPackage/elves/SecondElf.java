package com.example.HeroPackage.elves;

import com.example.HeroPackage.Heroes;
import javafx.scene.image.Image;

public class SecondElf extends Heroes {
    String img_walk1 = this.getClass().getResource("/com/example/game/Images/Elf_02__WALK_000.png").toString();
    String img_walk2 = this.getClass().getResource("/com/example/game/Images/Elf_02__WALK_005.png").toString();

    String img_Attack1 = this.getClass().getResource("/com/example/game/Images/Elf_02__ATTACK_003.png").toString();
    String img_Attack2 = this.getClass().getResource("/com/example/game/Images/Elf_02__ATTACK_004.png").toString();
    String img_Attack3 = this.getClass().getResource("/com/example/game/Images/Elf_02__ATTACK_005.png").toString();
    String img_main = this.getClass().getResource("/com/example/game/Images/Elf_02__Main.png").toString();
    int action = 1;

    public SecondElf(double x , double y) {
        super.health=100;

        super.power=5 ;

        super.speed = 3;

        setImage(new Image(img_main));

        setFitWidth(200);
        setFitHeight(100);

        setTranslateX(x);
        setTranslateY(y);
    }
}
