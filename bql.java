/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.sz;
import java.util.Map;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;

public abstract class bql {
    private static final d a = org.apache.logging.log4j.c.c();
    private static final Map b = sz.c();
    private static final Map c = sz.c();
    protected iu k;
    protected cmz l = cmz.e;
    protected boolean m;
    private int d = -1;
    protected bfa n;

    private static void a(Class class_, String string) {
        if (b.containsKey(string)) {
            throw new IllegalArgumentException("Duplicate id: " + string);
        }
        b.put(string, class_);
        c.put(class_, string);
    }

    public iu b_() {
        return this.k;
    }

    public void a(iu iu2) {
        this.k = iu2;
    }

    public boolean w() {
        return this.k != null;
    }

    public void a(bvp bvp2) {
        this.l = new cmz(bvp2.h("x"), bvp2.h("y"), bvp2.h("z"));
    }

    public bvp b(bvp bvp2) {
        return this.c(bvp2);
    }

    private bvp c(bvp bvp2) {
        String string = (String)c.get(this.getClass());
        if (string == null) {
            throw new RuntimeException(this.getClass() + " is missing a mapping! This is a bug!");
        }
        bvp2.a("id", string);
        bvp2.a("x", this.l.a());
        bvp2.a("y", this.l.b());
        bvp2.a("z", this.l.c());
        return bvp2;
    }

    public static bql a(iu iu2, bvp bvp2) {
        bql bql2 = null;
        String string = bvp2.l("id");
        try {
            Class class_ = (Class)b.get(string);
            if (class_ != null) {
                bql2 = (bql)class_.newInstance();
            }
        }
        catch (Throwable throwable) {
            a.b("Failed to create block entity {}", string, throwable);
        }
        if (bql2 != null) {
            try {
                bql2.b(iu2);
                bql2.a(bvp2);
            }
            catch (Throwable throwable) {
                a.b("Failed to load data for block entity {}", string, throwable);
                bql2 = null;
            }
        } else {
            a.f("Skipping BlockEntity with id {}", string);
        }
        return bql2;
    }

    protected void b(iu iu2) {
    }

    public int x() {
        if (this.d == -1) {
            dbk dbk2 = this.k.n(this.l);
            this.d = dbk2.t().e(dbk2);
        }
        return this.d;
    }

    public void c_() {
        if (this.k != null) {
            dbk dbk2 = this.k.n(this.l);
            this.d = dbk2.t().e(dbk2);
            this.k.b(this.l, this);
            if (this.z() != blg.a) {
                this.k.f(this.l, this.z());
            }
        }
    }

    public double a(double d2, double d3, double d4) {
        double d5 = (double)this.l.a() + 0.5 - d2;
        double d6 = (double)this.l.b() + 0.5 - d3;
        double d7 = (double)this.l.c() + 0.5 - d4;
        return d5 * d5 + d6 * d6 + d7 * d7;
    }

    public double d_() {
        return 4096.0;
    }

    public cmz y() {
        return this.l;
    }

    public bfa z() {
        if (this.n == null && this.k != null) {
            this.n = this.k.n(this.l).t();
        }
        return this.n;
    }

    public hv a_() {
        return null;
    }

    public bvp b() {
        return this.c(new bvp());
    }

    public boolean A() {
        return this.m;
    }

    public void e_() {
        this.m = true;
    }

    public void f_() {
        this.m = false;
    }

    public boolean a_(int n2, int n3) {
        return false;
    }

    public void g_() {
        this.n = null;
        this.d = -1;
    }

    public void a(sx sx2) {
        sx2.a("Name", new cx(this));
        if (this.k == null) {
            return;
        }
        sx.a(sx2, this.l, this.z(), this.x());
        sx2.a("Actual block type", new dan(this));
        sx2.a("Actual block data value", new th(this));
    }

    public void c(cmz cmz2) {
        if (cmz2 instanceof pj || cmz2 instanceof bjb) {
            a.f("Tried to assign a mutable BlockPos to a block entity...", (Throwable)new Error(cmz2.getClass().toString()));
            cmz2 = new cmz(cmz2);
        }
        this.l = cmz2;
    }

    public boolean h_() {
        return false;
    }

    public cbg v() {
        return null;
    }

    public void a_(ih ih2) {
    }

    public void a_(cdk cdk2) {
    }

    static /* synthetic */ Map B() {
        return c;
    }

    static {
        bql.a(bop.class, "Furnace");
        bql.a(bdm.class, "Chest");
        bql.a(abn.class, "EnderChest");
        bql.a(d.class, "RecordPlayer");
        bql.a(bqo.class, "Trap");
        bql.a(cvy.class, "Dropper");
        bql.a(bxr.class, "Sign");
        bql.a(ze.class, "MobSpawner");
        bql.a(bkh.class, "Music");
        bql.a(csv.class, "Piston");
        bql.a(buj.class, "Cauldron");
        bql.a(app.class, "EnchantTable");
        bql.a(alv.class, "Airportal");
        bql.a(agq.class, "Beacon");
        bql.a(tr.class, "Skull");
        bql.a(alh.class, "DLDetector");
        bql.a(cls.class, "Hopper");
        bql.a(csd.class, "Comparator");
        bql.a(cbj.class, "FlowerPot");
        bql.a(cwd.class, "Banner");
        bql.a(i.class, "Structure");
        bql.a(bii.class, "EndGateway");
        bql.a(jf.class, "Control");
    }
}

