package net.innno.publisher;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class ErrorHandlerController implements ErrorController {

    @Override
    @RequestMapping("/error")

    public String getErrorPath() {
        return "error";
    }
}