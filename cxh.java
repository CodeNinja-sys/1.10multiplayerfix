/*
 * Decompiled with CFR 0.150.
 */
import io.netty.b.g;
import java.text.SimpleDateFormat;
import java.util.Date;
import net.minecraft.c.a;

public abstract class cxh
implements ala {
    private static final SimpleDateFormat a = new SimpleDateFormat("HH:mm:ss");
    private int b;
    private boolean c = true;
    private cbg d;
    private String e = "";
    private String f = "@";
    private final bsv g = new bsv();

    public int j() {
        return this.b;
    }

    public void a(int n2) {
        this.b = n2;
    }

    public cbg k() {
        return this.d == null ? new aym("") : this.d;
    }

    public bvp a(bvp bvp2) {
        bvp2.a("Command", this.e);
        bvp2.a("SuccessCount", this.b);
        bvp2.a("CustomName", this.f);
        bvp2.a("TrackOutput", this.c);
        if (this.d != null && this.c) {
            bvp2.a("LastOutput", zf.a(this.d));
        }
        this.g.b(bvp2);
        return bvp2;
    }

    public void b(bvp bvp2) {
        this.e = bvp2.l("Command");
        this.b = bvp2.h("SuccessCount");
        if (bvp2.b("CustomName", 8)) {
            this.f = bvp2.l("CustomName");
        }
        if (bvp2.b("TrackOutput", 1)) {
            this.c = bvp2.p("TrackOutput");
        }
        if (bvp2.b("LastOutput", 8) && this.c) {
            try {
                this.d = zf.a(bvp2.l("LastOutput"));
            }
            catch (Throwable throwable) {
                this.d = new aym(throwable.getMessage());
            }
        } else {
            this.d = null;
        }
        this.g.a(bvp2);
    }

    @Override
    public boolean a(int n2, String string) {
        return n2 <= 2;
    }

    public void a(String string) {
        this.e = string;
        this.b = 0;
    }

    public String l() {
        return this.e;
    }

    public void a(iu iu2) {
        if (iu2.C) {
            this.b = 0;
            return;
        }
        if ("Searge".equalsIgnoreCase(this.e)) {
            this.d = new aym("#itzlipofutzli");
            this.b = 1;
            return;
        }
        a a2 = this.o_();
        if (a2 != null && a2.M() && a2.ah()) {
            m m2 = a2.N();
            try {
                this.d = null;
                this.b = m2.a(this, this.e);
            }
            catch (Throwable throwable) {
                cet cet2 = cet.a(throwable, "Executing command block");
                sx sx2 = cet2.a("Command to be executed");
                sx2.a("Command", new bgo(this));
                sx2.a("Name", new dgs(this));
                throw new oz(cet2);
            }
        } else {
            this.b = 0;
        }
    }

    @Override
    public String i_() {
        return this.f;
    }

    @Override
    public cbg v() {
        return new aym(this.i_());
    }

    public void b(String string) {
        this.f = string;
    }

    @Override
    public void a(cbg cbg2) {
        if (this.c && this.m_() != null && !this.m_().C) {
            this.d = new aym("[" + a.format(new Date()) + "] ").a(cbg2);
            this.h();
        }
    }

    @Override
    public boolean C_() {
        a a2 = this.o_();
        return a2 == null || !a2.M() || ((iu)((Object)a2.d[0])).F().b("commandBlockOutput");
    }

    @Override
    public void a(bnw bnw2, int n2) {
        this.g.a(this.o_(), this, bnw2, n2);
    }

    public abstract void h();

    public abstract int i();

    public abstract void a(g var1);

    public void b(cbg cbg2) {
        this.d = cbg2;
    }

    public void a(boolean bl2) {
        this.c = bl2;
    }

    public boolean m() {
        return this.c;
    }

    public boolean a(bdl bdl2) {
        if (!bdl2.aU()) {
            return false;
        }
        if (bdl2.m_().C) {
            bdl2.a(this);
        }
        return true;
    }

    public bsv n() {
        return this.g;
    }
}

