/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.ov;
import java.net.InetAddress;
import java.util.Collections;
import java.util.List;

public class vu {
    private final List b = ov.a();
    boolean a;

    public synchronized boolean a() {
        return this.a;
    }

    public synchronized void b() {
        this.a = false;
    }

    public synchronized List c() {
        return Collections.unmodifiableList(this.b);
    }

    public synchronized void a(String string, InetAddress inetAddress) {
        String string2 = cpd.a(string);
        String string3 = cpd.b(string);
        if (string3 == null) {
            return;
        }
        string3 = inetAddress.getHostAddress() + ":" + string3;
        boolean bl2 = false;
        for (mg mg2 : this.b) {
            if (!mg2.b().equals(string3)) continue;
            mg2.c();
            bl2 = true;
            break;
        }
        if (!bl2) {
            this.b.add(new mg(string2, string3));
            this.a = true;
        }
    }
}

