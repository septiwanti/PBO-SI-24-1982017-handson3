public class Latihan2 {
    public static void main(String[] args) {
        int[] angka = {1, 2, 3, 4, 5};

        // For loop for iterating through the array
      for (int i = 0; i < angka.length; i++) {
           System.out.println("Array indeks ke-" + i + " adalah " + angka[i]);
       }

        // For each loop for iterating through the array
        for (int value : angka) {
            System.out.println(value);
        }

        // While loop for iterating through the array
       int counter = 0;
        while (counter < angka.length) {
            System.out.println("Array indeks ke-" + counter + " adalah " + angka[counter]);
            counter++;
        }

        // Do-while loop for iterating through the array
        int counter = 0;
        do {
            System.out.println("Array indeks ke-" + counter + " adalah " + angka[counter]);
            counter++;
        } while (counter < angka.length);
    }

}
