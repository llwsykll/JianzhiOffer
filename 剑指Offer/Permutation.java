import java.util.ArrayList;
import java.util.Collections;
public class Permutation {
    public ArrayList<String> Permutation(String str) {
        ArrayList<String> res = new ArrayList<String>();
        if (str == null || str.length() == 0) {
            return res;
        }
        PermutationCore(str.toCharArray(), 0, res);
        Collections.sort(res);
        return res;
    }
    public void PermutationCore(char[] arr, int index, ArrayList<String> res) {
        if (index == arr.length - 1) {
            String cur = String.valueOf(arr);
            if (!res.contains(cur)) {
                res.add(cur);
            } else {
                for (int j = index; j < arr.length; j++) {
                    swap(index, j, arr);
                    PermutationCore(arr, index+1, res);
                    swap(index, j, arr);
                }
            }
            return ;
        }
    }
    public void swap(int i, int j, char[] arr){
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        Permutation p = new Permutation();
        p.Permutation("aa");

    }
}