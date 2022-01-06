module com.example.javafxpracticeproject {
	requires javafx.controls;
	requires javafx.fxml;

	requires org.controlsfx.controls;
	requires org.kordamp.bootstrapfx.core;

	opens com.example.javafxpracticeproject to javafx.fxml;
	exports com.example.javafxpracticeproject;
}