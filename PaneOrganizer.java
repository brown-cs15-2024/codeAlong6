package codeAlong5;

import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;

/**
 * Organizes GUI layout for workshop5.
 */
public class PaneOrganizer {
    private BorderPane root;

    public PaneOrganizer() {
        this.root = new BorderPane();
    }

    public Pane getRoot() {
        return this.root;
    }
}

