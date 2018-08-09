import com.itheima.dao.IRoleDao;
import com.itheima.domain.Role;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class IRoleDaoTest {
    @Test
    public void testRole() throws IOException {
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSession sqlSession = new SqlSessionFactoryBuilder().build(in).openSession();
        IRoleDao roleDao = sqlSession.getMapper(IRoleDao.class);
        List<Role> roleList = roleDao.findRoles();
        for (Role r:roleList){
            System.out.println(r);
            System.out.println(r.getUsers());
        }
    }
}
