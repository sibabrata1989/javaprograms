package basicPrograms;

public class TripletsMatchingAGivenSum {
    public static void main(String[] args) {
        int num[] = {1, 2, 3, 4, 7, 8, 5, 0};
        int sum = 5;
        int size = num.length;

        for (int i = 0; i < size - 2; i++) {
            for(int j = i+1;j<size-1;j++)
            {
                for (int k = j+1; k < size ; k++) {
                    if(num[i]+num[j]+num[k]==sum) {
                        System.out.println("{" + num[i] + "," + num[j] + "," + num[k] + "}");
                    }
                }
            }
        }
    }
}
