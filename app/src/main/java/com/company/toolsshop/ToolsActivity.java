package com.company.toolsshop;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

//TODO сделать разделы для перфораторов и болгарок по примеру дрелей

public class ToolsActivity extends AppCompatActivity {

    private ListView listViewTools;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tools);
        listViewTools = findViewById(R.id.listViewTools);
        ActionBar actionBar = getSupportActionBar();
        if(actionBar!=null){
            actionBar.hide();
        }
        listViewTools.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){
                    case 0:
                        Intent drill = new Intent(getApplicationContext(), DrillCategoryActivity.class);
                        startActivity(drill);
                        break;
                    case 1:
                        Intent perf = new Intent(getApplicationContext(), PerfCategoryActivity.class);
                        startActivity(perf);
                        break;
                    case 2:
                        Intent bolg = new Intent(getApplicationContext(), BolgCategoryActivity.class);
                        startActivity(bolg);
                        break;
                }
            }
        });
    }
}