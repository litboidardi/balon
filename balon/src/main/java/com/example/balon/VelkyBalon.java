package com.example.balon;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;

public class VelkyBalon extends Balon{

    public VelkyBalon(int w, int h,double x, double y, Color farba) {
        super(w, h,x,y, farba);
    }

    @Override
    public void pohyb() {
       setLayoutY(getLayoutY()+2);
    }
}
