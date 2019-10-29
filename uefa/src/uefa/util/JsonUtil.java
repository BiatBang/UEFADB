package uefa.util;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

public class JsonUtil {
	public static String jsonArrayFromList(List list) {
		String result = "";
		for(Object ele: list) {
			result += "{";
			for(Method m: ele.getClass().getMethods()) {
				if(m.getName().startsWith("get") && m.getParameterTypes().length == 0) {
					try {
						String name = m.getName().substring(3);
						result += name;
						result += ":";
						final String str = String.valueOf(m.invoke(ele));
						result += str;
						result += ",";
					} catch (IllegalAccessException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (IllegalArgumentException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (InvocationTargetException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			if(result.length() > 0) result = result.substring(0, result.length() - 1);
			result += "},";
		}
		if(result.length() > 0) result = result.substring(0, result.length() - 1);
		return result;
	}
}
