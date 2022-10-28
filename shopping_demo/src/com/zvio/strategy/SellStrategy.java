package com.zvio.strategy;

import com.zvio.bill.BaseBill;

import java.util.List;

/**
 * 销售策略
 */
public interface SellStrategy {
    double calCost(List<BaseBill> bills);
}
