package ru.project.medievalrpg.GUI.mainMenu;

import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class MapController {
    @FXML
    public ImageView aboutHero;
    @FXML
    public ImageView inventory;
    @FXML
    public ImageView quest;
    @FXML
    public ImageView ratCave;
    @FXML
    public void initialize() {
        ratCave.addEventHandler(MouseEvent.MOUSE_CLICKED, mouseEvent -> StartTheGame.setNewScene("/gui/ratCave.fxml"));
        aboutHero.addEventHandler(MouseEvent.MOUSE_CLICKED, mouseEvent -> StartTheGame.setNewScene("/gui/aboutHero.fxml"));
    }
}
