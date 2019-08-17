package id.rwxds.madp_submission;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class FavoriteDetailActivity extends AppCompatActivity {

    RecyclerView rv_characters;
    TextView favoriteTitle, favoriteRating, favoriteType, favoriteAired, favoriteGenres, favoriteRanked, favoritePopularity, favoriteMembers, favoriteSynopsis;
    ImageView favoriteImage;
    ArrayList<Character> characterList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animanga_detail);

        Intent intent = getIntent();
        Favorite favorite = intent.getParcelableExtra("data");

        getSupportActionBar().setTitle(favorite.getTitle());

        favoriteTitle = findViewById(R.id.tv_animanga_title_value);
        favoriteRating = findViewById(R.id.tv_animanga_rating_value);
        favoriteType = findViewById(R.id.tv_animanga_type_value);
        favoriteAired = findViewById(R.id.tv_animanga_aired_value);
        favoriteGenres = findViewById(R.id.tv_animanga_genres_value);
        favoriteRanked = findViewById(R.id.tv_animanga_ranked_value);
        favoritePopularity = findViewById(R.id.tv_animanga_popularity_value);
        favoriteMembers = findViewById(R.id.tv_animanga_members_value);
        favoriteSynopsis = findViewById(R.id.tv_animanga_synopsis);
        favoriteImage = findViewById(R.id.img_poster);
        rv_characters = findViewById(R.id.rv_characters);

        favoriteTitle.setText(favorite.getTitle());
        favoriteRating.setText(favorite.getRating());
        favoriteType.setText(favorite.getType());
        favoriteAired.setText(favorite.getAired());
        favoriteGenres.setText(favorite.getGenres());
        favoriteRanked.setText("#" + favorite.getRanked());
        favoritePopularity.setText("#" + favorite.getPopularity());
        favoriteMembers.setText(favorite.getMembers());
        favoriteSynopsis.setText(favorite.getSynopsis());

        Glide.with(getApplicationContext())
                .load(favorite.getImage())
                .into(favoriteImage);

        rv_characters.setHasFixedSize(true);
        characterList.addAll(CharacterData.getListData(favorite.getTitle()));

        LinearLayoutManager horizontalLayout = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        rv_characters.setLayoutManager(horizontalLayout);
        CharacterAdapter characterAdapter = new CharacterAdapter(characterList);
        rv_characters.setAdapter(characterAdapter);
    }
}
