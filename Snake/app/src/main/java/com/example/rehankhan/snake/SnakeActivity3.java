package com.example.rehankhan.snake;
import android.graphics.Point;
import android.os.Bundle;
import android.view.Display;

public class SnakeActivity3 extends SnakeActivity {

    // Declare an instance of SnakeEngine
    SnakeEngine3 SnakeEngine3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Get the pixel dimensions of the screen
        Display display = getWindowManager().getDefaultDisplay();

        // Initialize the result into a Point object
        Point size = new Point();
        display.getSize(size);

        // Create a new instance of the SnakeEngine class
        SnakeEngine3 = new SnakeEngine3(this, size);

        // Make snakeEngine the view of the Activity
        setContentView(SnakeEngine3);
    }
    // Start the thread in snakeEngine
    @Override
    protected void onResume() {
        super.onResume();
        SnakeEngine3.resume();
    }

    // Stop the thread in snakeEngine
    @Override
    protected void onPause() {
        super.onPause();
        SnakeEngine3.pause();
    }
}