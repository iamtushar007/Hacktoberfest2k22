import java.util.Arrays;

public class chocolate_pickup_3d_dp {
    public static void main(String[] args) {
        int [][]grid={{2, 3, 1, 2},
                {3 ,4 ,2 ,2}
                ,{5 ,6 ,3 ,5}};
        System.out.println(maximumChocolates(3,4,grid));
    }
    public static int maximumChocolates(int r, int c, int[][] grid) {
        int [][][]dp=new int[r][c][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                Arrays.fill(dp[i][j],-1);
            }
        }
        //        return f(0,0,c-1,r,c,grid);//recursion
        return f_with_memo(0,0,c-1,r,c,grid,dp);
    }
    public static int f_with_memo(int i,int j1,int j2,int r,int c,int[][]grid,int [][][]dp ){
        if(j1>=c||j2>=c||j1<0||j2<0){
            return (int)Math.pow(-10,9);
        }
        if(i==r-1){
            if(j1==j2){
                return grid[i][j1];
            }
            else{
                return grid[i][j1]+grid[i][j2];
            }
        }
        if(dp[i][j1][j2]!=-1){
            return dp[i][j1][j2];
        }
        int maxi=(int)Math.pow(-10,9);
        for(int d1=-1;d1<=1;d1++){
            for (int d2=-1;d2<=1;d2++){
                if(j1==j2){
                    maxi=Math.max(grid[i][j1]+f_with_memo(i+1,j1+d1,j2+d2,r,c,grid,dp),maxi);
                }
                else{
                    maxi=Math.max(grid[i][j1]+grid[i][j2]+f_with_memo(i+1,j1+d1,j2+d2,r,c,grid,dp),maxi);
                }
            }
        }
        return dp[i][j1][j2]=maxi;
    }

    public static int f(int i,int j1,int j2,int r,int c,int[][]grid){//only 1 i is there because
                                                                    // whole intension of both bob and alice is go down wink
        if(j1>=c||j2>=c||j1<0||j2<0){//last j1<0 is imp**
            return (int)Math.pow(-10,9);
        }
        if(i==r-1){
            if(j1==j2){//this case when both alice and bob end at the same point
                return grid[i][j1];
            }
            else {//this is case when alice and bob end at two different location
                return grid[i][j1]+grid[i][j2];
            }
        }
        //explore all the parts
        int maxi=(int)Math.pow(-10,9);
        for(int d1=-1;d1<=1;d1++){//change of alice
            for(int d2=-1;d2<=1;d2++){//change of bob
                if(j1==j2){
                    maxi=Math.max(grid[i][j1]+f(i+1,j1+d1,j2+d2,r,c,grid),maxi);
                }
                else{
                    maxi=Math.max(grid[i][j1]+grid[i][j2]+f(i+1,j1+d1,j2+d2,r,c,grid),maxi);
                }
            }
        }
        return maxi;
    }
}
