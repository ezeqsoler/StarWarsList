package com.example.starwarslist;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class StarshipsAdapter extends RecyclerView.Adapter<StarshipsAdapter.ViewHolder> {

    private List<Starships> starships;

    public StarshipsAdapter(List<Starships> starships){
        this.starships = starships;
    }

    @NonNull
    @Override
    public StarshipsAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View starshipsView = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_starships, parent, false);
        return new ViewHolder(starshipsView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Starships starships1 = starships.get(position);
        holder.bind(starships1);
    }


    @Override
    public int getItemCount() {
        return starships.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        public TextView tvStarshipName;
        public TextView tvStarshipModel;
        public TextView tvStarshipClassification;
        public TextView tvStarshipManufacturer;
        public TextView tvStarshipCost;
        public TextView tvStarshipLength;
        public TextView tvStarshipCrew;
        public TextView tvStarshipPassengers;
        public TextView tvStarshipMaxAtmospheringSpeed;
        public TextView tvStarshipHyperdriveRating;
        public TextView tvStarshipMGLT;
        public TextView tvStarshipCargoCapacity;
        public TextView tvStarshipConsumables;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            tvStarshipName = itemView.findViewById(R.id.tvStarshipName);
            tvStarshipModel = itemView.findViewById(R.id.tvStarshipModel);
            tvStarshipClassification = itemView.findViewById(R.id.tvStarshipClassification);
            tvStarshipManufacturer = itemView.findViewById(R.id.tvStarshipManufacturer);
            tvStarshipCost = itemView.findViewById(R.id.tvStarshipCost);
            tvStarshipLength = itemView.findViewById(R.id.tvStarshipLength);
            tvStarshipCrew = itemView.findViewById(R.id.tvStarshipCrew);
            tvStarshipPassengers = itemView.findViewById(R.id.tvStarshipPassengers);
            tvStarshipMaxAtmospheringSpeed = itemView.findViewById(R.id.tvStarshipMaxAtmospheringSpeed);
            tvStarshipHyperdriveRating = itemView.findViewById(R.id.tvStarshipHyperdriveRating);
            tvStarshipMGLT = itemView.findViewById(R.id.tvStarshipMGLT);
            tvStarshipCargoCapacity = itemView.findViewById(R.id.tvStarshipCargoCapacity);
            tvStarshipConsumables = itemView.findViewById(R.id.tvStarshipConsumables);

        }

        public void bind (Starships starships){
            tvStarshipName.setText(starships.getName());
            tvStarshipModel.setText(starships.getModel());
            tvStarshipClassification.setText(starships.getStarship_class());
            tvStarshipManufacturer.setText(starships.getManufacturer());
            tvStarshipCost.setText(starships.getCost_in_credits());
            tvStarshipLength.setText(starships.getLength());
            tvStarshipCrew.setText(starships.getCrew());
            tvStarshipPassengers.setText(starships.getPassengers());
            tvStarshipMaxAtmospheringSpeed.setText(starships.getMax_atmosphering_speed());
            tvStarshipHyperdriveRating.setText(starships.getHyperdrive_rating());
            tvStarshipMGLT.setText(starships.getMGLT());
            tvStarshipCargoCapacity.setText(starships.getCargo_capacity());
            tvStarshipConsumables.setText(starships.getConsumables());

        }
    }
}
