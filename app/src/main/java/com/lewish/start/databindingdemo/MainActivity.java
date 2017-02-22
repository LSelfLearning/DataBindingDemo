package com.lewish.start.databindingdemo;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.lewish.start.databindingdemo.databinding.ActivityMainBinding;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private Map<String, String> map;
    private User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        user = new User("James","Bond");
        binding.setUser(user);
        binding.setPresenter(new Presenter());
        binding.setList(Arrays.asList("1","2","3","4","5","6"));
        map = new HashMap<>();
        map.put("first","first");
        map.put("second","second");
        map.put("third","third");
        binding.setMap(map);
    }
    public class Presenter{
        public void onTextChanged(CharSequence text, int start, int lengthBefore, int lengthAfter){
            binding.tv.setText(text);
        }
        public void onClick(View view){
            Toast.makeText(MainActivity.this, "点击了", Toast.LENGTH_SHORT).show();
            user.setFirstName("hahahahahahah");
        }
        public void onTextChangedListener(){
            binding.tv.setText("hehe");
        }
    }

}
