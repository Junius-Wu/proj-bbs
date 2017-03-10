package bbs.action;

import org.beetl.sql.core.engine.PageQuery;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by jun on 17/3/10.
 */
@Controller
public class BBSController {

    @RequestMapping("/x")
    String inddd() {
        return "x";
    }
}
