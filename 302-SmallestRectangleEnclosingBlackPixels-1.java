public class Solution {
    public int minArea(char[][] image, int x, int y) {
        int nr=image.length;
        if (nr==0) return 0;
        int nc=image[0].length;
        if (nc==0) return 0;
        int left=search(image,0,x,0,nc,true,true);
        int right=search(image,x+1,nr,0,nc,true,false);
        int top=search(image,0,y,left,right,false,true);
        int bottom=search(image,y+1,nc,left,right,false,false);
        return (right-left)*(bottom-top);
    }
    
    private int search(char[][] image, int low, int high, int min, int max, boolean horizontal, boolean black) {
        while (low<high) {
            int mid=low+(high-low)/2;
            boolean containBlack=false;
            for (int i=min;i<max;i++) {
                if ((horizontal?image[mid][i]:image[i][mid])=='1') {
                    containBlack=true;
                    break;
                }
            }
            if (containBlack==black) {
                high=mid;
            } else {
                low=mid+1;
            }
        }
        return low;
    }
}
