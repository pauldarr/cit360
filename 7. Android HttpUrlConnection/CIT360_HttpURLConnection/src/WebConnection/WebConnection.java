package WebConnection;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.HttpURLConnection;

public class WebConnection {

  public static void main(String[] args) throws Exception {
      
    /* Step 1. Obtain a new HttpURLConnection by calling URL.openConnection() 
       and casting the result to HttpURLConnection. */
    
    URL url = new URL("http://www.darr.org/helloworld.html");
    
    /* Step 2. Prepare the request. 
    The primary property of a request is its URI. */
    
    HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
    
    /* Step 3. Optionally upload a request body. 
       Instances must be configured with setDoOutput(true) 
       if they include a request body. Transmit data by writing 
       to the stream returned by getOutputStream(). */
    
    urlConnection.setDoOutput(true);
    OutputStreamWriter writer = new OutputStreamWriter(urlConnection.getOutputStream());
    
    /* Code for output */
    
    writer.write("value=1&anotherValue=1");
    writer.flush();
    String line;
    
    /* Step 4. Read the response. 
       Response headers typically include metadata such as the response 
       body's content type and length, modified dates and session cookies. 
       The response body may be read from the stream returned by getInputStream(). 
       If the response has no body, that method returns an empty stream. */
    
    BufferedReader reader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
    
    /* Code for output */
    while ((line = reader.readLine()) != null) {
      System.out.println(line);
    }
    writer.close();
    reader.close();
    
    /* Step 5. Disconnect. Once the response body has been read, 
       the HttpURLConnection should be closed by calling disconnect(). 
       Disconnecting releases the resources held by a connection  
       so they may be closed or reused. */
    
    urlConnection.disconnect();

  }
}
