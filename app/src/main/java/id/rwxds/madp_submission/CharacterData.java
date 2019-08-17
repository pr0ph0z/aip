package id.rwxds.madp_submission;

import java.util.ArrayList;

public class CharacterData {
    public static String[][] data = new String[][] {
            {
                    "Demon Slayer",
                    "Tanjirou Kamado|https://cdn.myanimelist.net/images/characters/12/356099.jpg",
                    "Nezuko Kamado|https://cdn.myanimelist.net/images/characters/15/384829.jpg",
                    "Zenitsu Agatsuma|https://cdn.myanimelist.net/images/characters/6/384253.jpg",
                    "Inosuke Hashibara|https://cdn.myanimelist.net/images/characters/6/369047.jpg",
                    "Giyuu Tomioka|https://cdn.myanimelist.net/images/characters/15/384691.jpg",
                    "Kanao Tsuyuri|https://cdn.myanimelist.net/images/characters/2/384712.jpg",
                    "Shinobu Kochou|https://cdn.myanimelist.net/images/characters/5/329559.jpg",
                    "Sabito|https://cdn.myanimelist.net/images/characters/9/382212.jpg",
                    "Sakonji Urokodaki|https://cdn.myanimelist.net/images/characters/11/382214.jpg",
                    "Makomo|https://cdn.myanimelist.net/images/characters/7/382213.jpg"
            }
    };

    public static ArrayList<Character> getListData(String title) {
        ArrayList<Character> list = new ArrayList<>();
        for(String[] characters : data) {
            for(int i=1; i<characters.length; i++) {
                String name = characters[i].split("\\|")[0];
                String image = characters[i].split("\\|")[1];

                Character character = new Character();
                character.setName(name);
                character.setImage(image);

                list.add(character);
            }
        }

        return list;
    }
}
