package com.example.recycleview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ThanhVienAdapter extends RecyclerView.Adapter<ThanhVienAdapter.MyViewHolder> {
    private ArrayList<ThanhVien> thanhVienArrayList;
    private Context context;

    public ThanhVienAdapter(ArrayList<ThanhVien> thanhVienArrayList, Context context) {
        this.thanhVienArrayList = thanhVienArrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_thanhvien, parent, false);
        MyViewHolder myViewHolder = new MyViewHolder(view);

        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        ThanhVien thanhVien = thanhVienArrayList.get(position);
        holder.nhom.setText(thanhVien.getTenNhom());
        holder.fan.setText(thanhVien.getSlfan());
        holder.baiviet.setText(thanhVien.getBaiviet());
        holder.trangthai.setText(thanhVien.getStatus());

    }

    @Override
    public int getItemCount() {

        return thanhVienArrayList.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder{
        private TextView nhom;
        private TextView fan;
        private TextView baiviet;
        private TextView trangthai;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            nhom = itemView.findViewById(R.id.nhom);
            fan = itemView.findViewById(R.id.fan);
            baiviet = itemView.findViewById(R.id.baiviet);
            trangthai = itemView.findViewById(R.id.trangthai);
        }
    }
}
