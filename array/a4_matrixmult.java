//matrix mult 2d array
import java.util.*;
public class a4_matrixmult{
public static void main(String Rgs[]){
{  
    Scanner sc=new Scanner(System.in);
    int a[10][10],b[10][10],m[10][10],x,y,k,i,j;
    System.out.println("enter x and y=\n");
    scanf("%d %d",&x,&y);
     printf("enter the element of 1st matrix\n");
    for(i=0;i<x;i++)
    { for (j=0;j<y;j++)
        {
          scanf("%d",&a[i][j]);
        }
    }
      printf("enter the element of 2st matrix\n");
    for(i=0;i<x;i++)
    { for (j=0;j<y;j++)

        {
          scanf("%d",&b[i][j]);
        }
    }
    printf("multiply of the matrix is=\n");
    for(i=0;i<x;i++)
        {for (j=0;j<y;j++)
            {   m[i][j]=0;
                for(k=0;k<x;k++)
                {
                    m[i][j]=a[i][k]*b[k][j];
                }
                
            }
         
        }

    
    for(i=0;i<x;i++)
    { 
        for (j=0;j<y;j++)
        {
        printf("%d\t",m[i][j]);
        }printf("\n");
    }
}
}
}