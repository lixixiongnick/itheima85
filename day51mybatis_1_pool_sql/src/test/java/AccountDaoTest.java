import com.itheima.dao.IAccountDao;
import com.itheima.domain.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class AccountDaoTest {
    @Test
    public void testAcount() throws IOException {
        InputStream in  = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSession sqlSession = new SqlSessionFactoryBuilder().build(in).openSession();
        IAccountDao accountDao = sqlSession.getMapper(IAccountDao.class);
       // Account account = new Account();
        List<Account> account1 = accountDao.findAccount();
        System.out.println(account1);
        sqlSession.commit();
        sqlSession.close();
        in.close();
    }
}
