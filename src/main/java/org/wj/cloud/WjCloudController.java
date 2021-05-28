package org.wj.cloud;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by wenjing.liu on 2021/5/28 in J1.
 *
 * @author wenjing.liu
 */
@Controller
public class WjCloudController {
    @ResponseBody
    @RequestMapping("/")
    public String helloWjCloud() {
        return "Hello wj cloud! Come on";
    }
}