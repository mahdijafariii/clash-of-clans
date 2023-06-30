package com.example.UserPackage;

public class Administrator {
    public static String showCharacter;
    /*when you click on image of character in character page controller here we save the name of character and in show
    character we use it !!
     */


    public static User user ;
    //when the user login successfully we save user hear and use it everywhere we need!!

    public static String selectedMap;

    public static void setShowCharacter(String showCharacter) {
        Administrator.showCharacter = showCharacter;
    }

    public static void setSelectedMap(String selectedMap) {
        Administrator.selectedMap = selectedMap;
    }

    public static String getSelectedMap() {
        return selectedMap;
    }
}
