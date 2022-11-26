package com.example.introscreens;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

public class FragmentTiga extends Fragment {


    TextView back;
    TextView done;
    ViewPager viewPager;

    public FragmentTiga() {

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tiga, container, false);
        viewPager = getActivity().findViewById(R.id.viewPager);
        back = view.findViewById(R.id.kembali2);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewPager.setCurrentItem(1);
            }
        });

        done = view.findViewById(R.id.tombol3done);
        done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(),"DONE", Toast.LENGTH_LONG).show();
            }
        });
        return view;
    }
}