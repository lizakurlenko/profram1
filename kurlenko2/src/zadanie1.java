public class zadanie1 {
    public static void main(String[] args) {
        String[] a = {"Mama, ","i ","huchy ","kushat "};
        for(int i=0; i<a.length; i++) {
            System.out.print(a[i]);
        }

        int n = a.length;

        for(int i=0; i<n/2; i++) {
            String temp = a[n-i-1];
            a[n-i-1]=a[i];
            a[i]=temp;
        }
        System.out.println();
        for(int i=0; i<a.length; i++) {
            System.out.print(a[i]);
        }
    }
}