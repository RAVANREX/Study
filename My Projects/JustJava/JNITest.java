public class JNITest {
    static int x =0;
    public static void main(String[] args){
//        Runnable run = new Runnable() {
//            @Override
//            public void run() {
//                x=9;
//                System.out.println("my Name"+x);
//            }
//        };

        Runnable run = () ->{
                x=9;
                System.out.println("my Name"+x);
        };


        new Thread(run).;
    }

//   void show(final int x) {
//        x = x + 1;  // Error
//    }

}

// class A {
//
//}