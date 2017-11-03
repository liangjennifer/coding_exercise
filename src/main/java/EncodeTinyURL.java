import java.util.Hashtable;
import java.util.UUID;

/**
 * Created by jliang1 on 10/29/17.
 *
 * https://leetcode.com/problems/encode-and-decode-tinyurl/description/
 *
 * Note: This is a companion problem to the System Design problem: Design TinyURL.
 TinyURL is a URL shortening service where you enter a URL such as https://leetcode.com/problems/design-tinyurl and it returns a short URL such as http://tinyurl.com/4e9iAk.

 Design the encode and decode methods for the TinyURL service. There is no restriction on how your encode/decode algorithm should work. You just need to ensure that a URL can be encoded to a tiny URL and the tiny URL can be decoded to the original URL.


 */
public class EncodeTinyURL {

    static Hashtable<String, String> h = new Hashtable();


    public static String generateKey() {
        String key = UUID.randomUUID().toString();
        key = key.substring(0, key.indexOf("-"));
        return key;
    }
    // Encodes a URL to a shortened URL.
    public static String encode(String longUrl) {

        String key = generateKey();

        while (h.containsKey(key)) {
            key = generateKey();
        }

        h.put(key, longUrl);
        System.out.println("key = *" + key + "*");
        return "http://tinyurl.com/" + key;
    }

    // Decodes a shortened URL to its original URL.
    public static String decode(String shortUrl) {
        if (h.isEmpty())
            return "";

        String key = shortUrl.substring(shortUrl.lastIndexOf("/")+1);
        if (h.containsKey(key))
            return h.get(key);

        return "";
    }

    public static void main(String[] arg) {
       String tiny = EncodeTinyURL.encode("https://leetcode.com/problems/design-tinyurl");
       System.out.println(tiny);

       String longUrl = EncodeTinyURL.decode(tiny);
       System.out.println(longUrl);
    }
}
