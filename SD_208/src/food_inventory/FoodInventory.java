
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package food_inventory;

import java.util.Scanner;

/**
 *
 * @author 2ndyrGroupB
 */
public class FoodInventory {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        ProductList myList = new ProductList();
        Scanner input = new Scanner(System.in);
        String[] options = {"Show", "Add", "Remove", "Search", "Check-Out", "Check-In", "Exit"};
        int choice;
        Product p;

        do {
            System.out.println("\n-----------------------------------------------------------------------------------");
            System.out.println("\nINVENTORY MENU\n");
            for (int i = 0; i < options.length; ++i) {
                System.out.printf("[%d.] %s\n", i + 1, options[i]);
            }
            do {
                System.out.print("\nEnter your choice: ");
                choice = input.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("\nProduct List");
                        myList.displayProducts();
                        break;
                    case 2:
                        System.out.println("\nAdd Product\n");
                        p = new Product();
                        System.out.print("Enter product id: ");
                        p.setProductID(input.nextInt());
                        System.out.print("Enter product name: ");
                        input.nextLine();
                        p.setProductName(input.nextLine());
                        System.out.print("Enter product type: ");
                        p.setProductType(input.nextLine());
                        System.out.print("Enter product price: ");
                        p.setPrice(input.nextDouble());
                        System.out.print("Enter product quantity: ");
                        p.setQuantity(input.nextDouble());
                        System.out.print("Enter product unit: ");
                        input.nextLine();
                        p.setUnit(input.nextLine());
                        if (myList.addProduct(p)) {
                            System.out.printf("\nProduct %s sucesfully added.\n", p.getProductName());
                        } else {
                            System.out.println("\nProduct not added in the inventory\n");
                        }
                        break;
                    case 3:
                        System.out.println("\nRemove Product\n");
                        System.out.print("Enter product name: ");
                        if (myList.searchProductByName(input.next())) {
                            System.out.print("Enter product id: ");
                            p = myList.removeProduct(input.nextInt());
                            System.out.printf("\n%s was removed from the inventory list.\n", p.getProductName());
                        } else {
                            System.out.println("\nNo product found\n");
                        }

                        break;
                    case 4:
                        System.out.println("\nSearch Product\n");
                        System.out.print("Enter the product name: ");
                        if (myList.searchProductByName(input.next())) {
                            System.out.print("\nEnter product ID: ");
                            myList.searchProduct(input.nextInt());
                        } else {
                            System.out.println("\nNo product found\n");
                        }
                        break;
                    case 5:
                        System.out.println("\nCheck-out\n");
                        System.out.print("Enter product name: ");
                        if (myList.searchProductByName(input.next())) {
                            System.out.print("\nEnter product ID: ");
                            myList.CheckOut(input.nextInt());
                        } else {
                            System.out.println("\nNo product found\n");
                        }

                        break;
                    case 6:
                        System.out.println("\nCheck-in\n");
                        System.out.print("Enter product name: ");
                        if (myList.searchProductByName(input.next())) {
                            System.out.print("\nEnter product ID: ");
                            myList.CheckIn(input.nextInt());
                        } else {
                            System.out.println("\nNo product found\n");
                        }
                        break;
                    case 7:
                        System.out.println("\nThank you for using the program.\n");
                        break;
                    default:
                        System.out.println("\nInvalid choice.\n");
                }
            } while (!(choice >= 1 && choice <= 7));
        } while (choice != 7);
    }
    
}
