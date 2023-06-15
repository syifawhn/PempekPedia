package uas.syifa.pempekpedia;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvRestoran;

    private ArrayList<ModelRestoran> data = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvRestoran = findViewById(R.id.rv_restoran);
        rvRestoran.setHasFixedSize(true);

        data.addAll(DataRestoran.ambilDataRestoran());

    }
}