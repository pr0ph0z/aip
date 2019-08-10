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

public class NewsAdapter extends RecyclerView.Adapter<NewsAdapter.NewsViewHolder> {
    private ArrayList<News> listNews;

    public NewsAdapter(ArrayList<News> list) { this.listNews = list; }

    @NonNull
    @Override
    public NewsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_news, parent, false);
        return new NewsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NewsViewHolder holder, int position) {
        News news = listNews.get(position);
        Glide.with(holder.itemView.getContext())
                .load("https://vignette.wikia.nocookie.net/hamtaro/images/1/1d/HamtaroN.png/revision/latest/scale-to-width-down/350?cb=20150928215408")
                .apply(new RequestOptions().override(55, 55))
                .into(holder.newsImage);

        holder.newsTitle.setText(news.getTitle());
        holder.newsSummary.setText(news.getSummary());
    }

    @Override
    public int getItemCount() {
        return listNews.size();
    }

    public class NewsViewHolder extends RecyclerView.ViewHolder {

        ImageView newsImage;
        TextView newsTitle, newsSummary;

        public NewsViewHolder(@NonNull View itemView) {
            super(itemView);
            newsImage = itemView.findViewById(R.id.news_image);
            newsTitle = itemView.findViewById(R.id.news_title);
            newsSummary = itemView.findViewById(R.id.news_summary);
        }
    }
}
