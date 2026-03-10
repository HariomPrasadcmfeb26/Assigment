#include<iostream>
using namespace std;

class Box{
private:
    int length;
    int width;
    int height;

public:
    Box(int l,int w,int h){
        length=l;
        width=w;
        height=h;
    }

    void setDimensions(int length,int width,int height){
        this->length=length;
        this->width=width;
        this->height=height;
    }

    int volume(){
        return length*width*height;
    }
};

int main(){
    Box b(2,3,4);

    cout<<"Volume: "<<b.volume()<<endl;

    b.setDimensions(5,6,7);

    cout<<"Volume after change: "<<b.volume()<<endl;
}