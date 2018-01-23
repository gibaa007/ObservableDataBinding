package com.g7.sample;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
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
        Toast.makeText(this,"ABCD",Toast.LENGTH_SHORT).show();
    }
}
