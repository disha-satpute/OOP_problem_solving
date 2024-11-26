#include <iostream> 
using namespace std; 
int m; 
 
class cust{ 
  int record; 
  char name[50],email[50],adhar[50],mobile[50]; 
  public: 
   void getdata(); 
   void update(); 
   void putdata(); 
   void del(cust x[],int w); 
}; 
void cust::getdata(){ 
  cout<<"Enter customer id: "; 
  cin>>record; 
  cout<<"Enter customer name: "; 
  cin>>name; 
  cout<<"Enter customer email: "; 
 cin>>email; 
 cout<<"Enter customer adhar no: "; 
 cin>>adhar; 
 cout<<"Enter customer mobile no: "; 
 cin>>mobile; 
} 
void cust::update(){ 
 int i,ch; 
 if(m==record){ 
 do{ 
    cout<<"\nWhat would you like to update :=>\n1=customerid\n2=Name\n3=Email\n4=Adhar no\n5=Mobile no\n6=Nothing\n "; 
  cout<<"\nYour choice: "; 
   cin>>ch; 
   switch(ch){ 
    case 1: 
      cout<<"Enter customer id: "; 
      cin>>record; 
      break; 
    case 2: 
      cout<<"Enter customer name: "; 
      cin>>name; 
      break; 
    case 3: 
      cout<<"Enter customer email id: "; 
      cin>>email; 
      break; 
    case 4: 
      cout<<"Enter customer adhar no: "; 
      cin>>adhar; 
      break; 
    case 5: 
      cout<<"Enter customer mobile no: "; 
      cin>>mobile; 
      break; 
    default: 
      break; 
    } 
 }while(ch!=6); 
 } 
} 
void cust::putdata(){ 
  cout<<"\n\t\t\tCustomer id: "<<record<<endl; 
  cout<<"Customer name: "<<name<<endl; 
  cout<<"Customer email: "<<email<<endl; 
  cout<<"Customer adhar no: "<<adhar<<endl; 
  cout<<"Customer mobile no: "<<mobile<<endl; 
} 
void cust::del(cust x[100], int n) 
{ 
 int o,i,j; 
 cout<<"Enter customer id to be deleted: "; 
 cin>>o; 
 for( int i=0;i<n;i++) 
 { 
  if(o==record) 
  { 
   cout<<"customer id found:"<<endl; 
   break; 
  } 
 } 
 i=j; 
 for(int j;j<n;j++) 
 { 
  x[j]=x[j+1]; 
 } 
} 
 
 
int main(){ 
  cust x[50]; 
  int i,c,n,t,k,j; 
  cout<<"Enter no of customer: "; 
  cin>>n; 
  for(i=0;i<n;i++){ 
    x[i].getdata(); 
  } 
  for(i=0;i<n;i++){ 
    x[i].putdata(); 
  } 
  do{ 
   cout<<"\nWould you like to :\n\n1=Insert\n2=Display\n3=Update\n4=Delete\n5=Exit\n"<<endl; 
   cout<<"\nYour choice: "; 
   cin>>c; 
  switch(c){ 
    case 1: 
      cout<<"Enter no of customers to be inserted: "; 
      cin>>t; 
      for(i=n;i<(n+t);i++){ 
       x[i].getdata(); 
      } 
      n+=t; 
      break; 
    case 2: 
      for(i=0;i<n;i++){ 
       x[i].putdata(); 
      } 
      break; 
    case 3: 
      cout<<"Enter the customer id to be updated: ";           
      cin>>m; 
      for(i=0;i<n;i++){ 
x[i].update(); 
} 
break; 
case 4: 
x->del(x,n); 
n--; 
break; 
default: 
break; 
} 
}while(c!=5); 
}