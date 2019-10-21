package uefa.biz;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import uefa.model.Club;
import uefa.model.ClubDAO;

@Service
public class UefaMngr {
	
	@Autowired
	private ClubDAO clubDAO;
	
	// everything named in controller and concerned about db
	// operate here
	
	public List<Club> queryClubs(){
		List<Club> result = new ArrayList<>();
		result = clubDAO.findAll();
		return result;
	}
}
