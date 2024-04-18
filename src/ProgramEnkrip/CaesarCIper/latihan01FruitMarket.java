package ProgramEnkrip.CaesarCIper;

import java.util.Scanner;

public class latihan01FruitMarket {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
     // Read the prices and weights from the console
        double priceOfStrawberries = sc.nextDouble();
        double weightOfBananas = sc.nextDouble();
        double weightOfOranges = sc.nextDouble();
        double weightOfRaspberries = sc.nextDouble();
        double weightOfStrawberries = sc.nextDouble();

        // Calculate the prices of the other fruits
        double priceOfRaspberries = priceOfStrawberries / 2;
        double priceOfOranges = priceOfRaspberries * 0.6;
        double priceOfBananas = priceOfRaspberries * 0.2;

        // Calculate the total cost
        double totalCost = weightOfStrawberries * priceOfStrawberries
                + weightOfBananas * priceOfBananas
                + weightOfOranges * priceOfOranges
                + weightOfRaspberries * priceOfRaspberries;

        // Print the result
        System.out.printf("%.2f%n", totalCost);
    }
}
