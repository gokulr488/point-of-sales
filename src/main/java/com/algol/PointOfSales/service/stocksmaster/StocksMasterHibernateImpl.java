package com.algol.PointOfSales.service.stocksmaster;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.algol.PointOfSales.dao.BaseDao;
import com.algol.PointOfSales.dao.StocksMasterDao;
import com.algol.PointOfSales.service.HibernateUtil;

@Repository("StockMaster")
public class StocksMasterHibernateImpl implements StocksMasterDBService {

	Transaction transaction = null;

	@Override
	public int insert(List<StocksMasterDao> stocks) {
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			transaction = session.beginTransaction();
			for (StocksMasterDao item : stocks) {
				session.save(item);
			}
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
	public BaseDao get(int id) {

		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			transaction = session.beginTransaction();

			StocksMasterDao item = session.get(StocksMasterDao.class, id);
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
			session.delete(new StocksMasterDao(id));
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
		StocksMasterDao dao = (StocksMasterDao) baseDao;
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
	public List<StocksMasterDao> getAll() {
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {

			transaction = session.beginTransaction();
			CriteriaBuilder builder = session.getCriteriaBuilder();
			CriteriaQuery<StocksMasterDao> criteria = builder.createQuery(StocksMasterDao.class);
			criteria.from(StocksMasterDao.class);
			List<StocksMasterDao> cars = session.createQuery(criteria).getResultList();
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
