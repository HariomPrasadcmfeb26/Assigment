 
#include<iostream>
#include<fstream>
using namespace std;

class Student{
    int roll;
    string name;
    float marks;

public:

    Student(int r=0,string n=" ",float m=0){
        roll=r;
        name=n;
        marks=m;
    }

    ~Student(){
        cout<<"Destroying student "<<name<<endl;
    }

    void input(){
        cin>>roll>>name>>marks;
    }

    void display(){
        cout<<roll<<" "<<name<<" "<<marks<<endl;
    }

    void writeFile(ofstream &f){
        f<<roll<<" "<<name<<" "<<marks<<endl;
    }
};

int main(){

    Student s[3];

    for(int i=0;i<3;i++)
        s[i].input();

    ofstream out("students.txt");

    for(int i=0;i<3;i++)
        s[i].writeFile(out);

    out.close();

    ifstream in("students.txt");

    int r;
    string n;
    float m;

    while(in>>r>>n>>m)
        cout<<r<<" "<<n<<" "<<m<<endl;

    in.close();
}