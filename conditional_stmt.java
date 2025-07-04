public class conditional_stmt {
    public static void main(String[] args) {
        int salary=25000;
//        if(salary>10000){
//            salary=salary+2000;
//        }else{

        
//            salary=salary+1000;
//        }

        //multiple else if condition

        
        //

        if(salary>10000){
            salary=salary+2000;
        } else if (salary>20000) {
            salary +=3000;
        }else{

        salary=salary+1000;
        }
        System.out.println(salary);
    }
}
