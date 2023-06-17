/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.b.aj;
import com.a.a.n.a.gf;
import io.netty.b.bi;
import io.netty.b.g;
import io.netty.b.j;
import io.netty.c.a.a.a;
import java.awt.image.BufferedImage;
import java.util.List;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import org.apache.commons.c.ao;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;

public class aun
implements ye {
    private static final d a = org.apache.logging.log4j.c.c();
    private static final ThreadPoolExecutor b = new ScheduledThreadPoolExecutor(5, new gf().a("Server Pinger #%d").a(true).a());
    private static final bpx c = new bpx("textures/misc/unknown_server.png");
    private static final bpx d = new bpx("textures/gui/server_selection.png");
    private final cuz e;
    private final bxy f;
    private final cyq g;
    private final bpx h;
    private String i;
    private cze j;
    private long k;

    protected aun(cuz cuz2, cyq cyq2) {
        this.e = cuz2;
        this.g = cyq2;
        this.f = bxy.B();
        this.h = new bpx("servers/" + cyq2.b + "/icon");
        this.j = (cze)this.f.P().b(this.h);
    }

    @Override
    public void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, boolean bl2) {
        String string;
        int n9;
        if (!this.g.h) {
            this.g.h = true;
            this.g.e = -2L;
            this.g.d = "";
            this.g.c = "";
            b.submit(new fb(this));
        }
        boolean bl3 = this.g.f > 210;
        boolean bl4 = this.g.f < 210;
        boolean bl5 = bl3 || bl4;
        this.f.k.a(this.g.a, n3 + 32 + 3, n4 + 1, 0xFFFFFF);
        List list = this.f.k.c(this.g.d, n5 - 32 - 2);
        for (int i2 = 0; i2 < Math.min(list.size(), 2); ++i2) {
            this.f.k.a((String)list.get(i2), n3 + 32 + 3, n4 + 12 + this.f.k.a * i2, 0x808080);
        }
        String string2 = bl5 ? (Object)((Object)aug.e) + this.g.g : this.g.c;
        int n10 = this.f.k.a(string2);
        this.f.k.a(string2, n3 + n5 - n10 - 15 - 2, n4 + 1, 0x808080);
        int n11 = 0;
        String string3 = null;
        if (bl5) {
            n9 = 5;
            string = bl3 ? "Client out of date!" : "Server out of date!";
            string3 = this.g.i;
        } else if (this.g.h && this.g.e != -2L) {
            n9 = this.g.e < 0L ? 5 : (this.g.e < 150L ? 0 : (this.g.e < 300L ? 1 : (this.g.e < 600L ? 2 : (this.g.e < 1000L ? 3 : 4))));
            if (this.g.e < 0L) {
                string = "(no connection)";
            } else {
                string = this.g.e + "ms";
                string3 = this.g.i;
            }
        } else {
            n11 = 1;
            n9 = (int)(bxy.K() / 100L + (long)(n2 * 2) & 7L);
            if (n9 > 4) {
                n9 = 8 - n9;
            }
            string = "Pinging...";
        }
        cja.c(1.0f, 1.0f, 1.0f, 1.0f);
        this.f.P().a(alo.p);
        alo.a(n3 + n5 - 15, n4, n11 * 10, 176 + n9 * 8, 10, 8, 256.0f, 256.0f);
        if (this.g.c() != null && !this.g.c().equals(this.i)) {
            this.i = this.g.c();
            this.c();
            this.e.j().b();
        }
        if (this.j != null) {
            this.a(n3, n4, this.h);
        } else {
            this.a(n3, n4, c);
        }
        int n12 = n7 - n3;
        int n13 = n8 - n4;
        if (n12 >= n5 - 15 && n12 <= n5 - 5 && n13 >= 0 && n13 <= 8) {
            this.e.a(string);
        } else if (n12 >= n5 - n10 - 15 - 2 && n12 <= n5 - 15 - 2 && n13 >= 0 && n13 <= 8) {
            this.e.a(string3);
        }
        if (this.f.u.A || bl2) {
            this.f.P().a(d);
            alo.a(n3, n4, n3 + 32, n4 + 32, -1601138544);
            cja.c(1.0f, 1.0f, 1.0f, 1.0f);
            int n14 = n7 - n3;
            int n15 = n8 - n4;
            if (this.b()) {
                if (n14 < 32 && n14 > 16) {
                    alo.a(n3, n4, 0.0f, 32.0f, 32, 32, 256.0f, 256.0f);
                } else {
                    alo.a(n3, n4, 0.0f, 0.0f, 32, 32, 256.0f, 256.0f);
                }
            }
            if (this.e.a(this, n2)) {
                if (n14 < 16 && n15 < 16) {
                    alo.a(n3, n4, 96.0f, 32.0f, 32, 32, 256.0f, 256.0f);
                } else {
                    alo.a(n3, n4, 96.0f, 0.0f, 32, 32, 256.0f, 256.0f);
                }
            }
            if (this.e.b(this, n2)) {
                if (n14 < 16 && n15 > 16) {
                    alo.a(n3, n4, 64.0f, 32.0f, 32, 32, 256.0f, 256.0f);
                } else {
                    alo.a(n3, n4, 64.0f, 0.0f, 32, 32, 256.0f, 256.0f);
                }
            }
        }
    }

    protected void a(int n2, int n3, bpx bpx2) {
        this.f.P().a(bpx2);
        cja.l();
        alo.a(n2, n3, 0.0f, 0.0f, 32, 32, 32.0f, 32.0f);
        cja.k();
    }

    private boolean b() {
        return true;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void c() {
        if (this.g.c() == null) {
            this.f.P().c(this.h);
            this.j = null;
        } else {
            BufferedImage bufferedImage;
            g g2 = bi.a(this.g.c(), aj.c);
            g g3 = io.netty.c.a.a.a.b(g2);
            try {
                bufferedImage = anq.a(new j(g3));
                ao.b(bufferedImage.getWidth() == 64, "Must be 64 pixels wide", new Object[0]);
                ao.b(bufferedImage.getHeight() == 64, "Must be 64 pixels high", new Object[0]);
            }
            catch (Throwable throwable) {
                a.b("Invalid icon for server {} ({})", this.g.a, this.g.b, throwable);
                this.g.a((String)null);
                return;
            }
            finally {
                g2.ad();
                g3.ad();
            }
            if (this.j == null) {
                this.j = new cze(bufferedImage.getWidth(), bufferedImage.getHeight());
                this.f.P().a(this.h, (dfs)this.j);
            }
            bufferedImage.getRGB(0, 0, bufferedImage.getWidth(), bufferedImage.getHeight(), this.j.c(), 0, bufferedImage.getWidth());
            this.j.b();
        }
    }

    @Override
    public boolean a(int n2, int n3, int n4, int n5, int n6, int n7) {
        if (n6 <= 32) {
            if (n6 < 32 && n6 > 16 && this.b()) {
                this.e.b(n2);
                this.e.h();
                return true;
            }
            if (n6 < 16 && n7 < 16 && this.e.a(this, n2)) {
                this.e.a(this, n2, cjn.o());
                return true;
            }
            if (n6 < 16 && n7 > 16 && this.e.b(this, n2)) {
                this.e.b(this, n2, cjn.o());
                return true;
            }
        }
        this.e.b(n2);
        if (bxy.K() - this.k < 250L) {
            this.e.h();
        }
        this.k = bxy.K();
        return false;
    }

    @Override
    public void a(int n2, int n3, int n4) {
    }

    @Override
    public void b(int n2, int n3, int n4, int n5, int n6, int n7) {
    }

    public cyq a() {
        return this.g;
    }

    static /* synthetic */ cyq a(aun aun2) {
        return aun2.g;
    }

    static /* synthetic */ cuz b(aun aun2) {
        return aun2.e;
    }
}

