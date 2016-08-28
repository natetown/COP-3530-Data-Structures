class HighArray
{
private long[] a;
private int nElems;
//--------------------------------------------------
public HighArray(int max)
{
a = new long[max];
nElems = 0;
}
//--------------------------------------------------
public boolean find(long searchKey)
{
int j;
for(j=0; j<nElems; j++)
   if(a[j] == searchKey)
   break;
if(j == nElems)
   return false;
else
   return true;
}
//--------------------------------------------------
public void insert(long value)
{
a[nElems] = value;
nElems++;
}
//--------------------------------------------------
public boolean delete(long value){

int j;
for(j=0; j<nElems; j++)
   if( value == a[j] )
   break;
if(j==nElems)
   return false;
else
   {
   for(int k=j; k<nElems; k++)
      a[k] = a[k+1];
      nElems--;
      return true;
   }
}
//--------------------------------------------------
public void display()
{
for(int j=0; j<nElems; j++)
   System.out.print(a[j] + " ");
System.out.println("");
}
//--------------------------------------------------getmax()
public long getMax()
{
long highest = a[0];

if (a.length == 0){
   highest = -1;
   }
else{
   for(int i = 0; i<a.length; i++){
   if (a[i] > highest)
      {
         highest = a[i];
      }
   }
   }
return highest;
}
//--------------------------------------------------
//--------------------------------------------------getmin()
public long getMin()
{
long lowest = a[0];
for(int i = 0; i<a.length; i++){
if (a[i] < lowest)
   {
      lowest = a[i];
   }
}
return lowest;
}
//--------------------------------------------------
}


class n00871989
{
public static void main(String[] args)

{
int maxSize = 100;
HighArray arr;
arr = new HighArray(maxSize);


arr.insert(77);
arr.insert(99);
arr.insert(44);
arr.insert(55);
arr.insert(22);
arr.insert(88);
arr.insert(11);
arr.insert(00);
arr.insert(66);
arr.insert(33);
arr.insert(-10987324);
arr.insert(2349875);

arr.display();

int searchKey = 35;
if( arr.find(searchKey) )
   System.out.println("Can't find " + searchKey);
else 
   System.out.println("Can't find " + searchKey);
   
arr.delete(00);
arr.delete(55);
arr.delete(99);

arr.display();


long y=arr.getMax(); 
System.out.println(y);
long z=arr.getMin();
System.out.println(z);
}}
