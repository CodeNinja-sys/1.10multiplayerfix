/*
 * Decompiled with CFR 0.150.
 */
import java.util.concurrent.atomic.AtomicInteger;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;

public class bqn
extends cjn {
    private static final AtomicInteger a = new AtomicInteger(0);
    private static final d b = org.apache.logging.log4j.c.c();
    private sz c;
    private boolean d;
    private final cjn e;

    public bqn(cjn cjn2, bxy bxy2, cyq cyq2) {
        this.u = bxy2;
        this.e = cjn2;
        ri ri2 = ri.a(cyq2.b);
        bxy2.a((ym)null);
        bxy2.a(cyq2);
        this.a(ri2.a(), ri2.b());
    }

    public bqn(cjn cjn2, bxy bxy2, String string, int n2) {
        this.u = bxy2;
        this.e = cjn2;
        bxy2.a((ym)null);
        this.a(string, n2);
    }

    private void a(String string, int n2) {
        b.d("Connecting to {}, {}", string, n2);
        new asg(this, "Server Connector #" + a.incrementAndGet(), string, n2).start();
    }

    @Override
    public void d() {
        if (this.c != null) {
            if (this.c.e()) {
                this.c.a();
            } else {
                this.c.j();
            }
        }
    }

    @Override
    protected void a(char c2, int n2) {
    }

    @Override
    public void cH_() {
        this.y.clear();
        this.y.add(new cwv(0, this.w / 2 - 100, this.x / 4 + 120 + 12, bf.a("gui.cancel", new Object[0])));
    }

    @Override
    protected void a(cwv cwv2) {
        if (cwv2.j == 0) {
            this.d = true;
            if (this.c != null) {
                this.c.a(new aym("Aborted"));
            }
            this.u.a(this.e);
        }
    }

    @Override
    public void a(int n2, int n3, float f2) {
        this.aH_();
        if (this.c == null) {
            this.a(this.B, bf.a("connect.connecting", new Object[0]), this.w / 2, this.x / 2 - 50, 0xFFFFFF);
        } else {
            this.a(this.B, bf.a("connect.authorizing", new Object[0]), this.w / 2, this.x / 2 - 50, 0xFFFFFF);
        }
        super.a(n2, n3, f2);
    }

    static /* synthetic */ boolean a(bqn bqn2) {
        return bqn2.d;
    }

    static /* synthetic */ sz a(bqn bqn2, sz sz2) {
        bqn2.c = sz2;
        return bqn2.c;
    }

    static /* synthetic */ sz b(bqn bqn2) {
        return bqn2.c;
    }

    static /* synthetic */ cjn c(bqn bqn2) {
        return bqn2.e;
    }

    static /* synthetic */ d f() {
        return b;
    }
}

