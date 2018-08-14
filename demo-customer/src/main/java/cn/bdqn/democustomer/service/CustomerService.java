package cn.bdqn.democustomer.service;

import cn.bdqn.demo.pojo.Cashier;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("PROVIDER")
public interface CustomerService {


    /**
     * 添加
     * @param cashier
     * @return
     */
    @RequestMapping(value = "insertCashier",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    String insertCashier(@RequestBody Cashier cashier);

    /**
     * 查询所有
     * @return
     */
    @RequestMapping(value = "listCashiers",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    String listCashiers();

    /**
     * 根据条形码获取
     * @param barCode
     * @return
     */
    @RequestMapping(value = "getCashierByBarCode",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    String getCashierByBarCode(@RequestParam("barCode") String barCode);

    /**
     * 修改库存
     * @param count
     * @param barCode
     * @return
     */
    @RequestMapping(value = "updateCashier",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    String updateCashier(@RequestParam("count") Integer count, @RequestParam("barCode") String barCode);
}
