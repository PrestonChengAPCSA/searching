public int linearSearchList(ArrayList <Integer> list, int target){
  for(int i = 0; i < list.size(); i++){
    if(list.get(i) == target){
      return i;
    } 
  }
  return -1;
}
