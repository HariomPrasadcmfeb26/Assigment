#include<iostream>
using namespace std;

class Employee{
private:
    int empID;
    string empName;
    double empSalary;
    double grossSalary;

public:
    void setID(int id){ empID=id; }
    void setName(string name){ empName=name; }
    void setSalary(double salary){ empSalary=salary; }

    int getID(){ return empID; }
    string getName(){ return empName; }
    double getSalary(){ return empSalary; }

    void calculateGrossSalary(){
        if(empSalary<=5000)
            grossSalary=empSalary + empSalary*0.10;
        else if(empSalary<=10000)
            grossSalary=empSalary + empSalary*0.15;
        else
            grossSalary=empSalary + empSalary*0.20;
    }

    void display(){
        cout<<"Employee ID: "<<empID<<endl;
        cout<<"Name: "<<empName<<endl;
        cout<<"Salary: "<<empSalary<<endl;
        cout<<"Gross Salary: "<<grossSalary<<endl;
    }
};

int main(){
    Employee e;
    int choice,id;
    string name;
    double salary;

    do{
        cout<<"1.Add Employee\n2.Calculate Gross Salary\n3.Display Details\n4.Update\n5.Exit\n";
        cin>>choice;

        switch(choice){
            case 1:
                cout<<"Enter ID: ";
                cin>>id;
                cout<<"Enter Name: ";
                cin>>name;
                cout<<"Enter Salary: ";
                cin>>salary;

                e.setID(id);
                e.setName(name);
                e.setSalary(salary);
                break;

            case 2:
                e.calculateGrossSalary();
                cout<<"Gross Salary Calculated\n";
                break;

            case 3:
                e.display();
                break;

            case 4:
                cout<<"Enter New Name: ";
                cin>>name;
                cout<<"Enter New Salary: ";
                cin>>salary;

                e.setName(name);
                e.setSalary(salary);
                break;
        }

    }while(choice!=5);
}