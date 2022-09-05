package edu.wctc.springassignment.impl;

import edu.wctc.springassignment.Sale;
import edu.wctc.springassignment.iface.ShippingPolicy;

public class FreeShippingOver100Policy implements ShippingPolicy {
    @Override
    public void applyShipping(Sale sale) {
        double cost = sale.getCost();
        sale.setShipping(cost < 100 ? cost * 0.05 : 0);
    }
}
