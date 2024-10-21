#include <iostream>
#include <string>
#include <iomanip>
using namespace std;

struct Order {
    int id;             // Order ID
    string type;
    int quantity;
    double price;
    Order* next;

    Order(int orderId, const string& t, int q, double p) : id(orderId), type(t), quantity(q), price(p), next(nullptr) {}
};

class CircularLinkedList {
private:
    Order* tail;
    int currentOrders;
    int nextOrderId;   // To keep track of the next order ID

public:
    CircularLinkedList() : tail(nullptr), currentOrders(0), nextOrderId(1) {} // No maxOrders

    bool addOrder(const string& type, int quantity) {
        double price = getPrice(type);
        if (price < 0) {
            cout << "Invalid pizza type." << endl;
            return false;
        }

        Order* newOrder = new Order(nextOrderId++, type, quantity, price);
        if (!tail) {
            tail = newOrder;
            tail->next = tail;
        }
        else {
            newOrder->next = tail->next;
            tail->next = newOrder;
            tail = newOrder;
        }

        currentOrders++;
        return true;
    }

    double getPrice(const string& type) {
        // Predefined prices for pizza types using if-else statements
        if (type == "Paneer") return 120.00;
        if (type == "Cheese") return 150.00;
        if (type == "Double Cheese") return 170.00;
        if (type == "Veggie") return 200.00;
        return -1; // Invalid type
    }
    void deleteOrder() {
        if (!tail) {
            cout << "No orders to Delete." << endl;
            return;
        }
        else {
            cout << "Orders Cannot be Delete.." << endl;
            return;
        }
    }

    void serveOrder() {
        if (!tail) {
            cout << "No orders to serve." << endl;
            return;
        }

        Order* toServe = tail->next;
        double totalPrice = toServe->price * toServe->quantity;

        cout << "** Serving Order **" << endl;
        cout << "\nServing order ID: " << toServe->id << endl;
        cout << "Pizza Type: " << toServe->type
            << " (Quantity: " << toServe->quantity
            << ", Price per unit: $" << fixed << setprecision(2) << toServe->price << ")" << endl;
        cout << "Total Bill: $" << fixed << setprecision(2) << totalPrice << endl;
        cout << "*********" << endl;

        if (toServe == tail) {
            delete toServe;
            tail = nullptr;
        }
        else {
            tail->next = toServe->next;
            delete toServe;
        }

        currentOrders--;
    }

    void displayOrders() {
        if (!tail) {
            cout << "No current orders." << endl;
            return;
        }

        Order* current = tail->next;
        cout << "Current orders: " << endl;
        do {
            cout << "Order ID: " << current->id
                << ", Type: " << current->type
                << " (Quantity: " << current->quantity
                << ", Price: $" << fixed << setprecision(2) << current->price << ")" << endl;
            current = current->next;
        } while (current != tail->next); // Loop until we circle back to the start
        cout << endl;
    }

    void displayMenu() {
        cout << "Pizza Menu:" << endl;
        cout << "1. Paneer - $120.00" << endl;
        cout << "2. Cheese - $150.00" << endl;
        cout << "3. Double Cheese - $170.00" << endl;
        cout << "4. Veggie - $200.00" << endl;
    }

    ~CircularLinkedList() {
        while (tail) {
            serveOrder();
        }
    }
};

int main() {
    CircularLinkedList orders; // No max orders limit
    int choice;
    string type;
    int quantity;

    do {
        cout << "\n1. Display Menu\n2. Add Order\n3. Serve Order\n4. Display Current Orders\n5. Delete Order\n6. Exit\n";
        cout << "Choose an option: ";
        cin >> choice;

        switch (choice) {
        case 1:
            orders.displayMenu();
            break;
        case 2:
            cout << "Enter the pizza type: ";
            cin.ignore(); // Clear the buffer
            getline(cin, type);
            cout << "Enter the quantity: ";
            cin >> quantity;
            orders.addOrder(type, quantity);
            break;
        case 3:
            orders.serveOrder();
            break;
        case 4:
            orders.displayOrders();
            break;
        case 5:
            orders.deleteOrder();
            break;
        case 6:
            cout << "Exiting." << endl;
            break;
        default:
            cout << "Invalid choice." << endl;
        }
    } while (choice != 6);

    return 0;
}