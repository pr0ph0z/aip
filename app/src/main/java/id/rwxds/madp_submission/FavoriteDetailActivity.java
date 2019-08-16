package id.rwxds.madp_submission;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class FavoriteDetailActivity extends AppCompatActivity {

    TextView favoriteTitle, favoriteRating;
    ImageView favoriteImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animanga_detail);

        favoriteTitle = findViewById(R.id.tv_animanga_title_value);
        favoriteRating = findViewById(R.id.tv_animanga_rating_value);
        favoriteImage = findViewById(R.id.img_poster);

        Intent intent = getIntent();
        Favorite favorite = intent.getParcelableExtra("data");

        favoriteTitle.setText(favorite.getTitle());
        favoriteRating.setText(favorite.getRating());

        Glide.with(getApplicationContext())
                .load(favorite.getImage())
                .into(favoriteImage);
    }
}
