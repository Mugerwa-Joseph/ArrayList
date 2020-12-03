package com.jose;

import java.util.ArrayList;

public class GroceryList {
	
	@Andylibs(author = "andylibs", language = "javascript enthusiat", email = "")
	
	/**
	 * @School of computing and Informatics
	 */
	private ArrayList<String> groceryList = new ArrayList<>();


    public void addGroceryItem (String item){

        groceryList.add(item);
    }

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }


    public void printGroceryList (){

        System.out.println("You have " + groceryList.size() + " Items on your list");

		/**
		 * Iterating through the array list
		 */
        for (int i =0; i<groceryList.size(); i++){

            System.out.println((i+1) + "." + groceryList.get(i));
        }
    }

	/**
	 * @param currentItem
	 * @param newItem
	 */
    public void modifyGroceryItem (String currentItem,String newItem){
        int position = findItem(currentItem);

        if (position >= 0){

            modifyGroceryItem(position,newItem);
        }

    }

	/**
	 * @param position
	 * @param newItem
	 */
    private void modifyGroceryItem (int position, String newItem){
        groceryList.set(position, newItem);
        System.out.println("Grocery Item " + (position+1) + " has been modified");

    }

    public void removeGroceryItem(String item){

        int position = findItem(item);

        if (position >= 0){

            removeGroceryItem(position);
        }

    }

	/**
	 * @param position the item index
	 * @Array index begins from zero '0'
	 */
    private void removeGroceryItem (int position){
        groceryList.remove(position);

    }

	/**
	 * @param searchItem search item by index
	 * @return value
	 */
    private int findItem (String searchItem){

       return groceryList.indexOf(searchItem);
//        if (position >= 0){
//            return groceryList.get(position);
//        }
//        return null;
    }

    public boolean onFile (String searchItem){

        int position = findItem(searchItem);
        if (position > 0){
            return true;
        }
        return false;
    }
}
