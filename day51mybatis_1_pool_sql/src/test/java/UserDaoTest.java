import com.itheima.dao.IUserDao;
import com.itheima.domain.QueryVo;
import com.itheima.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class UserDaoTest {
    InputStream inputStream;
    SqlSession sqlSession;
    IUserDao userDao;
        @Before
    public void before() throws IOException {
            inputStream  = Resources.getResourceAsStream("SqlMapConfig.xml");
         sqlSession = new SqlSessionFactoryBuilder().build(inputStream).openSession();
            userDao = sqlSession.getMapper(IUserDao.class);
        }
        @Test
    public void test(){
            User user = new User();
                    user.setAddress("西班牙");
                    user.setUsername("C罗");
            QueryVo queryVo = new QueryVo();
            queryVo.setUser(user);
            List<User> userList = userDao.findByCondition(queryVo);
            List<Integer> ids = new ArrayList<>();
            ids.add(50);
            ids.add(51);
            queryVo.setIds(ids);
            //List<User> userList = userDao.findByCondition(queryVo);
            System.out.println(userList);
        }
        @Test
        public void testQuery(){
            List<User> userList = userDao.findByAccount();
            for (User u : userList) {
                System.out.println(u);
                System.out.println(u.getAccounts());
            }
        }
        @Test
    public void testUser(){
            List<User> userList = userDao.findByRole();
            for (User u:userList){
                System.out.println(u);
                System.out.println(u.getRoles());
            }
        }

}
