package matheus.AgendaWeb.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class AgendaController {
    
    @RequestMapping("/ola")
    public String exibirMensagem() {
        return "Ola mundo!";
    }
}
