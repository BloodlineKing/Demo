package cn.bdqn.demoprovider.controller;

import cn.bdqn.demo.pojo.Cashier;
import cn.bdqn.demoprovider.service.CashierService;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CashierController {
    @Autowired
    private CashierService cashierService;

    /**
     * 添加
     * @param cashier
     * @return
     */
    @RequestMapping(value = "insertCashier",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public String insertCashier(@RequestBody Cashier cashier){
        Integer result=cashierService.insertCashier(cashier);
        return JSON.toJSONString(result);
    }

    /**
     * 查询所有
     * @return
     */
    @RequestMapping(value = "listCashiers",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public String listCashiers(){
        List<Cashier> list=cashierService.listCashiers();
        return JSON.toJSONString(list);
    }

    /**
     * 根据条形码获取
     * @param barCode
     * @return
     */
    @RequestMapping(value = "getCashierByBarCode",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public String getCashierByBarCode(@RequestParam("barCode")String barCode){
        Cashier cashier=cashierService.getCashierByBarCode(barCode);
        return JSON.toJSONString(cashier);
    }

    /**
     * 修改库存
     * @param count
     * @param barCode
     * @return
     */
    @RequestMapping(value = "updateCashier",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public String updateCashier(@RequestParam("count") Integer count,@RequestParam("barCode") String barCode){
        Integer result=cashierService.updateCashier(count, barCode);
        return JSON.toJSONString(result);
    }
}
