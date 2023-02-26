package speldemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component("mapListTestBean")
public class MapListDemo {
	private Map<String, String> map;
	private List<String> list;

	public MapListDemo() {
		map = new HashMap<String, String>();
		map.put("stu1", "Bhavish");
		map.put("stu2", "Murugesh");
		map.put("stu3", "Bharath");

		list = new ArrayList<String>();
		list.add("Nidhi");
		list.add("Ankit");
		list.add("Amani");

	}

	public Map<String, String> getMap() {
		return map;
	}

	public void setMap(Map<String, String> map) {
		this.map = map;
	}

	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}
}
