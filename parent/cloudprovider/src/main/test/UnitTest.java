import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UnitTest {

    //Logger log= Logger.getLogger(UnitTest.class);

    @Before
    public void before(){
    }

    @After
    public void after(){
       // log.info("------结束-------");
    }
}
