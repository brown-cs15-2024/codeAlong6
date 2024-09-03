package codeAlong6;

import javafx.scene.layout.Pane;

public class Cloud {
    int[][] coordinates;
    Bubble[] bubbles;
    public Cloud(int[][] coords, Pane pane){
        this.coordinates = coords;
        this.bubbles = new Bubble[Constants.num_bubbles];
        this.generateCloud(pane);
        this.arrangeBubbles();
    }

    private void generateCloud(Pane pane){
        for(int i = 0; i < this.coordinates.length; i++){
            this.bubbles[i] = new Bubble(pane);
        }
    }

    private void arrangeBubbles(){
        for(int i = 0; i < this.coordinates.length; i++){
            this.bubbles[i].setCoordinates(
                    this.coordinates[i][Constants.x_coord],this.coordinates[i][Constants.y_coord]);
        }
    }

    public void moveDown(){
        for(int i = 0; i < this.bubbles.length; i++){
            this.bubbles[i].setCoordinates(this.bubbles[i].getCoordinates()[Constants.x_coord],
                                            this.bubbles[i].getCoordinates()[Constants.y_coord] + 5);
        }
    }
}
