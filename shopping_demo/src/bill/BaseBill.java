package bill;

/**
 * 账单
 */
public interface BaseBill {
    /**
     * 获取商品单价
     */
    double getUniPrice();

    /**
     * 获取商品种类
     */
    String getType();

    /**
     * 设置商品数量
     */
    void setQuantity(int quantity);

    /**
     * 获取商品数量
     */
    int getQuantity();
}
