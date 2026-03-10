#include<iostream>
using namespace std;

int main(){
    int a=10;

    int *ptr=&a;

    int &ref=a;

    cout<<a<<endl;

    *ptr=20;
    cout<<a<<endl;

    ref=30;
    cout<<a<<endl;
}