package com.example.balon;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
      Group root = new Group();
      Scene scene = new Scene(root, 600, 400);
      HBox hbo = new HBox(5);

        Button btn1 = new Button("Maly Balon");
        btn1.setOnAction(e->{
            double x = Math.random()*(scene.getWidth());
            double y = Math.random()*(scene.getHeight());
            MalyBalon malyBalon = new MalyBalon(20,20,x,y, Color.YELLOW);
            root.getChildren().add(malyBalon);
        });
        Button btn2 = new Button("Velky Balon");
        btn2.setOnAction(e->{
            double x = Math.random()*(scene.getWidth());
            double y = Math.random()*(scene.getHeight());
            VelkyBalon velkyBalon = new VelkyBalon(30,30,x,y, Color.RED);
            root.getChildren().add(velkyBalon);
        });
        Button btn3 = new Button("posun");
        btn3.setOnAction(e->{
            for(int i=0; i<root.getChildren().size();i++) {
                Node moj = root.getChildren().get(i);
                if(moj instanceof Balon) ((Balon)moj).posun();
            }
        });
        Button btn4 = new Button("farba");
        btn4.setOnAction(e-> {
                    for (int i = 0; i < root.getChildren().size(); i++) {
                        Node moj = root.getChildren().get(i);
                        if (moj instanceof VelkyBalon) ((VelkyBalon) moj).zmenFarbu(Color.BLUE);
                    }
                });
        hbo.getChildren().addAll(btn1,btn2,btn3,btn4);
        root.getChildren().add(hbo);

        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}