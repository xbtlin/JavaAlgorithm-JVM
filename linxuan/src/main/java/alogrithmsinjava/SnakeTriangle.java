package alogrithmsinjava;

/**
 * Created by linxuan on 16/03/2017.
 */
public class SnakeTriangle {

    static int EDGE = 15;

    static void snake()
    {
        int[][] a = new int[EDGE][EDGE];
        //根据蛇形矩阵的规律，对其进行赋值
        for(int i=0;i<EDGE;i++)
        {
            for(int j=0;j<EDGE;j++)
            {
                if(i + j == 0) {
                    a[0][0]=1;    //a[0][0]无法有前驱求得
                    continue;
                }
                if(j>=EDGE-i)    //左上三角的特征j<i
                    a[i][j]=0;
                else if(j==0)    //先确定第一列，后面的数都与第一行以及所在的行序、列序有关
                    a[i][j]=a[i-1][j]+i;
                else a[i][j]=a[i][j-1]+i+j+1;
            }
        }
        //输出蛇形矩阵
        for(int i=0;i<EDGE;i++)
        {
            for(int j=0;j<EDGE;j++)
            {
                if(a[i][j]==0) System.out.print(" ");
                else System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        snake();
    }
}
