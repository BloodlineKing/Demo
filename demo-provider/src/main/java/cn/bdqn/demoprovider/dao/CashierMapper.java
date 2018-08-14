package cn.bdqn.demoprovider.dao;

import cn.bdqn.demo.pojo.Cashier;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface CashierMapper {

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
     * 根据编码查询药品
     * @param barCode
     * @return
     */
    Cashier getCashierByBarCode(@Param("barCode") String barCode);

    /**
     * 修改药品库存
     * @param count
     * @param barCode
     * @return
     */
    Integer updateCashier(@Param("count") Integer count, @Param("barCode") String barCode);
}
