#include <bits/stdc++.h>
using namespace std;
#include <math.h>
#define ll long long

int main()
{
    int p;
    cin >> p;
    while (p--)
    {
        ll t = 1;

        for (ll i = 2; i <= sqrt(t); i++)
        {
            if (n % i == 0)
            {

                if (n / i == i)
                {
                    t += 1;
                }
                else
                {
                    t += 2;
                }
            }
        }

        if (n % 2 == 0)
        {
            cout << (2 * t) - 1 << endl;
        }
        else
        {
            cout << 2 * t << endl;
        }
    }
    return 0;
}