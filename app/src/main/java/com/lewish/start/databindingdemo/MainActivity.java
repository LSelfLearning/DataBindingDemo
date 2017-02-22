package com.lewish.start.databindingdemo;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.lewish.start.databindingdemo.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setUser(new User("James","Bond"));
        binding.setPresenter(new Presenter());
    }
    public class Presenter{
        public void onTextChanged(CharSequence text, int start, int lengthBefore, int lengthAfter){
            binding.tv.setText(text);
        }
        public void onClick(View view){
            Toast.makeText(MainActivity.this, "点击了", Toast.LENGTH_SHORT).show();
        }
        public void onTextChangedListener(){
            binding.tv.setText("hehe");
        }
    }

}
