package com.example.gameofappsinternship_challenge2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    //Variables
    private int[] pictureList = { //All of these are pictures in the "drawables" section
            R.drawable.pic1, R.drawable.pic2, R.drawable.pic3, R.drawable.pic4, R.drawable.pic5,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initRecyclerView(); //Calls the function known as initRecyclerView()
    }

    private void initRecyclerView() { //Initializes the RecyclerView
        RecyclerView recyclerView = findViewById(R.id.recyclerViewMain);
        PhotoTemplateRecyclerViewAdapter adapter = new PhotoTemplateRecyclerViewAdapter(pictureList, this);

        recyclerView.setHasFixedSize(true); //Makes sure all the sizes of the pictures are the same

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2)); //RecyclerView is given 2 columns
    }
}
