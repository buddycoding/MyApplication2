package com.example.myapplication.Adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.example.myapplication.R;

import java.util.List;

public class SongsListAdapter extends RecyclerView.Adapter<SongsListAdapter.ViewHolder>{

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView nameTextView;
        public TextView artistTextView;

        public ViewHolder(View itemView) {
            super(itemView);

            nameTextView = itemView.findViewById(R.id.song_title);
            artistTextView = itemView.findViewById(R.id.song_artist);
        }
    }

    private List<SongsList> mSongsList;

    public SongsListAdapter(List<SongsList> contacts) {
        mSongsList = contacts;
    }

    @Override
    public SongsListAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        View contactView = inflater.inflate(R.layout.activity_song_chords_list, parent, false);

        ViewHolder viewHolder = new ViewHolder(contactView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(SongsListAdapter.ViewHolder viewHolder, int position) {
        // Get the data model based on position
        SongsList songs = mSongsList.get(position);

        // Set item views based on your views and data model
        TextView textView = viewHolder.nameTextView;
        TextView textView2 = viewHolder.artistTextView;
        textView.setText(songs.getName());
        textView2.setText(songs.getArtist());
    }

    @Override
    public int getItemCount() {
        return mSongsList.size();
    }
}
