package uefa.control;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import net.sf.json.JSONObject;
import net.sf.json.util.JSONUtils;
import uefa.biz.UefaMngr;
import uefa.model.Club;
import uefa.util.JsonUtil;

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
	
	@Autowired
	private UefaMngr uefaMngr;
	
	@RequestMapping(value = "/queryClubs.do")
	public @ResponseBody JSONObject queryClubs(HttpServletRequest request) throws Exception{
		JSONObject model = new JSONObject();
		List<Club> clubs = uefaMngr.queryClubs();
		model.put("success", true);
		model.put("msg", "caonima");
		model.put("clubs", JsonUtil.jsonArrayFromList(clubs));
		System.out.println(model.get("msg"));
		return model;
	}
}
