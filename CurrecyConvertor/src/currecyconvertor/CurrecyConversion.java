/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package currecyconvertor;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author dawitabera
 */
public class CurrecyConversion {
    private String base; 
    private String date; 
    private String countryCode;
    
    public Map<String,String> rates = new TreeMap<String, String>();
    /**
     * 
     * @return the rate that matches the key
     */
    public Map<String,String> getRates(){
        return rates;
    }
    public void printValue(){
        Set set = rates.entrySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {            
            Map.Entry MEntry = (Map.Entry)iterator.next();
            System.out.println(MEntry.getValue());
        }
        
    }
    public void printKey(){
        Set set = rates.entrySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {            
            Map.Entry MEntry = (Map.Entry)iterator.next();
            System.out.println(MEntry.getKey());
        }
        
    }
    /**
     * 
     * @param rates 
     */
    public void setRates(Map<String,String>rates){
        this.rates = rates;
    }
    /**
     * 
     * @return base
     */
    public String getBase(){
        return base;
    }
    /**
     * 
     * @param base 
     */
    public void setBase(String base){
        this.base = base;
    }
    /**
     * 
     * @return date
     */
    public String getDate(){
        return date;
    }
    /**
     * 
     * @param date 
     */
    public void setDate(String date){
        this.date = date;
    }
}
