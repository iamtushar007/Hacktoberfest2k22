#include <bits/stdc++.h>
#include <string>
#include <sstream>
using namespace std;

int check(char str)
{
    stringstream ss;
    int y;
    switch (str)
    {
    case 'A':
        return 10;
        break;
    case 'B':
        return 11;
        break;
    case 'C':
        return 12;
        break;
    case 'D':
        return 13;
        break;
    case 'E':
        return 14;
        break;
    case 'F':
        return 15;
        break;
    default:
        ss << str;
        ss >> y;
        return y;
    }
    return y;
}

int hTd(string n)
{
    int ans = 0;
    int x = 1;
    for (int i = n.length() - 1; i >= 0; i--)
    {
        int y = check(n[i]);
        ans += x * y;
        x *= 16;
    }

    return ans;
}

int main()
{
    string n;
    cin >> n;

    cout << hTd(n) << endl;

    return 0;
}