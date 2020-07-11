package com.algol.PointOfSales.service.shopmaster;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.algol.PointOfSales.dao.BaseDao;
import com.algol.PointOfSales.dao.ShopMasterDao;
import com.algol.PointOfSales.service.HibernateUtil;

@Repository("ShopMaster")
public class ShopMasterHibernateImpl implements ShopMasterDBService {

	Transaction transaction = null;

	@Override
	public int insert(ShopMasterDao shop) {
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			transaction = session.beginTransaction();
			// TODO get id of auto incrementing field
			System.out.println(session.save(shop));
			transaction.commit();

			return shop.getShopId();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public BaseDao get(int id) {
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			transaction = session.beginTransaction();

			ShopMasterDao item = session.get(ShopMasterDao.class, id);
			transaction.commit();
			return item;
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public int delete(int id) {
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {

			transaction = session.beginTransaction();
			session.delete(new ShopMasterDao(id));
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int update(BaseDao baseDao) {
		ShopMasterDao dao = (ShopMasterDao) baseDao;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {

			transaction = session.beginTransaction();
			// update the car
			session.update(dao);
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public List<ShopMasterDao> getAll() {
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {

			transaction = session.beginTransaction();
			CriteriaBuilder builder = session.getCriteriaBuilder();
			CriteriaQuery<ShopMasterDao> criteria = builder.createQuery(ShopMasterDao.class);
			criteria.from(ShopMasterDao.class);
			List<ShopMasterDao> cars = session.createQuery(criteria).getResultList();
			transaction.commit();
			return cars;
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
		return null;
	}

}
