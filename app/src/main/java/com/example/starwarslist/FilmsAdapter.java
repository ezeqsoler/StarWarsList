package com.example.starwarslist;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class FilmsAdapter extends RecyclerView.Adapter<FilmsAdapter.ViewHolder>{

    private List<Films> films;

    public FilmsAdapter(List<Films> films){
        this.films = films;
    }


    @NonNull
    @Override
    public FilmsAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View filmView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, parent, false);
        return new ViewHolder(filmView);
    }

    @Override
    public void onBindViewHolder(@NonNull FilmsAdapter.ViewHolder holder, int position) {
        Films film = films.get(position);
        holder.bind(film);

    }

    @Override
    public int getItemCount() {
        return films.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        public TextView tvTitle;
        public TextView tvEpisodeId;
        public TextView tvDirector;
        public TextView tvProducer;
        public TextView tvReleaseDate;
        public TextView tvOpeningCrawl;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            tvTitle = itemView.findViewById(R.id.tvTitle);
            tvEpisodeId = itemView.findViewById(R.id.tvEpisodeId);
            tvDirector = itemView.findViewById(R.id.tvDirector);
            tvProducer = itemView.findViewById(R.id.tvProducer);
            tvReleaseDate = itemView.findViewById(R.id.tvReleaseDate);
            tvOpeningCrawl = itemView.findViewById(R.id.tvOpeningCrawl);
        }

        public void bind(Films films) {
            tvTitle.setText(films.getTitle());
            tvEpisodeId.setText(films.getEpisode_id());
            tvDirector.setText(films.getDirector());
            tvProducer.setText(films.getProducer());
            tvReleaseDate.setText(films.getRelease_date());
            tvOpeningCrawl.setText(films.getOpening_crawl());

        }
    }
}
