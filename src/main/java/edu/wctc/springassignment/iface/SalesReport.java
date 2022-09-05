package edu.wctc.springassignment.iface;

import edu.wctc.springassignment.Sale;

import java.util.List;

public interface SalesReport {
    void generateReport(List<Sale> salesList);
}
