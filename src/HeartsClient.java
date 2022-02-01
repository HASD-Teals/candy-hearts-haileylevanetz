public class HeartsClient {
    public static void main(String[] args) throws Exception {
        //System.out.print(group1SetUp().report());
        //Heart test =new Heart(color, size, saying, costPerLb, calories, available, stock);
        Heart group1 = new Heart("red", 3, "Hi", 5, 0, 50);
        Heart group2 =new Heart("teal", 5, "Love CS-A", 4.5, 0, 200);
        Heart group3= new Heart("green", 2, "Go Girl!", 3.5, 0, 75);
        Heart[] store= {group1, group2, group3};
        group3.adjPrice(50);
        System.out.print(group3.report());

        
        //banana(group1, group2, group3);
    
}
    public static int buyOut (Heart[] store){
        int x=0;
        for(int i=0; i<store.length; i++){
            x= x+ store[i].getStock();
        }
        return x;
    }
    public static double colorPrice(String colorRequest, Heart[] store){
        for(int i=0; i<store.length; i++){
           if ((store[i].getColor() = colorRequest.toLowerCase()){

           }
        }
    }
   
    
}



