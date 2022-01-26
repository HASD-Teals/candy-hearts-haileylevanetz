public class HeartsClient {
    public static void main(String[] args) throws Exception {
        //System.out.print(group1SetUp().report());
        banana();
    
}
public static Heart group1SetUp (){
    Heart group1= new Heart();
    group1.setColor("red");
    group1.setSize(3);
    group1.setSaying("Hi");
    group1.setCostPerLb(4.5);
    group1.setStock(50);
    return group1;
    
  
}
public static void banana (){
    Heart[] arr= {group1SetUp()};
    for(int i=0; i<arr.length; i++){
        System.out.print(arr[i].getStock());
    }
}
}
