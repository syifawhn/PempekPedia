package uas.syifa.pempekpedia;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class AboutSaya extends AppCompatActivity {
    public static String[][] data = new String[][] {
            {"Syifa Wahyuni 2024240115 \n" + "Project ini dikerjakan untuk memenuhi nilai tugas akhir mata kuliah Pemrograman Aplikasi Bergerak II"},
    };

    public static ArrayList<ModelSaya> ambilDataSaya() {
        ArrayList<ModelSaya> aboutSaya = new ArrayList<>();
        for (String[] varData : data) {
            ModelSaya modelSaya = new ModelSaya();
            ModelSaya.setSaya(varData[0]);
            ModelSaya.setDeskripsi(varData[1]);

            aboutSaya.add(modelSaya);
        }
        return aboutSaya;
    }
}
