package ua.nure.makestart.controller;


import org.springframework.stereotype.Controller;

@Controller
public class RegistrationController {
}
//
//    @Autowired
//    private UserSevice userSevice;
//
//    @Value("${recaptcha.secret}")
//    private String secret;
//
//    @Autowired
//    private RestTemplate restTemplate;
//
//    @GetMapping("/registration")
//    public String registration() {
//        return "registration";
//    }
//
//    @PostMapping("/registration")
//    public String addUser(
//            @RequestParam("password2") String passwordConfirm,
//            @RequestParam("g-recaptcha-response") String captchaResponce,
//            @Valid User user,
//            BindingResult bindingResult,
//            Model model
//    ) {
//        String url = String.format(CAPTCHA_URL, secret, captchaResponce);
//        CaptchaResponseDto response = restTemplate.postForObject(url, Collections.emptyList(), CaptchaResponseDto.class);
//
//        if (!response.isSuccess()) {
//            model.addAttribute("captchaError", "Fill captcha");
//        }
//
//        boolean isConfirmEmpty = StringUtils.isEmpty(passwordConfirm);
//
//        if (isConfirmEmpty) {
//            model.addAttribute("password2Error", "Password confirmation cannot be empty");
//        }
//
//        if (user.getPassword() != null && !user.getPassword().equals(passwordConfirm)) {
//            model.addAttribute("passwordError", "Passwords are different!");
//        }
//
//        if (isConfirmEmpty || bindingResult.hasErrors() || !response.isSuccess()) {
//            Map<String, String> errors = ControllerUtils.getErrors(bindingResult);
//
//            model.mergeAttributes(errors);
//
//            return "registration";
//        }
//
//        if (!userSevice.addUser(user)) {
//            model.addAttribute("usernameError", "User exists!");
//            return "registration";
//        }
//
//        return "redirect:/login";
//    }
//
//    @GetMapping("/activate/{code}")
//    public String activate(Model model, @PathVariable String code) {
//        boolean isActivated = userSevice.activateUser(code);
//
//        if (isActivated) {
//            model.addAttribute("messageType", "success");
//            model.addAttribute("message", "User successfully activated");
//        } else {
//            model.addAttribute("messageType", "danger");
//            model.addAttribute("message", "Activation code is not found!");
//        }
//
//        return "login";
//    }
//
//}
