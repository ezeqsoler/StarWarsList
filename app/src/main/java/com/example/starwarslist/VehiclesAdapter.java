package com.example.starwarslist;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class VehiclesAdapter extends RecyclerView.Adapter<VehiclesAdapter.ViewHolder> {

    private List<Vehicles> vehicles;

    public VehiclesAdapter(List<Vehicles> vehicles){
        this.vehicles = vehicles;
    }

    @NonNull
    @Override
    public VehiclesAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View vehiclesView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, parent, false);
        return new ViewHolder(vehiclesView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Vehicles vehicles1 = vehicles.get(position);
        holder.bind(vehicles1);
    }

    @Override
    public int getItemCount() {
        return vehicles.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        public TextView tvVehicleName;
        public TextView tvVehicleModel;
        public TextView tvVehicleClass;
        public TextView tvVehicleManufacturer;
        public TextView tvVehicleCost;
        public TextView tvVehicleLength;
        public TextView tvVehicleCrew;
        public TextView tvVehiclePassengers;
        public TextView tvVehicleMaxAtmospheringSpeed;
        public TextView tvVehicleCargoCapacity;
        public TextView tvVehicleConsumables;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            tvVehicleName = itemView.findViewById(R.id.tvVehicleName);
            tvVehicleModel = itemView.findViewById(R.id.tvVehicleModel);
            tvVehicleClass = itemView.findViewById(R.id.tvVehicleClass);
            tvVehicleManufacturer = itemView.findViewById(R.id.tvVehicleManufacturer);
            tvVehicleCost = itemView.findViewById(R.id.tvVehicleCost);
            tvVehicleLength = itemView.findViewById(R.id.tvVehicleLength);
            tvVehicleCrew = itemView.findViewById(R.id.tvVehicleCrew);
            tvVehiclePassengers = itemView.findViewById(R.id.tvVehiclePassengers);
            tvVehicleMaxAtmospheringSpeed = itemView.findViewById(R.id.tvVehicleMaxAtmospheringSpeed);
            tvVehicleCargoCapacity = itemView.findViewById(R.id.tvVehicleCargoCapacity);
            tvVehicleConsumables = itemView.findViewById(R.id.tvVehicleConsumables);

        }

        public void bind (Vehicles vehicles){
            tvVehicleName.setText(vehicles.getName());
            tvVehicleModel.setText(vehicles.getModel());
            tvVehicleClass.setText(vehicles.getVehicle_class());
            tvVehicleManufacturer.setText(vehicles.getManufacturer());
            tvVehicleCost.setText(vehicles.getCost_in_credits());
            tvVehicleLength.setText(vehicles.getLength());
            tvVehicleCrew.setText(vehicles.getCrew());
            tvVehiclePassengers.setText(vehicles.getPassengers());
            tvVehicleMaxAtmospheringSpeed.setText(vehicles.getMax_atmosphering_speed());
            tvVehicleCargoCapacity.setText(vehicles.getCargo_capacity());
            tvVehicleConsumables.setText(vehicles.getConsumables());

        }
    }
}
