public class Main {
    
    public static int l_search(int arr[],int key)
    {
        for (int i=0; i<arr.length; i++){
            if (arr[i]==key)
            {
                return i;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int arr[] = { 14, 22, 33, 47, 56, 64, 79, 85, 92 };
        int key = 14;

// System.out.println(l_search(arr, key));



        // for (int j=0; j<9; j++)
        // {
        //     System.out.println(j);
        // }A

        // Search obj = new Search();
        // obj.linear_search(arr,key);
        // if (obj.linear_search(arr,key)==key) {
        //     System.out.println(" found at index " + obj.linear_search(arr, key));
        // } else {
        //     System.out.println("not found at any index");
        // }


        int res=l_search(arr, key);
        if(key==arr[res])
        {
        System.out.println(" found at index " + res);
        }
        else{
            System.out.println("not found");
        }
        
     

        // System.out.println(arr[0]);
    }

}


// class Search {
//      int  linear_search(int arr[],int key) {

//         for (int i = 0; i < arr.length; i++) {
//             // System.out.println(arr[i]);
//             if (arr[i]==key) {
//                 return i;
//             }
//         }
        
//     }
// }
