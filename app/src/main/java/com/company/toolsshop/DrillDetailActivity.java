package com.company.toolsshop;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DrillDetailActivity extends AppCompatActivity {

    private TextView textViewTitle;
    private TextView textViewDescription;
    private ImageView imageViewDrill;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drill_detail);
        ActionBar actionBar = getSupportActionBar();
        if(actionBar!=null){
            actionBar.hide();
        }
        textViewTitle = findViewById(R.id.textViewTitle);
        textViewDescription = findViewById(R.id.textViewDescription);
        imageViewDrill = findViewById(R.id.imageViewDrill);
        Intent intent = getIntent();
        if(intent.hasExtra("title") && intent.hasExtra("info") && intent.hasExtra("resId")){
            imageViewDrill.setImageResource(intent.getIntExtra("resId",0));
            textViewTitle.setText(intent.getStringExtra("title"));
            textViewDescription.setText(intent.getStringExtra("info"));
        } else{
            Intent backToCategory = new Intent(this, DrillCategoryActivity.class);
            startActivity(backToCategory);
            finish();
        }
    }
}