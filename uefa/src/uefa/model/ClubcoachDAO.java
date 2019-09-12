package uefa.model;

import java.util.List;
import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A data access object (DAO) providing persistence and search support for
 * Clubcoach entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see uefa.model.Clubcoach
 * @author MyEclipse Persistence Tools
 */
public class ClubcoachDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(ClubcoachDAO.class);
	// property constants
	public static final String CLUB_ID = "clubId";
	public static final String COACH_ID = "coachId";

	public void save(Clubcoach transientInstance) {
		log.debug("saving Clubcoach instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Clubcoach persistentInstance) {
		log.debug("deleting Clubcoach instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Clubcoach findById(java.lang.Integer id) {
		log.debug("getting Clubcoach instance with id: " + id);
		try {
			Clubcoach instance = (Clubcoach) getSession().get(
					"uefa.model.Clubcoach", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Clubcoach instance) {
		log.debug("finding Clubcoach instance by example");
		try {
			List results = getSession().createCriteria("uefa.model.Clubcoach")
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
		log.debug("finding Clubcoach instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Clubcoach as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByClubId(Object clubId) {
		return findByProperty(CLUB_ID, clubId);
	}

	public List findByCoachId(Object coachId) {
		return findByProperty(COACH_ID, coachId);
	}

	public List findAll() {
		log.debug("finding all Clubcoach instances");
		try {
			String queryString = "from Clubcoach";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Clubcoach merge(Clubcoach detachedInstance) {
		log.debug("merging Clubcoach instance");
		try {
			Clubcoach result = (Clubcoach) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Clubcoach instance) {
		log.debug("attaching dirty Clubcoach instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Clubcoach instance) {
		log.debug("attaching clean Clubcoach instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}