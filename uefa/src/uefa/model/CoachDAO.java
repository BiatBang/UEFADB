package uefa.model;

import java.util.List;
import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A data access object (DAO) providing persistence and search support for Coach
 * entities. Transaction control of the save(), update() and delete() operations
 * can directly support Spring container-managed transactions or they can be
 * augmented to handle user-managed Spring transactions. Each of these methods
 * provides additional information for how to configure it for the desired type
 * of transaction control.
 * 
 * @see uefa.model.Coach
 * @author MyEclipse Persistence Tools
 */
public class CoachDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory.getLogger(CoachDAO.class);
	// property constants
	public static final String NAME = "name";
	public static final String CLUB = "club";
	public static final String COUNTRY = "country";
	public static final String COUNTRY_ICON = "countryIcon";

	public void save(Coach transientInstance) {
		log.debug("saving Coach instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Coach persistentInstance) {
		log.debug("deleting Coach instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Coach findById(java.lang.Integer id) {
		log.debug("getting Coach instance with id: " + id);
		try {
			Coach instance = (Coach) getSession().get("uefa.model.Coach", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Coach instance) {
		log.debug("finding Coach instance by example");
		try {
			List results = getSession().createCriteria("uefa.model.Coach")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Coach instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Coach as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByName(Object name) {
		return findByProperty(NAME, name);
	}

	public List findByClub(Object club) {
		return findByProperty(CLUB, club);
	}

	public List findByCountry(Object country) {
		return findByProperty(COUNTRY, country);
	}

	public List findByCountryIcon(Object countryIcon) {
		return findByProperty(COUNTRY_ICON, countryIcon);
	}

	public List findAll() {
		log.debug("finding all Coach instances");
		try {
			String queryString = "from Coach";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Coach merge(Coach detachedInstance) {
		log.debug("merging Coach instance");
		try {
			Coach result = (Coach) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Coach instance) {
		log.debug("attaching dirty Coach instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Coach instance) {
		log.debug("attaching clean Coach instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}