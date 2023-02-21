package com.example.projectinfovalley;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class TiposGranja extends Fragment {
    NavController navController;
    TextView botonGranjaEstandar;
    TextView botonGranjaFluvial;
    TextView botonGranjaMinera;
    TextView botonGranjaPlaya;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tipos_granja, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        navController = Navigation.findNavController(view);
        botonGranjaEstandar = view.findViewById(R.id.botonGranjaEstandar);
        botonGranjaFluvial = view.findViewById(R.id.botonGranjaFluvial);
        botonGranjaMinera = view.findViewById(R.id.botonGranjaMinera);
        botonGranjaPlaya = view.findViewById(R.id.botonGranjaPlaya);

        botonGranjaEstandar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.action_tiposGranja_to_granjaEstandar);
            }
        });

        botonGranjaFluvial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.action_tiposGranja_to_granjaFluvial);
            }
        });

        botonGranjaMinera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.action_tiposGranja_to_granjaMinera);
            }
        });

        botonGranjaPlaya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.action_tiposGranja_to_granjaPlaya);
            }
        });
    }
}