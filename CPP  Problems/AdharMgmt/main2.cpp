#include <iostream>
#include <cstring> // For handling strings
using namespace std;

int m; // Global variable for update operations

class cust {
    int id;
    char name[50], email[50], adhar[50], mobile[50];

public:
    void getdata();
    void update();
    void putdata();
    void del(cust x[], int &n);
};

void cust::getdata() {
    cout << "Enter customer id: ";
    cin >> id;
    cout << "Enter customer name: ";
    cin >> name;
    cout << "Enter customer email: ";
    cin >> email;
    cout << "Enter customer adhar no: ";
    cin >> adhar;
    cout << "Enter customer mobile no: ";
    cin >> mobile;
}

void cust::update() {
    int ch;
    if (m == id) {
        do {
            cout << "\nWhat would you like to update :=>\n";
            cout << "1 = Customer ID\n";
            cout << "2 = Name\n";
            cout << "3 = Email\n";
            cout << "4 = Adhar no\n";
            cout << "5 = Mobile no\n";
            cout << "6 = Exit\n";
            cout << "Your choice: ";
            cin >> ch;

            switch (ch) {
                case 1:
                    cout << "Enter new customer ID: ";
                    cin >> id;
                    break;
                case 2:
                    cout << "Enter new customer name: ";
                    cin >> name;
                    break;
                case 3:
                    cout << "Enter new customer email: ";
                    cin >> email;
                    break;
                case 4:
                    cout << "Enter new customer adhar no: ";
                    cin >> adhar;
                    break;
                case 5:
                    cout << "Enter new customer mobile no: ";
                    cin >> mobile;
                    break;
                default:
                    break;
            }
        } while (ch != 6);
    }
}

void cust::putdata() {
    cout << "\n\tCustomer ID: " << id << endl;
    cout << "Customer Name: " << name << endl;
    cout << "Customer Email: " << email << endl;
    cout << "Customer Adhar No: " << adhar << endl;
    cout << "Customer Mobile No: " << mobile << endl;
}

void cust::del(cust x[], int &n) {
    int deleteId, i, j;
    cout << "Enter customer ID to be deleted: ";
    cin >> deleteId;

    for (i = 0; i < n; i++) {
        if (x[i].id == deleteId) {
            cout << "Customer with ID " << deleteId << " found and deleted.\n";
            for (j = i; j < n - 1; j++) {
                x[j] = x[j + 1]; // Shift elements left
            }
            n--; // Reduce the total number of customers
            return;
        }
    }
    cout << "Customer ID not found.\n";
}

int main() {
    cust x[50];
    int i, c, n = 0, t;

    cout << "Enter the number of customers: ";
    cin >> n;

    // Input initial customer data
    for (i = 0; i < n; i++) {
        x[i].getdata();
    }

    do {
        cout << "\nMenu:\n";
        cout << "1 = Insert\n";
        cout << "2 = Display\n";
        cout << "3 = Update\n";
        cout << "4 = Delete\n";
        cout << "5 = Exit\n";
        cout << "Your choice: ";
        cin >> c;

        switch (c) {
            case 1:
                cout << "Enter the number of customers to insert: ";
                cin >> t;
                for (i = n; i < n + t && i < 50; i++) {
                    x[i].getdata();
                }
                n += t;
                if (n > 50) {
                    cout << "Array limit reached, some customers were not added.\n";
                    n = 50;
                }
                break;

            case 2:
                for (i = 0; i < n; i++) {
                    x[i].putdata();
                }
                break;

            case 3:
                cout << "Enter the customer ID to update: ";
                cin >> m;
                for (i = 0; i < n; i++) {
                    x[i].update();
                }
                break;

            case 4:
                x[0].del(x, n);
                break;

            case 5:
                cout << "Exiting program.\n";
                break;

            default:
                cout << "Invalid choice. Please try again.\n";
                break;
        }
    } while (c != 5);

    return 0;
}
