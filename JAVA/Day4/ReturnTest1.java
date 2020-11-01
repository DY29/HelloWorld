public class ReturnTest1 {
    public static void main(String args[]){
        System.out.println("main() 메서드 start ... ");
        methodA();
        System.out.println("main() 메서드 end ... ");
    }
    private static void methodA() {
        System.out.println("methodA() 메서드 start...");
        for (int i = 0; i<5; i++){
            if(i==3){
                return;
            }
            System.out.println(i);
        }
        System.out.println(("methodA() 메서드 end..."));
    }
}
