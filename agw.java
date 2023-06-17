/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.ov;
import java.util.Collections;
import java.util.List;

public class agw
implements Runnable {
    private static final agw a = new agw();
    private final List b = Collections.synchronizedList(ov.a());
    private volatile long c;
    private volatile long d;
    private volatile boolean e;

    private agw() {
        Thread thread = new Thread((Runnable)this, "File IO Thread");
        thread.setPriority(1);
        thread.start();
    }

    public static agw a() {
        return a;
    }

    @Override
    public void run() {
        while (true) {
            this.c();
        }
    }

    private void c() {
        for (int i2 = 0; i2 < this.b.size(); ++i2) {
            cyw cyw2 = (cyw)this.b.get(i2);
            boolean bl2 = cyw2.a();
            if (!bl2) {
                this.b.remove(i2--);
                ++this.d;
            }
            try {
                Thread.sleep(this.e ? 0L : 10L);
                continue;
            }
            catch (InterruptedException interruptedException) {
                interruptedException.printStackTrace();
            }
        }
        if (this.b.isEmpty()) {
            try {
                Thread.sleep(25L);
            }
            catch (InterruptedException interruptedException) {
                interruptedException.printStackTrace();
            }
        }
    }

    public void a(cyw cyw2) {
        if (this.b.contains(cyw2)) {
            return;
        }
        ++this.c;
        this.b.add(cyw2);
    }

    public void b() {
        this.e = true;
        while (this.c != this.d) {
            Thread.sleep(10L);
        }
        this.e = false;
    }
}

