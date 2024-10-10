package displayimagesfx;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class DisplayImages extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create a GridPane layout
        GridPane pane = new GridPane();

        // Load the images (replace the image paths with your actual paths)
        Image flag1 = new Image("/Images/flag1.gif");
        Image flag2 = new Image("/Images/flag2.gif");
        Image flag6 = new Image("/Images/flag6.gif");
        Image flag7 = new Image("/Images/flag7.gif");

        // Create ImageView nodes to display the images
        ImageView imageView1 = new ImageView(flag1);
        ImageView imageView2 = new ImageView(flag2);
        ImageView imageView3 = new ImageView(flag6);
        ImageView imageView4 = new ImageView(flag7);

        // Add the ImageViews to the GridPane (row, column)
        pane.add(imageView1, 0, 0);
        pane.add(imageView2, 1, 0);
        pane.add(imageView3, 0, 1);
        pane.add(imageView4, 1, 1);
        // Set the scene and the stage
        Scene scene = new Scene(pane);
        
        primaryStage.setScene(scene);
        
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}