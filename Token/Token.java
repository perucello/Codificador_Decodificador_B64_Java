import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class Token {

    public static void main(String[] args) {
    	String token = "token";
    	codB64(token);
    	
    	String token_decode = "token decode aqui";
    	decodb64(token_decode);
    }
    
    public static void codB64(String token_cp4ba) {
    	System.out.println("**** codb64 ****");
    	 String username = "username aqui"; 
         String apiKey = token_cp4ba;
     
         String credentials = username + ":" + apiKey;
         
         String encodedCredentials = Base64.getEncoder().encodeToString(credentials.getBytes(StandardCharsets.UTF_8));
         
         System.out.println("codB64: " + encodedCredentials);
         System.out.println("Authorization: ZenApiKey " + encodedCredentials);
    }
    
    public static void decodb64(String token_decode) {
    	System.out.println("**** decodb64 ****");

        String encodedCredentials = token_decode;
        
        byte[] decodedBytes = Base64.getDecoder().decode(encodedCredentials);
        
        String decodedCredentials = new String(decodedBytes, StandardCharsets.UTF_8);
        
        System.out.println("decodb64: " + decodedCredentials);
    }
}