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

public class Vender extends Fragment {
    NavController navController;
    ImageView semillasFresaVender;
    ImageView semillasChiviriaVender;
    ImageView granoCafeVender;
    ImageView semillasCarambolaVender;
    ImageView gujaNeptunoVender;
    ImageView tridenteRotoVender;
    ImageView tijerasEsquilarVender;
    ImageView cuboBasuraOroVender;
    ImageView lucioVender;
    ImageView calamarMediaNocheVender;
    ImageView esquirlaPrismaticaVender;
    ImageView hidrogelDeluxeVender;
    TextView botonVolver;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_vender, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        navController = Navigation.findNavController(view);
        semillasFresaVender = view.findViewById(R.id.semillasFresaVender);
        semillasChiviriaVender = view.findViewById(R.id.semillasChiviriaVender);
        granoCafeVender = view.findViewById(R.id.granoCafeVender);
        semillasCarambolaVender = view.findViewById(R.id.semillasCarambolaVender);
        gujaNeptunoVender = view.findViewById(R.id.gujaNeptunoVender);
        tridenteRotoVender = view.findViewById(R.id.tridenteRotoVender);
        tijerasEsquilarVender = view.findViewById(R.id.tijerasEsquilarVender);
        cuboBasuraOroVender = view.findViewById(R.id.cuboBasuraOroVender);
        lucioVender = view.findViewById(R.id.lucioVender);
        calamarMediaNocheVender = view.findViewById(R.id.calamarMedianocheVender);
        esquirlaPrismaticaVender = view.findViewById(R.id.esquirlaPrismaticaVender);
        hidrogelDeluxeVender = view.findViewById(R.id.hidrogelDeluxeVender);

        botonVolver = view.findViewById(R.id.botonVolverVender);


        semillasFresaVender.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.action_vender_to_semillasFresa);
            }
        });

        semillasChiviriaVender.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.action_vender_to_semillasChiviria);
            }
        });

        granoCafeVender.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.action_vender_to_granoCafe);
            }
        });

        semillasCarambolaVender.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.action_vender_to_semillaCarambola);
            }
        });

        gujaNeptunoVender.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.action_vender_to_gujaNeptuno);
            }
        });

        tridenteRotoVender.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.action_vender_to_tridenteRoto);
            }
        });

        tijerasEsquilarVender.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.action_vender_to_tijerasEsquilar);
            }
        });

        cuboBasuraOroVender.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.action_vender_to_cuboBasuraOro);
            }
        });

        lucioVender.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.action_vender_to_lucio);
            }
        });

        calamarMediaNocheVender.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.action_vender_to_calamarMedianoche);
            }
        });

        esquirlaPrismaticaVender.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.action_vender_to_esquirlaPrismatica);
            }
        });


        hidrogelDeluxeVender.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.action_vender_to_hidrogelDeluxe);
            }
        });

        botonVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.action_vender_to_opcionesOnline);
            }
        });
    }
}