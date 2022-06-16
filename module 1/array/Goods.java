package array;

import javax.swing.JOptionPane;

public class Goods {

    /*
     * Create a Java program that reads the nail and the stock of N goods.
     * At the end the algorithm should print:
     * 
     * - How many goods have less than 10 units in stock
     * 
     * - How many goods cost more than 100 reais and
     * have stock with more than 10 units
     * 
     * - Which price of the commodity has the lowest stock
     * 
     * - What is the stock of the commodity with the highest price
     * 
     * - The percentage of goods that are out of stock.
     */

    public static void main(String[] args) {

        int n = Integer.parseInt(JOptionPane.showInputDialog("How many products to register: "));

        double[] prices = new double[n];
        int[] goods = new int[n];

        int zeroStock = 0;
        int lessThan10units = 0;
        int costsMoreThan100andMoreThan10un = 0;
        int lowerstock = 0;
        double stockPriceLowerstock = 0.0;
        double biggerPrice = prices[0];
        int stockGoodsBiggerPrice = goods[0];

        for (int i = 0; i < prices.length; i++) {

            prices[i] = Double.parseDouble(JOptionPane.showInputDialog("Price: " + (i + 1)));
            goods[i] = Integer.parseInt(JOptionPane.showInputDialog("Stock quantity: " + (i + 1)));

            if (goods[i] == 0) {

                zeroStock++;
            }

            if (goods[i] < 10) {

                lessThan10units++;
            }

            if (prices[i] > 100.0 && goods[i] > 10) {

                costsMoreThan100andMoreThan10un++;
            }

            lowerstock = goods[0];

            if (goods[i] < lowerstock) {

                lowerstock = goods[i];
                stockPriceLowerstock = prices[i];
            }

            if (prices[i] > biggerPrice) {

                stockGoodsBiggerPrice = goods[i];
            }
        }

        double percentage = ((double) zeroStock / (double) n) * 100.0;

        System.out.println("Goods with stock less than 10 units: " + lessThan10units
                + "\nGoods that cost more than 100 reais and have more than 10 units in stock: "
                + costsMoreThan100andMoreThan10un
                + "\nPrice of the goods with the lowest stock: $ " + stockPriceLowerstock
                + "\nStock of the highest priced merchandise: " + stockGoodsBiggerPrice
                + "\nPercentage of goods with zero stock: " + percentage + "%");

    }
}
