package homework5;


public class Main {
    private static final int size = 10000000;
    private static final int h = size / 2;
    private static float[] arr = new float[size];

    static class ThreadArray implements Runnable{
        float[] arr;
        int threadNum;

        public ThreadArray(float[] arr, int threadNum) {
            this.arr = arr;
            this.threadNum = threadNum;
        }

        @Override
        public void run() {
            final long timeStart = System.currentTimeMillis();
            for(int i = 0; i < arr.length; i++){
                arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }
            final long timeEnd = System.currentTimeMillis() - timeStart;
            System.out.println("Время обработки формулы в массиве в потоке " + threadNum + "---> " + timeEnd + " мс");
        }
    }

    public static void main(String[] args) {
        simpleArray();
        dividedArray();
    }

    public static void arrayFill(){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1;
        }
    }

    public static void simpleArray(){
        arrayFill();

        final long timeSimpleArrStart = System.currentTimeMillis();
        for(int i = 0; i < arr.length; i++){
            arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        final long timeSimpleArrStop = System.currentTimeMillis() - timeSimpleArrStart;
        System.out.println("Время простой обработки массива: " + (timeSimpleArrStop/1000) + " секунд");

    }

    public static void dividedArray(){
        arrayFill();
        final long timeDividedArrStart = System.currentTimeMillis();
        final float [] a1 = new float[h];
        final float [] a2 = new float[h];
        System.arraycopy(arr, 0, a1, 0, h);
        System.arraycopy(arr, h, a2, 0, h);

        final long timeDivideArrStop = System.currentTimeMillis() - timeDividedArrStart;
        System.out.println("\nОбработка массива в разных потоках:");
        System.out.println("Разделение массива занимает " + timeDivideArrStop + " мс");

        Thread thread1 = new Thread(new ThreadArray(a1, 1));
        Thread thread2 = new Thread(new ThreadArray(a2, 2));

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        final long timeJoinArrStart = System.currentTimeMillis();
        System.arraycopy(a1, 0, arr, 0, h);
        System.arraycopy(a2, 0, arr, h, h);
        final long timeJoinArrStop = System.currentTimeMillis() - timeJoinArrStart;
        System.out.println("Склейка массивов занимает " + timeJoinArrStop + " мс");

        System.out.println("Общее время: " + ((System.currentTimeMillis() - timeDividedArrStart))/1000 + " секунд");



    }

}
