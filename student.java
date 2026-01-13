public class student {
    public String name;
    public String id;
    public int score =0;

    public void doHomework(int point){
          score += point;
          System.out.println(name+"did homrwork"+point+"point");
    }
    public void takeExam(int point){
        score += point;
        System.out.println(name+"did homrwork"+point+"point");
    }
    public String getResult(){
        if(score >= 50)
            return"PASS";
        return"FALL";
    }
    public void showStatus(){
        System.out.println("Name :"+ name);
        System.out.println("ID :"+ id);
        System.out.println("Socre :"+ score);
        System.out.println("Result :"+ getResult());
    }

}
