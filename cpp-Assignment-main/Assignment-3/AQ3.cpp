 
#include<iostream>
using namespace std;

class Matrix{

    int **a;
    int r,c;

public:

    Matrix(int row=2,int col=2){
        r=row;
        c=col;

        a=new int*[r];

        for(int i=0;i<r;i++)
            a[i]=new int[c];
    }

    ~Matrix(){
        for(int i=0;i<r;i++)
            delete[] a[i];
        delete[] a;
    }

    friend istream& operator>>(istream &in,Matrix &m){

        for(int i=0;i<m.r;i++)
            for(int j=0;j<m.c;j++)
                in>>m.a[i][j];

        return in;
    }

    friend ostream& operator<<(ostream &out,Matrix &m){

        for(int i=0;i<m.r;i++){
            for(int j=0;j<m.c;j++)
                out<<m.a[i][j]<<" ";
            out<<endl;
        }

        return out;
    }

    Matrix operator+(Matrix &m){

        Matrix temp(r,c);

        for(int i=0;i<r;i++)
            for(int j=0;j<c;j++)
                temp.a[i][j]=a[i][j]+m.a[i][j];

        return temp;
    }

    bool operator==(Matrix &m){

        for(int i=0;i<r;i++)
            for(int j=0;j<c;j++)
                if(a[i][j]!=m.a[i][j])
                    return false;

        return true;
    }
};

int main(){

    Matrix m1(2,2),m2(2,2),m3;

    cin>>m1>>m2;

    m3=m1+m2;

    cout<<m3;

    if(m1==m2)
        cout<<"Equal"<<endl;
    else
        cout<<"Not Equal"<<endl;
}