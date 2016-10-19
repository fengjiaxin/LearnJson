package json;
import java.util.HashMap;
import java.util.Map;

import org.json.JSONException;
import org.json.JSONObject;

import bean.Person;;

public class JsonObjectExample {

	public static void main(String[] args) {
//		jsonObjectsample();
//		createJsonByMap();
		createJsonByBean();

	}
	


	//原生的json传递数据
	private static void jsonObjectsample() {
		JSONObject  wangxiaoer = new JSONObject();
		Object nullObject = null;
		try {
			wangxiaoer.put("name", "王小二");
			wangxiaoer.put("age", 25.2);
			wangxiaoer.put("birthday", "1990-01-01");
			wangxiaoer.put("school", "蓝翔");
			wangxiaoer.put("major", new String[]{"理发","挖掘机"});
			wangxiaoer.put("has_girlfriend", false);
			wangxiaoer.put("car", nullObject);
			wangxiaoer.put("house", nullObject);
			wangxiaoer.put("comment", "这是一个注释");
			System.out.println(wangxiaoer.toString());
			
			
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	//通过HashMap构建Json
	private static void createJsonByMap(){
		Map<String,Object> wangxiaoer = new HashMap<String, Object>();
		Object nullObject = null;
		wangxiaoer.put("name", "王小二");
		wangxiaoer.put("age", 25.2);
		wangxiaoer.put("birthday", "1990-01-01");
		wangxiaoer.put("school", "蓝翔");
		wangxiaoer.put("major", new String[]{"理发","挖掘机"});
		wangxiaoer.put("has_girlfriend", false);
		wangxiaoer.put("car", nullObject);
		wangxiaoer.put("house", nullObject);
		wangxiaoer.put("comment", "这是一个注释");
		System.out.println(new JSONObject(wangxiaoer).toString());
	}
	
	
	//通过bean常见json
	//setMajor出现问题
	private static void createJsonByBean() {
		Person wangxiaoer = new Person();
		wangxiaoer.setName("王小二");
		wangxiaoer.setAge(25.2);
		wangxiaoer.setBirthday("1990-01-01");
		wangxiaoer.setSchool("蓝翔");
		wangxiaoer.setMajor(new String[]{"理发","发掘集"});
		wangxiaoer.setHas_girlfriend(false);
		wangxiaoer.setCar(null);
		wangxiaoer.setHouse(null);
		wangxiaoer.setComment("这是一个注释");
		System.out.println(new JSONObject(wangxiaoer));
		
	}

}
