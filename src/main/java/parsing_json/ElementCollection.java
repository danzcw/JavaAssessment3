package parsing_json;

import java.util.ArrayList;

public class ElementCollection extends ArrayList{
    ArrayList<Integer> listOfElements = new ArrayList<>();
    Element element = new Element();

    public ElementCollection() {

    }

    public Element findByAtomicNumber(int atomic_number) {

        for(int i = 0; i < listOfElements.size(); i++)
            if (element.getNumber() == atomic_number) {
            return element;
            }

        return null;
    }

    public Element findByName(String name) {
        for(int i = 0; i < listOfElements.size(); i++)
            if (element.getName() .equals(name)) {
                return element;
            }
                return null;
    }

    public ElementCollection where(String fieldName, Object value) {
        return null;
    }
}
