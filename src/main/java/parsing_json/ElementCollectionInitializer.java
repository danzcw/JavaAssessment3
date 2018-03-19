package parsing_json;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ElementCollectionInitializer {

    //Gson gson = new Gson();



    public static ElementCollection generate() {




        return null;
    }
}

//    private Matcher matcher;
//    private Pattern pattern;
//    public int count = 0;
//    Main main = new Main();
//    private Map<String, ArrayList<Item>> groceryList = new HashMap<String, ArrayList<Item>>();
//
//    public ArrayList<String> parseRawDataIntoStringArray(String rawData) {
//        String stringPattern = "##";
//        ArrayList<String> response = splitStringWithRegexPattern(stringPattern, rawData);
//        return response;
//    }
//
//    public Item parseStringIntoItem(String rawItem) throws ItemParseException {
//        String name = changeAny0(rawItem);
//        Double price = findPrice(rawItem);
//        String type = findType(rawItem);
//        String expiration = findExpirationDate(rawItem);
//
//        if (changeAny0(rawItem) == null || findPrice(rawItem) == 0.0) {
//            throw new ItemParseException();
//        }
//
//        return new Item(name, price, type, expiration);
//    }
//
//    public ArrayList<String> findKeyValuePairsInRawItemData(String rawItem) {
//        String stringPattern = "[;|^]";
//        ArrayList<String> response = splitStringWithRegexPattern(stringPattern, rawItem);
//        return response;
//    }
//
//    private ArrayList<String> splitStringWithRegexPattern(String stringPattern, String inputString) {
//        return new ArrayList<String>(Arrays.asList(inputString.split(stringPattern)));
