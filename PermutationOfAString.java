public class PermutationOfAString {
    static void permutation(String str, int i, int n){
        if(i==n){
            System.out.print(str+" ");
        }
        
        for(int j=i;j<=n;j++){
            str = swap(str, i, j);
            permutation(str, i+1, n);
            str = swap(str, i, j);
        }
    }

        static String swap(String str, int x, int y){
        char temp;
        char[] charArray = str.toCharArray();
        temp = charArray[x];
        charArray[x] = charArray[y];
        charArray[y] = temp;
        return String.valueOf(charArray);
    }
    public static void main(String[] args) {
        String str = "abc";
        int n = str.length()-1;
        permutation(str, 0, n);
    }
}
