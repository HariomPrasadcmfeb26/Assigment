 
#include<iostream>
#include<cstring>
using namespace std;

class String{

    char *str;

public:

    String(){
        str=new char[1];
        str[0]='\0';
    }

    String(const char *s){
        str=new char[strlen(s)+1];
        strcpy(str,s);
    }

    String(const String &s){
        str=new char[strlen(s.str)+1];
        strcpy(str,s.str);
    }

    ~String(){
        delete[] str;
    }

    String& operator=(const String &s){

        if(this!=&s){
            delete[] str;
            str=new char[strlen(s.str)+1];
            strcpy(str,s.str);
        }

        return *this;
    }

    String operator+(String &s){

        char temp[200];

        strcpy(temp,str);
        strcat(temp,s.str);

        return String(temp);
    }

    friend istream& operator>>(istream &in,String &s){
        char temp[100];
        in>>temp;
        s=String(temp);
        return in;
    }

    friend ostream& operator<<(ostream &out,String &s){
        out<<s.str;
        return out;
    }
};

int main(){

    String s1,s2;

    cin>>s1>>s2;

    String s3=s1+s2;

    cout<<s1<<endl;
    cout<<s2<<endl;
    cout<<s3<<endl;
}