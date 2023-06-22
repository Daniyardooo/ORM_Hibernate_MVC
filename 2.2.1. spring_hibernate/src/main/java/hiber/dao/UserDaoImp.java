package hiber.dao;

import hiber.model.User;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class UserDaoImp implements UserDao {

    private final SessionFactory sessionFactory;

    @Autowired
    public UserDaoImp(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void add(User user) {
        sessionFactory.getCurrentSession().save(user);
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<User> getListUsers() {
        TypedQuery<User> query = sessionFactory.getCurrentSession().createQuery("from User");
        return query.getResultList();
    }

    @Override
    public void getUserBySeriesAndModel(String model, int series) {
        String HQL = "FROM User u LEFT OUTER JOIN FETCH u.car p WHERE p.series = :series AND p.model = :model";
        User user = sessionFactory.getCurrentSession().createQuery(HQL, User.class).setParameter("series", series).setParameter("model", model).uniqueResult();
        System.out.println(user);

    }

}
