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

import com.ablanco.zoomy.Zoomy;

public class GranjaPlaya extends Fragment {
    NavController navController;
    TextView botonVolver;
    ImageView zoomGranjaPlaya;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_granja_playa, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        navController = Navigation.findNavController(view);
        botonVolver = view.findViewById(R.id.botonVolverGranjaPlaya);
        zoomGranjaPlaya = view.findViewById(R.id.granjaPlaya);


        botonVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.action_granjaPlaya_to_tiposGranja);
            }
        });

        Zoomy.Builder builder = new Zoomy.Builder(getActivity()).target(zoomGranjaPlaya);
        builder.register();
    }
}