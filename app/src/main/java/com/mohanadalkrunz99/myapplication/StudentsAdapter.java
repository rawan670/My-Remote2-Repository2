package com.mohanadalkrunz99.myapplication;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class StudentsAdapter extends RecyclerView.Adapter<StudentsAdapter.StudentVh> {


    Context context ;
    List<Student> students ;

    public StudentsAdapter(Context context  , List<Student> students) {
        this.context = context;
        this.students = students;
    }

    @NonNull
    @Override
    public StudentVh onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.row_student,parent , false );
        return new StudentVh(view);
    }

    @Override
    public void onBindViewHolder(@NonNull StudentVh holder, int position) {
        holder.setData(students.get(position));
    }

    @Override
    public int getItemCount() {
        return students.size();
    }




    class StudentVh extends RecyclerView.ViewHolder{

        TextView std_name , std_level ,std_avg,std_id ;
        public StudentVh(@NonNull View itemView) {
            super(itemView);
            std_name= itemView.findViewById(R.id.std_name);
            std_level = itemView.findViewById(R.id.std_level);
            std_avg = itemView.findViewById(R.id.std_avg);
            std_id=itemView.findViewById(R.id.std_id);

        }

        public void setData(final Student student) {
            std_name.setText(student.getName());
            std_level.setText(student.getLevel());
            std_avg.setText(student.getAvg()+"");
            std_id.setText(student.getId());

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(context, student.getName(), Toast.LENGTH_SHORT).show();
                    Intent  intent = new Intent(itemView.getContext() , StudentActivity.class);
                    intent.putExtra("id",student.getId());
                    intent.putExtra("name",student.getName());
                    intent.putExtra("level",student.getLevel());
                    intent.putExtra("avg",student.getAvg());
                    itemView.getContext().startActivity(intent);
                }
            });
        }
    }
}
