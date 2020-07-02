package com.example.lecture9.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.example.lecture9.R;

public class homeFragment extends Fragment {



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_home, container, false);


        final EditText etReceiveData =root.findViewById(R.id.etReceiveData);

       Bundle bundle = getArguments();
       etReceiveData.setText(bundle.getString("userName"));
        return root;
    }
}