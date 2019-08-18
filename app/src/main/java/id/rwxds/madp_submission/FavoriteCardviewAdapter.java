package id.rwxds.madp_submission;

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

public class FavoriteCardviewAdapter extends RecyclerView.Adapter<FavoriteCardviewAdapter.CardViewViewHolder> {
    private ArrayList<Favorite> listFavorite;
    private OnItemClickCallback onItemClickCallback;

    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }

    public FavoriteCardviewAdapter(ArrayList<Favorite> list) { this.listFavorite = list; }

    @NonNull
    @Override
    public CardViewViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_favorite_grid, parent, false);
        return new CardViewViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final CardViewViewHolder holder, int position) {
        Favorite favorite = listFavorite.get(position);
        Glide.with(holder.itemView.getContext())
                .load(favorite.getImage())
                .into(holder.imgFavorite);

        holder.titleFavorite.setText(favorite.getTitle());
        holder.descriptionFavorite.setText(favorite.getSynopsis());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onItemClickCallback.onItemClicked(listFavorite.get(holder.getAdapterPosition()));
            }
        });
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class CardViewViewHolder extends RecyclerView.ViewHolder {
        ImageView imgFavorite;
        TextView titleFavorite, descriptionFavorite;

        public CardViewViewHolder(@NonNull View itemView) {
            super(itemView);
            imgFavorite = itemView.findViewById(R.id.img_item_photo);
            titleFavorite = itemView.findViewById(R.id.tv_item_name);
            descriptionFavorite = itemView.findViewById(R.id.tv_item_description);
        }
    }

    public interface OnItemClickCallback {
        void onItemClicked(Favorite data);
    }
}
