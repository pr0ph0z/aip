package id.rwxds.madp_submission;

import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class GridFavoriteAdapter extends RecyclerView.Adapter<GridFavoriteAdapter.GridViewHolder>{
    private ArrayList<Favorite> listFavorite;
    private OnItemClickCallback onItemClickCallback;

    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }

    public GridFavoriteAdapter(ArrayList<Favorite> list) { this.listFavorite = list; }

    @NonNull
    @Override
    public GridViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_favorite_grid, parent, false);
        return new GridViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final GridViewHolder holder, final int position) {
        Favorite favorite = listFavorite.get(position);
        Glide.with(holder.itemView.getContext())
                .load(favorite.getImage())
                .apply(new RequestOptions().override(350, 550))
                .into(holder.imgFavorite);

        holder.titleFavorite.setText(favorite.getTitle());
        holder.ratingFavorite.setText(favorite.getRating());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onItemClickCallback.onItemClicked(listFavorite.get(holder.getAdapterPosition()));
            }
        });
    }

    @Override
    public int getItemCount() {
        return listFavorite.size();
    }

    public class GridViewHolder extends RecyclerView.ViewHolder {
        ImageView imgFavorite;
        TextView titleFavorite, ratingFavorite;

        public GridViewHolder(@NonNull View itemView) {
            super(itemView);
            imgFavorite = itemView.findViewById(R.id.img_favorite);
            titleFavorite = itemView.findViewById(R.id.tv_favorite_title);
            ratingFavorite = itemView.findViewById(R.id.tv_favorite_rating);
        }
    }

    public interface OnItemClickCallback {
        void onItemClicked(Favorite data);
    }
}
