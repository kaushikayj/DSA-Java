package Patterns;
public class hollow_rect {
    public static void hollowrectangle(int totRows,int totCols){
        for(int i=1;i<=totRows;i++){
            for(int j=1;j<=totCols;j++){
                if(i==1 || i==totRows || j==1 || j==totCols){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                
            }
            System.out.println();
        }

    }
    public static void main(String args[]){
        hollowrectangle(4,5);
    }
    
}
