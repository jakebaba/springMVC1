package cn.itcast.controller;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Component
//@RequestMapping(value="/book")
public class BookController {

    @RequestMapping(value="hello" ,method = {RequestMethod.POST})
    public String sayHello(String book){
        System.out.println("Hello StringMVC");
        System.out.println("Book");
        return "success";
    }


}
