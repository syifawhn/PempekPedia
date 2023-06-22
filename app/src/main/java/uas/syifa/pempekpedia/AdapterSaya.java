package uas.syifa.pempekpedia;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterSaya extends RecyclerView.Adapter<AboutSaya.CardViewHolder> {

    private ArrayList<ModelSaya> dataSaya;

    public AdapterSaya(ArrayList<ModelSaya> dataSaya, AboutActivity aboutActivity) {
        this.dataSaya = dataSaya;
    }

    @NonNull
    @Override
    public AdapterSaya.CardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.)
    }
}
