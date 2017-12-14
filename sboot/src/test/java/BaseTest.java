import com.baizhi.Application;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @AUTHOR licy
 * @create 2017-12-11-17:34
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = {Application.class})  //指定入口类名称
public class BaseTest {
}
