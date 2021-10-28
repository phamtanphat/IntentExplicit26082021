package com.example.intentexplicit26082021;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

//         1 : Lấy dữ liệu dang string
//        Intent intent = getIntent();
//        if (intent != null){
//            String text = intent.getStringExtra("text");
//            Log.d("BBB",text);
//        }

//        2 : Lấy dữ liệu dang object
//        Intent intent = getIntent();
//        if (intent != null){
//            Animal animal = (Animal) intent.getSerializableExtra("object");
//            Log.d("BBB",animal.name);
//        }

//        3 : Lấy dữ liệu dạng list object
//        Intent intent = getIntent();
//        if (intent != null){
//            ArrayList<Animal> list = (ArrayList<Animal>) intent.getSerializableExtra("list");
//            Log.d("BBB",list.get(0).name);
//        }

//        4 : Lấy dữ liệu object thông qua parcel
//        Intent intent = getIntent();
//        if (intent != null) {
//            Person person = intent.getParcelableExtra("person");
//            Log.d("BBB", person.name);
//        }
//        5 : Lấy dữ liệu dạng list object qua parcel
        Intent intent = getIntent();
        if (intent != null) {
            ArrayList<Person> list = intent.getParcelableArrayListExtra("list");
            Log.d("BBB", list.size() + "");
        }
    }
}