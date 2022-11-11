package com.golmoo.springboot.web;

import com.golmoo.springboot.HelloController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class) // 1번
@WebMvcTest(controllers = HelloController.class) //2번
public class HelloControllerTest {

    @Autowired  //3번
    private MockMvc mvc;    //4번

    @Test
    public void hello가_리턴된다() throws Exception{
        String hello = "hello";

        mvc.perform(get("/hello"))  //5번
                .andExpect(status().isOk()) //6번
                .andExpect(content().string(hello));    //7번
    }
}
