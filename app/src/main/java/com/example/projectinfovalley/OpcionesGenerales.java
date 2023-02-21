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

public class OpcionesGenerales extends Fragment {
    NavController navController;
    net.cachapa.expandablelayout.ExpandableLayout menuDesplegableGuiaInicio;
    net.cachapa.expandablelayout.ExpandableLayout menuDesplegableHerramientas;
    TextView botonGuiaInicio;
    TextView botonTiposGranja;
    TextView botonControles;
    TextView botonPrimeraCosecha;
    TextView botonEnergia;
    TextView botonHabilidades;
    TextView botonAldeanosAmistades;
    TextView botonTelevision;

    TextView botonHerramientas;
    TextView botonMejoras;
    TextView botonEncantamientos;
    TextView botonAzadas;
    TextView botonPicos;
    TextView botonHachas;
    TextView botonRegaderas;
    TextView botonCanaPescar;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_opciones_generales, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        navController = Navigation.findNavController(view);


        botonGuiaInicio = view.findViewById(R.id.botonGuiaInicio);
        menuDesplegableGuiaInicio = view.findViewById(R.id.menuDesplegableGuiaInicio);
        botonTiposGranja = view.findViewById(R.id.botonTiposGranja);
        botonControles = view.findViewById(R.id.botonControles);
        botonPrimeraCosecha = view.findViewById(R.id.botonPrimeraCosecha);
        botonEnergia = view.findViewById(R.id.botonEnergia);
        botonHabilidades = view.findViewById(R.id.botonHabilidades);
        botonAldeanosAmistades = view.findViewById(R.id.botonAldeanosAmistades);
        botonTelevision = view.findViewById(R.id.botonTelevision);


        botonHerramientas = view.findViewById(R.id.botonHerramientas);
        menuDesplegableHerramientas = view.findViewById(R.id.menuDesplegableHerramientas);
        botonMejoras = view.findViewById(R.id.botonMejoras);
        botonEncantamientos = view.findViewById(R.id.botonEncantamientos);
        botonAzadas = view.findViewById(R.id.botonAzadas);
        botonPicos = view.findViewById(R.id.botonPicos);
        botonHachas = view.findViewById(R.id.botonHachas);
        botonRegaderas = view.findViewById(R.id.botonRegaderas);
        botonCanaPescar = view.findViewById(R.id.botonCañaPescar);

        botonGuiaInicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (menuDesplegableGuiaInicio.isExpanded()) {
                    menuDesplegableGuiaInicio.collapse();
                } else {
                    menuDesplegableGuiaInicio.expand();
                    botonTiposGranja.setVisibility(View.VISIBLE);
                    botonControles.setVisibility(View.VISIBLE);
                    botonPrimeraCosecha.setVisibility(View.VISIBLE);
                    botonEnergia.setVisibility(View.VISIBLE);
                    botonHabilidades.setVisibility(View.VISIBLE);
                    botonAldeanosAmistades.setVisibility(View.VISIBLE);
                    botonTelevision.setVisibility(View.VISIBLE);
                }
            }
        });

        botonHerramientas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (menuDesplegableHerramientas.isExpanded()) {
                    menuDesplegableHerramientas.collapse();
                } else {
                    menuDesplegableHerramientas.expand();
                    botonMejoras.setVisibility(View.VISIBLE);
                    botonEncantamientos.setVisibility(View.VISIBLE);
                    botonAzadas.setVisibility(View.VISIBLE);
                    botonPicos.setVisibility(View.VISIBLE);
                    botonHachas.setVisibility(View.VISIBLE);
                    botonRegaderas.setVisibility(View.VISIBLE);
                    botonCanaPescar.setVisibility(View.VISIBLE);
                }
            }
        });

        botonTiposGranja.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.action_opcionesGenerales_to_tiposGranja);
            }
        });

        botonControles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.action_opcionesGenerales_to_controles);
            }
        });

        botonPrimeraCosecha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.action_opcionesGenerales_to_primeraCosecha);
            }
        });

        botonEnergia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.action_opcionesGenerales_to_energia);
            }
        });

        botonHabilidades.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.action_opcionesGenerales_to_habilidades);
            }
        });

        botonAldeanosAmistades.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.action_opcionesGenerales_to_aldeanosAmistades);
            }
        });

        botonTelevision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.action_opcionesGenerales_to_television);
            }
        });

        botonMejoras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.action_opcionesGenerales_to_herramientas);
            }
        });

        botonEncantamientos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.action_opcionesGenerales_to_encantamientos);
            }
        });

        botonAzadas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.action_opcionesGenerales_to_azadas);
            }
        });

        botonPicos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.action_opcionesGenerales_to_picos);
            }
        });

        botonHachas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.action_opcionesGenerales_to_hachas);
            }
        });

        botonRegaderas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.action_opcionesGenerales_to_regaderas);
            }
        });

        botonCanaPescar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.action_opcionesGenerales_to_canaPescar);
            }
        });
    }
}