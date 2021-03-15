package com.example.starwarslist;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class SpeciesAdapter extends RecyclerView.Adapter<SpeciesAdapter.ViewHolder> {

    private List<Species> species;

    public SpeciesAdapter(List<Species> species){
        this.species = species;
    }

    @NonNull
    @Override
    public SpeciesAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View speciesView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, parent, false);
        return new ViewHolder(speciesView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Species species1 = species.get(position);
        holder.bind(species1);
    }


    @Override
    public int getItemCount() {
        return species.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        public TextView tvSpecieNames;
        public TextView tvClassification;
        public TextView tvDesignation;
        public TextView tvAverageHeight;
        public TextView tvAverageLifespan;
        public TextView tvEyeColors;
        public TextView tvHairColors;
        public TextView tvSkinColors;
        public TextView tvLanguages;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            tvSpecieNames = itemView.findViewById(R.id.tvSpecieNames);
            tvClassification = itemView.findViewById(R.id.tvClassification);
            tvDesignation = itemView.findViewById(R.id.tvDesignation);
            tvAverageHeight = itemView.findViewById(R.id.tvAverageHeight);
            tvAverageLifespan = itemView.findViewById(R.id.tvAverageLifespan);
            tvEyeColors = itemView.findViewById(R.id.tvEyeColors);
            tvHairColors = itemView.findViewById(R.id.tvHairColors);
            tvSkinColors = itemView.findViewById(R.id.tvSkinColors);
            tvLanguages = itemView.findViewById(R.id.tvLanguage);

        }

        public void bind (Species species){
            tvSpecieNames.setText(species.getName());
            tvClassification.setText(species.getClassification());
            tvDesignation.setText(species.getDesignation());
            tvAverageHeight.setText(species.getAverage_height());
            tvAverageLifespan.setText(species.getAverage_lifespan());
            tvEyeColors.setText(species.getEye_colors());
            tvHairColors.setText(species.getHair_colors());
            tvSkinColors.setText(species.getSkin_colors());
            tvLanguages.setText(species.getLanguage());
        }
    }
}
