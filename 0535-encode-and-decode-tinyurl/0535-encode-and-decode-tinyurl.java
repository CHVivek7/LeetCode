public class Codec {

    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        return longUrl;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return shortUrl;
    }
}

// public class Codec {
//     String BASE_URL = "http://tinyurl.com/";
//     Map<String, String> urlStore = new HashMap<>();
//     long counter = 0;
//     public String encode(String longUrl) {
//         String shortKey = String.valueOf(counter++);
//         urlStore.put(shortKey, longUrl);
//         return BASE_URL + shortKey;
//     }
//     public String decode(String shortUrl) {
//         String[] parts = shortUrl.split("/");
//         String shortKey = parts[parts.length - 1];
//         return urlStore.get(shortKey);
//     }
// }

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));