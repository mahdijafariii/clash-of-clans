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
        super.info="Knife woman\n" +
                "Our warrior woman is very dangerous\n" +
                "He is an extremely skilled knife thrower\n" +
                "He is thirsty for the blood of his enemies!!";

        setImage(new Image(img_main));

        setFitWidth(200);
        setFitHeight(100);

        setTranslateX(x);
        setTranslateY(y);
    }
    public String toString(){
        return "Knife woman:\n" +
                "Health = 140 \n " +
                "Power = 7 \n " +
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
