package com.example.recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //YOLO

        recyclerView = findViewById(R.id.recycleview);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        ArrayList<ThanhVien> thanhVienArrayList = new ArrayList<>();
        thanhVienArrayList.add(new ThanhVien("Mua ban co tam","8k Fan", "NHOM DONG","+10 bai viet"));
        thanhVienArrayList.add(new ThanhVien("An de lan","8k Fan", "NHOM KIN","+10 bai viet"));
        thanhVienArrayList.add(new ThanhVien("Chia se kien thuc tai lieu Montessori","1.6k Fan", "NHOM MO","+10 bai viet"));
        thanhVienArrayList.add(new ThanhVien("Thuc don Eat-Clean giam can khoe dep","11k Fan", "NHOM MO","+20 bai viet"));
        thanhVienArrayList.add(new ThanhVien("Easy Kento for busy people","8k Fan", "NHOM KIN","+10 bai viet"));
        thanhVienArrayList.add(new ThanhVien("OFFB","11k Fan", "NHOM MO","+10 bai viet"));


        ThanhVienAdapter adapter = new ThanhVienAdapter(thanhVienArrayList,this);
        recyclerView.setAdapter(adapter);
    }
}