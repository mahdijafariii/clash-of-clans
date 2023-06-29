package com.example.HeroPackage.elves;

import com.example.HeroPackage.Heroes;
import javafx.scene.image.Image;

public class ThirdElf extends Heroes {
    String img_walk1 = this.getClass().getResource("/com/example/game/Images/Elf_03__WALK_000.png").toString();
    String img_walk2 = this.getClass().getResource("/com/example/game/Images/Elf_03__WALK_005.png").toString();

    String img_Attack1 = this.getClass().getResource("/com/example/game/Images/Elf_03__ATTACK_006.png").toString();
    String img_Attack2 = this.getClass().getResource("/com/example/game/Images/Elf_03__ATTACK_007.png").toString();
    String img_Attack3 = this.getClass().getResource("/com/example/game/Images/Elf_03__ATTACK_008.png").toString();
    String img_Attack4 = this.getClass().getResource("/com/example/game/Images/Elf_03__ATTACK_009.png").toString();

    String img_main = this.getClass().getResource("/com/example/game/Images/Elf_03__Main.png").toString();


    int action = 1;
    public ThirdElf(double x , double y) {
        super.health=80;

        super.power=6 ;

        super.speed = 3;
        super.info="Elf magician\n" +
                "With his magic, he destroys and destroys his enemies\n" +
                "Stay away from him";

        setImage(new Image(img_main));

        setFitWidth(200);
        setFitHeight(100);

        setTranslateX(x);
        setTranslateY(y);
    }

    public String toString(){
        return "Elf Magician:\n" +
                "Health = 80 \n " +
                "Power = 6 \n " +
                "Speed = 3 \n" ;
    }

    public void showCharacterInfoAttack(){
        for(int i = 0 ; i < 120 ; i ++){
            if(i%4==0){
                setImage(new Image(img_Attack1));
            }
            else if (i%4==1){
                setImage(new Image(img_Attack2));
            }
            else if (i%4==2){
                setImage(new Image(img_Attack3));
            }
            else if (i%4==3){
                setImage(new Image(img_Attack4));
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
