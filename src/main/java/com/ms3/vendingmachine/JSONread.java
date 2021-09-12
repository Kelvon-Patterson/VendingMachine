package com.ms3.vendingmachine;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.*;

public class JSONread {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) throws Exception {
        JSONParser jsonParser = new JSONParser();

        try(FileReader reader = new FileReader("src/main/java/com/ms3/vendingmachine/snacks.json")){
            Object obj = jsonParser.parse(reader);
            
            JSONArray snackList= (JSONArray) obj;
            System.out.println("snackList = " + snackList);

            snackList.forEach(item-> parseSnackObject( (JSONObject) item));
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }

    }
        private static void parseSnackObject(JSONObject items)
        {
            //Get snack object within list
            JSONObject snackObject = (JSONObject) items.get("items");

            String name = (String) items.get("name");
            System.out.println( name);

            String price = (String) items.get("price");
            System.out.println(price);


            String amount = (String) items.get("amount");
            System.out.println(amount);

        }

}
