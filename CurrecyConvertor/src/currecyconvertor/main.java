/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package currecyconvertor;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import static currecyconvertor.CurrecyConvertor.convert;
import java.util.Scanner;

/**
 *
 * @author dawitabera
 */
public class main {
    
    static HttpResponse<JsonNode> response;
    static String print = "https://restcountries-v1.p.mashape.com/currency/NOK";
    
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your currency code ?");
	String fromCurrencyCode = scanner.next();
        
	System.out.println("Enter the Amount :");
	double amount = scanner.nextDouble();
        
	System.out.println("Enter the Currency Code that you want to covert : ");
	String toCurrencyCode = scanner.next();
        
        fromCurrencyCode = fromCurrencyCode.toUpperCase();
        toCurrencyCode = toCurrencyCode.toUpperCase();
        
        double conRate = convert(fromCurrencyCode,toCurrencyCode);
        
        System.out.println("Currency Rate: " + conRate);
        System.out.println("The: " + amount + " "+ fromCurrencyCode + " is "+ (conRate*amount)+" "+toCurrencyCode + " today" );
    }
}
