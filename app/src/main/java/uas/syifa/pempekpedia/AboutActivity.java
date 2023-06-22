package uas.syifa.pempekpedia;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AboutActivity extends AppCompatActivity {
    private RecyclerView rv_saya;
    private ArrayList<ModelSaya> data = new ArrayList<>();

    @Override
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_about);

        rv_saya= findViewById(R.id.rv_saya);
        rv_saya.setHasFixedSize(true);

        data.addAll(AboutSaya.ambilDataSaya());
        tampilDataCard();
    }

    private void tampilDataCard() {
        rv_saya.setLayoutManager(new LinearLayoutManager(this));
        AdapterCard AC = new AdapterCard(data, AboutActivity.this);
        rv_saya.setAdapter(AC);
    }
}
