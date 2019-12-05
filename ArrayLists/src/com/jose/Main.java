package com.jose;

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
        System.out.println("\t 1 - to print the items on the list");
        System.out.println("\t 2 - to add an item on the list");
        System.out.println("\t 3 - to modify an item on the list");
        System.out.println("\t 4 - to remove an item from the list");
        System.out.println("\t 5 - to search for an item from the list");
        System.out.println("\t 6 - to quit the application");

    }

    public static void addItem(){
        System.out.print("Please enter the item of your choice : ");
        groceryList.addGroceryItem(scan.nextLine());
    }

    public static void modifyItem(){

        System.out.print("Enter item number: ");
        int itemNo = scan.nextInt();
        scan.nextLine();

        System.out.print("Enter the replacement Item : ");
        String newItem = scan.nextLine();

        groceryList.modifyGroceryItem(itemNo-1,newItem);
    }

    public static void removeItem(){

        System.out.print("Enter item number: ");
        int itemNo = scan.nextInt();
        scan.nextLine();

        groceryList.removeGroceryItem(itemNo-1);

    }

    public static void searchItem(){
        System.out.print("Enter the name of item to search for : ");

        String searchedItem = scan.nextLine();
        if (groceryList.findItem(searchedItem) != null){
            System.out.println("Found " + searchedItem + " In your list");
        }else {
            System.out.println(searchedItem + " is not found in your list");
        }
    }


}
