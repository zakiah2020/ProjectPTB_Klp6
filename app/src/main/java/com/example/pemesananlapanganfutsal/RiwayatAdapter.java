package com.example.pemesananlapanganfutsal;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.pemesananlapanganfutsal.R;

import java.util.ArrayList;

public class RiwayatAdapter extends RecyclerView.Adapter<RiwayatAdapter.RiwayatViewHolder>{

    public class RiwayatViewHolder extends RecyclerView.ViewHolder {

        TextView nama_tempat, harga_l, tgl;
//        ImageButton rate, deleteRiwayat;
        public RiwayatViewHolder(@NonNull View itemView) {
            super(itemView);
            nama_tempat = itemView.findViewById(R.id.namaTempat);
            harga_l = itemView.findViewById(R.id.harga);
            tgl = itemView.findViewById(R.id.tanggal);
//            rate = itemView.findViewById(R.id.rating);
//            deleteRiwayat = itemView.findViewById(R.id.deleteHistory);

        }
    }

    ArrayList<Riwayat> listRiwayat = new ArrayList<>();

    public void setListRiwayat(ArrayList<Riwayat> listRiwayat) {
        this.listRiwayat = listRiwayat;
    }

    @NonNull
    @Override
    public RiwayatViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.item_history, parent, false);
        RiwayatViewHolder viewHolder = new RiwayatViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RiwayatViewHolder viewHolder, int position) {
        Riwayat riwayat = listRiwayat.get(position);
        viewHolder.nama_tempat.setText(riwayat.namaTempatnya);
        viewHolder.harga_l.setText(riwayat.harganya);
        viewHolder.tgl.setText(riwayat.tanggalnya);
    }

    @Override
    public int getItemCount() {
        return listRiwayat.size();
    }

}
