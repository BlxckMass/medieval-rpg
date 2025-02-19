package ru.project.medievalrpg.GUI.Controllers;

import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import ru.project.medievalrpg.GUI.Start.StartTheGame;
import ru.project.medievalrpg.Main;
import ru.project.medievalrpg.exceptions.NullValueException;

public class aboutHeroController {
    @FXML
    public Text name;
    @FXML
    public Text level;
    @FXML
    public Text health;
    @FXML
    public Text defence;
    @FXML
    public ImageView back;
    @FXML
    public void initialize() {
        name.setText(Main.mainHero.getName());
        level.setText(String.valueOf(Main.mainHero.getLevel()));
        health.setText(String.valueOf(Main.mainHero.getHealth()));
        try {
            defence.setText(String.valueOf(Main.mainHero.getDefence()));
        } catch (NullValueException e) {
            e.printStackTrace();
        }
        back.addEventHandler(MouseEvent.MOUSE_CLICKED, mouseEvent -> StartTheGame.setNewScene("/gui/map.fxml"));
    }
}
