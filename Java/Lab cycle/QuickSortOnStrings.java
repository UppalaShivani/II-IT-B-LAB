import java.io.*;

public class QuickSortOnStrings {

    static String names[];
    int length;

    public static void main(String[] args) throws IOException{
        QuickSortOnStrings sqs = new QuickSortOnStrings();
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the size");
        int size = Integer.parseInt(br.readLine());
        System.out.println("Enter the elements");
        String[] words = new String[size];
        for (int i = 0; i < size; i++) {
            words[i] = br.readLine();
        }
        names = words;
        sqs.quickSort(0,size-1);
          System.out.println("The sorted strings are : ");
        for (String  i : words) {
            System.out.println(i);
           
        }
    }

    void quickSort(int lower, int upper) {
        int lb = lower;
        int ub = upper;
        String pivot = names[lower + ( upper - lower) / 2];

        while (lb <= ub) {
            while (names[lb].compareToIgnoreCase(pivot) < 0) {
                lb++;
            }

            while (names[ub].compareToIgnoreCase(pivot) > 0) {
                ub--;
            }

            if (lb <= ub) {
                swap(lb, ub);
                lb++;
                ub--;
            }
        }
      
        if (lower < ub) {
            quickSort(lower, ub);
        }
        if (lb <  upper) {
            quickSort(lb,  upper);
        }
    }

    void swap(int i, int j) {
        String temp = names[i];
        names[i] = names[j];
        names[j] = temp;
    }
}