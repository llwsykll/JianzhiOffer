public class Solution {
    public boolean VerifySquenceOfBST(int [] sequence) {
        if(sequence.length==0){
            return false;
        }
        if(sequence.length==1){
            return true;
        }
        return subVerifyOfBST(sequence, 0, sequence.length-1);
    }
     
    public boolean subVerifyOfBST(int [] a, int head, int tail){
        if(head>=tail){
            return true;
        }
        int i = tail;
        //从后面开始找
        while(i>head&&a[i-1]>a[tail])
            i--;//找到比根小的坐标
        //从前面开始找 star到i-1应该比根小
        for(int j = head;j<i-1;j++)
            if(a[j]>a[tail])
                return false;;
        return subVerifyOfBST(a,head,i-1)&&subVerifyOfBST(a, i, tail-1);
    }
}

public class Solution {
    public boolean VerifySquenceOfBST(int [] sequence) {
        if(sequence.length==0){
            return false;
        }
        if(sequence.length==1){
            return true;
        }
        return subVerifyOfBST(sequence, 0, sequence.length-1);
    }
     
    public boolean subVerifyOfBST(int [] a, int head, int tail){
        if(head>=tail){
            return true;
        }
        int i = head;
        while(i<tail&&a[i]<a[tail])
            i++;
        for(int j = tail;j>i;j--)
            if(a[j]<a[tail])
                return false;;
        return subVerifyOfBST(a,head,i-1)&&subVerifyOfBST(a, i, tail-1);
    }
}