package org.wj.cloud.common;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by wenjing.liu on 2021/5/31 in J1.
 *
 * @author wenjing.liu
 */
@Controller
public class WjCloudCommonController {
   @RequestMapping("/")
   @ResponseBody
    public String requestWjCloudCommon(){
        return "Hello WjCloudCommonController";
    }

}
