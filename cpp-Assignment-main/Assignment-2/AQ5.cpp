#include<iostream>
using namespace std;

class Student{
private:
    int rollNo;
    string name;
    float marks;

public:

    Student(){
        rollNo=0;
        name="Unknown";
        marks=0;
    }

    Student(int r,string n,float m){
        rollNo=r;
        name=n;
        marks=m;
    }

    Student(int rollNo,string name){
        this->rollNo=rollNo;
        this->name=name;
        marks=0;
    }

    void display(){
        cout<<rollNo<<" "<<name<<" "<<marks<<endl;
    }
};

int main(){

    Student s1;

    Student s2(1,"Amit",85);

    Student s3(2,"Rahul",90);

    s1.display();
    s2.display();
    s3.display();
}