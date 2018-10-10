package test.com.zzx.activemq.initial; 

import com.zzx.activemq.CustomerApplication;
import com.zzx.activemq.activemq_initial.PTPReceive;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/** 
* PTPReceive Tester. 
* 
* @author <Authors name> 
* @since <pre>���� 16, 2018</pre> 
* @version 1.0 
*/
@RunWith(SpringRunner.class)
@SpringBootTest(classes= CustomerApplication.class)
public class PTPReceiveTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: start() 
* 
*/ 
@Test
public void testStart() throws Exception {
    PTPReceive ptpReceive=new PTPReceive();
    ptpReceive.start();
} 


} 
