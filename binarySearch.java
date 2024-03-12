public int binarySearch(int [] a, int target){
  int min = 0;
  int max = a.length - 1;
  int checker;
  while(min <= max)
  {
     checker = (min + max)/2;
     if(a[checker] == target)
       return checker;
     else if(a[checker] < target)
       min = checker + 1;
     else 
       max = checker - 1;
  }
  return -1;
}
