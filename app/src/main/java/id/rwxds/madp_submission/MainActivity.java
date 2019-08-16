package id.rwxds.madp_submission;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvNews, rvFavorite;
    private ArrayList<News> newsList = new ArrayList<>();
    private ArrayList<Favorite> favoriteList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvNews = findViewById(R.id.rv_news);
        rvFavorite = findViewById(R.id.rv_favorite);
        rvNews.setHasFixedSize(true);
        rvFavorite.setHasFixedSize(true);

        newsList.addAll(NewsData.getListData());
        favoriteList.addAll(FavoriteData.getListData());
        showNews();
        showFavorite();
    }

    private void showNews() {
        LinearLayoutManager horizontalLayout = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        rvNews.setLayoutManager(horizontalLayout);
        NewsAdapter newsAdapter = new NewsAdapter(newsList);
        rvNews.setAdapter(newsAdapter);

        newsAdapter.setOnItemClickCallback(new NewsAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(News data) {
                Intent i = new Intent(MainActivity.this, NewsDetailActivity.class);
                i.putExtra("data", data);
                startActivity(i);
            }
        });
    }

    private void showFavorite() {
        rvFavorite.setLayoutManager(new GridLayoutManager(this, 2));
        GridFavoriteAdapter gridFavoriteAdapter = new GridFavoriteAdapter(favoriteList);
        rvFavorite.setAdapter(gridFavoriteAdapter);

        gridFavoriteAdapter.setOnItemClickCallback(new GridFavoriteAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Favorite data) {
                Intent i = new Intent(MainActivity.this, FavoriteDetailActivity.class);
                i.putExtra("data", data);
                startActivity(i);
            }
        });
    }
}
