package pl.rtaj.reporter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import pl.rtaj.reporter.User.UserRepository;

import javax.persistence.EntityManager;

@Controller
public class HomeController {

    @Autowired
    private EntityManager entityManager;

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/")
    public String home() {
        return "home";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }




}
