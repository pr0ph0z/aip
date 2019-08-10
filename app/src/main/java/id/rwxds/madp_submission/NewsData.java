package id.rwxds.madp_submission;

import java.util.ArrayList;

public class NewsData {
    public static String[][] data = new String[][] {
            {"Hamtaro", "Kasian hamtaro dia sedang mencari ibunya namun meskipun dia kesusahan dia tetap tidak menyerah dan akan mencari tahu kemana ia harus menemuinya", "https://vignette.wikia.nocookie.net/hamtaro/images/1/1d/HamtaroN.png/revision/latest/scale-to-width-down/350?cb=20150928215408"},
            {"Hachi", "Sedangkan Hachi, hachi malah mabok-mabokan dan bebruat tidak patut. Dimana seharusnya ia mencari ibunya, malah ibunya yang harus mencari dia. Ibu hachi kecewa ..", "https://vignette.wikia.nocookie.net/hamtaro/images/1/1d/HamtaroN.png/revision/latest/scale-to-width-down/350?cb=20150928215408"},
    };

    public static ArrayList<News> getListData() {
        ArrayList<News> list = new ArrayList<>();
        for (String[] newsData : data) {
            News news = new News();
            news.setTitle(newsData[0]);
            news.setSummary(newsData[1]);
            news.setImage(newsData[2]);

            list.add(news);
        }

        return list;
    }
}
