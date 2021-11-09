public class Genitore extends Thread {

    private Cassetto c;

    public Genitore(Cassetto cassetto) {
        c = cassetto;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (c) {
                while (c.getSoldi() != 0) {
                    try {
                        c.wait();
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
                c.versa();
                System.out.println(this.getName() + " " + c.getSoldi());
                c.notifyAll();
            }
        }
    }

}
