#include <iostream>
#include <string>
using namespace std;

class Aadhaar {
private:
    string aadhaar_number;
    string name;
    int age;
   int n;

public:
    Aadhaar() : n(0) {}


    void read() {
        cout << "Enter Aadhaar number: ";
        cin >> aadhaar_number;
        cout << "Enter name: ";
        cin >> name;

        cout << "Enter age: ";
        cin >> age;
    }

    void display() {
        cout << "Aadhaar Number: " << aadhaar_number << "\nName: " << name << "\nAge: " << age << endl;
    }

    void acceptAadhaar(Aadhaar a[], int &n);
    void displayAllAadhaar(Aadhaar a[], int n);
    void insertAadhaar(Aadhaar a[], int &n);
    void deleteAadhaar(Aadhaar a[], int &n);
    void searchAadhaar(Aadhaar a[], int n);
    void updateAadhaar(Aadhaar a[], int n);
    void menu(Aadhaar a[], int &n);
    string getAadhaarNumber();
};

string Aadhaar::getAadhaarNumber() {
    return aadhaar_number;
}

void Aadhaar::acceptAadhaar(Aadhaar a[], int &n) {
    cout << "\nHow many Aadhaar card holders? ";
    cin >> n;
    for (int i = 0; i < n; i++) {
        cout << "Enter details for Aadhaar holder " << i + 1 << ":\n";
        a[i].read();
    }
}

void Aadhaar::displayAllAadhaar(Aadhaar a[], int n) {
    cout << "\nDisplaying all Aadhaar card details:\n";
    for (int i = 0; i < n; i++) {
        cout << "Details of Aadhaar holder " << i + 1 << ":\n";
        a[i].display();
    }
}

void Aadhaar::insertAadhaar(Aadhaar a[], int &n) {
    int loc;
    cout << "\nEnter the location to insert: ";
    cin >> loc;
    if (loc > n + 1 || loc < 1) {
        cout << "Invalid location!" << endl;
    } else {
        for (int i = n; i >= loc; i--) {
            a[i] = a[i - 1];
        }
        cout << "Enter details for new Aadhaar holder:\n";
        a[loc - 1].read();
        n++;
    }
}

void Aadhaar::deleteAadhaar(Aadhaar a[], int &n) {
    string x;
    int flag = 0, i;
    cout << "\nEnter the Aadhaar number to delete: ";
    cin >> x;
    for (i = 0; i < n; i++) {
        if (a[i].getAadhaarNumber() == x) {
            flag = 1;
            break;
        }
    }
    if (flag == 0) {
        cout << "Aadhaar number not found!";
    } else {
        for (int j = i; j < n - 1; j++) {
            a[j] = a[j + 1];
        }
        n--;
        cout << "Aadhaar number deleted!";
    }
}

void Aadhaar::searchAadhaar(Aadhaar a[], int n) {
    string x;
    int flag = 0;
    cout << "\nEnter the Aadhaar number to search: ";
    cin >> x;
    for (int i = 0; i < n; i++) {
        if (a[i].getAadhaarNumber() == x) {
            flag = 1;
            cout << "Aadhaar card found at position " << i + 1 << endl;
            a[i].display();
            break;
        }
    }
    if (flag == 0) {
        cout << "Aadhaar number not found!";
    }
}

void Aadhaar::updateAadhaar(Aadhaar a[], int n) {
    string x;
    int flag = 0;
    cout << "\nEnter the Aadhaar number to update: ";
    cin >> x;
    for (int i = 0; i < n; i++) {
        if (a[i].getAadhaarNumber() == x) {
            flag = 1;
            cout << "Enter new details for Aadhaar card holder:\n";
            a[i].read();
            break;
        }
    }
    if (flag == 0) {
        cout << "Aadhaar number not found!";
    }
}

// Menu function
void Aadhaar::menu(Aadhaar a[], int &n) {
    int choice;
    do {
        cout << "\n1. Accept\n2. Display\n3. Insert\n4. Delete\n5. Search\n6. Update\n7. Exit\nEnter your choice: ";
        cin >> choice;

        switch (choice) {
        case 1:
            acceptAadhaar(a, n);
            break;
        case 2:
            displayAllAadhaar(a, n);
            break;
        case 3:
            insertAadhaar(a, n);
            break;
        case 4:
            deleteAadhaar(a, n);
            break;
        case 5:
            searchAadhaar(a, n);
            break;
        case 6:
            updateAadhaar(a, n);
            break;
        case 7:
            cout << "Exiting the program.";
            break;
        default:
            cout << "Invalid choice!";
            break;
        }
    } while (choice != 7);
}

int main() {
    Aadhaar a[50];
    int n = 0;
    Aadhaar system;
    system.menu(a, n);
    return 0;
}

/*
g++ -Iinclude -c ./main.cpp -o ./main.o
g++ ./main.o -o .main.exe
*/