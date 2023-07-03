package com.example.UserPackage;

import com.example.MapPackage.Map;
import com.example.ViewPackage.CastleBridgeMapController;
import com.example.ViewPackage.DarkJungleMapController;
import com.example.ViewPackage.JungleMapController;
import com.example.ViewPackage.SkyBridgeMapController;

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

    private static final JungleMapController jungleMapController = new JungleMapController();
    private static final CastleBridgeMapController castleBridgeMapController = new CastleBridgeMapController();
    private static final SkyBridgeMapController skyBridgeMapController = new SkyBridgeMapController();
    private static final DarkJungleMapController darkJungleMapController = new DarkJungleMapController();
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

    public static CastleBridgeMapController getCastleBridgeMapController() {
        return castleBridgeMapController;
    }

    public static SkyBridgeMapController getSkyBridgeMapController() {
        return skyBridgeMapController;
    }

    public static DarkJungleMapController getDarkJungleMapController() {
        return darkJungleMapController;
    }
}
