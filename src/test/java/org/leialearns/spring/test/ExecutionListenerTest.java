package org.leialearns.spring.test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/org/leialearns/spring/test/AppTest-context.xml"})
@TestExecutionListeners(value = {DependencyInjectionTestExecutionListener.class,ExecutionListener.class})
public class ExecutionListenerTest {

    @Autowired
    private Object test;

    @Test
    public void testExecutionListener() {
        Assert.assertNotNull(test);
    }
}
