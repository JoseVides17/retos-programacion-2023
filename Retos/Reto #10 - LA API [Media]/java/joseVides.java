import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class Api {

    public static void main(String[] args) throws IOException {
        
        try {
            //crear y conectar a una url
            URL url = new URL("https://dog.ceo/api/breeds/image/random");
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.connect();
            
            //comprobar codigo de respuesta
            int responseCode = httpURLConnection.getResponseCode();
            if(responseCode != 200){
                throw new RuntimeException("*** Algo salio mal *** "+ responseCode);
            }else{
                // leemos la informacion obtenida
                StringBuilder information = new StringBuilder();
                Scanner scanner = new Scanner(url.openStream());
                while(scanner.hasNext()){
                    information.append(scanner.nextLine());
                }
                scanner.close();
                
                //imprimimos la informacion obtenida
                System.out.println(""+information);
            }
        } catch (IOException e) {
            System.err.println(""+e);
        }
        
    }
    
}
