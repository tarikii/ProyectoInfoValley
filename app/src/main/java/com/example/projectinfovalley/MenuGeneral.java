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

public class MenuGeneral extends Fragment {
    NavController navController;
    ImageView guiaJuego;
    ImageView jugador;
    ImageView mercadoOnline;
    ImageView preguntasForo;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_menu_general, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        navController = Navigation.findNavController(view);

        guiaJuego = view.findViewById(R.id.guiaJuego);
        jugador = view.findViewById(R.id.jugador);
        mercadoOnline = view.findViewById(R.id.mercadoOnline);
        preguntasForo = view.findViewById(R.id.preguntasForo);

        guiaJuego.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.action_menuGeneral_to_opcionesGenerales);
            }
        });

        jugador.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.action_menuGeneral_to_menuJugador);
            }
        });


        mercadoOnline.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.action_menuGeneral_to_opcionesOnline);
            }
        });

        preguntasForo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.action_menuGeneral_to_foroQA);
            }
        });
    }
}