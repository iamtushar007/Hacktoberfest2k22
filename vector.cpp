#include <iostream>
#include <vector>
using namespace std;

int main()
{
    vector<int> *vp = new vector<int>; // dynamically allocated// deletion shoul be done by ourself
    vector<int> v;                     // static allocated // automatically deleted once scope is ended
    v.push_back(10);
    v.push_back(20);
    v.push_back(30);

    v[1] = 100;
    v.pop_back();
    cout << v[0] << " " << v[1] << " " << v[2] << endl;

    cout << v.size() << endl;
    cout << v.at(1); // alternate of sqare brackets

    return 0;
}