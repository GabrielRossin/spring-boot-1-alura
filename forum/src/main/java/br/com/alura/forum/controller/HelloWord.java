package br.com.alura.forum.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller //indica que um controller
public class HelloWord
{
    @RequestMapping("/") //mapeia a função
    @ResponseBody //Indicar ao Spring que o retorno do método deve ser devolvido como resposta
    public String hello()
    {
        return  "Hello World";
    }
}
