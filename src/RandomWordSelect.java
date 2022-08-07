import java.util.ArrayList;
public class RandomWordSelect {
    public String getWord(){
        ArrayList<String> dictionary = new ArrayList<>();
        dictionary.add("animal");
        dictionary.add("prosecute");
        dictionary.add("departure");
        dictionary.add("articulate");
        dictionary.add("nationalist");

        // loop to print elements at randonm
        for (int i = 0; i < dictionary.size(); i++)
        {
            // generating the index using Math.random()
            int index = (int)(Math.random() * dictionary.size());
            return dictionary.get(index);
        }
        return null;
    }


}
