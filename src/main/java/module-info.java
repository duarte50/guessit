module io.github.duarte50.guessit {
    requires javafx.controls;
    requires javafx.fxml;


    opens io.github.duarte50.guessit to javafx.fxml;
    exports io.github.duarte50.guessit;
    exports io.github.duarte50.guessit.controllers;
    opens io.github.duarte50.guessit.controllers to javafx.fxml;
    exports io.github.duarte50.guessit.utils;
    opens io.github.duarte50.guessit.utils to javafx.fxml;
    exports io.github.duarte50.guessit.models;
    opens io.github.duarte50.guessit.models to javafx.fxml;
}
