public class FindDuplicated {
  String[] firstArray = new String[] { "a", "b", "c" };
  String[] secondArray = new String[] {"c", "a", "e"};

  public void checkout() {
    for(int i = 0; i < firstArray.length; i++){
      for(int j = 0; j< secondArray.length; j++){
        if(firstArray[i] == secondArray[j]){
          System.out.println(firstArray[i]);
        }
      }
    }    
  }

}
