package com.algol.PointOfSales.service.userdetails;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.algol.PointOfSales.dao.BaseDao;
import com.algol.PointOfSales.dao.UserDetailsDao;
import com.algol.PointOfSales.service.HibernateUtil;

@Repository("UserDetails")
public class UserDetailsHibernateImpl implements UserDetailsDBService {

	Transaction transaction = null;

	@Override
	public int insert(List<UserDetailsDao> users) {
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			transaction = session.beginTransaction();

			for (UserDetailsDao user : users) {
				session.save(user);
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

			UserDetailsDao item = session.get(UserDetailsDao.class, id);
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
			session.delete(new UserDetailsDao(id));
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
		UserDetailsDao dao = (UserDetailsDao) baseDao;
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
	public List<UserDetailsDao> getAll() {
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {

			transaction = session.beginTransaction();
			CriteriaBuilder builder = session.getCriteriaBuilder();
			CriteriaQuery<UserDetailsDao> criteria = builder.createQuery(UserDetailsDao.class);
			criteria.from(UserDetailsDao.class);
			List<UserDetailsDao> cars = session.createQuery(criteria).getResultList();
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
