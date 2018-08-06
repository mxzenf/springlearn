package org.yx;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.connection.RedisClusterConfiguration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.ListOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @author 杨欣
 *
 */
@SpringBootApplication
@EnableAutoConfiguration
@RunWith(SpringRunner.class)
public class App 
{
    @Resource(name = "redis")
    private RedisTemplate redisTemplate;
    //将template当做list来操作
    @Resource(name="redis")
    private ListOperations<String, String> listOps;


    @Test
    public void test_connection(){
        Assert.assertNotNull(redisTemplate);
    }
    @Test
    public void test_addLink(){
        listOps.leftPush("name", "杨欣");
        listOps.leftPush("sex","男");
    }

    @Test
    public void test_getLink(){
        String name = listOps.leftPop("name");
        System.out.print("输出:"+name);
        String sex = listOps.leftPop("sex");
        System.out.print("输出:"+sex);
    }

    @Test
    public void test_opslist(){
        redisTemplate.opsForList().leftPush("l1","1");
        Assert.assertEquals(Long.valueOf(1), redisTemplate.opsForList().size("l1"));
        redisTemplate.opsForList().leftPop("l1");
        Assert.assertEquals(Long.valueOf(0), redisTemplate.opsForList().size("l1"));
    }

    public static void main( String[] args )
    {


    }
}
