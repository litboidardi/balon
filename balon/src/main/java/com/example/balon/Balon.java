package com.example.balon;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.util.Duration;

public class Balon extends Canvas {
    GraphicsContext gc;
    Timeline t;
    Color farba;


    public Balon(int w, int h, double x, double y, Color farba) {
        super(w,h);
      this.farba=farba;
      setLayoutX(x);
      setLayoutY(y);
        gc = this.getGraphicsContext2D();
        t= new Timeline(new KeyFrame(Duration.millis(100),e -> pohyb()));
        t.setCycleCount(Animation.INDEFINITE);
        t.play();
        vykresli();
    }
    public void pohyb() {}
    public void posun() {
        setLayoutX(getLayoutX()+20);
    }
    public void vykresli() {
        gc.setFill(farba);
        gc.fillOval(0,0,getWidth(),getHeight());
    }
    public void zmenFarbu(Color nova) {
        farba = nova; vykresli();
    }
}
