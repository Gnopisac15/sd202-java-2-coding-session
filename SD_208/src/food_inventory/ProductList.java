/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package food_inventory;

/**
 *
 * @author 2ndyrGroupB
 */
import java.util.Scanner;

public class ProductList {

    private Product[] list;
    private int count;
    private int max;
    private final Scanner input = new Scanner(System.in);

    public ProductList() {
        this(10);
    }

    public ProductList(int max) {
        this.max = max;
        list = new Product[this.max];
    }

    public Product[] getList() {
        return list;
    }

    public int getCount() {
        return count;
    }

    public int getMax() {
        return max;
    }

    public boolean addProduct(Product p) {
        if (!isFull()) {
            this.list[this.count++] = p;
            return true;
        }
        return false;
    }

    public Product removeProduct(int prodID) {
        Product p = null;
        int index = searchProduct(prodID);

        if (index >= 0) {
            p = list[index];
            for (int i = index; i < count - 1; ++i) {
                list[i] = list[i + 1];
            }
            count--;
        }
        return p;
    }

    private boolean isFull() {
        return count == max;
    }

    public boolean searchProductByName(String name) {
        System.out.println("\nResult\n");
        System.out.printf("\n %-10s | %-15s \n", "ID", "NAME");
        boolean exist = false;
        int i;
        for (i = 0; i < count; ++i) {
            if (list[i].getProductName().contains(name)) {
                System.out.printf("\n %-10d | %-15s \n",
                        list[i].getProductID(), list[i].getProductName());
                exist = true;
            }
        }
        return exist;
    }

    public int searchProduct(int prodID) {
        int i;
        for (i = 0; i < count; ++i) {
            if (prodID == list[i].getProductID()) {
                list[i].displayProduct();
                break;
            } else {
                System.out.println("\nNo product found\n");
                break;
            }
        }

        return i == count ? -1 : i;
    }

    public void CheckOut(int prodID) {
        int i;

        for (i = 0; i < count; ++i) {
            if (prodID == list[i].getProductID()) {
                System.out.print("Enter the quantity amount: ");
                double num = input.nextDouble();
                if (num < list[i].getQuantity()) {
                    list[i].setQuantity(list[i].getQuantity() - num);
                    System.out.println("\nSuccesfully modified the product quantity of " + list[i].getProductName() + ".\n");
                } else {
                    System.out.println("\nInvalid amount: "+num+"\n");
                    System.out.println("Should be lesser than or equal of the current quantity amount... ");
                }
                
            } else {
                System.out.println("\nNo product found\n");
            }
        }

    }

    public void CheckIn(int prodID) {
        int i;
        for (i = 0; i < count; ++i) {
            if (prodID == list[i].getProductID()) {
                System.out.print("Enter the quantity amount: ");
                list[i].setQuantity(input.nextDouble() + list[i].getQuantity());
                System.out.println("\nSuccesfully added to product quantity of " + list[i].getProductName() + ".\n");
                break;
            }
        }

    }

    public void displayProducts() {
        System.out.printf("\n %-10s | %-15s | %-15s | %-15s | %-15s \n", "ID", "NAME", "TYPE", "PRICE", "QTY");
        for (int i = 0; i < count; ++i) {
            System.out.printf(" %-10d | %-15s | %-15s | Php%12.2f | %.2f %s \n",
                    list[i].getProductID(), list[i].getProductName(),
                    list[i].getProductType(), list[i].getPrice(), list[i].getQuantity(),
                    list[i].getUnit());
        }
    }

    @Override
    public String toString() {
        return "ProductList{" + "list=" + list + ", count=" + count + ", max=" + max + '}';
    }

}
