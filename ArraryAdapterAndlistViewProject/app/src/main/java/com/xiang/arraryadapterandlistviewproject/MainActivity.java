package com.xiang.arraryadapterandlistviewproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView list1 = (ListView) findViewById(R.id.list1);
        String[] arr1 = {"小明", "小王", "小里"};
        //将数组包装为arrayAdapter
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.item_1, arr1);
        // ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1 , arr1);
        //为list view设置adapter
        list1.setAdapter(adapter);

    }
}
