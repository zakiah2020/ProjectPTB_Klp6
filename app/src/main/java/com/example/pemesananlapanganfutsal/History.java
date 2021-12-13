package com.example.pemesananlapanganfutsal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import java.util.ArrayList;

public class History extends AppCompatActivity {

    RecyclerView rvListRiwayat;
    RiwayatAdapter riwayatAdapter;
    ImageButton rating;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

        riwayatAdapter = new RiwayatAdapter();
        riwayatAdapter.setListRiwayat(getDataRiwayat());
        rvListRiwayat = findViewById(R.id.listHistory);
        rvListRiwayat.setAdapter(riwayatAdapter);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        rvListRiwayat.setLayoutManager(linearLayoutManager);

        rating = findViewById(R.id.rating);
        rating.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(History.this, RatingActivity.class));
            }
        });
    }
    public ArrayList<Riwayat> getDataRiwayat(){
        ArrayList<Riwayat> list = new ArrayList<>();
        list.add(new Riwayat("Semen Padang", "100K", "14 Juni"));

        return list;
    }
}