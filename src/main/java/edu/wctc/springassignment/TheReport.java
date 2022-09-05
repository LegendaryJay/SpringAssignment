package edu.wctc.springassignment;

import edu.wctc.springassignment.iface.SalesInput;
import edu.wctc.springassignment.iface.SalesReport;
import edu.wctc.springassignment.iface.ShippingPolicy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TheReport {
    private final SalesInput in;
    private final SalesReport out;
    private final ShippingPolicy policy;


    @Autowired
    public TheReport(SalesInput in, SalesReport out, ShippingPolicy policy)
    {
        this.in = in;
        this.out = out;
        this.policy = policy;
    }

    public void generateReport(){
        List<Sale> allSales = in.getSales();
        for(Sale aSale : allSales)
            policy.applyShipping(aSale);
        out.generateReport(allSales);
    }
}
