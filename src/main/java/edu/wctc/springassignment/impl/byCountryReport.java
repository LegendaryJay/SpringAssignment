package edu.wctc.springassignment.impl;

import edu.wctc.springassignment.Sale;
import edu.wctc.springassignment.iface.SalesReport;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class byCountryReport implements SalesReport {

    @Override
    public void generateReport(List<Sale> salesList) {
        System.out.println("Report");
        System.out.println("Customer\t\t\tCountry\t\tAmount\tTax\tShipping");
        salesList.stream()
                .collect(
                        groupingBy(Sale::getCountry,
                                collectingAndThen(
                                        reducing(
                                                (a, b) -> new Sale(a.getName(), a.getCountry(), a.getCost() + b.getCost(), a.getTax() + b.getTax())),
                                        Optional::get)))
                .forEach((country, sale) ->
                        System.out.println(sale.getCountry() + "\t\t" + sale.getCost() + "\t" + sale.getTax() + "\t" + sale.getShipping())
                );
    }
}
