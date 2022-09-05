package edu.wctc.springassignment.iface;

import edu.wctc.springassignment.Sale;

public interface ShippingPolicy {
    void applyShipping(Sale sale);
}