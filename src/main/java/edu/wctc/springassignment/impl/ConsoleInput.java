package edu.wctc.springassignment.impl;

import edu.wctc.springassignment.Sale;
import edu.wctc.springassignment.iface.SalesInput;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ConsoleInput  implements SalesInput {
    @Override
    public List<Sale> getSales() {
        List<Sale> output = new ArrayList<>();
        do {
            List<String> elements = new ArrayList<>();
            System.out.println();
            System.out.println("Name");
            elements.add(System.console().readLine());

            System.out.println("Country");
            elements.add(System.console().readLine());

            System.out.println("cost");
            elements.add(System.console().readLine());

            System.out.println("tax");
            elements.add(System.console().readLine());

            output.add(new Sale(elements.get(0), elements.get(1), Double.parseDouble(elements.get(2)), Double.parseDouble(elements.get(3))));

            System.out.println("Add line? (Y/N)");
        } while (System.console().readLine().toLowerCase(Locale.ROOT).equals("y"));
        return output;
    }
}
