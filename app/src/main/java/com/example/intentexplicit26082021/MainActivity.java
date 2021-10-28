package com.example.intentexplicit26082021;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.intentexplicit26082021.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding mBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(mBinding.getRoot());

        mBinding.buttonString.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                intent.putExtra("text","Hello main 2");
                startActivity(intent);
            }
        });

        mBinding.buttonObject.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ArrayList<Animal> list = new ArrayList<>();
                Animal animal = new Animal("Mèo");
                list.add(animal);
                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                intent.putExtra("list",list);
                startActivity(intent);
            }
        });

        mBinding.buttonObjectParcelable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Person person = new Person("Nguyễn Văn A");
                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                intent.putExtra("person",person);
                startActivity(intent);
            }
        });
    }
}