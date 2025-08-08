import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class HotelManagementSystemGUI extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Hotel Management System");

        // Create the main menu
        VBox mainMenu = new VBox(10);
        mainMenu.setPadding(new Insets(20,2,2,2));
        Scene scene = new Scene(mainMenu, 400, 300);

        // Booking Button
        Button bookingButton = new Button("Booking");
        bookingButton.setOnAction(e -> showBookingScreen(primaryStage));

        // Room Service Button
        Button roomServiceButton = new Button("Room Service (Menu Card)");
        roomServiceButton.setOnAction(e -> showRoomServiceScreen(primaryStage));

        // Payment Button
        Button paymentButton = new Button("Payment");
        paymentButton.setOnAction(e -> showPaymentScreen(primaryStage));

        // Record Button
        Button recordButton = new Button("Record");
        recordButton.setOnAction(e -> showRecordScreen(primaryStage));

        // Exit Button
        Button exitButton = new Button("Exit");
        exitButton.setOnAction(e -> primaryStage.close());

        mainMenu.getChildren().addAll(
                new Label("WELCOME TO HOTEL HARI PATTI"),
                bookingButton,
                roomServiceButton,
                paymentButton,
                recordButton,
                exitButton
        );

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void showBookingScreen(Stage primaryStage) {
        // Implement the Booking screen here
        VBox bookingScreen = new VBox(10);
        bookingScreen.setPadding(new Insets(20));
        Scene scene = new Scene(bookingScreen, 400, 300);

        // Add booking form elements (e.g., text fields, labels, etc.)

        // Back Button
        Button backButton = new Button("Back");
        backButton.setOnAction(e -> primaryStage.setScene(scene));

        bookingScreen.getChildren().add(backButton);

        primaryStage.setScene(scene);
    }

    private void showRoomServiceScreen(Stage primaryStage) {
        // Implement the Room Service screen here
        VBox roomServiceScreen = new VBox(10);
        roomServiceScreen.setPadding(new Insets(20));
        Scene scene = new Scene(roomServiceScreen, 400, 300);

        // Add room service menu items and order functionality

        // Back Button
        Button backButton = new Button("Back");
        backButton.setOnAction(e -> primaryStage.setScene(scene));

        roomServiceScreen.getChildren().add(backButton);

        primaryStage.setScene(scene);
    }

    private void showPaymentScreen(Stage primaryStage) {
        // Implement the Payment screen here
        VBox paymentScreen = new VBox(10);
        paymentScreen.setPadding(new Insets(20));
        Scene scene = new Scene(paymentScreen, 400, 300);

        // Add payment details and functionality

        // Back Button
        Button backButton = new Button("Back");
        backButton.setOnAction(e -> primaryStage.setScene(scene));

        paymentScreen.getChildren().add(backButton);

        primaryStage.setScene(scene);
    }

    private void showRecordScreen(Stage primaryStage) {
        // Implement the Record screen here
        VBox recordScreen = new VBox(10);
        recordScreen.setPadding(new Insets(20));
        Scene scene = new Scene(recordScreen, 400, 300);

        // Display hotel records (e.g., table or list)

        // Back Button
        Button backButton = new Button("Back");
        backButton.setOnAction(e -> primaryStage.setScene(scene));

        recordScreen.getChildren().add(backButton);

        primaryStage.setScene(scene);
    }
}
