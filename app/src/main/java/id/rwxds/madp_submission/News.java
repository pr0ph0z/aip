package id.rwxds.madp_submission;

import android.os.Parcel;
import android.os.Parcelable;

public class News implements Parcelable {
    private String title;
    private String summary;
    private String image;
    private String content;
    private String source;
    private String author;

    public News() {
        //
    }

    protected News(Parcel in) {
        title = in.readString();
        summary = in.readString();
        image = in.readString();
        content = in.readString();
        source = in.readString();
        author = in.readString();
    }

    public static final Creator<News> CREATOR = new Creator<News>() {
        @Override
        public News createFromParcel(Parcel in) {
            return new News(in);
        }

        @Override
        public News[] newArray(int size) {
            return new News[size];
        }
    };

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getContent() { return content; }

    public void setContent(String content) { this.content = content; }

    public String getSource() { return source; }

    public void setSource(String source) { this.source = source; }

    public String getAuthor() { return author; }

    public void setAuthor(String author) { this.author = author; }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(title);
        parcel.writeString(summary);
        parcel.writeString(image);
        parcel.writeString(content);
        parcel.writeString(source);
        parcel.writeString(author);
    }
}
