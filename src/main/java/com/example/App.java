package com.example;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

import com.example.client.Client;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("primary"), 640, 480);
        stage.setScene(scene);
        stage.show();
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();

        Client api = new Client();

        try {api.getMovies().forEach(m -> System.out.println(m));
        } catch(Exception e) {
            System.err.println("Error: " + e.getMessage());
        }

         try {api.getBooks().forEach(b -> System.out.println(b));
        } catch(Exception e) {
            System.err.println("Error: " + e.getMessage());
        }

         try {api.getChapters().forEach(c -> System.out.println(c));
        } catch(Exception e) {
            System.err.println("Error: " + e.getMessage());
        }

         try {api.getCharacters().forEach(c -> System.out.println(c));
        } catch(Exception e) {
            System.err.println("Error: " + e.getMessage());
        }

         try {api.getQuotes().forEach(q -> System.out.println(q));
        } catch(Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

}