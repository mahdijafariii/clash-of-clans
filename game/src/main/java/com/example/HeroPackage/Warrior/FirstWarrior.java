package com.example.HeroPackage.Warrior;

import com.example.HeroPackage.Heroes;
import javafx.scene.image.Image;

public class FirstWarrior extends Heroes {
    String img_walk1 = this.getClass().getResource("/com/example/game/Images/Warrior_01__WALK_000.png").toString();
    String img_walk2 = this.getClass().getResource("/com/example/game/Images/Warrior_01__WALK_005.png").toString();

    String img_Attack1 = this.getClass().getResource("/com/example/game/Images/Warrior_01__ATTACK_005.png").toString();
    String img_Attack2 = this.getClass().getResource("/com/example/game/Images/Warrior_01__ATTACK_006.png").toString();
    String img_Attack3 = this.getClass().getResource("/com/example/game/Images/Warrior_01__ATTACK_007.png").toString();
    String img_main = this.getClass().getResource("/com/example/game/Images/Warrior_01__Main.png").toString();

    int action = 1;
    public FirstWarrior(double x , double y) {
        super.health=140;

        super.power=8 ;

        super.speed = 2;
        super.info=
                "Woman Warrior\n" +
                        "She is a warrior woman who lost her family in the crusades\n" +
                "She is a skilled swordswoman, stay away from her";

        setImage(new Image(img_main));

        setFitWidth(200);
        setFitHeight(100);

        setTranslateX(x);
        setTranslateY(y);
    }


    public String toString(){
        return "Woman Warrior:\n" +
                "Health = 140 \n " +
                "Power = 8 \n " +
                "Speed = 2 \n" ;
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

}
