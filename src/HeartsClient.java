public class HeartsClient {
    public static void main(String[] args) throws Exception {
        //System.out.print(group1SetUp().report());
        //Heart test =new Heart(color, size, saying, costPerLb, calories, available, stock);
        Heart group1 = new Heart("red", 3, "Hi", 5, 0, 50);
        Heart group2 =new Heart("teal", 5, "Love CS-A", 4.5, 0, 200);
        Heart group3= new Heart("green", 2, "Go Girl!", 3.5, 0, 75);
        Heart[] store= {group1, group2, group3};
        group3.adjPrice(50);
        System.out.println(group3.report());
<<<<<<< HEAD
        System.out.print(buyColor(store, "red"));
=======
        System.out.print(colorPrice("red", store));
>>>>>>> 573754c564503ecb65d6ab05921489d5a8cf5b0d

        
        //banana(group1, group2, group3);
    
}
    public static int buyOut (Heart[] store){
        int x=0;
        for(int i=0; i<store.length; i++){
            x= x+ store[i].getStock();
        }
        return x;
    }
<<<<<<< HEAD
    public static double buyColor (Heart[] store, String color){
        double buyColor= 0;
        for(int i=0; i<store.length; i++){
            if(store[i].getColor().toLowerCase()==color){
               buyColor= buyColor + (store[i].getCostPerLb() * store[i].getStock());
            }
        }
        return buyColor;
=======
    public static double colorPrice(String colorRequest, Heart[] store){
        double colorPrice=0.0;
        for(int i=0; i<store.length; i++){
           if ((store[i].getColor().toLowerCase()) == colorRequest.toLowerCase()){
            colorPrice= colorPrice +(store[i].getCostPerLb() * store[i].getStock());
           }
        }
        return colorPrice;
>>>>>>> 573754c564503ecb65d6ab05921489d5a8cf5b0d
    }
   
    
}



