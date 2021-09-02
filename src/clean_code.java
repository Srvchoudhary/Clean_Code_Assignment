public class clean_code {                                                       //puhlic class B named as Public class Clean_code
    static class Min_Max {                                                     //  class C named as Min_Max

        int Min_num;                                                            // variable a is named as Min_num
        int Max_num;                                                           // variable b is named as Max_num
    }

    static Min_Max find_Min_Max(int arr[], int n) {                           //func1 name changed to find_Min_Max
        Min_Max min_max = new Min_Max();                                    // object min_max initialized of class Min_Max
        int i;

        if (n == 1) {
            min_max.Max_num = arr[0];
            min_max.Min_num = arr[0];
            return min_max;
        }
        if (arr[0] > arr[1]) {
            min_max.Max_num = arr[0];
            min_max.Min_num = arr[1];
        } else {
            min_max.Min_num = arr[1];
            min_max.Min_num = arr[0];
        }
        for (i = 2; i < n; i++) {
            if (arr[i] > min_max.Max_num ){
                min_max.Max_num = arr[i];
            } else if (arr[i] < min_max.Min_num) {
                min_max.Min_num = arr[i];
            }
        }

        return min_max;
    }

    public static void main(String args[]) {
        int arr[] = {1000,11,9,63,78,45};
        int No_of_elements = 6;                                                 // variable s name is changed to No_of_elements
        Min_Max min_max = find_Min_Max(arr, No_of_elements);
        System.out.printf("\na is %d", min_max.Min_num);
        System.out.printf("\nb is %d", min_max.Max_num);
    }
}