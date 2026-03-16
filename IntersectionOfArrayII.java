//Time Complexity: O(n log n + m log m) due to the sorting step, where n and m are the lengths of the two input arrays.
//Space Complexity: O(k) where k is the number of common elements in the result list.

    public static List<Integer>IntArrII(int[]arr1,int[]arr2){
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int i=0;
        int j=0;
      List<Integer>res = new ArrayList<>();
        while(i<arr1.length && j<arr2.length){
            if(arr1[i] == arr2[j]){
                res.add(arr1[i]);
                i++;
                j++;
            }else if(arr1[i]<arr2[j]){
                i++;
            }else{
                j++;
            }
        }
        return res;
    }
