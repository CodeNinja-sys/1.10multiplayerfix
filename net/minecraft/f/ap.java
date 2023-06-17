/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.f;

import com.a.a.d.sz;
import java.util.Map;
import net.minecraft.a.p;
import net.minecraft.f.aa;
import net.minecraft.f.ab;
import net.minecraft.f.ad;
import net.minecraft.f.ae;
import net.minecraft.f.ag;
import net.minecraft.f.ah;
import net.minecraft.f.aj;
import net.minecraft.f.ak;
import net.minecraft.f.am;
import net.minecraft.f.ao;
import net.minecraft.f.aq;
import net.minecraft.f.b;
import net.minecraft.f.d;
import net.minecraft.f.e;
import net.minecraft.f.f;
import net.minecraft.f.g;
import net.minecraft.f.h;
import net.minecraft.f.j;
import net.minecraft.f.k;
import net.minecraft.f.m;
import net.minecraft.f.s;
import net.minecraft.f.u;
import net.minecraft.f.w;
import net.minecraft.f.y;
import net.minecraft.f.z;
import net.minecraft.g.cn;
import net.minecraft.g.dr;
import net.minecraft.k.i;
import net.minecraft.u.bi;
import net.minecraft.u.bq;
import net.minecraft.u.d.a;
import org.apache.logging.log4j.c;

public abstract class ap {
    private static final org.apache.logging.log4j.d a = org.apache.logging.log4j.c.c();
    private static final Map b = sz.c();
    private static final Map c = sz.c();
    protected net.minecraft.q.k k;
    protected net.minecraft.u.b.b l = net.minecraft.u.b.b.c;
    protected boolean m;
    private int d = -1;
    protected cn n;

    static {
        ap.a(aa.class, "Furnace");
        ap.a(u.class, "Chest");
        ap.a(ak.class, "EnderChest");
        ap.a(dr.class, "RecordPlayer");
        ap.a(ae.class, "Trap");
        ap.a(ag.class, "Dropper");
        ap.a(ad.class, "Sign");
        ap.a(y.class, "MobSpawner");
        ap.a(e.class, "Music");
        ap.a(m.class, "Piston");
        ap.a(j.class, "Cauldron");
        ap.a(aj.class, "EnchantTable");
        ap.a(ao.class, "Airportal");
        ap.a(aq.class, "Beacon");
        ap.a(f.class, "Skull");
        ap.a(ah.class, "DLDetector");
        ap.a(k.class, "Hopper");
        ap.a(d.class, "Comparator");
        ap.a(g.class, "FlowerPot");
        ap.a(w.class, "Banner");
        ap.a(ab.class, "Structure");
        ap.a(am.class, "EndGateway");
        ap.a(h.class, "Control");
    }

    private static void a(Class class_, String string) {
        if (b.containsKey(string)) {
            throw new IllegalArgumentException("Duplicate id: " + string);
        }
        b.put(string, class_);
        c.put(class_, string);
    }

    public net.minecraft.q.k cD_() {
        return this.k;
    }

    public void b(net.minecraft.q.k k2) {
        this.k = k2;
    }

    public boolean B() {
        return this.k != null;
    }

    public void b(net.minecraft.e.e e2) {
        this.l = new net.minecraft.u.b.b(e2.h("x"), e2.h("y"), e2.h("z"));
    }

    public net.minecraft.e.e a(net.minecraft.e.e e2) {
        return this.c(e2);
    }

    private net.minecraft.e.e c(net.minecraft.e.e e2) {
        String string = (String)c.get(this.getClass());
        if (string == null) {
            throw new RuntimeException(this.getClass() + " is missing a mapping! This is a bug!");
        }
        e2.a("id", string);
        e2.a("x", this.l.cy_());
        e2.a("y", this.l.k());
        e2.a("z", this.l.l());
        return e2;
    }

    public static ap a(net.minecraft.q.k k2, net.minecraft.e.e e2) {
        ap ap2 = null;
        String string = e2.l("id");
        try {
            Class class_ = (Class)b.get(string);
            if (class_ != null) {
                ap2 = (ap)class_.newInstance();
            }
        }
        catch (Throwable throwable) {
            a.b("Failed to create block entity {}", string, throwable);
        }
        if (ap2 != null) {
            try {
                ap2.a(k2);
                ap2.b(e2);
            }
            catch (Throwable throwable) {
                a.b("Failed to load data for block entity {}", string, throwable);
                ap2 = null;
            }
        } else {
            a.f("Skipping BlockEntity with id {}", string);
        }
        return ap2;
    }

    protected void a(net.minecraft.q.k k2) {
    }

    public int bL_() {
        if (this.d == -1) {
            net.minecraft.g.c.b b2 = this.k.n(this.l);
            this.d = b2.c().b(b2);
        }
        return this.d;
    }

    public void C() {
        if (this.k != null) {
            net.minecraft.g.c.b b2 = this.k.n(this.l);
            this.d = b2.c().b(b2);
            this.k.b(this.l, this);
            if (this.E() != p.a) {
                this.k.f(this.l, this.E());
            }
        }
    }

    public double a(double d2, double d3, double d4) {
        double d5 = (double)this.l.cy_() + 0.5 - d2;
        double d6 = (double)this.l.k() + 0.5 - d3;
        double d7 = (double)this.l.l() + 0.5 - d4;
        return d5 * d5 + d6 * d6 + d7 * d7;
    }

    public double bM_() {
        return 4096.0;
    }

    public net.minecraft.u.b.b D() {
        return this.l;
    }

    public cn E() {
        if (this.n == null && this.k != null) {
            this.n = this.k.n(this.l).c();
        }
        return this.n;
    }

    public net.minecraft.x.d.b.j bJ_() {
        return null;
    }

    public net.minecraft.e.e d() {
        return this.c(new net.minecraft.e.e());
    }

    public boolean F() {
        return this.m;
    }

    public void bP_() {
        this.m = true;
    }

    public void l() {
        this.m = false;
    }

    public boolean c(int n2, int n3) {
        return false;
    }

    public void bN_() {
        this.n = null;
        this.d = -1;
    }

    public void a(i i2) {
        i2.a("Name", new b(this));
        if (this.k != null) {
            i.a(i2, this.l, this.E(), this.bL_());
            i2.a("Actual block type", new s(this));
            i2.a("Actual block data value", new z(this));
        }
    }

    public void c(net.minecraft.u.b.b b2) {
        if (b2 instanceof net.minecraft.u.b.g || b2 instanceof net.minecraft.u.b.h) {
            a.f("Tried to assign a mutable BlockPos to a block entity...", (Throwable)new Error(b2.getClass().toString()));
            b2 = new net.minecraft.u.b.b(b2);
        }
        this.l = b2;
    }

    public boolean bK_() {
        return false;
    }

    public a aK() {
        return null;
    }

    public void a(bq bq2) {
    }

    public void a(bi bi2) {
    }

    static /* synthetic */ Map G() {
        return c;
    }
}

