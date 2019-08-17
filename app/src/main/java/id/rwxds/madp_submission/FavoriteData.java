package id.rwxds.madp_submission;

import java.util.ArrayList;

public class FavoriteData {
    public static String[][] data = new String[][] {
            {
                    "Demon Slayer",
                    "4.3",
                    "https://cdn.myanimelist.net/images/anime/1286/99889l.jpg",
                    "53",
                    "291",
                    "31,102",
                    "Anime",
                    "Apr 6, 2019",
                    "Action, Demons, Historical, Shounen, Supernatural",
                    "Ever since the death of his father, the burden of supporting the family has fallen upon Tanjirou Kamado's shoulders. Though living impoverished on a remote mountain, the Kamado family are able to enjoy a relatively peaceful and happy life.\n\nOne day, Tanjirou decides to go down to the local village to make a little money selling charcoal. On his way back, night falls, forcing Tanjirou to take shelter in the house of a strange man, who warns him of the existence of flesh-eating demons that lurk in the woods at night.\n\nWhen he finally arrives back home the next day, he is met with a horrifying sight—his whole family has been slaughtered. Worse still, the sole survivor is his sister Nezuko, who has been turned into a bloodthirsty demon.\n\nConsumed by rage and hatred, Tanjirou swears to avenge his family and stay by his only remaining sibling. Alongside the mysterious group calling themselves the Demon Slayer Corps, Tanjirou will do whatever it takes to slay the demons and protect the remnants of his beloved sister's humanity."
            }
    };

    public static ArrayList<Favorite> getListData() {
        ArrayList<Favorite> list = new ArrayList<>();
        for (String[] newsData : data) {
            Favorite favorite= new Favorite();
            favorite.setTitle(newsData[0]);
            favorite.setRating(newsData[1]);
            favorite.setImage(newsData[2]);
            favorite.setRanked(newsData[3]);
            favorite.setPopularity(newsData[4]);
            favorite.setMembers(newsData[5]);
            favorite.setType(newsData[6]);
            favorite.setAired(newsData[7]);
            favorite.setGenres(newsData[8]);
            favorite.setSynopsis(newsData[9]);

            list.add(favorite);
        }

        return list;
    }
}
