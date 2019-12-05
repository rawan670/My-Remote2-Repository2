package com.mohanadalkrunz99.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    List<Student> stdList = new ArrayList<>();
    RecyclerView students_rv;
    StudentsAdapter stdAdapter ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initData();

        students_rv = findViewById(R.id.notes_rv);
        students_rv.setLayoutManager(new LinearLayoutManager(this));
        stdAdapter = new StudentsAdapter(this ,stdList );
        students_rv.setAdapter(stdAdapter);
    }

    private void initData() {
        stdList . add(new Student("20162200","Student 1 " , "level 5" , 90));
        stdList . add(new Student("20162255","Student 2" , "level 2" , 80));
        stdList . add(new Student("20168855","Student 3" , "level 3" , 85));
        stdList . add(new Student("20164404","Student 4" , "level 2" , 70));
        stdList . add(new Student("20164444","Student 5" , "level 4" , 77));
        stdList . add(new Student("20165566","Student 6" , "level 1" , 83));
        stdList . add(new Student("20162222","Student 7" , "level 2" , 85));
        stdList . add(new Student("20168888","Student 8" , "level 5" , 93));
        stdList . add(new Student("20165533","Student 9" , "level 3" , 97));
        stdList . add(new Student("20161010","Student 10" , "level 1" , 98));
        stdList . add(new Student("20161111","Student 11" , "level 4" , 91));
        stdList . add(new Student("20161212","Student 12" , "level 2" , 72));
    }
}
