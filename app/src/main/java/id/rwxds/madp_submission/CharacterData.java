package id.rwxds.madp_submission;

import android.util.Log;

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
            },
            {
                    "Dr. Stone",
                    "Senkuu|https://cdn.myanimelist.net/images/characters/11/324060.jpg",
                    "Yuzuriha Ogawa|https://cdn.myanimelist.net/images/characters/4/338968.jpg",
                    "Tsukasa Shishiou|https://cdn.myanimelist.net/images/characters/6/385096.jpg",
                    "Taijuu Ooki|https://cdn.myanimelist.net/images/characters/15/324073.jpg",
                    "Gen Asagiri|https://cdn.myanimelist.net/images/characters/11/338972.jpg",
                    "Kohaku|https://cdn.myanimelist.net/images/characters/5/385325.jpg",
                    "Chrome|https://cdn.myanimelist.net/images/characters/8/342530.jpg",
                    "Suika|https://cdn.myanimelist.net/images/characters/16/343365.jpg",
                    "Ruri|https://cdn.myanimelist.net/images/characters/2/336331.jpg"
            },
            {
                    "Fire Force",
                    "Shinra Kusakabe|https://cdn.myanimelist.net/images/characters/11/384757.jpg",
                    "Iris|https://cdn.myanimelist.net/images/characters/9/384768.jpg",
                    "Maki Oze|https://cdn.myanimelist.net/images/characters/3/384686.jpg",
                    "Tamaki Kotatsu|https://cdn.myanimelist.net/images/characters/5/384756.jpg",
                    "Arthur Boyle|https://cdn.myanimelist.net/images/characters/2/384687.jpg",
                    "Akitaru Oubi|https://cdn.myanimelist.net/images/characters/5/384685.jpg",
                    "Takehisa Hinawa|https://cdn.myanimelist.net/images/characters/16/297025.jpg",
                    "Inka Kasugatami|https://cdn.myanimelist.net/images/characters/8/349450.jpg",
                    "Benimaru|https://cdn.myanimelist.net/images/characters/14/306290.jpg",
                    "Joker|https://cdn.myanimelist.net/images/characters/13/384780.jpg"
            },
            {
                    "Vinland Saga",
                    "Thorfinn|https://cdn.myanimelist.net/images/characters/9/309871.jpg",
                    "Askeladd|https://cdn.myanimelist.net/images/characters/4/309800.jpg",
                    "Canute|https://cdn.myanimelist.net/images/characters/14/153471.jpg",
                    "Thorkell|https://cdn.myanimelist.net/images/characters/4/303830.jpg",
                    "Thors|https://cdn.myanimelist.net/images/characters/11/381890.jpg",
                    "Ylva|https://cdn.myanimelist.net/images/characters/13/384574.jpg",
                    "Leif Erikson|https://cdn.myanimelist.net/images/characters/3/384570.jpg",
                    "Bjorn|https://cdn.myanimelist.net/images/characters/13/381887.jpg",
                    "Willibald|https://cdn.myanimelist.net/images/characters/16/153543.jpg",
                    "Sweyn Forkbeard|https://cdn.myanimelist.net/images/characters/14/71054.jpg"
            },
            {
                    "Goodnight Punpun",
                    "Onodera Punpun|https://cdn.myanimelist.net/images/characters/12/333827.jpg",
                    "Aiko Tanaka|https://cdn.myanimelist.net/images/characters/5/158639.jpg",
                    "Sachi Nanjou|https://cdn.myanimelist.net/images/characters/15/288305.jpg",
                    "Masumi Seki|https://cdn.myanimelist.net/images/characters/13/333849.jpg",
                    "Yuuichi Onodera|https://cdn.myanimelist.net/images/characters/2/288295.jpg",
                    "God|https://cdn.myanimelist.net/images/characters/5/216605.jpg",
                    "Kou Shimizu|https://cdn.myanimelist.net/images/characters/6/333894.jpg",
                    "Toshiki Hoshikawa|https://cdn.myanimelist.net/images/characters/7/333838.jpg",
                    "Ass Hamburger|https://cdn.myanimelist.net/images/characters/7/333949.jpg",
                    "Takao Yaguchi|https://cdn.myanimelist.net/images/characters/15/216569.jpg"
            },
            {
                    "My Neighbor Totoro",
                    "Totoro|https://cdn.myanimelist.net/images/characters/16/81225.jpg",
                    "Mei Kusakabe|https://cdn.myanimelist.net/images/characters/4/278460.jpg",
                    "Satsuki Kusakabe|https://cdn.myanimelist.net/images/characters/4/55560.jpg",
                    "Nekobasu|https://cdn.myanimelist.net/images/characters/15/55346.jpg",
                    "Makkuro-Kurosuke|https://cdn.myanimelist.net/images/characters/5/102432.jpg",
                    "Tatsuo Kusakabe|https://cdn.myanimelist.net/images/characters/7/253333.jpg",
                    "Kanta Oogaki|https://cdn.myanimelist.net/images/characters/6/63836.jpg",
                    "Nanny|https://cdn.myanimelist.net/images/characters/5/63839.jpg",
                    "Yasuko Kusakabe|https://cdn.myanimelist.net/images/characters/8/63838.jpg"
            },
            {
                    "Natsume's Book of Friends",
                    "Takashi Natsume|https://cdn.myanimelist.net/images/characters/6/160755.jpg",
                    "Madara|https://cdn.myanimelist.net/images/characters/13/83359.jpg",
                    "Reiko Natsume|https://cdn.myanimelist.net/images/characters/15/313321.jpg",
                    "Kaname Tanuma|https://cdn.myanimelist.net/images/characters/12/47125.jpg",
                    "Kogitsune|https://cdn.myanimelist.net/images/characters/6/160259.jpg",
                    "Shuuichi Natori|https://cdn.myanimelist.net/images/characters/5/111868.jpg",
                    "Hinoe|https://cdn.myanimelist.net/images/characters/7/55192.jpg",
                    "Hiiragi|https://cdn.myanimelist.net/images/characters/16/158901.jpg",
                    "Touko Fujiwara|https://cdn.myanimelist.net/images/characters/9/122735.jpg",
                    "Tsubame|https://cdn.myanimelist.net/images/characters/11/161535.jpg"
            },
            {
                    "K-On!",
                    "Mio Aiyama|https://cdn.myanimelist.net/images/characters/11/48547.jpg",
                    "Yui Hirasawa|https://cdn.myanimelist.net/images/characters/6/326131.jpg",
                    "Azusa Nakano|https://cdn.myanimelist.net/images/characters/15/86736.jpg",
                    "Tsumugi Kotobuki|https://cdn.myanimelist.net/images/characters/8/51210.jpg",
                    "Ritsu Tainaka|https://cdn.myanimelist.net/images/characters/6/51212.jpg",
                    "Ui Hirasawa|https://cdn.myanimelist.net/images/characters/7/79861.jpg",
                    "Sawako Yamanaka|https://cdn.myanimelist.net/images/characters/9/72659.jpg",
                    "Nodoka Manabe|https://cdn.myanimelist.net/images/characters/15/80300.jpg",
                    "Jun Suzuki|https://cdn.myanimelist.net/images/characters/3/95854.jpg",
                    "Satoshi Tainaka|https://cdn.myanimelist.net/images/characters/16/83873.jpg"
            },
            {
                    "Hyouka",
                    "Houtarou Oreki|https://cdn.myanimelist.net/images/characters/15/308148.jpg",
                    "Eru Chitanda|https://cdn.myanimelist.net/images/characters/2/175599.jpg",
                    "Satoshi Fukube|https://cdn.myanimelist.net/images/characters/2/164607.jpg",
                    "Mayaka Iraba|https://cdn.myanimelist.net/images/characters/16/328959.jpg",
                    "Fuyumi Irisu|https://cdn.myanimelist.net/images/characters/11/171169.jpg",
                    "Tomoe Oreki|https://cdn.myanimelist.net/images/characters/6/175267.jpg",
                    "Misaki Sawakiguchi|https://cdn.myanimelist.net/images/characters/2/169541.jpg",
                    "Kaho Juumonji|https://cdn.myanimelist.net/images/characters/12/181511.jpg",
                    "Masashi Toogaito|https://cdn.myanimelist.net/images/characters/5/175269.jpg",
                    "Muneyoshi Kugayama|https://cdn.myanimelist.net/images/characters/12/175275.jpg"
            },
            {
                    "Fate/Zero",
                    "Saber|https://cdn.myanimelist.net/images/characters/6/275276.jpg",
                    "Kiritsugu Emiya|https://cdn.myanimelist.net/images/characters/14/302007.jpg",
                    "Gilgamesh|https://cdn.myanimelist.net/images/characters/3/102822.jpg",
                    "Kirei Kotomine|https://cdn.myanimelist.net/images/characters/3/258487.jpg",
                    "Irizviel von Einzbern|https://cdn.myanimelist.net/images/characters/14/30256.jpg",
                    "Rin Toosaka|https://cdn.myanimelist.net/images/characters/2/270529.jpg",
                    "Rider|https://cdn.myanimelist.net/images/characters/9/142869.jpg",
                    "Illyasviel von Einzbern|https://cdn.myanimelist.net/images/characters/14/346384.jpg",
                    "Sakura Matou|https://cdn.myanimelist.net/images/characters/14/294277.jpg",
                    "Lancer|https://cdn.myanimelist.net/images/characters/11/116250.jpg"
            },
            {
                    "March Comes in Like a Lion",
                    "Rei Kiriyama|https://cdn.myanimelist.net/images/characters/14/320199.jpg",
                    "Hinata Kawamoto|https://cdn.myanimelist.net/images/characters/6/320379.jpg",
                    "Akari Kawamoto|https://cdn.myanimelist.net/images/characters/6/320383.jpg",
                    "Momo Kawamoto|https://cdn.myanimelist.net/images/characters/16/314603.jpg",
                    "Kai Shimada|https://cdn.myanimelist.net/images/characters/4/324260.jpg",
                    "Harunobu Nikaidou|https://cdn.myanimelist.net/images/characters/14/314605.jpg",
                    "Kyouko Kouda|https://cdn.myanimelist.net/images/characters/16/314606.jpg",
                    "Takashi Hayashida|https://cdn.myanimelist.net/images/characters/9/314601.jpg",
                    "Touji Souya|https://cdn.myanimelist.net/images/characters/6/316456.jpg",
                    "Eisaku Noguchi|https://cdn.myanimelist.net/images/characters/10/322254.jpg"
            },
            {
                    "Non Non Biyori",
                    "Renge Miyauchi|https://cdn.myanimelist.net/images/characters/15/288781.jpg",
                    "Komari Koshigaya|https://cdn.myanimelist.net/images/characters/3/225067.jpg",
                    "Hotaru Ichijou|https://cdn.myanimelist.net/images/characters/15/222839.jpg",
                    "Natsumi Koshigaya|https://cdn.myanimelist.net/images/characters/14/222841.jpg",
                    "Kaede Kageyama|https://cdn.myanimelist.net/images/characters/7/225829.jpg",
                    "Suguru Koshigaya|https://cdn.myanimelist.net/images/characters/3/223393.jpg",
                    "Kazuho Miyauchi|https://cdn.myanimelist.net/images/characters/9/254903.jpg",
                    "Hikage Miyauchi|https://cdn.myanimelist.net/images/characters/2/254703.jpg",
                    "Konomi Fujiyama|https://cdn.myanimelist.net/images/characters/15/230215.jpg",
                    "Honoka Ishikawa|https://cdn.myanimelist.net/images/characters/10/224301.jpg"
            },
            {
                    "Barakamon",
                    "Naru Kotoishi|https://cdn.myanimelist.net/images/characters/14/271093.jpg",
                    "Sei Handa|https://cdn.myanimelist.net/images/characters/9/190852.jpg",
                    "Tamako Arai|https://cdn.myanimelist.net/images/characters/12/253107.jpg",
                    "Hina Kubota|https://cdn.myanimelist.net/images/characters/16/266707.jpg",
                    "Hiroshi Kido|https://cdn.myanimelist.net/images/characters/8/253109.jpg",
                    "Mia Yamamura|https://cdn.myanimelist.net/images/characters/7/255947.jpg",
                    "Emi Handa|https://cdn.myanimelist.net/images/characters/12/259475.jpg",
                    "Takao Kawafuji|https://cdn.myanimelist.net/images/characters/16/286568.jpg",
                    "Kazuyuki Sakamoto|https://cdn.myanimelist.net/images/characters/15/256721.jpg",
                    "Kousuke Kanzaki|https://cdn.myanimelist.net/images/characters/8/256715.jpg"
            },
            {
                    "A Silent Voice",
                    "Shouko Nishimiya|https://cdn.myanimelist.net/images/characters/16/342454.jpg",
                    "Shouya Ishida|https://cdn.myanimelist.net/images/characters/8/302316.jpg",
                    "Yuzuru Nishimiya|https://cdn.myanimelist.net/images/characters/10/330472.jpg",
                    "Naoka Ueno|https://cdn.myanimelist.net/images/characters/2/316403.jpg",
                    "Tomohiro Nagatsuka|https://cdn.myanimelist.net/images/characters/15/324719.jpg",
                    "Pedro|https://cdn.myanimelist.net/images/characters/8/330357.jpg",
                    "Miyoko Sahara|https://cdn.myanimelist.net/images/characters/16/330358.jpg",
                    "Maria Ishida|https://cdn.myanimelist.net/images/characters/10/324718.jpg",
                    "Miyako Ishida|https://cdn.myanimelist.net/images/characters/6/330353.jpg",
                    "Satoshi Mishiba|https://cdn.myanimelist.net/images/characters/11/337967.jpg",
            },
            {
                    "Violet Evergarden",
                    "Violet Evergarden|https://cdn.myanimelist.net/images/characters/9/345616.jpg",
                    "Gilber Bougainvillea|https://cdn.myanimelist.net/images/characters/3/333314.jpg",
                    "Luculia Malborough|https://cdn.myanimelist.net/images/characters/8/349384.jpg",
                    "Benedict Blue|https://cdn.myanimelist.net/images/characters/11/333316.jpg",
                    "Cattleya Baudelaire|https://cdn.myanimelist.net/images/characters/13/333317.jpg",
                    "Leon Stephanotis|https://cdn.myanimelist.net/images/characters/10/351658.jpg",
                    "Claudia Hodgins|https://cdn.myanimelist.net/images/characters/9/333312.jpg",
                    "Charlotte Drossel|https://cdn.myanimelist.net/images/characters/14/350554.jpg",
                    "Dietfried Bougainvillea|https://cdn.myanimelist.net/images/characters/5/348991.jpg",
                    "Erica Brown|https://cdn.myanimelist.net/images/characters/15/342263.jpg"
            }
    };

    public static ArrayList<Character> getListData(String title) {
        ArrayList<Character> list = new ArrayList<>();
        for(String[] characters : data) {
            if (characters[0].equals(title)) {
                for(int i=1; i<characters.length; i++) {
                    String name = characters[i].split("\\|")[0];
                    String image = characters[i].split("\\|")[1];

                    Character character = new Character();
                    character.setName(name);
                    character.setImage(image);

                    list.add(character);
                }
            }
        }

        return list;
    }
}
