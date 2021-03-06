package br.com.alura.forum.controller;


import br.com.alura.forum.controller.dto.TopicosDto;
import br.com.alura.forum.modelo.Curso;
import br.com.alura.forum.modelo.Topico;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


import java.util.Arrays;
import java.util.List;

//@Controller
@RestController //assume que toda classe será ReponseBody
public class TopicosController
{
        @RequestMapping("/topicos")
        //@ResponseBody
        public List<TopicosDto> topicos()
        {
            Topico topico = new Topico("Dúvida","Dúvida com spring",
                    new Curso("Spring","Programacão"));

            return TopicosDto.converter(Arrays.asList(topico, topico, topico));
        }


}
