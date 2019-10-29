package uefa.biz;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

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
	
	public List<Club> queryClubsByLeague(String league) {
		List<Club> result = new ArrayList<>();
		List temps = clubDAO.findByLeague(league);
		for(Object temp: temps) {
			System.out.println(temp);
			Club tp = (Club)temp;
			result.add(tp);
		}
		System.out.println("umngr 36: " + result.size());
		return result;		
	}
}
