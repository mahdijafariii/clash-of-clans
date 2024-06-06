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
        super.info="Elf Swordsman\n" +
                "He is famous for one-handed swordsmanship\n" +
                "His sword quickly splits all objects into two halves";

        setImage(new Image(img_main));

        setFitWidth(200);
        setFitHeight(100);

        setTranslateX(x);
        setTranslateY(y);
    }

    public String toString(){
        return "Elf Swordsman:\n" +
                "Health = 100 \n " +
                "Power = 5 \n " +
                "Speed = 3 \n" ;
    }

    public void showCharacterInfoAttack(){
        for(int i = 0 ; i < 90 ; i ++){
            if(i%3==0){
                setImage(new Image(img_Attack1));
            }
            else if (i%3==1){
                setImage(new Image(img_Attack2));
            }
            else if (i%3==2){
                setImage(new Image(img_Attack3));
            }
        }
    }
    public void walkForLogin(){
        action++;
        setTranslateX(getTranslateX()+speed);
        if(action%2==0){
            setImage(new Image(img_walk1));
        }
        else {
            setImage(new Image(img_walk2));
        }

    }
}
