package com.example.UserPackage;

import com.example.MapPackage.Map;
import com.example.ViewPackage.*;

import java.util.ArrayList;

public class Administrator {
    private static String showCharacter;
    /*when you click on image of character in character page controller here we save the name of character and in show
    character we use it !!
     */


    private static User user ;
    //when the user login successfully we save user hear and use it everywhere we need!!

    private static String selectedMap;
    // when user choose map to attack we want to load this map !!

    private static Map currentMap;
    //when selected map is chosen this will set to the chosen map !!

    private static ArrayList<String> characters = new ArrayList<>();
    //when user choose character we save name of character here and use it in battle!!

    private static  JungleMapController jungleMapController = new JungleMapController();
    private static  CastleBridgeMapController castleBridgeMapController = new CastleBridgeMapController();
    private static  SkyBridgeMapController skyBridgeMapController = new SkyBridgeMapController();
    private static  DarkJungleMapController darkJungleMapController = new DarkJungleMapController();
    private static TwoPlayerMapController twoPlayerMapController = new TwoPlayerMapController();
    /*controllers for when towers or the code needs access to the controllers , creating a new instance each time
    will cause bugs and won't let program function correctly*/

    public static void setShowCharacter(String showCharacter) {
        Administrator.showCharacter = showCharacter;
    }

    public static void setSelectedMap(String selectedMap) {
        Administrator.selectedMap = selectedMap;
    }

    public static String getSelectedMap() {
        return selectedMap;
    }

    public static String getShowCharacter() {
        return showCharacter;
    }

    public static User getUser() {
        return user;
    }

    public static void setUser(User user) {
        Administrator.user = user;
    }

    public static void setCharacters(ArrayList<String> characters) {
        Administrator.characters = characters;
    }

    public static ArrayList<String> getCharacters() {
        return characters;
    }

    public static Map getCurrentMap() {
        return currentMap;
    }
    public static void setCurrentMap(Map currentMap) {
        Administrator.currentMap = currentMap;
    }

    public static JungleMapController getJungleMapController() {
        return jungleMapController;
    }

    public static void setJungleMapController(JungleMapController jungleMapController) {
        Administrator.jungleMapController = jungleMapController;
    }

    public static void setCastleBridgeMapController(CastleBridgeMapController castleBridgeMapController) {
        Administrator.castleBridgeMapController = castleBridgeMapController;
    }

    public static void setDarkJungleMapController(DarkJungleMapController darkJungleMapController) {
        Administrator.darkJungleMapController = darkJungleMapController;
    }

    public static void setSkyBridgeMapController(SkyBridgeMapController skyBridgeMapController) {
        Administrator.skyBridgeMapController = skyBridgeMapController;
    }

    public static CastleBridgeMapController getCastleBridgeMapController() {
        return castleBridgeMapController;
    }

    public static SkyBridgeMapController getSkyBridgeMapController() {
        return skyBridgeMapController;
    }

    public static DarkJungleMapController getDarkJungleMapController() {
        return darkJungleMapController;
    }

    public static TwoPlayerMapController getTwoPlayerMapController() {
        return twoPlayerMapController;
    }

    public static void setTwoPlayerMapController(TwoPlayerMapController twoPlayerMapController) {
        Administrator.twoPlayerMapController = twoPlayerMapController;
    }
}
