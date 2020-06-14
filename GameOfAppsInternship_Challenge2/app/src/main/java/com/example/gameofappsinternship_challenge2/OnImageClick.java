package com.example.gameofappsinternship_challenge2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class OnImageClick extends AppCompatActivity {

    ImageView imageView;
    Button backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_on_image_click);
        imageView = findViewById(R.id.singleImageView);

        imageView.setImageResource(getIntent().getIntExtra("image_id", 0)); //Gets the selected image and sets it as that

        backButton = findViewById(R.id.backButton); //This button lets you go back to the Main Activity
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish(); //Stops OnImageClick.class
            }
        });
    }
}
