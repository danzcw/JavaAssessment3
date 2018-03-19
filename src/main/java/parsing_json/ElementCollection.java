package parsing_json;

import java.util.ArrayList;

public class ElementCollection extends ArrayList{
    ArrayList<Element> listOfElements = new ArrayList<>();
    Element element = new Element();

    public ElementCollection() {

    }

    public Element findByAtomicNumber(int atomic_number) {

        for(int i = 0; i < this.listOfElements.size(); i++) {
            if (this.listOfElements.get(i).getNumber() == atomic_number) {
                return this.listOfElements.get(i);
            }
        }
        return null;
    }

    public Element findByName(String name) {
        for(int i = 0; i < this.listOfElements.size(); i++) {
            if (this.listOfElements.get(i).getName() == name) {
                return this.listOfElements.get(i);
            }
        }
        return null;
    }

    public ElementCollection where(String fieldName, Object value) {
//        for(int i = 0; i < this.listOfElements.size(); i++)
//            if(this.listOfElements.get(i).contains(fieldName))

        return null;
    }
}
