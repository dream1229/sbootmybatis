package com.offcn.sbootmybatis;

import com.offcn.sbootmybatis.pojo.Student;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = SbootmybatisApplication.class)
class SbootmybatisApplicationTests {

    @Autowired
   private RedisTemplate redisTemplate;

    @Test
   public void test(){

        redisTemplate.opsForValue().set("kk","1234");


        String kk = (String) redisTemplate.opsForValue().get("kk");
        System.out.println(kk);

        Student student = new Student();
        student.setId(6);
        student.setName("小米");
        redisTemplate.opsForValue().set("stu",student);
        Student s = (Student) redisTemplate.opsForValue().get("stu");
        System.out.println(s);

    }

}
