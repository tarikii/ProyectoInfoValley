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
import android.widget.ImageView;
import android.widget.TextView;

public class Comprar extends Fragment {
    NavController navController;
    ImageView baguette;
    ImageView incubadoraAvestruces;
    ImageView oveja;
    ImageView cerdo;
    ImageView mayonesaDinosaurio;
    ImageView recolector;
    ImageView radiador;
    TextView botonVolver;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_comprar, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        navController = Navigation.findNavController(view);
        baguette = view.findViewById(R.id.baguetteComprar);
        incubadoraAvestruces = view.findViewById(R.id.incubadoraComprar);
        oveja = view.findViewById(R.id.ovejaComprar);
        cerdo = view.findViewById(R.id.cerdoComprar);
        mayonesaDinosaurio = view.findViewById(R.id.mayonesaComprar);
        recolector = view.findViewById(R.id.recolectorComprar);
        radiador = view.findViewById(R.id.radiadorComprar);
        botonVolver = view.findViewById(R.id.botonVolverComprar);


        baguette.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.action_comprar_to_baguette);
            }
        });

        incubadoraAvestruces.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.action_comprar_to_incubadoraAvestruces);
            }
        });

        oveja.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.action_comprar_to_oveja);
            }
        });

        cerdo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.action_comprar_to_cerdo2);
            }
        });

        mayonesaDinosaurio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.action_comprar_to_mayonesaDinosaurio);
            }
        });

        recolector.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.action_comprar_to_recolectorAutomatico);
            }
        });

        radiador.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.action_comprar_to_radiador);
            }
        });

        botonVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.action_comprar_to_opcionesOnline);
            }
        });
    }
}