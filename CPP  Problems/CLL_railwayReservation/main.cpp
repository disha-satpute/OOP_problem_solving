#include <iostream>
#include <string>
using namespace std;

class Node {
public:
    int reservationID;
    string passengerName;
    string trainName;
    int seatNumber;  // Added seat attribute
    Node* next;

    Node(int id, string name, string train, int seat) 
        : reservationID(id), passengerName(name), trainName(train), seatNumber(seat), next(nullptr) {}
};

class CircularLinkedList {
private:
    Node* head;
    int count;

public:
    CircularLinkedList() : head(nullptr), count(0) {}

    void addReservation(string name, string train, int seat) {
        int id = ++count;
        Node* newNode = new Node(id, name, train, seat);

        if (!head) {
            head = newNode;
            newNode->next = head;
        } else {
            Node* temp = head;
            while (temp->next != head) {
                temp = temp->next;
            }
            temp->next = newNode;
            newNode->next = head;
        }

        cout << "Reservation made successfully! Reservation ID: " << id << ", Seat Number: " << seat << endl;
    }

    void displayReservations() {
        if (!head) {
            cout << "No reservations found." << endl;
            return;
       }

        Node* temp = head;
        do {
            cout << "Reservation ID: " << temp->reservationID
                 << ", Passenger Name: " << temp->passengerName
                 << ", Train Name: " << temp->trainName
                 << ", Seat Number: " << temp->seatNumber << endl;
            temp = temp->next;
        } while (temp != head);
    }

    void cancelReservation(int id) {
        if (!head) {
            cout << "No reservations to cancel." << endl;
            return;
        }

        Node* temp = head;
        Node* prev = nullptr;

        do {
            if (temp->reservationID == id) {
                if (prev) {
                    prev->next = temp->next;
                    if (temp == head) {
                        head = temp->next;
                    }
                } else {
                    if (temp->next == head) {
                        delete head;
                        head = nullptr;
                    } else {
                        Node* last = head;
                        while (last->next != head) {
                            last = last->next;
                        }
                        last->next = temp->next;
                        head = temp->next;
                        delete temp;
                    }
                }
                cout << "Reservation with ID " << id << " has been canceled." << endl;
                return;
            }
            prev = temp;
            temp = temp->next;
        } while (temp != head);

        cout << "Reservation with ID " << id << " not found." << endl;
    }

    void setReservation(int id, string newName, string newTrain, int newSeat) {
        if (!head) {
            cout << "No reservations to modify." << endl;
            return;
        }

        Node* temp = head;
        do {
            if (temp->reservationID == id) {
                temp->passengerName = newName;
                temp->trainName = newTrain;
                temp->seatNumber = newSeat;  // Update seat number
                cout << "Reservation with ID " << id << " has been updated." << endl;
                return;
            }
            temp = temp->next;
        } while (temp != head);

        cout << "Reservation with ID " << id << " not found." << endl;
    }

 
};

int main() {
    CircularLinkedList cll;
    int choice;
    string name, train;
    int reservationID, seat;

    do {
        cout << "\nRailway Reservation System\n";
        cout << "1. Add Reservation\n";
        cout << "2. Display Reservations\n";
        cout << "3. Cancel Reservation\n";
        cout << "4. Modify Reservation\n";
        cout << "5. Exit\n";
        cout << "Enter your choice: ";
        cin >> choice;

        switch (choice) {
            case 1:
                cout << "Enter Passenger Name: ";
                cin.ignore();
                getline(cin, name);
                cout << "Enter Train Name: ";
                getline(cin, train);
                cout << "Enter Seat Number: ";
                cin >> seat;
                cll.addReservation(name, train, seat);
                break;

            case 2:
                cll.displayReservations();
                break;

            case 3:
                cout << "Enter Reservation ID to cancel: ";
                cin >> reservationID;
                cll.cancelReservation(reservationID);
                break;

            case 4:
                cout << "Enter Reservation ID to modify: ";
                cin >> reservationID;
                cout << "Enter New Passenger Name: ";
                cin.ignore();
                getline(cin, name);
                cout << "Enter New Train Name: ";
                getline(cin, train);
                cout << "Enter New Seat Number: ";
                cin >> seat;
                cll.setReservation(reservationID, name, train, seat);
                break;

            case 5:
                cout << "Exiting..." << endl;
                break;

            default:
                cout << "Invalid choice. Please try again." << endl;
        }
    } while (choice != 5);

    return 0;
}
