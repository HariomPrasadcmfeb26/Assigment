#include<iostream>
using namespace std;

class BankAccount{
private:
    int accountNumber;
    string accountHolderName;
    double balance;

public:
    void setAccountNumber(int a){ accountNumber=a; }
    void setAccountHolderName(string n){ accountHolderName=n; }
    void setBalance(double b){ balance=b; }

    int getAccountNumber(){ return accountNumber; }
    string getAccountHolderName(){ return accountHolderName; }
    double getBalance(){ return balance; }

    void deposit(double amount){
        balance+=amount;
    }

    void withdraw(double amount){
        if(amount<=balance)
            balance-=amount;
        else
            cout<<"Insufficient Balance\n";
    }

    void display(){
        cout<<"Account Number: "<<accountNumber<<endl;
        cout<<"Account Holder: "<<accountHolderName<<endl;
        cout<<"Balance: "<<balance<<endl;
    }
};

int main(){
    BankAccount b;
    int choice;
    int acc;
    string name;
    double bal,amount;

    cout<<"Enter Account Number: ";
    cin>>acc;
    cout<<"Enter Account Holder Name: ";
    cin>>name;
    cout<<"Enter Initial Balance: ";
    cin>>bal;

    b.setAccountNumber(acc);
    b.setAccountHolderName(name);
    b.setBalance(bal);

    do{
        cout<<"1.Deposit\n2.Withdraw\n3.Display\n4.Exit\n";
        cin>>choice;

        switch(choice){
            case 1:
                cout<<"Enter Amount: ";
                cin>>amount;
                b.deposit(amount);
                break;

            case 2:
                cout<<"Enter Amount: ";
                cin>>amount;
                b.withdraw(amount);
                break;

            case 3:
                b.display();
                break;
        }
    }while(choice!=4);
}