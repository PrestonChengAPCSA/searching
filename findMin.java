public int findMin(int [] aList){
  int min = aList[0];
  for(int i = 0; i < aList.length; i++){
    if(aList[i] < min){
      min = aList[i];
    }
  }
  return min;
}
