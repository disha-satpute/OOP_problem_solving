#include <iostream>
using namespace std;

void leftRotate(int arr[], int n, int k) {
    k = k % n;
    for (int i = 0; i < k; i++) {
        int first = arr[0];
        for (int j = 0; j < n - 1; j++) {
            arr[j] = arr[j + 1];
        }
        arr[n - 1] = first;
    }
}

void rightRotate(int arr[], int n, int k) {
    k = k % n;
    for (int i = 0; i < k; i++) {
        int last = arr[n - 1];
        for (int j = n - 1; j > 0; j--) {
            arr[j] = arr[j - 1];
        }
        arr[0] = last;
    }
}

void printArray(int arr[], int n) {
    for (int i = 0; i < n; i++) {
        cout << arr[i] << " ";
    }
    cout << endl;
}

int main() {
    int n, k;
    cin >> n;

    int* arr = new int[n]; 
    for (int i = 0; i < n; i++) {
        cin >> arr[i];
    }
    cin >> k;

    leftRotate(arr, n, k);
    printArray(arr, n);

    rightRotate(arr, n, k);
    printArray(arr, n);

    delete[] arr;
    return 0;
}
