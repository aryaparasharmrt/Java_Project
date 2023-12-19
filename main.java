import java.util.Scanner;

// Function to two numbers
public static void main (String args[]){
  Scanner sc = new Scanner(System.in);
  int a = sc.nextInt();
  int b = sc.nextInt();
  int result = a - b;

  System.out.print(result);
}  


public static int fabonnaci(int n) {
    if(n == 0 || n == 1) {
         return 1; 
    }
    return fabonnaci(n - 1) + fabnnaci(n - 2);
}

// Merge Sort
public static int[] mergeSort(int[] arr, int left, int right) {
    if(left == right) {
      int[] res = new int[1];
      res[0]=arr[left];
      return res;
    }

    int mid = (left + right)/2;
    int [] ls = mergeSort(arr, left, mid);
    int [] rs = mergeSort(arr, mid+1, right);
    int [] ans = mergeTwoSortedArrays(ls, rs);
}

public static int[] mergeTwoSortedArrays(int[] arr1, int[] arr2) {
  int i=0, j=0, k=0;
  int[] arr3 = new int[arr1.length + arr2.length];

  while(i < arr1.length && j < arr2.length) {
    if(arr1[i] <= arr2[j]){
      arr3[k] = arr1[i];
    i++;
    j++;
    }else{
      arr3[k] = arr2[j];
      i++;
      j++;
    }
}
  while(p1 < arr1. length){
  arr3[k] = arr1[i];
  i++;
  j++;
  }
  return arr3;
}
public static void main(String[] args) {
int[] arr = {3, 12, 44, 1, 2, 67, 0};
  int[] sa = mergeSort(arr,0,arr.length - 1);
  System.out.print("Sorted Array -> ");
  print(sa)
}
