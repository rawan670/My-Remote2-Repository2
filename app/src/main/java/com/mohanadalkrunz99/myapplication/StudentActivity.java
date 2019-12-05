package com.mohanadalkrunz99.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class StudentActivity extends AppCompatActivity {
    TextView tv_name,tv_id,tv_level,tv_avg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student);
        tv_name=findViewById(R.id.res_name);
        tv_id=findViewById(R.id.res_id);
        tv_level=findViewById(R.id.res_level);
        tv_avg=findViewById(R.id.res_avg);
        String id = getIntent().getStringExtra("id");
        String name = getIntent().getStringExtra("name");
        String level = getIntent().getStringExtra("level");
        float avg = getIntent().getFloatExtra("avg",0);
        tv_name.append(name);
        tv_id.append(id);
        tv_level.append(level);
        tv_avg.append(avg+"");
    }
}
