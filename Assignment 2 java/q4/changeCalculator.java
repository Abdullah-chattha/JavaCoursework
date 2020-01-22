
public class changeCalculator {
    
    private int price;
    private int pay;
    private double change[] = {0,0,0,0,0};
    
    public changeCalculator(){
        
    }
    
    public changeCalculator(int priceIn, int payIn){
        price = priceIn;
        pay = payIn;
    }
    
    public String changeDue(){
        int changeBack = (pay - price);
        System.out.println(changeBack + " is total change due");
        change[0] = (changeBack - changeBack%100)/100;
        changeBack = changeBack -(changeBack - changeBack%100);
        
        change[1] = (changeBack - changeBack%25)/25;
        changeBack = changeBack - (changeBack - changeBack%25);
        
        change[2] = (changeBack - changeBack%10)/10;
        changeBack = changeBack - (changeBack - changeBack%10);
        
        change[3] = (changeBack - changeBack%5)/5;
        changeBack = changeBack - (changeBack - changeBack%5);
        
        change[4] = changeBack/1;
        changeBack = changeBack -  0;
        return "Change:\nloonies:\t" + change[0] +
               "\nquarters:\t" + change[1] + 
               "\ndimes:  \t" + change[2] +
               "\nnickels:\t" + change[3] +
               "\npennies:\t" + change[4];
    }
    
}