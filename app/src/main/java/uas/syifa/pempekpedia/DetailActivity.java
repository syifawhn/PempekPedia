package uas.syifa.pempekpedia;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {

    private ImageView ivFoto;
    private TextView tvNama, tvTentang, tvAlamat;
    private String yNama, yFoto, yKoordinat, yAlamat, yTelphone;
    private Button btnTelphone, btnLokasi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("Pempek Pedia");
        btnLokasi = findViewById(R.id.btn_lokasi);
        btnTelphone = findViewById(R.id.btn_telphone);
        tvAlamat =

    }
}
