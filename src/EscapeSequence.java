public class EscapeSequence {
    public static void main(String[] args) {

        double cost1 = 1000.0;
        double cost2 = 50.0;
        int quant1 = 4;
        int quant2 = 8;

        int sum_qty = quant1 + quant2;
        double total1 = cost1 * quant1;
        double total2 = cost2 * quant2;
        double total_sum = total1 + total2;

        System.out.println("Cost" + "\t\t\t" + "Quantity" + "\t" + "Total");
        System.out.println("$" + String.format("%(,.2f", cost1) + "\t\t" + quant1 + "\t\t\t$" + String.format("%(,.2f", total1));
        System.out.println("$" + String.format("%(,.2f", cost2) + "\t\t\t" + quant2 + "\t\t\t$" + String.format("%(,.2f", total2));
        System.out.println("------------------------------------------");
        System.out.println("TOTAL: " + "\t\t\t" + sum_qty + "\t\t\t$" + String.format("%(,.2f", total_sum));



    }
}
