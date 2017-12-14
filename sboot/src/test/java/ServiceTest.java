import com.baizhi.entity.User;
import com.baizhi.service.UserService;
import org.junit.Test;
import redis.clients.jedis.Jedis;

import javax.annotation.Resource;
import java.util.List;

/**
 * @AUTHOR licy
 * @create 2017-12-11-17:37
 */
public class ServiceTest extends BaseTest {

    @Resource
    private UserService userService;

    @Resource
    private Jedis jedis;

    @Test
    public void find(){
        List<User> users = userService.findAll();
        System.out.println(users);
    }

    @Test
    public  void jedis(){
        jedis.select(0);
        jedis.set("1","1");
    }
}
