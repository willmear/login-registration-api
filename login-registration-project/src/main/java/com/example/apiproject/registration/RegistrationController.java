package com.example.apiproject.registration;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/registration")
@AllArgsConstructor
public class RegistrationController {

    private final RegistrationService registrationService;

    @PostMapping
    public String register(@RequestBody RegistrationRequest request) {

        return registrationService.register(request);
    }












//    @Autowired
//    private final UserRepository repo;
//
//    @GetMapping("/registration")
//    public String registrationPage(Model model) {
//        model.addAttribute("user", new User());
//        return "registration";
//    }
//
//    @PostMapping("/save")
//    public String saveUser(User user) {
//        if(user.getPassword().equals(user.getCheckPassword())) {
//            repo.save(user);
//            return "home";
//        }
//        else {
//            return "registration";
//        }
//    }
//
//    @GetMapping("/login")
//    public String loginPage() {
//        return "login";
//    }



}
