package com.example.writers_pad;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    public static String url="https://jsonplaceholder.typicode.com/";
    private List<WeighingMachins> lists2;
    private RecyclerView recyclerView;
//    Intent intent;
    private BottomNavigationView bottomNavigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.select_device);
        bottomNavigationView=findViewById(R.id.bNavBar);
        onClickBottomNavBar();

        lists2=new ArrayList<>();

        lists2.add(new WeighingMachins("NTC - 1","Available to connect"));
        lists2.add(new WeighingMachins("NTC - 2","Available to connect"));
        lists2.add(new WeighingMachins("NTC - 3","Available to connect"));
        lists2.add(new WeighingMachins("NTC - 4","Available to connect"));
        lists2.add(new WeighingMachins("NTC - 1","Available to connect"));
        lists2.add(new WeighingMachins("NTC - 2","Available to connect"));
         recyclerView=findViewById(R.id.weighingRv);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new Adapter2(MainActivity.this,lists2));

    }
    public void onClickBottomNavBar(){
        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.more:
                        refresh();
                        break;
                    case R.id.logs:
                        Intent intent = new Intent (MainActivity.this, LogsActivity.class);
                        startActivity(intent);
                        break;
                    case R.id.sheetTransfer:
                        sheetTransfer();
                        break;
                    case R.id.connect:
                        connect();
                        break;
                    default:
                        break;
                }
                return true;
            }
        });
    }

    private void sheetTransfer() {
    }


    private void refresh() {
    }
    public void connect(){

    }
}
