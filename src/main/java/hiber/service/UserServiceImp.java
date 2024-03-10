package hiber.service;

import hiber.dao.UserDao;
import hiber.model.Car;
import hiber.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImp implements UserService {

   @Autowired
   private UserDao userDao;
   @Autowired Car car;

   @Transactional
   @Override
   public void add(User user) {
      userDao.add(user);
   }
   @Autowired
   private SessionFactory sessionFactory;
   @Transactional(readOnly = true)
   public User getUserByCar(String model, int series) {
      return userDao.getUserByCar(model, series);
   }



   @Transactional(readOnly = true)
   @Override
   public List<User> listUsers() {
      return userDao.listUsers();
   }

}
