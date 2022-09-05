package edu.wctc.springassignment.impl;

import edu.wctc.springassignment.Sale;
import edu.wctc.springassignment.iface.SalesReport;

import java.util.List;

public class BasicReport implements SalesReport {
    @Override
    public void generateReport(List<Sale> salesList) {
        System.out.println("Report");
        System.out.println("Customer\t\t\tCountry\t\tAmount\tTax\tShipping");
        for (Sale sale : salesList) {
            System.out.println(sale.getName() + "\t\t\t" + sale.getCountry() + "\t\t" + sale.getCost() + "\t" + sale.getTax() + "\t" + sale.getShipping());

        }
    }
}
