package com.jose;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static Scanner scan = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();
    public static void main(String[] args) {
	// write your code here
        boolean quit = false;
        int choice = 0;
        printInstructions();

        while (!quit){

            System.out.println("Enter your choice ");
            choice = scan.nextInt();
            scan.nextLine();

            switch (choice){
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchItem();
                    break;
                case 6:
                    quit = true;
                    break;
            }


        }



    }

    public static void printInstructions(){

        System.out.println("\n press: ");
        System.out.println("\t 0 - To print choice options");
        System.out.println("\t 1 - To print the items on the list");
        System.out.println("\t 2 - To add an item on the list");
        System.out.println("\t 3 - To modify an item on the list");
        System.out.println("\t 4 - To remove an item from the list");
        System.out.println("\t 5 - To search for an item from the list");
        System.out.println("\t 6 - To quit the application");

    }

    public static void addItem(){
        System.out.print("Please enter the item of your choice : ");
        groceryList.addGroceryItem(scan.nextLine());
    }

    public static void modifyItem(){

        System.out.print("Enter current item name: ");
        String itemName = scan.nextLine();

        System.out.print("Enter the new Item name : ");
        String newItem = scan.nextLine();

        groceryList.modifyGroceryItem(itemName,newItem);
    }

    public static void removeItem(){

        System.out.print("Enter item name: ");
        String itemName = scan.nextLine();
        scan.nextLine();

        groceryList.removeGroceryItem(itemName);

    }

    public static void searchItem(){
        System.out.print("Enter the name of item to search for : ");

        String searchedItem = scan.nextLine();
        if (groceryList.onFile(searchedItem)){
            System.out.println("Found " + searchedItem + " In your list");
        }else {
            System.out.println(searchedItem + " is not found in your list");
        }
    }

    public static void processArrayList(){
        ArrayList<String> newArray = new ArrayList<String>();
        newArray.addAll(groceryList.getGroceryList()); //copies all elements of the array into a new one.
    }


}
