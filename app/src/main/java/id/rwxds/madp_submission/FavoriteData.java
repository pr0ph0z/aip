package id.rwxds.madp_submission;

import java.util.ArrayList;

public class FavoriteData {
    public static String[][] data = new String[][] {
            {"Hamtaro", "4.5", "https://vignette.wikia.nocookie.net/hamtaro/images/1/1d/HamtaroN.png/revision/latest/scale-to-width-down/350?cb=20150928215408"},
            {"Hachi", "5.5", "https://vignette.wikia.nocookie.net/hamtaro/images/1/1d/HamtaroN.png/revision/latest/scale-to-width-down/350?cb=20150928215408"},
            {"Hachi", "5.5", "https://vignette.wikia.nocookie.net/hamtaro/images/1/1d/HamtaroN.png/revision/latest/scale-to-width-down/350?cb=20150928215408"},
            {"Hachi", "5.5", "https://vignette.wikia.nocookie.net/hamtaro/images/1/1d/HamtaroN.png/revision/latest/scale-to-width-down/350?cb=20150928215408"},
            {"Hachi", "5.5", "https://vignette.wikia.nocookie.net/hamtaro/images/1/1d/HamtaroN.png/revision/latest/scale-to-width-down/350?cb=20150928215408"},
            {"Hachi", "5.5", "https://vignette.wikia.nocookie.net/hamtaro/images/1/1d/HamtaroN.png/revision/latest/scale-to-width-down/350?cb=20150928215408"},
            {"Hachi", "5.5", "https://vignette.wikia.nocookie.net/hamtaro/images/1/1d/HamtaroN.png/revision/latest/scale-to-width-down/350?cb=20150928215408"},
    };

    public static ArrayList<Favorite> getListData() {
        ArrayList<Favorite> list = new ArrayList<>();
        for (String[] newsData : data) {
            Favorite favorite= new Favorite();
            favorite.setTitle(newsData[0]);
            favorite.setRating(newsData[1]);
            favorite.setImage(newsData[2]);

            list.add(favorite);
        }

        return list;
    }
}
