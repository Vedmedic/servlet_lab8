package bsuir;

import java.util.*;

public class Main {
    public static Map<String, List<String>> map = new HashMap<>();
    static {
        map.put("nature", Arrays.asList(
                "https://funik.ru/wp-content/uploads/2018/11/512698c56364f34a8ed6.jpg",
                "https://picwalls.ru/img/gallery/9/thumbs/thumb_l_0361pw.jpg",
                "https://images.ru.prom.st/800387010_w640_h640_kartina-po-nomeram.jpg"
        ));
        map.put("naruto", Arrays.asList(
                "https://sun9-4.userapi.com/impg/HpOas37wwXhPIVJMcxzQA02Oi0TJRR-mpoFWYQ/Cpipd9YTDR4.jpg?size=1080x766&quality=96&proxy=1&sign=c0883dc2cf76caea5687985dea006b83&type=album",
                "http://pm1.narvii.com/7602/2de1a401196211871601a70e5ffea3e0e7091c04r1-1280-720v2_uhq.jpg",
                "https://i.ytimg.com/vi/KrnhCblUlik/maxresdefault.jpg"
                ));
        map.put("wish", Arrays.asList(
                "https://i.imgur.com/IQ9JY3P.jpg",
                "https://sun9-45.userapi.com/c857520/v857520180/1d8a6f/fJ0j74gMkco.jpg",
                "https://s.tcdn.co/2fe/858/2fe858f8-6cf8-40d1-8052-450a83d61e78/12.png"
        ));
        map.put("gif", Arrays.asList(
                "https://i.gifer.com/RSt7.gif",
                "https://avatars.mds.yandex.net/get-zen_doc/1362956/pub_5d56e060f73d9d00addea45e_5d57e27386c4a900ac65d80c/orig",
                "https://avatars.mds.yandex.net/get-zen_doc/1718701/pub_5d28c402d11ba200ad493951_5d28d06e4e057700ad08813d/orig"
                ));
    }

    public static String getImageURL(String topic) {
        List<String> images = map.get(topic);
        if (images == null) {
            return null;
        }
        if (images.size() == 1) {
            return images.get(0);
        }
        int randomNumber = getRandom(0, images.size()-1);
        System.out.println("RANDOM: " + randomNumber);
        return images.get(randomNumber);
    }

    private static int getRandom(int min, int max) {
        return new Random().nextInt(max - min + 1) + min;
    }
}
