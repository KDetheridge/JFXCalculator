package uk.ac.aston.jpc.calc;


import java.io.IOException;

//Always need one class that imports this package
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
    	//Loads FXML files from src/main/resources
    	FXMLLoader loader = new FXMLLoader();
    	loader.setLocation(App.class.getResource("Calculator.fxml"));
    	loader.setController(new CalculatorController());
    	Parent parent = loader.load();
        scene = new Scene(parent, 300, 60);
        stage.setScene(scene);
        //The window title
        stage.setTitle("Example App");
        stage.show();
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
    	//FXML Loader is given a resource
    	//App.class.getResource tries to find a path that exists in resources path
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
    	//calls the start method above
        launch();
    }

}