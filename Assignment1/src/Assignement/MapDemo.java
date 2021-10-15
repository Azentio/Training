package Assignement;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("Anandh", "8765278822");
		map.put("Gokul", "9257424770");
		map.put("Guru", "9248563214");
		map.put("selva", "6385742364");
		System.out.println(map.get("Anandh"));

	}

}
