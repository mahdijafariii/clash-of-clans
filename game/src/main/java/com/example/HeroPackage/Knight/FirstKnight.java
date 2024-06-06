package com.example.HeroPackage.Knight;

import com.example.HeroPackage.Heroes;
import javafx.scene.Node;
import javafx.scene.image.Image;

import javax.xml.stream.events.StartDocument;

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
        super.info="German spearman\n" +
                "This warrior was in the Assassins family\n" +
                "It has the ability to destroy the battalion with each spear strike";

        setImage(new Image(img_main));

        setFitWidth(200);
        setFitHeight(100);

        setTranslateX(x);
        setTranslateY(y);
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


    public String toString(){
        return "German Spearman:\n" +
                "Health = 200 \n " +
                "Power = 10 \n " +
                "Speed = 1 \n" ;
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
