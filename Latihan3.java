public class Latihan3 {
    public static void main(String[] args) {
        // Declare and initialize an array
        int[] angka = {1, 2, 3, 4, 5};

             Print the array
    System.out.println("Array: " + Array.toString(angka));

             Find the maximum value in the array
            int max = angka[0];
            for (int i = 1; i < angka.length; i++) {
               if (angka[i] > max) {
                    max = angka[i];
    }
}
            System.out.println("Nilai Maksimum: " + max);

             Find the minimum value in the array
            int min = angka[0];
            for (int i = 1; i < angka.length; i++) {
                if (angka[i] < min) {
                   min = angka[i];
               }
            }
            System.out.println("Nilai Minimum: " + min);

// Calculate the sum of all elements in the array
            int sum = 0;
            for (int i = 0; i < angka.length; i++) {
                sum += angka[i];
         }
           System.out.println("Jumlah Elemen: " + sum);

// Calculate the average of all elements in the array
           double average = (double) sum / angka.length;
            System.out.println("Rata-rata Elemen: " + average);
            }
}
