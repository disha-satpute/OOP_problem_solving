#include <iostream>
#include <string>

using namespace std;

struct Node {
   int RollNo;
   string name;
   long contact_no;
   float CGPA;
   string company_name;

   struct Node *next;
};

struct Node* head = NULL;

void insert(int RollNo, string name, long contact_no, float CGPA, string company_name) {
   struct Node* new_node = new Node;  // C++ style memory allocation
   new_node->RollNo = RollNo;
   new_node->name = name;
   new_node->contact_no = contact_no;
   new_node->CGPA = CGPA;
   new_node->company_name = company_name;
   new_node->next = head;
   head = new_node;
}

void display() {
   struct Node* ptr = head;
   while (ptr != NULL) {
      cout << "Roll No: " << ptr->RollNo << "\n";
      cout << "Name: " << ptr->name << "\n";
      cout << "Contact No: " << ptr->contact_no << "\n";
      cout << "CGPA: " << ptr->CGPA << "\n";
      cout << "Company Name: " << ptr->company_name << "\n\n";
      ptr = ptr->next;
   }
}


void deleteNode(int RollNo) {
   // Case 1: List is empty
   if (head == NULL) {
      cout << "The list is empty. Nothing to delete." << endl;
      return;
   }

   // Case 2: Node to delete is the head
   if (head->RollNo == RollNo) {
      struct Node* temp = head;  // Store the current head
      head = head->next;         // Move head to the next node
      delete temp;               // Free the old head
      cout << "Node with Roll No " << RollNo << " deleted." << endl;
      return;
   }

   // Case 3: Node to delete is in the middle or end
   struct Node* current = head;
   struct Node* prev = NULL;

   // Traverse the list to find the node to delete
   while (current != NULL && current->RollNo != RollNo) {
      prev = current;             // Track the previous node
      current = current->next;    // Move to the next node
   }

   // If the node was not found
   if (current == NULL) {
      cout << "Node with Roll No " << RollNo << " not found." << endl;
      return;
   }

   // Node found, adjust the previous node's next pointer
   prev->next = current->next;

   // Free memory of the node to delete
   delete current;

   cout << "Node with Roll No " << RollNo << " deleted." << endl;
}

void updateNode(int RollNo) {
   struct Node* current = head;

   // Traverse the list to find the node with the given RollNo
   while (current != NULL && current->RollNo != RollNo) {
      current = current->next;
   }

   // If node is not found
   if (current == NULL) {
      cout << "Node with Roll No " << RollNo << " not found." << endl;
      return;
   }

   // Node found, ask for new details to update
   cout << "Updating details for Roll No " << RollNo << ":\n";

   cout << "Enter new Name: ";
   cin.ignore(); // To ignore newline from previous input
   getline(cin, current->name);

   cout << "Enter new Contact No: ";
   cin >> current->contact_no;

   cout << "Enter new CGPA: ";
   cin >> current->CGPA;

   cout << "Enter new Company Name: ";
   cin.ignore();
   getline(cin, current->company_name);

   cout << "Record updated successfully.\n";
}



int main() {
   int choice;
   int RollNo;
   string name;
   long contact_no;
   float CGPA;
   string company_name;

   do {
      cout << "\nMenu:\n";
      cout << "1. Insert a student record\n";
      cout << "2. Delete a student record\n";
      cout << "3. Update a student record\n";
      cout << "4. Display all student records\n";
      cout << "5. Exit\n";
      cout << "Enter your choice: ";
      cin >> choice;

      switch (choice) {
         case 1:
            cout << "Enter Roll No: ";
            cin >> RollNo;
            cout << "Enter Name: ";
            cin.ignore(); // To consume newline from previous input
            getline(cin, name);
            cout << "Enter Contact No: ";
            cin >> contact_no;
            cout << "Enter CGPA: ";
            cin >> CGPA;
            cout << "Enter Company Name: ";
            cin.ignore();
            getline(cin, company_name);
            insert(RollNo, name, contact_no, CGPA, company_name);
            cout << "Student record inserted.\n";
            break;

         case 2:
            cout << "Enter Roll No to delete: ";
            cin >> RollNo;
            deleteNode(RollNo);
            break;

         case 3:
            cout << "Enter Roll No to update: ";
            cin >> RollNo;
            updateNode(RollNo);
            break;

         case 4:
            cout << "Displaying student records:\n";
            display();
            break;

         case 5:
            cout << "Exiting program.\n";
            break;

         default:
            cout << "Invalid choice! Please try again.\n";
      }
   } while (choice != 5);

   return 0;
}