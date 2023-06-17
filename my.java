/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.ov;
import java.io.File;
import java.util.List;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;

public class my {
    private static final d a = org.apache.logging.log4j.c.c();
    private final bxy b;
    private final List c = ov.a();

    public my(bxy bxy2) {
        this.b = bxy2;
        this.a();
    }

    public void a() {
        try {
            this.c.clear();
            bvp bvp2 = cyb.a(new File(this.b.w, "servers.dat"));
            if (bvp2 == null) {
                return;
            }
            bmh bmh2 = bvp2.c("servers", 10);
            for (int i2 = 0; i2 < bmh2.b(); ++i2) {
                this.c.add(cyq.a(bmh2.b(i2)));
            }
        }
        catch (Exception exception) {
            a.b("Couldn't load server list", (Throwable)exception);
        }
    }

    public void b() {
        try {
            bmh bmh2 = new bmh();
            for (cyq cyq2 : this.c) {
                bmh2.a(cyq2.a());
            }
            bvp bvp2 = new bvp();
            bvp2.a("servers", bmh2);
            cyb.a(bvp2, new File(this.b.w, "servers.dat"));
        }
        catch (Exception exception) {
            a.b("Couldn't save server list", (Throwable)exception);
        }
    }

    public cyq a(int n2) {
        return (cyq)this.c.get(n2);
    }

    public void b(int n2) {
        this.c.remove(n2);
    }

    public void a(cyq cyq2) {
        this.c.add(cyq2);
    }

    public int c() {
        return this.c.size();
    }

    public void a(int n2, int n3) {
        cyq cyq2 = this.a(n2);
        this.c.set(n2, this.a(n3));
        this.c.set(n3, cyq2);
        this.b();
    }

    public void a(int n2, cyq cyq2) {
        this.c.set(n2, cyq2);
    }

    public static void b(cyq cyq2) {
        my my2 = new my(bxy.B());
        my2.a();
        for (int i2 = 0; i2 < my2.c(); ++i2) {
            cyq cyq3 = my2.a(i2);
            if (!cyq3.a.equals(cyq2.a) || !cyq3.b.equals(cyq2.b)) continue;
            my2.a(i2, cyq2);
            break;
        }
        my2.b();
    }
}

