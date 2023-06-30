package com.example.UserPackage;

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

    private static ArrayList<String> characters = new ArrayList<>();
    //when user choose character we save name of character here and use it in battle!!

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
}
