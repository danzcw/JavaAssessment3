package parsing_json;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import com.google.gson.Gson;

public class ElementCollectionInitializer {

    ArrayList<Element> periodicTableList = new ArrayList<>();


    public ArrayList<String> parseJsonFromGson() throws FileNotFoundException {
        Gson gson = new Gson();
        BufferedReader br = null;

        try {
            br = new BufferedReader(new FileReader("periodic_table.json"));
            Element element = gson.fromJson(br, Element.class);
            if (element != null) {

            }
        } catch (FileNotFoundException e){
        }
        return null;
    }

        public ArrayList<String> parseJsonToStringArrayList (String text){
            String stringPattern = "";
            ArrayList<String> tableString = splitStringTableWithRegex(stringPattern, text);
            return tableString;

        }

        private ArrayList<String> splitStringTableWithRegex (String stringPattern, String inputString){
            return new ArrayList<String>(Arrays.asList(inputString.split(stringPattern)));
        }

        public static ElementCollection generate () {


            return null;
        }
    }



