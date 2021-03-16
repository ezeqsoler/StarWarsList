package com.example.starwarslist;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class PeopleAdapter extends RecyclerView.Adapter<PeopleAdapter.ViewHolder> {

    private List<People> people;

    public PeopleAdapter(List<People> people){
        this.people = people;
        }

    @NonNull
    @Override
    public PeopleAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View peopleView = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_people, parent, false);
        return new ViewHolder(peopleView);
    }

    @Override
    public void onBindViewHolder(@NonNull PeopleAdapter.ViewHolder holder, int position) {
        People person = people.get(position);
        holder.bind(person);
    }

    @Override
    public int getItemCount() {
        return people.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        public TextView tvPersonName;
        public TextView tvBirthYear;
        public TextView tvGender;
        public TextView tvEyeColor;
        public TextView tvHairColor;
        public TextView tvSkinColor;
        public TextView tvHeight;
        public TextView tvMass;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            tvPersonName = itemView.findViewById(R.id.tvPersonName);
            tvBirthYear = itemView.findViewById(R.id.tvBirthYear);
            tvGender = itemView.findViewById(R.id.tvGender);
            tvEyeColor = itemView.findViewById(R.id.tvEyeColor);
            tvHairColor = itemView.findViewById(R.id.tvHairColor);
            tvSkinColor = itemView.findViewById(R.id.tvSkinColor);
            tvHeight = itemView.findViewById(R.id.tvHeight);
            tvMass = itemView.findViewById(R.id.tvMass);

        }

        public void bind (People people){
            tvPersonName.setText(people.getName());
            tvBirthYear.setText(people.getBirth_year());
            tvGender.setText(people.getGender());
            tvEyeColor.setText(people.getEye_color());
            tvHairColor.setText(people.getHair_color());
            tvSkinColor.setText(people.getSkin_color());
            tvHeight.setText(people.getHeight());
            tvMass.setText(people.getMass());
        }
    }
}
