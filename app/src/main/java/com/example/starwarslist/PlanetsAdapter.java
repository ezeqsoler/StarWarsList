package com.example.starwarslist;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class PlanetsAdapter extends RecyclerView.Adapter<PlanetsAdapter.ViewHolder> {

    private List<Planets> planets;

    public PlanetsAdapter(List<Planets> planets){
        this.planets = planets;
    }

    @NonNull
    @Override
    public PlanetsAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View planetsView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, parent, false);
        return new ViewHolder(planetsView);
    }

    @Override
    public void onBindViewHolder(@NonNull PlanetsAdapter.ViewHolder holder, int position) {
        Planets planets1 = planets.get(position);
        holder.bind(planets1);
    }

    @Override
    public int getItemCount() {
        return planets.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        public TextView tvPlanetName;
        public TextView tvDiameter;
        public TextView tvRotationPeriod;
        public TextView tvOribitalPeriod;
        public TextView tvGravity;
        public TextView tvPopulation;
        public TextView tvClimate;
        public TextView tvTerrain;
        public TextView tvSurfaceWater;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            tvPlanetName = itemView.findViewById(R.id.tvPlanetName);
            tvDiameter = itemView.findViewById(R.id.tvDiameter);
            tvRotationPeriod = itemView.findViewById(R.id.tvRotationPeriod);
            tvOribitalPeriod = itemView.findViewById(R.id.tvOrbitalPeriod);
            tvGravity = itemView.findViewById(R.id.tvGravity);
            tvPopulation = itemView.findViewById(R.id.tvPopulation);
            tvClimate = itemView.findViewById(R.id.tvClimate);
            tvTerrain = itemView.findViewById(R.id.tvTerrain);
            tvSurfaceWater = itemView.findViewById(R.id.tvSurfaceWater);

        }

        public void bind (Planets planets){
            tvPlanetName.setText(planets.getName());
            tvDiameter.setText(planets.getDiameter());
            tvRotationPeriod.setText(planets.getRotation_period());
            tvOribitalPeriod.setText(planets.getOrbital_period());
            tvGravity.setText(planets.getGravity());
            tvPopulation.setText(planets.getPopulation());
            tvClimate.setText(planets.getClimate());
            tvTerrain.setText(planets.getTerrain());
            tvSurfaceWater.setText(planets.getSurface_water());
        }
    }
}
