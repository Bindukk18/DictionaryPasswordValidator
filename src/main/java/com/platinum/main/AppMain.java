/**
 * 
 */
package com.platinum.main;

import com.platinum.dpv.DictionaryPasswordValidator;

/**
 * @author kk.bindumalini
 *
 */
public class AppMain {
    public static void main(String[] args) {
        try {

            DictionaryPasswordValidator pDV = DictionaryPasswordValidator.getInstance();

            if (pDV.isDictionaryWord("runner") == true) {
                System.out.println("Password contains a dictionary word!");
            } else {
                {
                    System.out.println("Password is valid.");
                }
            }
        } catch (Exception e) {
            System.out.println("Failed!");
        }
    }
}
