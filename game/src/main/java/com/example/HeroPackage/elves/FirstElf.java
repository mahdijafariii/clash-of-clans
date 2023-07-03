package com.example.HeroPackage.elves;

import com.example.BuildingPackage.Building;
import com.example.BuildingPackage.Towers.CastleBridgeTower;
import com.example.BuildingPackage.Towers.JungleTower;
import com.example.BuildingPackage.Towers.SkyBridgeTower;
import com.example.HeroPackage.Heroes;
import com.example.UserPackage.Administrator;
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
        super.info="ELf shooter\n" +
                "The best archer in the whole world is undoubtedly him\n" +
                "He has the ability to shoot from a long distance and easily destroys his enemies";

        setImage(new Image(img_main));

        setFitWidth(200);
        setFitHeight(100);

        setTranslateX(x);
        setTranslateY(y);
    }

    public String toString(){
        return "Elf Shooter:\n" +
                "Health = 50 \n " +
                "Power = 8 \n " +
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

    //--------------------------------------------------- Walk x , y

    public void walkForAttackX(){
        action++;
        setTranslateX(getTranslateX()+speed);
        if(action%2==0){
            setImage(new Image(img_walk1));
        }
        else {
            setImage(new Image(img_walk2));
        }
    }
    public void walkForAttackY(){
        action++;
        setTranslateY(getTranslateY()+speed);
        if(action%2==0){
            setImage(new Image(img_walk1));
        }
        else {
            setImage(new Image(img_walk2));
        }
    }
    //--------------------------------------------------- Walk x , y

    //--------------------------------------------------- Attack and change attack picture

    public void attackInBattle(){
        action++;
        setTranslateY(getTranslateY()+1);
        setTranslateY(getTranslateY()-1);
        if(action%3==0){
            setImage(new Image(img_Attack1));
        }
        else if (action%3==1){
            setImage(new Image(img_Attack2));

        }
        else {
            setImage(new Image(img_Attack3));
        }
    }
    //--------------------------------------------------- Attack and change attack picture


    public void StartBattleAttacking(){

        for(int i = 0 ; i <Administrator.getCurrentMap().getBuildings().size() ; i++ ){
            if(Administrator.getCurrentMap().getBuildings().get(i) instanceof CastleBridgeTower || Administrator.getCurrentMap().getBuildings().get(i) instanceof JungleTower ||Administrator.getCurrentMap().getBuildings().get(i) instanceof SkyBridgeTower){

            }
        }


    }


}
