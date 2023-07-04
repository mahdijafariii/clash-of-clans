package com.example.HeroPackage.elves;

import com.example.BuildingPackage.Building;
import com.example.BuildingPackage.Castles.CastleBridgeCastle;
import com.example.BuildingPackage.Castles.JungleCastle;
import com.example.BuildingPackage.Castles.SkyBridgeCastle;
import com.example.BuildingPackage.Doors.CastleBridgeDoor;
import com.example.BuildingPackage.Doors.JungleDoor;
import com.example.BuildingPackage.Doors.SkyBridgeDoor;
import com.example.BuildingPackage.Towers.CastleBridgeTower;
import com.example.BuildingPackage.Towers.JungleTower;
import com.example.BuildingPackage.Towers.SkyBridgeTower;
import com.example.HeroPackage.Heroes;
import com.example.UserPackage.Administrator;
import javafx.scene.Node;
import javafx.scene.image.Image;

import java.util.ArrayList;

public class FirstElf extends Heroes {

    String img_walk1 = this.getClass().getResource("/com/example/game/Images/Elf_01__WALK_000.png").toString();
    String img_walk2 = this.getClass().getResource("/com/example/game/Images/Elf_01__WALK_005.png").toString();

    String img_Attack1 = this.getClass().getResource("/com/example/game/Images/Elf_01__ATTACK_001.png").toString();
    String img_Attack2 = this.getClass().getResource("/com/example/game/Images/Elf_01__ATTACK_002.png").toString();
    String img_Attack3 = this.getClass().getResource("/com/example/game/Images/Elf_01__ATTACK_007.png").toString();
    String img_main = this.getClass().getResource("/com/example/game/Images/Elf_01__Main.png").toString();
    int action = 1;

    public FirstElf(double x, double y) {
        super.health = 50;

        super.power = 8;

        super.speed = 3;
        super.info = "ELf shooter\n" +
                "The best archer in the whole world is undoubtedly him\n" +
                "He has the ability to shoot from a long distance and easily destroys his enemies";

        setImage(new Image(img_main));

        setFitWidth(200);
        setFitHeight(100);

        setTranslateX(x);
        setTranslateY(y);
    }

    public String toString() {
        return "Elf Shooter:\n" +
                "Health = 50 \n " +
                "Power = 8 \n " +
                "Speed = 3 \n";
    }

    public void showCharacterInfoAttack() {
        for (int i = 0; i < 90; i++) {
            if (i % 3 == 0) {
                setImage(new Image(img_Attack1));
            } else if (i % 3 == 1) {
                setImage(new Image(img_Attack2));
            } else if (i % 3 == 2) {
                setImage(new Image(img_Attack3));
            }
        }
    }

    public void walkForLogin() {
        action++;
        setTranslateX(getTranslateX() + speed);
        if (action % 2 == 0) {
            setImage(new Image(img_walk1));
        } else {
            setImage(new Image(img_walk2));
        }

    }

    //--------------------------------------------------- Walk x , y

    public void walkForAttackXP() {// walk right
        action++;
        setTranslateX(getTranslateX() + speed);
        if (action % 2 == 0) {
            setImage(new Image(img_walk1));
        } else {
            setImage(new Image(img_walk2));
        }
    }
    public void walkForAttackXN() {// walk left
        action++;
        setTranslateX(getTranslateX() - speed);
        if (action % 2 == 0) {
            setImage(new Image(img_walk1));
        } else {
            setImage(new Image(img_walk2));
        }
    }

    public void walkForAttackYN() {// walk down
        action++;
        setTranslateY(getTranslateY() - speed);
        if (action % 2 == 0) {
            setImage(new Image(img_walk1));
        } else {
            setImage(new Image(img_walk2));
        }
    }
    public void walkForAttackYP() { // walk up

        action++;
        setTranslateY(getTranslateY() + speed);
        if (action % 2 == 0) {
            setImage(new Image(img_walk1));
        } else {
            setImage(new Image(img_walk2));
        }
    }
    //--------------------------------------------------- Walk x , y

    //--------------------------------------------------- Attack and change attack picture

    public void attackInBattle() {
        action++;
        setTranslateY(getTranslateY() + 1);
        setTranslateY(getTranslateY() - 1);
        if (action % 3 == 0) {
            setImage(new Image(img_Attack1));
        } else if (action % 3 == 1) {
            setImage(new Image(img_Attack2));

        } else {
            setImage(new Image(img_Attack3));
        }
    }
    //--------------------------------------------------- Attack and change attack picture


    public void startBattleAttacking() {
        ArrayList<Building> castle = new ArrayList<>();
        ArrayList<Building> doors = new ArrayList<>();
        ArrayList<Building> towers = new ArrayList<>();
        castle = castle();
        doors = doors();
        towers = towers();
        ArrayList<Building> finalTowers = towers;
        ArrayList<Building> finalCastle = castle;
        ArrayList<Building> finalDoors = doors;
        new Thread(()->{

        while (true){
            double minDistance = 0;
            Building closest = null;
            for (int i = 0; i < finalTowers.size(); i++) {
                if (finalTowers.get(i) != null && finalTowers.get(i).getHealth() > 0) {
                    if (minDistance > getDistanceFromBuilding(this, finalTowers.get(i)) || minDistance == 0) {
                        minDistance = getDistanceFromBuilding(this, finalTowers.get(i));
                        closest = finalTowers.get(i);
                    }
                }

            }
            if (minDistance != 0) {
                while (closest.getX() > this.getTranslateX() + 130) {
                    walkForAttackXP();
                }
                if (closest.getY() > this.getTranslateY()) {
                    while (closest.getY() > this.getTranslateY() - 80) {
                        walkForAttackYP();
                    }
                } else if (closest.getY() < this.getTranslateY()) {
                    while (closest.getY() < this.getTranslateY() - 80) {
                        walkForAttackYN();
                    }
                }
                attackInBattle();
                closest.setHealth(closest.health - this.power);
                if (closest.getHealth() <= 0) {
                    finalTowers.remove(closest);
                    Administrator.getCurrentMap().getBuildings().get(closest);
                }
            }
            if (finalTowers.size()==0 && finalCastle.size()!=0){ // start attack on castle
                for (int i = 0; i < finalCastle.size(); i++) {
                    if (finalCastle.get(i) != null && finalCastle.get(i).getHealth() > 0) {
                        if (minDistance > getDistanceFromBuilding(this, finalCastle.get(i)) || minDistance == 0) {
                            minDistance = getDistanceFromBuilding(this, finalCastle.get(i));
                            closest = finalCastle.get(i);
                        }
                    }

                }
                if (minDistance != 0) {
                    while (closest.getX() > this.getTranslateX() + 130) {
                        walkForAttackXP();
                    }
                    if (closest.getY() > this.getTranslateY()) {
                        while (closest.getY() > this.getTranslateY() - 80) {
                            walkForAttackYP();
                        }
                    } else if (closest.getY() < this.getTranslateY()) {
                        while (closest.getY() < this.getTranslateY() - 180) {
                            walkForAttackYN();
                        }
                    }
                    attackInBattle();
                    closest.setHealth(closest.health - this.power);
                    if (closest.getHealth() <= 0) {
                        finalCastle.remove(closest);
                        Administrator.getCurrentMap().getBuildings().remove(closest);
                    }
                }
            }
//            else if(finalTowers.size()==0 ){//start battle on door
//
//                for (int i = 0; i < finalDoors.size(); i++) {
//                    if (finalDoors.get(i) != null && finalDoors.get(i).getHealth() > 0) {
//                        if (minDistance > getDistanceFromBuilding(this, finalDoors.get(i)) || minDistance == 0) {
//                            minDistance = getDistanceFromBuilding(this, finalDoors.get(i));
//                            closest = finalDoors.get(i);
//                        }
//                    }
//
//                }
//                if (minDistance != 0) {
//                    if(closest.getX() > this.getTranslateX()){
//                        while (closest.getX() > this.getTranslateX() ) {
//                            walkForAttackXP();
//                        }
//                    }
//                    else if (closest.getX() > this.getTranslateX()){
//                        while (closest.getX() < this.getTranslateX() ) {
//                            walkForAttackXN();
//                        }
//                    }
//
//                    if (closest.getY() > this.getTranslateY()) {
//                        while (closest.getY() > this.getTranslateY() - 80) {
//                            walkForAttackYP();
//                        }
//                    } else if (closest.getY() < this.getTranslateY()) {
//                        while (closest.getY() < this.getTranslateY() - 180) {
//                            walkForAttackYN();
//                        }
//                    }
//                    attackInBattle();
//                    closest.setHealth(closest.health - this.power);
//                    if (closest.getHealth() <= 0) {
//                        finalDoors.remove(closest);
//                        Administrator.getCurrentMap().getBuildings().remove(closest);
//                    }
//                }
//
//
//            }



        }
        }).start();


    }


    public ArrayList<Building> towers() {
        ArrayList<Building> towers = new ArrayList<>();
        for (int i = 0; i < Administrator.getCurrentMap().getBuildings().size(); i++) {
            if (Administrator.getCurrentMap().getBuildings().get(i) instanceof CastleBridgeTower || Administrator.getCurrentMap().getBuildings().get(i) instanceof JungleTower || Administrator.getCurrentMap().getBuildings().get(i) instanceof SkyBridgeTower) {
                towers.add(Administrator.getCurrentMap().getBuildings().get(i));
            }
        }
        return towers;
    }

    public ArrayList<Building> castle() {
        ArrayList<Building> castle = new ArrayList<>();
        for (int i = 0; i < Administrator.getCurrentMap().getBuildings().size(); i++) {
            if (Administrator.getCurrentMap().getBuildings().get(i) instanceof CastleBridgeCastle || Administrator.getCurrentMap().getBuildings().get(i) instanceof JungleCastle || Administrator.getCurrentMap().getBuildings().get(i) instanceof SkyBridgeCastle) {
                castle.add(Administrator.getCurrentMap().getBuildings().get(i));
            }
        }
        return castle;
    }

    public ArrayList<Building> doors() {
        ArrayList<Building> doors = new ArrayList<>();
        for (int i = 0; i < Administrator.getCurrentMap().getBuildings().size(); i++) {
            if (Administrator.getCurrentMap().getBuildings().get(i) instanceof CastleBridgeDoor || Administrator.getCurrentMap().getBuildings().get(i) instanceof JungleDoor || Administrator.getCurrentMap().getBuildings().get(i) instanceof SkyBridgeDoor) {
                doors.add(Administrator.getCurrentMap().getBuildings().get(i));
            }
        }
        return doors;
    }

    public double getDistanceFromBuilding(Heroes hero, Building building) {
        double distance = Math.sqrt(Math.pow((hero.getTranslateX() - building.getX()), 2) + Math.pow((hero.getTranslateY() - building.getY()), 2));
        return distance;

    }

    public void setNullBuilding(Building building){
        for (int i = 0 ; i < Administrator.getCurrentMap().getBuildings().size() ; i++ ){
            if(Administrator.getCurrentMap().getBuildings().get(i)==building){
                Administrator.getCurrentMap().getBuildings().get(i).get;
            }
        }
    }

}

