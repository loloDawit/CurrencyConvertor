/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package currecyconvertor;

import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author dawitabera
 */
public class CurrecyConversion {
    private String base; 
    private String date; 
    
    private Map<String,String> rates = new TreeMap<String, String>();
    /**
     * 
     * @return the rate that matches the key
     */
    public Map<String,String> getRates(){
        return rates;
    }
}
