public int binarySearchList(ArrayList <Integer> list, int target){
    int min = 0;
  int max = list.size() - 1;
  int checker;
  while(min <= max)
  {
     checker = (min + max)/2;
     if(list.get(checker) == target)
       return checker;
     else if(list.get(checker) < target)
       min = checker + 1;
     else 
       max = checker - 1;
  }
  return -1;
}
