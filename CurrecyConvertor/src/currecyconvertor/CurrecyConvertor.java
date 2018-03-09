/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package currecyconvertor;

import com.google.gson.Gson;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 *
 * @author dawitabera
 */
public class CurrecyConvertor {
    // Currency API provider
    private static final String api_PROVIDER = "http://data.fixer.io/api/latest?access_key=5df0ce6206b1addd28e50cb012e0d715&format=1";
    /**
     * 
     * @param fromC
     * @param toC
     * @return 
     */
    public static double convert(String fromC, String toC){
        if((fromC !=null && !fromC.isEmpty())&&(toC !=null && !toC.isEmpty())){
            CurrecyConversion response = getResponse(api_PROVIDER+"/latest?base="+fromC);
            if(response != null){
                String rate = response.getRates().get(toC);
                double conRate = Double.valueOf((rate != null) ? rate: "0.0");
                return conRate;
            }
        }
        return 0.0;
    }
    
    /**
     * 
     * @param strUrl
     * @return 
     */
    private static CurrecyConversion getResponse(String strUrl) {
        CurrecyConversion response = null;
        
        Gson gson = new Gson();
        StringBuffer sb = new StringBuffer();
        
        if(strUrl == null || strUrl.isEmpty()){
            System.out.println("Application Error");
            return null;
        }
        
        URL url; 
        try {
            url = new URL(strUrl);
            HttpURLConnection connection = (HttpURLConnection)url.openConnection();
            InputStream stream = connection.getInputStream();
            
            int data = stream.read();
            while (data !=-1) {
                sb.append((char)data);
                data = stream.read();
            }
            stream.close();
            response = gson.fromJson(sb.toString(), CurrecyConversion.class);
        } catch(IOException e){
            System.out.println(e.getMessage());
        }
        return response;
    }
    
}
