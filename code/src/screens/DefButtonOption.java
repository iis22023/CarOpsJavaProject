package screens;
import CarOps.Main;

import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.geometry.Insets;

public class DefButtonOption extends DefButton {
	private Timeline timeline; 
	public DefButtonOption(DefScreen userScreen,String username) {
        super(username);
        this.setPadding(new Insets(10));

        this.setOnAction(e -> {
            Stage stage = (Stage) this.getScene().getWindow();
            userScreen.setStyle(Main.backgroundColor);
            stage.setScene(new Scene(userScreen, Main.i, Main.j));
        });

        this.setPrefSize(Main.ii, Main.jj);
        
        //this.setStyle(Main.backgroundSecColor+"-fx-background-radius: 10;");
    }
	//__________________________________________________________________________
	
	public DefButtonOption(DefStartScreen userScreen,String username) {
        super(username);
        this.setPadding(new Insets(10));

        this.setOnAction(e -> {
            Stage stage = (Stage) this.getScene().getWindow();
            userScreen.setStyle(Main.backgroundColor);
            stage.setScene(new Scene(userScreen, Main.i, Main.j));
        });

        this.setPrefSize(Main.ii, Main.jj);
        //this.setStyle(Main.backgroundSecColor+"-fx-background-radius: 10;");
    }
	//___________________________________________________________________________
	public DefButtonOption(String username) {
        super(username);
        this.setPadding(new Insets(10));

        

        this.setPrefSize(Main.ii, Main.jj);
        //this.setStyle(Main.backgroundSecColor+"-fx-background-radius: 10;");
    }
}
