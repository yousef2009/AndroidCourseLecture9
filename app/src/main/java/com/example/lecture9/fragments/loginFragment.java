package com.example.lecture9.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.lecture9.R;

public class loginFragment extends Fragment {

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_login, container, false);

        final TextView etUserName = root.findViewById(R.id.etUserName);
        final TextView etPassword = root.findViewById(R.id.etPassword);
        final Button btnLogin = root.findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Bundle bundle = new Bundle();
                bundle.putInt("userID", 24);
                bundle.putString("userName", etUserName.getText().toString());

                Fragment fragment = new homeFragment();
                fragment.setArguments(bundle);

                getActivity().getSupportFragmentManager().beginTransaction().
                        replace(R.id.frContainer, fragment).commit();
            }
        });

        return  root;
    }
}