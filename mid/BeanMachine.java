package mid;

public class BeanMachine {
    private int[] shots;
    private int n;
    private int m;
    private int maxlen;
    BeanMachine(int n,int m){
        shots = new int[m];
        this.n = n;
        this.m = m;
        maxlen = 0;
    }
    public void addShot(int n){
        shots[n]++;
        if(shots[n]>shots[maxlen]){
            maxlen = n;
        }
    }
    public void showBean(){
        for(int i=shots[maxlen];i>=0;i--){
            for(int j=0;j<m;j++){
                if(shots[j]>i){
                    System.out.print('*');
                }else{
                    System.out.print(' ');
                }
            }
            System.out.println();
        }
    }
    public void dropBalls(){
        for(int k=0;k<n;k++){
            int count = m-1;
            for(int i =0;i<m-1;i++){
                int direction=(int)(Math.random()*2)+1;
                // direction=1;
                if(direction==2){
                    System.out.print('R');
                }else{
                    count-=1;
                    System.out.print('L');
                }
            }
            System.out.println();
            addShot(count);
        }

    }
    public static void main(String[] args) {
        BeanMachine beanMachine = new BeanMachine(5, 8);
        beanMachine.dropBalls();
        
        beanMachine.showBean();
    }
}
