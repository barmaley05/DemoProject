/**
 * Created by Gasanov on 01.11.2016.
 */
public class ConcatSortArray {
    public int[] concat(int[] a, int[] b){
        int lengthA = a.length;
        int lengthB = b.length;
        int lengthC = lengthA+lengthB;
        int[] c = new int[lengthC];
        int indexA = 0;
        int indexB = 0;
        for(int i=0; i<lengthC; i++){
            if(indexA<lengthA && indexB<lengthB){
                if(a[indexA] < b[indexB]){
                    c[i] = a[indexA++];
                }else{
                    c[i] = b[indexB++];
                }
            }else if(indexA<lengthA){
                c[i] = a[indexA++];
            }else{
                c[i] = b[indexB++];
            }
        }
        return c;
    }
}
