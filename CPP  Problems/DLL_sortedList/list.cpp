#include <iostream>

struct Node {
    int data;
    Node* next;
    Node* prev;

    Node(int val) : data(val), next(nullptr), prev(nullptr) {}
};

class DoublyLinkedList {
public:
    Node* head;
    Node* tail;

    DoublyLinkedList() : head(nullptr), tail(nullptr) {}

    void insert(int val) {
        Node* newNode = new Node(val);
        if (!head) {
            head = tail = newNode;
        }
        else {
            tail->next = newNode;
            newNode->prev = tail;
            tail = newNode;
        }
    }

    void display() {
        Node* current = head;
        while (current) {
            std::cout << current->data << " ";
            current = current->next;
        }
        std::cout << std::endl;
    }

    void sort() {
        if (!head) return;

        bool swapped;
        do {
            swapped = false;
            Node* current = head;
            while (current->next) {
                if (current->data > current->next->data) {
                    std::swap(current->data, current->next->data);
                    swapped = true;
                }
                current = current->next;
            }
        } while (swapped);
    }

    DoublyLinkedList merge(DoublyLinkedList& other) {
        DoublyLinkedList mergedList;
        Node* first = head;
        Node* second = other.head;

        while (first && second) {
            if (first->data <= second->data) {
                mergedList.insert(first->data);
                first = first->next;
            }
            else {
                mergedList.insert(second->data);
                second = second->next;
            }
        }
        while (first) {
            mergedList.insert(first->data);
            first = first->next;
        }
        while (second) {
            mergedList.insert(second->data);
            second = second->next;
        }
        return mergedList;
    }
};

int main() {
    DoublyLinkedList list1;
    DoublyLinkedList list2;

    // Inserting marks into the first list
    list1.insert(85);
    list1.insert(70);
    list1.insert(90);
    list1.insert(75);

    // Inserting marks into the second list
    list2.insert(80);
    list2.insert(60);
    list2.insert(95);
    list2.insert(65);

    std::cout << "List 1 before sorting: ";
    list1.display();
    list1.sort();
    std::cout << "List 1 after sorting: ";
    list1.display();

    std::cout << "List 2 before sorting: ";
    list2.display();
    list2.sort();
    std::cout << "List 2 after sorting: ";
    list2.display();

    // Merging the two sorted lists
    DoublyLinkedList mergedList = list1.merge(list2);
    std::cout << "Merged sorted list: ";
    mergedList.display();

    return 0;
}