package com.dnsoftindia.hellokotlin.interop;

import com.dnsoftindia.hellokotlin.classes.CustomerKotlin;
import com.dnsoftindia.hellokotlin.classes.CustomerKotlinKt;

import java.io.IOException;

/**
 * Created by Ganesha on 5/14/17.
 */
public class TalkingToKotlin {

    public void loadStats(CustomerKotlin custKotlin) {
        try {
            custKotlin.loadStatistics("filename");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        CustomerKotlin custKotlin = new CustomerKotlin(1, "Riddhish", "a@b.com", null);
        custKotlin.setEmail("b@a.com");
        String value = custKotlin.someProperty;

        custKotlin.changeStatus();

        custKotlin.preferrential();

        UtilityClass.prefix("hello", "world");
        int copyright = UtilityClass.copyrightYear;

        CustomerKotlinKt.extension(custKotlin);

    }

}
