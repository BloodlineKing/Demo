package cn.bdqn.demoprovider.service;

import cn.bdqn.demo.pojo.Cashier;

import java.util.List;

public interface CashierService {
    /**
     * 添加药品信息
     * @param cashier
     * @return
     */
    Integer insertCashier(Cashier cashier);

    /**
     * 查询所有药品信息按日期倒序
     * @return
     */
    List<Cashier> listCashiers();

    /**
     * 根据编码查询
     * @param barCode
     * @return
     */
    Cashier getCashierByBarCode(String barCode);

    /**
     * 修改药品库存
     * @param count
     * @param barCode
     * @return
     */
    Integer updateCashier(Integer count, String barCode);
}
