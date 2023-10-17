package com.example.writers_pad;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class SecondActivity extends AppCompatActivity {

    private List<Users> lists;
    private RecyclerView recyclerView;
    private TextView walText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent = new Intent();
        String a= getIntent().getStringExtra("key");
        walText=findViewById(R.id.vinay);
        walText.setText(a);
        lists = new ArrayList<>();

        lists.add(new Users("TMZ", "M10", "270", "bags", "160"));
        lists.add(new Users("Qw", "45", "270", "bags", "40"));
        lists.add(new Users("TMZ", "R", "270", "bags", "235"));
        lists.add(new Users("A", "M10", "270", "bags", "10"));
        lists.add(new Users("RDS", "25", "270", "bags", "4"));
        lists.add(new Users("FG", "M10", "270", "bags", "52"));
        lists.add(new Users("TMZ", "66", "450", "bags", "45"));
        lists.add(new Users("A", "K30", "450", "bags", "67"));
        lists.add(new Users("A-1", "M10", "270", "bags", "35"));

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 3));
        recyclerView.setAdapter(new Adapter(SecondActivity.this, lists));

        ImageView imageView = findViewById(R.id.imageBack);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
    }
}
