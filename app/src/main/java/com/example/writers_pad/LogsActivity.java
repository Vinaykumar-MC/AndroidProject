package com.example.writers_pad;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LogsActivity extends AppCompatActivity {

    private List<UserModel> lists3;
   private ImageView imageView;
    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        lists3=new ArrayList<>();
//        lists3.add(new LogItems("hh:mm","mark1","weight","status"));
//        lists3.add(new LogItems("hh:mm","mark1","weight","status"));
//        lists3.add(new LogItems("hh:mm","mark1","weight","status"));
//        lists3.add(new LogItems("hh:mm","mark1","weight","status"));
        setContentView(R.layout.logs_design);
        recyclerView=findViewById(R.id.logRv);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        RetrofitInstance.getInstance().apiInterface.getUser().enqueue(new Callback<List<UserModel>>() {
            @Override
            public void onResponse(Call<List<UserModel>> call, Response<List<UserModel>> response) {
                lists3=response.body();
                recyclerView.setAdapter(new LogAdapter(lists3,LogsActivity.this));
            }

            @Override
            public void onFailure(Call<List<UserModel>> call, Throwable t) {
                Log.e("api","on failure :"+ t.getLocalizedMessage());
            }
        });

         imageView = findViewById(R.id.imageBack2);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

    }

}
