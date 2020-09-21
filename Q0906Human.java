//Main.java========================================
class Main {
  public static void main(String[] args) {
    Human gildong = new Human("길동",170,60);
    Human chulsu = new Human("철수",166,72);

    System.out.println("gildong = " + gildong);
    System.out.println("chulsu  = " + chulsu);

  }
}


//Human.java=====================================
// 사람 클래스


public class Human {
  private String name; // private 를 쓰면 외부에선 접근금지.
  private int height;
  private int weight;


  public Human(String name, int height, int weight){
    this.name = name;
    this.height = height;
    this.weight = weight;

  }
    public String getName() { return name;}
    public int getHeight() {return height;}
    public int getweight() {return weight;}


    void gainweight(int w ) { weight += w;}
    void reduceweight(int w) {weight -= w;}


    public String toString() {
      return "{" + name + ":" + height + "cm" + weight + "kg"+ "}" ;
    }



  }
