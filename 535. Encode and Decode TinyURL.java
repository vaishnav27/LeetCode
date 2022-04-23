public class Codec {
    HashMap<String,String>map=new HashMap<>();
    public String encode(String longUrl) {
        StringBuilder sb=new StringBuilder();
        
        sb.append((char)(Math.floor(Math.random()*100)));
        while(map.containsKey(sb.toString())){
            sb.append((char)(Math.floor(Math.random()*100)));
        }
        map.put(sb.toString(),longUrl);
        
        return sb.toString();
    }
    public String decode(String shortUrl) {
        return map.get(shortUrl);
    }
}

