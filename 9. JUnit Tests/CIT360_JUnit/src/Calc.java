/**
 *
 * @author pauldarr
 */
import java.util.HashMap;


public class Calc {
	
    public int rectangle (int x, int y){
	int result = x * y;
	return result;
	}

    public boolean isEvenNumber(int number){
	boolean result = false;
	if(number%2 == 0){
			result = true;
	}
	return result;
	}
	
    public String getValue(final String key){
        HashMap<String, String> value = new HashMap<>();
        value.put("key1", "value 1");
        value.put("key2", "value 2");
        value.put("key3", "value 3");
        return value.get(key);
    }

    public static String[] stringArray() {
		String[] result = {"one", "two", "three"};
		return result;
	}
}	
