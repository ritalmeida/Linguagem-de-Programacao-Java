package edu.ufp.inf.lp2._08_gui_javafx.figgeodraw;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.StrokeType;
import javafx.stage.Stage;

public class DrawCircles extends Application {

//private ArrayList<Circle> bagCircles = new ArrayList<>();

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Group rootGroup=new Group();
        Scene scene=new Scene(rootGroup, 800, 600, Color.GRAY);
        primaryStage.setScene(scene);

        /* Add circles to the circlesGroup - try to increase size for each new concentric circle */
        Group circlesGroup = new Group();
        for (int i=0; i < 3; i++) {
            Circle circle = new Circle(150, Color.web("blue", 0.05));
            circle.setId("Circle-"+i);
            circle.setStrokeType(StrokeType.OUTSIDE);
            circle.setStroke(Color.web("white", 0.16));
            circle.setStrokeWidth(4);
            circlesGroup.getChildren().add(circle);
        }
        rootGroup.getChildren().add(circlesGroup);
        /* SOLUTION...
        Group circlesGroup = new Group();
        for (int i=0; i < 3; i++) {
            Circle circle = new Circle(100+(3-i)*100, Color.web("blue", 0.05));
            circle.setId("Circle-"+i);
            circle.setStrokeType(StrokeType.OUTSIDE);
            circle.setStroke(Color.web("white", 0.16));
            circle.setStrokeWidth(4);
            circlesGroup.getChildren().add(circle);

            circle.addEventFilter(MouseEvent.MOUSE_RELEASED, (evt)->{
                Logger.getAnonymousLogger().log(Level.INFO, "Mouse released on circle: id=" + circle.getId() +"; color="+circle.getFill());
            });
        }
        rootGroup.getChildren().add(circlesGroup);
        */

/*
        //These events will be generated/handled by the scene itself
        scene.addEventFilter(MouseEvent.MOUSE_RELEASED, evtScene -> {
            double centerX=evtScene.getSceneX();
            double centerY=evtScene.getSceneY();
            Logger.getAnonymousLogger().log(Level.INFO, "Mouse released on scene: (" + centerX + ", " + centerY + ")");
            Circle c=new Circle(centerX, centerY, 10);
            c.setFill(Color.BLUE);
            String id="" + rootGroup.getChildren().size();
            c.setId(id);
            Logger.getAnonymousLogger().log(Level.INFO, "Create circle id=" + c.getId());
            rootGroup.getChildren().add(c);

            //These events will be generated/handled by EACH circle
            c.addEventFilter(MouseEvent.MOUSE_RELEASED, (evtCircle) -> {
                EventTarget evtCircleTarget=evtCircle.getTarget();
                //If click on a circle...
                if (evtCircleTarget instanceof Circle) {
                    Circle circleTarget=(Circle)evtCircleTarget;
                    Color circleTargetColor = (Color)circleTarget.getFill();
                    Logger.getAnonymousLogger().log(Level.INFO, "Mouse released on circle: id=" + circleTarget.getId() +"; color="+circleTargetColor);

                    //If color of new circle c == target circle, change color of target
                    if (c.getFill().equals(circleTargetColor)) {
                        circleTarget.setFill(Color.WHITE);
                        Logger.getAnonymousLogger().log(Level.INFO, "Mouse released on circle: id=" + circleTarget.getId() +"; change color="+circleTarget.getFill().toString());
                        //If setting c circle color here, it will only change on next click on c circle
                        //c.setFill(Color.WHITE);
                    }
                }
            });

            //Prevent event to be consumed by dispatch chain nodes inside rootGroup or afterwards inside circlesGroup
            //evtScene.consume();
        });

        //These events will be generated/handled by ALL the nodes (e.g. circles) inside rootGroup
        rootGroup.addEventFilter(MouseEvent.MOUSE_RELEASED, (evtRootGroup) -> {
            double centerX=evtRootGroup.getSceneX();
            double centerY=evtRootGroup.getSceneY();
            Logger.getAnonymousLogger().log(Level.INFO, "Mouse released on a node inside rootGroup: (" + centerX + ", " + centerY + ")... rootGroup.size()=" + rootGroup.getChildren().size());
            //Prevent event to be consumed by dispatch chain nodes inside circlesGroup
            //evtRootGroup.consume();
        });
        */

        //Show interface
        primaryStage.show();
    }
}
