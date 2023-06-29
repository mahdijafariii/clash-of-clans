package com.example.ViewPackage;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.layout.AnchorPane;

public class JungleMapController
{
    @FXML
    private AnchorPane mainAnchor;
    public ObservableList<Node> getImages()
    {
        return mainAnchor.getChildren();
    }
}