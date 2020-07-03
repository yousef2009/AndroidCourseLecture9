package com.example.lecture9.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.example.lecture9.R;
import com.example.lecture9.adapter.StudentAdapter;
import com.example.lecture9.model.Student;

import java.util.ArrayList;

public class homeFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_home, container, false);


        //  final EditText etReceiveData =root.findViewById(R.id.etReceiveData);

        Bundle bundle = getArguments();
        String name = bundle.getString("userName");




        RecyclerView rvStudent = root.findViewById(R.id.rvStudent);

        ArrayList<Student> data = new ArrayList<>();

        data.add(new Student(1, name, 50));
        data.add(new Student(2, name, 60));
        data.add(new Student(3, name, 89));
        data.add(new Student(4, name, 99));
        data.add(new Student(5, name, 45));
        data.add(new Student(6, name, 50));
        data.add(new Student(7, name, 36));
        data.add(new Student(8, name, 89));
        data.add(new Student(9, name, 88));
        data.add(new Student(10, name, 79));
        data.add(new Student(11, name, 98));

        RecyclerView.LayoutManager manager = new LinearLayoutManager(getActivity());
        rvStudent.setLayoutManager(manager);

        StudentAdapter adapter = new StudentAdapter(getActivity(), data);
        rvStudent.setAdapter(adapter);


        return root;
    }
}