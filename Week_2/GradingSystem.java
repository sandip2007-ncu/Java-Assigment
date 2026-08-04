public class GradingSystem{
  public static void main(String[] args){
    int[] marks = {-1,0,49,50,69,70,79,80,100,101};
      for(int result : marks){
          System.out.println(result + "  " + MarksChecking(result);
      }
  }
  public static String MarksChecking(int marks){
    if(marks >= 80 && marks <= 100 ){
      return "Distinction";
    }
    else if(marks >= 70 && marks <= 79){
      return "Merits";
    }

    else if(marks >= 50 && marks <= 69){
      return "Pass";
    }

    else if(marks >= 0 && marks <= 49){
      return "Fail";
    } 
    
    else {
      return "Invalid marks";
    }
  }
}
