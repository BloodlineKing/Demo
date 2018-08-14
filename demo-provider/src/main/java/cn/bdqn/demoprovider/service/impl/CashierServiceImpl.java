package cn.bdqn.demoprovider.service.impl;

import cn.bdqn.demo.pojo.Cashier;
import cn.bdqn.demoprovider.dao.CashierMapper;
import cn.bdqn.demoprovider.service.CashierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CashierServiceImpl implements CashierService {

    @Autowired
    private CashierMapper cashierMapper;

    @Override
    public Integer insertCashier(Cashier cashier) {
        return cashierMapper.insertCashier(cashier);
    }

    @Override
    public List<Cashier> listCashiers() {
        return cashierMapper.listCashiers();
    }

    @Override
    public Cashier getCashierByBarCode(String barCode) {
        return cashierMapper.getCashierByBarCode(barCode);
    }

    @Override
    public Integer updateCashier(Integer count, String barCode) {
        return cashierMapper.updateCashier(count, barCode);
    }
}
