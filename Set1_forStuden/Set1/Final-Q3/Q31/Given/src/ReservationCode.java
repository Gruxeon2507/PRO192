public class ReservationCode {
    String customerName;
    String code;
    public ReservationCode(String code, String customerName) {
        this.code=code;
        this.customerName=customerName;
    }
    
     
    String getCode() {
        String result="";
        for(int i=0;i<code.length()-3;i+=2){
            result=result+ code.charAt(i)+ code.charAt( i+1) +"-" ;
        }
        result=result+ code.charAt(code.length()-2)+code.charAt(code.length()-1);
        return result;
    }
    @Override
    public String toString(){
        return customerName+"\t"+code;
    }
    /*add and complete your other methods here (if needed)*/
    
}
