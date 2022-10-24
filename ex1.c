#include <stdio.h>
int main()
{
    int n;
    scanf("%d", &n);
    while (n--)
    {
        int n1, n2, count = 0, i;

        printf("Enter two positive integers: ");
        scanf("%d %d", &n1, &n2);

        
        if(n1>n2)
        {
        while (n1 != 1)
            {
                n1 = n1 / 2;
                count++;
            }
        }
        else if (n1<n2)
        {
            while(n2!=1)
            {
                n2=n2/1;
                count++;
            }
        }
        
        
        
        printf("GCD = %d\n", count);
    }
    return 0;
}



#include<iostream>
using namespace std;
#include<math.h>


int main()
{
    int t;
    cin>>t;
    while(t--)
    {

    }
    return 0;
}