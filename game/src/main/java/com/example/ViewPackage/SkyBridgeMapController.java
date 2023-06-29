package com.example.ViewPackage;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

import java.util.ArrayList;

public class SkyBridgeMapController
{
    @FXML
    private ImageView castle_1;
    @FXML
    private AnchorPane mainAnchor;
    @FXML
    private ImageView tower_1;
    @FXML
    private ImageView tower_2;
    @FXML
    private ImageView door_1;
    @FXML
    private ImageView door_2;
    @FXML
    private ImageView door_3;
    @FXML
    private ImageView door_4;

    @FXML
    public ArrayList<ImageView> getImages()
    {
        ArrayList<ImageView> images = new ArrayList<>();
        images.add(castle_1);
        images.add(tower_1);
        images.add(tower_2);
        images.add(door_1);
        images.add(door_2);
        images.add(door_3);
        images.add(door_4);

        return images;
    }
}