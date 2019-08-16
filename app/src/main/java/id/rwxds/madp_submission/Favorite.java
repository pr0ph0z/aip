package id.rwxds.madp_submission;

import android.os.Parcel;
import android.os.Parcelable;

public class Favorite implements Parcelable {
    private String title;
    private String image;
    private String rating;
    private String ranked;
    private String popularity;
    private String members;
    private String type;
    private String aired;
    private String genres;
    private String synopsis;

    public Favorite() {
        //
    }

    protected Favorite(Parcel in) {
        title = in.readString();
        image = in.readString();
        rating = in.readString();
        ranked = in.readString();
        popularity = in.readString();
        members = in.readString();
        type = in.readString();
        aired= in.readString();
        genres = in.readString();
        synopsis = in.readString();
    }

    public static final Creator<Favorite> CREATOR = new Creator<Favorite>() {
        @Override
        public Favorite createFromParcel(Parcel in) {
            return new Favorite(in);
        }

        @Override
        public Favorite[] newArray(int size) {
            return new Favorite[size];
        }
    };

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getRanked() { return ranked; }

    public void setRanked(String ranked) { this.ranked = ranked; }

    public String getPopularity() { return popularity; }

    public void setPopularity(String popularity) { this.popularity = popularity; }

    public String getMembers() { return members; }

    public void setMembers(String members) { this.members = members; }

    public String getType() { return type; }

    public void setType(String type) { this.type = type; }

    public String getAired() { return aired; }

    public void setAired(String aired) { this.aired = aired; }

    public String getGenres() { return genres; }

    public void setGenres(String genres) { this.genres = genres; }

    @Override
    public int describeContents() { return 0; }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(title);
        parcel.writeString(image);
        parcel.writeString(rating);
        parcel.writeString(ranked);
        parcel.writeString(popularity);
        parcel.writeString(members);
        parcel.writeString(type);
        parcel.writeString(aired);
        parcel.writeString(genres);
        parcel.writeString(synopsis);
    }
}
