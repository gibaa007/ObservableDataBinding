package com.g7.sample;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.g7.sample.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity {


    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=DataBindingUtil.setContentView(this,R.layout.activity_main);
        binding.setLayoutBinder(this);
        binding.setUser(new Pojo("abcd"));
    }

    public void clicked(){
        startActivity(new Intent(MainActivity.this, AnimalsListActivity.class));
        Toast.makeText(this,"ABCD",Toast.LENGTH_SHORT).show();
    }
}
