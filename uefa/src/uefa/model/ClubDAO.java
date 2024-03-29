package uefa.model;

import java.util.List;
import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

/**
 * A data access object (DAO) providing persistence and search support for Club
 * entities. Transaction control of the save(), update() and delete() operations
 * can directly support Spring container-managed transactions or they can be
 * augmented to handle user-managed Spring transactions. Each of these methods
 * provides additional information for how to configure it for the desired type
 * of transaction control.
 * 
 * @see uefa.model.Club
 * @author MyEclipse Persistence Tools
 */
@Repository
public class ClubDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory.getLogger(ClubDAO.class);
	// property constants
	public static final String NAME = "name";
	public static final String ICON = "icon";
	public static final String CITY = "city";
	public static final String STADIUM = "stadium";
	public static final String ESTYR = "estyr";
	public static final String CAPACITY = "capacity";
	public static final String LEAGUE = "league";
	public static final String LEAGUE_ICON = "leagueIcon";

	public void save(Club transientInstance) {
		log.debug("saving Club instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Club persistentInstance) {
		log.debug("deleting Club instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Club findById(java.lang.Integer id) {
		log.debug("getting Club instance with id: " + id);
		try {
			Club instance = (Club) getSession().get("uefa.model.Club", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Club instance) {
		log.debug("finding Club instance by example");
		try {
			List results = getSession().createCriteria("uefa.model.Club").add(Example.create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Club instance with property: " + propertyName + ", value: " + value);
		try {
			String queryString = "from Club as model where model." + propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			System.out.println("clubdao 86: " + queryObject.list().size());
			System.out.println("clubdao 86: " + queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByName(Object name) {
		return findByProperty(NAME, name);
	}

	public List findByIcon(Object icon) {
		return findByProperty(ICON, icon);
	}

	public List findByCity(Object city) {
		return findByProperty(CITY, city);
	}

	public List findByStadium(Object stadium) {
		return findByProperty(STADIUM, stadium);
	}

	public List findByEstyr(Object estyr) {
		return findByProperty(ESTYR, estyr);
	}

	public List findByCapacity(Object capacity) {
		return findByProperty(CAPACITY, capacity);
	}

	public List findByLeague(Object league) {
		return findByProperty(LEAGUE, league);
	}

	public List findByLeagueIcon(Object leagueIcon) {
		return findByProperty(LEAGUE_ICON, leagueIcon);
	}

	public List findAll() {
		log.debug("finding all Club instances");
		try {
			String queryString = "from Club";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Club merge(Club detachedInstance) {
		log.debug("merging Club instance");
		try {
			Club result = (Club) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Club instance) {
		log.debug("attaching dirty Club instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Club instance) {
		log.debug("attaching clean Club instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}