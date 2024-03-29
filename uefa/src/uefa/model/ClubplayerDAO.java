package uefa.model;

import java.util.List;
import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A data access object (DAO) providing persistence and search support for
 * Clubplayer entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see uefa.model.Clubplayer
 * @author MyEclipse Persistence Tools
 */
public class ClubplayerDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(ClubplayerDAO.class);
	// property constants
	public static final String CLUB_ID = "clubId";
	public static final String PLAYER_ID = "playerId";

	public void save(Clubplayer transientInstance) {
		log.debug("saving Clubplayer instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Clubplayer persistentInstance) {
		log.debug("deleting Clubplayer instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Clubplayer findById(java.lang.Integer id) {
		log.debug("getting Clubplayer instance with id: " + id);
		try {
			Clubplayer instance = (Clubplayer) getSession().get(
					"uefa.model.Clubplayer", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Clubplayer instance) {
		log.debug("finding Clubplayer instance by example");
		try {
			List results = getSession().createCriteria("uefa.model.Clubplayer")
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
		log.debug("finding Clubplayer instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Clubplayer as model where model."
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

	public List findByPlayerId(Object playerId) {
		return findByProperty(PLAYER_ID, playerId);
	}

	public List findAll() {
		log.debug("finding all Clubplayer instances");
		try {
			String queryString = "from Clubplayer";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Clubplayer merge(Clubplayer detachedInstance) {
		log.debug("merging Clubplayer instance");
		try {
			Clubplayer result = (Clubplayer) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Clubplayer instance) {
		log.debug("attaching dirty Clubplayer instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Clubplayer instance) {
		log.debug("attaching clean Clubplayer instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}