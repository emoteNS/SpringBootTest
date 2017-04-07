package jahv.springboot.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jahv.springboot.repository.JournalRepository;

@Controller
public class JournalController {

    @Autowired
    JournalRepository journalRepository;

    @RequestMapping("/")
    public String index(Model model){
        model.addAttribute("journal", journalRepository.findAll());
        return "index";
    }
}
