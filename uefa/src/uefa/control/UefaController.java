package uefa.control;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import net.sf.json.JSONObject;

@Controller
@RequestMapping(value = "/ctrl/uefa")

public class UefaController {
	// controller is responsible for fetching information
	// however, it doesn't really touch DAO, not mention db
	// there is a dao manager handles data from db to models
	// controller only fetch data from manager
	// so, the procedure is:
	// dao -> manager(handle some validation, query) -> controller
	// therefore, functions in controller and manager are like 1 to 1 mapping
	// their names remain the same, too.
	
	@RequestMapping(value = "/queryClubs.do")
	public @ResponseBody JSONObject queryClubs(HttpServletRequest request)  throws Exception{
		JSONObject model = new JSONObject();
		model.put("success", true);
		model.put("msg", "caonima");
		System.out.println(model.get("msg"));
		return model;
	}
}
