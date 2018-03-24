package me.pycode.learn._8.CaffeineBeverage;

import java.io.*;

public class Tea extends CaffeineBeverage {
    @Override
    public void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding lemon");
    }

    @Override
    public boolean customerWantsCondiments() {
        String response = askCustomer();
        return response.toLowerCase().startsWith("y");
    }

    public String askCustomer(){
        String response = null;
        System.out.println("Do you want condiments");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            response = in.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (response == null) {
            return "";
        }
        return response;
    }
}
