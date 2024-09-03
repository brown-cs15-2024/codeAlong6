package codeAlong6;

import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;

public class Bubble {
    Circle bubble;
    public Bubble(Pane pane){
        this.createBubble(pane);
    }

    private void createBubble(Pane pane){
        this.bubble = new Circle();
        this.bubble.setRadius(Constants.BUBBLE_SIZE);
        this.bubble.setFill(Constants.BUBBLE_COLOR);
        pane.getChildren().add(this.bubble);
    }

    public void setCoordinates(int x, int y){
        this.bubble.setCenterX(x);
        this.bubble.setCenterY(y);
    }

    public int[] getCoordinates(){
        return new int[]{(int) this.bubble.getCenterX(), (int) this.bubble.getCenterY()};
    }
}
