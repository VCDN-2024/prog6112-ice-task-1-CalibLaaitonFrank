package bookstoreinventory;

import javax.swing.JOptionPane;

public class BookstoreInventory {

    //Define an array of book titles
    public static void main(String[] args) {
        String[] books = {
            "Harry Potter",
            "The Great Gatsby",
            "To Kill a Mockingbird",
            "Pride and Prejudice",
            "Othello"
        };

        //Prompt the user to choose sorting order
        String order = JOptionPane.showInputDialog("Would you like to sort the books in ascending or descending order? (asc/desc)");

        // Sort the books based on user input and display the sorted list
        if (order != null) { // Check if the user didn't cancel the input
            if (order.equalsIgnoreCase("asc")) {
                insertionSortAscending(books);
                JOptionPane.showMessageDialog(null, "Books sorted in ascending order:\n" + String.join("\n", books));
            } else if (order.equalsIgnoreCase("desc")) {
                insertionSortDescending(books);
                JOptionPane.showMessageDialog(null, "Books sorted in descending order:\n" + String.join("\n", books));
            } else {
                JOptionPane.showMessageDialog(null, "Invalid input. Sorting in ascending order by default.");
                insertionSortAscending(books);
                JOptionPane.showMessageDialog(null, "Books sorted in ascending order:\n" + String.join("\n", books));
            }
        } else {
            JOptionPane.showMessageDialog(null, "No input provided. Exiting.");
        }
    }

  
    public static void insertionSortAscending(String[] books) {
        // Loop over the array starting from the second element
        for (int i = 1; i < books.length; i++) {
            // Store the current element
            String current = books[i];
            int j = i - 1;
            // Move elements of the array that are greater than the current element one position ahead
            while (j >= 0 && books[j].compareTo(current) > 0) {
                books[j + 1] = books[j];
                j--;
            } 
            books[j + 1] = current;
        }
    }

   
    public static void insertionSortDescending(String[] books) {
        // Loop over the array starting from the second element
        for (int i = 1; i < books.length; i++) {
            // Store the current element
            String current = books[i];
            int j = i - 1;
            // Move elements of the array that are less than the current element one position ahead
            while (j >= 0 && books[j].compareTo(current) < 0) {
                books[j + 1] = books[j];
                j--;
            }
            books[j + 1] = current;
        }
    }
}


