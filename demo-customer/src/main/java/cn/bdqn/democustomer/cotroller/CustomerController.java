package cn.bdqn.democustomer.cotroller;

import cn.bdqn.demo.pojo.Cashier;
import cn.bdqn.democustomer.service.CustomerService;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class CustomerController {

    @RequestMapping("show.html")
    public String toShow(){
        return "show";
    }

    @RequestMapping("cashier.html")
    public String toCashier(){
        return "cashier";
    }

    @RequestMapping("warehousing.html")
    public String toWarehousing(){
        return "warehousing";
    }


    @Resource
    private CustomerService customerService;

    /**
     * 添加
     * @param cashier
     * @return
     */
    @RequestMapping(value = "insertCashier",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseBody
    public String insertCashier(Cashier cashier){
        return customerService.insertCashier(cashier);
    }

    /**
     * 查询所有
     * @return
     */
    @RequestMapping(value = "listCashiers",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseBody
    public String listCashiers(){
        return customerService.listCashiers();
    }

    /**
     * 修改库存
     * @param count
     * @param barCode
     * @return
     */
    @RequestMapping(value = "updateCashier",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseBody
    public String updateCashier(@RequestParam("count") Integer count, @RequestParam("barCode") String barCode){
        return customerService.updateCashier(count,barCode);
    }

    /**
     * 根据条形码获取
     * @param barCode
     * @return
     */
    @RequestMapping(value = "getCashierByBarCode",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseBody
    public String getCashierByBarCode(@RequestParam("barCode")String barCode){
        return customerService.getCashierByBarCode(barCode);
    }
}
