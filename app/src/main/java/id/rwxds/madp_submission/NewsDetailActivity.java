package id.rwxds.madp_submission;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class NewsDetailActivity extends AppCompatActivity {

    TextView newsTitle, newsSource, newsAuthor, newsContent;
    ImageView newsImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_detail);

        newsTitle = findViewById(R.id.tv_news_title);
        newsImage = findViewById(R.id.img_news_detail);
        newsSource = findViewById(R.id.tv_news_source);
        newsAuthor = findViewById(R.id.tv_news_author);
        newsContent = findViewById(R.id.tv_news_content);

        Intent intent = getIntent();
        News news = intent.getParcelableExtra("data");

        newsTitle.setText(news.getTitle());
        newsSource.setText(news.getSource());
        newsAuthor.setText(news.getAuthor());
        newsContent.setText(news.getContent());
        Glide.with(getApplicationContext())
                .load(news.getImage())
                .into(newsImage);
    }
}
