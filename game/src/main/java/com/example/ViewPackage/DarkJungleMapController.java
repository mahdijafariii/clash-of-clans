package com.example.ViewPackage;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

import java.util.ArrayList;

public class DarkJungleMapController
{
    @FXML
    private ImageView castle_1;

    @FXML
    private ImageView door_1;

    @FXML
    private ImageView door_2;

    @FXML
    private ImageView hero_1;

    @FXML
    private ImageView hero_2;

    @FXML
    private ImageView hero_3;

    @FXML
    private ImageView hero_4;

    @FXML
    private Label name_1;

    @FXML
    private Label name_2;

    @FXML
    private Label name_3;

    @FXML
    private Label name_4;

    @FXML
    private ProgressBar progress;

    @FXML
    private ImageView star_1;

    @FXML
    private ImageView star_2;

    @FXML
    private ImageView star_3;

    @FXML
    private ImageView tower_1;

    @FXML
    private ImageView tower_2;

    @FXML
    private ImageView tower_3;


    @FXML
    public ArrayList<ImageView> getImages()
    {
        ArrayList<ImageView> images = new ArrayList<>();
        images.add(castle_1);
        images.add(tower_1);
        images.add(tower_2);
        images.add(door_1);
        images.add(door_2);
        images.add(tower_3);

        return images;
    }
}