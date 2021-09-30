import java.util.*;
public class printArray{
public static void main(String args[]){
  Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
  int[] arr = new int(N);
  for(int i = 0;i<N;i++){
    arr[i] = sc.nextInt();
  }
  int[] arr2 = new int[n];
  for(int i = 0;i<n;i++){
    arr2[i] = sc.nextInt();
  }
  int n2 = sc.nextInt();
  int[] arr3 = new int[n2];
  for(int val : arr3){
    arr3[val] = sc.nextInt();
    
        String str = sc.nextLine();
        int len = str.length();
        int max = 0;
        for(int i = 0; i<len ; i++){
            int temp = 0;
            for(int j = 0;j< len;j++){
                if(str[i]==str[j]){
                    temp=temp++;
                }
            }
            if(temp > max){
                max=temp;
            }
        }
        System.out.println(max+"The hisgest number of letters in the word"+str);
  }
}
  
