package ValidarNome;

import java.util.*; 


class Main {

  public static String CodelandUsernameValidation(String str) {
    // code goes here  
    
    boolean result = true; 

    for(int i = 0; i < str.length(); i++){
      if(!(Character.isLetterOrDigit(str.charAt(i))||str.charAt(i) == ('_'))){
        result = false;
        break;
      }else{
        result = true;
      }
    }

    if(str.length()<4&&str.length()>25){
      str="false";
    }else if(str.charAt(str.length()-1) == ('_')){
      str="false";
    }else if(!(Character.isLetter(str.charAt(0)))){
      str="false";
    }else if(!(result)){
      str="false";
    }else{
      str="true";
    }
    return str;
  }

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(CodelandUsernameValidation(s.nextLine())); 
    s.close();
  }

}