#include<iostream>
using namespace std;

class Employee{
private:
    const int employeeId;
    string name;
    float salary;

public:

    Employee(int id,string n,float s):employeeId(id),name(n),salary(s){}

    void display(){
        cout<<employeeId<<" "<<name<<" "<<salary<<endl;
    }
};

int main(){

    Employee e1(101,"Amit",5000);

    e1.display();
}