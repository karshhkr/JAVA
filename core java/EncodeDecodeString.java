import java.util.*;

public class EncodeDecodeString {

    // Encodes a list of strings to a single string.
    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (String s : strs) {
            // Store length of string + "#" + actual string
            sb.append(s.length()).append("#").append(s);
        }
        return sb.toString();
    }

    // Decodes a single string to a list of strings.
    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        int i = 0;
        
        while (i < str.length()) {
            // Find the separator "#"
            int j = i;
            while (str.charAt(j) != '#') {
                j++;
            }
            
            // Length of string
            int length = Integer.parseInt(str.substring(i, j));
            
            // Extract the string of given length
            String word = str.substring(j + 1, j + 1 + length);
            result.add(word);
            
            // Move pointer
            i = j + 1 + length;
        }
        
        return result;
    }

    // For testing
    public static void main(String[] args) {
        EncodeDecodeString codec = new EncodeDecodeString();
        
        List<String> input = Arrays.asList("leet", "code", "love#java", "");
        String encoded = codec.encode(input);
        System.out.println("Encoded: " + encoded);
        
        List<String> decoded = codec.decode(encoded);
        System.out.println("Decoded: " + decoded);
    }
}
