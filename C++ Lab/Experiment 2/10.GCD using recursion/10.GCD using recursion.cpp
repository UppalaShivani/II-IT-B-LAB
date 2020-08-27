/* program to find GCD using recursion */
#include <iostream>
using namespace std;
int gcd(int a, int b);
int main()
{
   int a,b;
   cout << "Enter two positive integers : ";
   cin >> a >> b;
   cout << "G.C.D of " <<a<< " & " <<b<< " is : " << gcd(a,b)<<endl;
   return 0;
}
int gcd(int a, int b)
{
    if (b != 0)
       return gcd(b, a % b);
    else 
       return a;
}