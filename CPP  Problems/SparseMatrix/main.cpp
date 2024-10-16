#include <iostream>
using namespace std;

class sparcematrix
{
private:
    int r, c, n, triplet[50][3];
public:
    sparcematrix(int r1, int c1, int n1)
    {
        r = r1;
        c = c1;
        n = n1;
    }
    void getTriplet();
    void displayTriplet();
    void addTriplet(sparcematrix s);
    void transpose();
    void multi(sparcematrix s2);
    void fasttranspose();
};

void sparcematrix::getTriplet()
{
    triplet[0][0] = r;
    triplet[0][1] = c;
    triplet[0][2] = n;
    for (int i = 1; i <= n; i++)
    {
        cout << "Enter the row, column, and value for element " << i << endl;
        cin >> triplet[i][0] >> triplet[i][1] >> triplet[i][2];
    }
}

void sparcematrix::displayTriplet()
{
    for (int i = 0; i <= n; i++)
    {
        cout << triplet[i][0] << " " << triplet[i][1] << " " << triplet[i][2] << endl;
    }
} 

void sparcematrix::addTriplet(sparcematrix s2)
{
    int i = 1, j = 1, k = 1;
    int result[50][3];
    if (triplet[0][0] == s2.triplet[0][0] || triplet[0][1] == s2.triplet[0][1])
    {
        result[0][0] = triplet[0][0];
        result[0][1] = triplet[0][1];

        while (i <= n && j <= s2.n)
        {
            if (triplet[i][0] < s2.triplet[j][0] || 
               (triplet[i][0] == s2.triplet[j][0] && triplet[i][1] < s2.triplet[j][1]))
            {
                result[k][0] = triplet[i][0];
                result[k][1] = triplet[i][1];
                result[k][2] = triplet[i][2];
                i++;
            }
            else if (s2.triplet[j][0] < triplet[i][0] ||
                     (s2.triplet[j][0] == triplet[i][0] && s2.triplet[j][1] < triplet[i][1]))
            {
                result[k][0] = s2.triplet[j][0];
                result[k][1] = s2.triplet[j][1];
                result[k][2] = s2.triplet[j][2];
                j++;
            }
            else
            {
                result[k][0] = triplet[i][0];
                result[k][1] = triplet[i][1];
                result[k][2] = triplet[i][2] + s2.triplet[j][2];
                i++;
                j++;
            }
            k++;
        }

        while (i <= n)
        {
            result[k][0] = triplet[i][0];
            result[k][1] = triplet[i][1];
            result[k][2] = triplet[i][2];
            i++;
            k++;
        }

        while (j <= s2.n)
        {
            result[k][0] = s2.triplet[j][0];
            result[k][1] = s2.triplet[j][1];
            result[k][2] = s2.triplet[j][2];
            j++;
            k++;
        }

        result[0][2] = k - 1;

        cout << "Resultant matrix in triplet form:" << endl;
        for (int l = 0; l < k; l++)
        {
            cout << result[l][0] << " " << result[l][1] << " " << result[l][2] << endl;
        }
    }
    else
    {
        cout << "The number of rows and columns do not match." << endl;
    }
}

void sparcematrix::transpose()
{
    int result[50][3];
    int k = 1;
    for (int i = 0; i < triplet[0][1]; i++)
    {
        for (int j = 0; j <= triplet[0][2]; j++)
        {
            if (i == triplet[j][1])
            {
                result[k][0] = triplet[j][1];
                result[k][1] = triplet[j][0];
                result[k][2] = triplet[j][2];
                k++;
            }
        }
    }
    result[0][0] = triplet[0][1];
    result[0][1] = triplet[0][0];
    result[0][2] = k - 1;

    cout << "Displaying the transpose of matrix" << endl;
    for (int l = 0; l < k; l++)
    {
        cout << result[l][0] << " " << result[l][1] << " " << result[l][2] << endl;
    }
}

void sparcematrix::multi(sparcematrix s2)
{
    int  Arr[50][3];

    
    int trans[50][3];
    int k1 = 1;

    trans[0][0] = s2.triplet[0][1];
    trans[0][1] = s2.triplet[0][0];
    trans[0][2] = s2.triplet[0][2];

    for (int col = 0; col < s2.triplet[0][2]; col++)
    {
        for (int i = 1; i <= s2.triplet[0][2]; i++)
        {
            if (s2.triplet[i][1] == col)
            {
                trans[k1][0] = col;
                trans[k1][1] = s2.triplet[i][0];
                trans[k1][2] = s2.triplet[i][2];
                k1++;
            }
        }
    }
    trans[0][2] = k1 - 1;

    int idx = 1;
    Arr[0][0] = triplet[0][0];
    Arr[0][1] = trans[0][1];
    Arr[0][2] = 0;
    if(triplet[0][1] == trans[0][1])
    {

    for (int i = 1; i <= triplet[0][2]; i++)
    {
        for (int j = 1; j <= trans[0][2]; j++)
        {
            if (triplet[i][1] == trans[j][1])
            {
                Arr[idx][0] = triplet[i][0];
                Arr[idx][1] = trans[j][0];
                Arr[idx][2] = triplet[i][2] * trans[j][2];
                idx++;
            }
        }
    }
    Arr[0][2] = idx - 1;
    
    for(int i =1;i<=idx;i++)
    {
    	for(int j = i+1;j<=idx;j++)
    	{
    		if(Arr[i][0] == Arr[j][0] && Arr[i][1] == Arr[j][1]) 
    		{
    			Arr[i][2] = Arr[i][2] + Arr[j][2];
			}
		}
	}

    cout << "Multiplication Result in triplet form:" << endl;
    for (int i = 0; i <= Arr[0][2]; i++)
    {
        cout << Arr[i][0] << " " << Arr[i][1] << " " << Arr[i][2] << endl;
    }
}
else
{
	cout << "error"<<endl;
}
}
void sparcematrix::fasttranspose() {
    int loc, colno;
    int total[triplet[0][1]] = {0};
    int index[triplet[0][1] + 1];
    int fastresult[50][3];

    for (int i = 1; i <= triplet[0][2]; i++) {
        colno = triplet[i][1];
        total[colno]++;
    }

    index[0] = 1;
    for (int i = 1; i <= triplet[0][1]; i++) {
        index[i] = index[i - 1] + total[i - 1];
    }

    for (int i = 1; i <= triplet[0][2]; i++) {
        colno = triplet[i][1];
        loc = index[colno];
        fastresult[loc][0] = triplet[i][1];
        fastresult[loc][1] = triplet[i][0];
        fastresult[loc][2] = triplet[i][2];
        index[colno]++;
    }

    fastresult[0][0] = triplet[0][1];
    fastresult[0][1] = triplet[0][0];
    fastresult[0][2] = triplet[0][2];

    for (int i = 0; i <= fastresult[0][2]; i++) {
        cout << fastresult[i][0] << " " << fastresult[i][1] << " " << fastresult[i][2] << endl;
    }
}

int main()
{
    int r, c, n, choice,ch = 1;
    cout << "Enter number of rows, columns, and elements of the first matrix: ";
    cin >> r >> c >> n;
    sparcematrix s1(r, c, n);
    s1.getTriplet();

    cout << "Enter number of rows, columns, and elements of the second matrix: ";
    cin >> r >> c >> n;
    sparcematrix s2(r, c, n);
    s2.getTriplet();

    
    
    while( ch!=0)
    {
    	cout << "Choose an operation: \n1. Transpose\n2. Addition\n3. Multiplication\n4.display\n5.fasttranspose" << endl;
    cin >> choice;
    switch (choice)
    {
    case 1:
    	int num;
    	cout << "enter no of matrix you want to transpose" << endl;
    	cin>> num;
    	switch(num)
    	{
    		case 1 : 
    		 s1.transpose();
    		 break;
    		 
    		case 2 :
    		 	s2.transpose();
    		 	break;
		}
       
     break;
    case 2:
        s1.addTriplet(s2);
        break;
    case 3:
        s1.multi(s2);
        break;
        case 4:
        	s1.displayTriplet();
        	s2.displayTriplet();
        case 5:
        		int no;
    	cout << "enter no of matrix you want to fasttranspose" << endl;
    	cin>> no;
    	switch(no)
    	{
    		case 1 : 
    		 s1.fasttranspose();
    		 break;
    		 
    		case 2 :
    		 	s2.fasttranspose();
    		 	break;
		}
	        
   
    }
    cout<< "enter 1 to continue or enter 0 to exit"<<endl;
    cin>>ch;
}

    return 0;
}