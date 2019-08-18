package id.rwxds.madp_submission;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvNews, rvFavorite;
    private ArrayList<News> newsList = new ArrayList<>();
    private ArrayList<Favorite> favoriteList = new ArrayList<>();

    private Menu menu;

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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        this.menu = menu;
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        setView(item.getItemId());
        return super.onOptionsItemSelected(item);
    }

    public void setView(int selectedView) {
        MenuItem listView = this.menu.findItem(R.id.list_view);
        MenuItem gridView = this.menu.findItem(R.id.grid_view);

        switch (selectedView) {
            case R.id.list_view:
                listView.setVisible(false);
                gridView.setVisible(true);
                showFavoriteCard();
                break;

            case R.id.grid_view:
                listView.setVisible(true);
                gridView.setVisible(false);
                showFavorite();
                break;
        }
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

    private void showFavoriteCard() {
        rvFavorite.setLayoutManager(new LinearLayoutManager(this));
        FavoriteCardviewAdapter favoriteCardviewAdapter = new FavoriteCardviewAdapter(favoriteList);
        rvFavorite.setAdapter(favoriteCardviewAdapter);

        favoriteCardviewAdapter.setOnItemClickCallback(new FavoriteCardviewAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Favorite data) {
                Intent i = new Intent(MainActivity.this, FavoriteDetailActivity.class);
                i.putExtra("data", data);
                startActivity(i);
            }
        });
    }
}
