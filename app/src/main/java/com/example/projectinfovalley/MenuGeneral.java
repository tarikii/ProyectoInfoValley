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

public class MenuGeneral extends Fragment {
    NavController navController;
    ImageView guiaJuegoImage;
    ImageView jugadorImage;
    ImageView mercadoOnlineImage;
    ImageView preguntasForoImage;

    TextView guiaJuegoText;
    TextView jugadorText;
    TextView mercadoOnlineText;
    TextView preguntasForoText;


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

        guiaJuegoImage = view.findViewById(R.id.guiaJuego);
        jugadorImage = view.findViewById(R.id.jugador);
        mercadoOnlineImage = view.findViewById(R.id.mercadoOnline);
        preguntasForoImage = view.findViewById(R.id.preguntasForo);

        guiaJuegoText = view.findViewById(R.id.guiasDelJuego);
        jugadorText = view.findViewById(R.id.jugadorText);
        mercadoOnlineText = view.findViewById(R.id.mercadoText);
        preguntasForoText = view.findViewById(R.id.preguntasForoText);

        guiaJuegoImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.action_menuGeneral_to_opcionesGenerales);
            }
        });

        guiaJuegoText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.action_menuGeneral_to_opcionesGenerales);
            }
        });

        jugadorImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.action_menuGeneral_to_menuJugador);
            }
        });

        jugadorText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.action_menuGeneral_to_menuJugador);
            }
        });

        mercadoOnlineImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.action_menuGeneral_to_opcionesOnline);
            }
        });

        mercadoOnlineText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.action_menuGeneral_to_opcionesOnline);
            }
        });

        preguntasForoImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.action_menuGeneral_to_foroQA);
            }
        });

        preguntasForoText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.action_menuGeneral_to_foroQA);
            }
        });
    }
}