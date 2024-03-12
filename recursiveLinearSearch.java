public int recursiveLinearSearch(int [] a, int target, int startIndex){
  if(startIndex == a.length){
    return -1;
  } else if(a[startIndex] == target){
    return startIndex;
  } else if(a[startIndex] != target && startIndex < a.length){
    startIndex++;
    return recursiveLinearSearch(a, target, startIndex);
  } 
  return 12341243;
}
