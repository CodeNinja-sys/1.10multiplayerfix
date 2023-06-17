/*
 * Decompiled with CFR 0.150.
 */
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class cyd {
    public final String e;
    private final cbg a;
    public boolean f;
    private final brr b;
    private final bcu c;
    private Class d;
    private static final NumberFormat k = NumberFormat.getIntegerInstance(Locale.US);
    public static brr g = new wc();
    private static final DecimalFormat l = new DecimalFormat("########0.00");
    public static brr h = new bwc();
    public static brr i = new b();
    public static brr j = new cih();

    public cyd(String string, cbg cbg2, brr brr2) {
        this.e = string;
        this.a = cbg2;
        this.b = brr2;
        this.c = new cox(this);
        bcu.a.put(this.c.a(), this.c);
    }

    public cyd(String string, cbg cbg2) {
        this(string, cbg2, g);
    }

    public cyd i() {
        this.f = true;
        return this;
    }

    public cyd aE_() {
        if (bpv.a.containsKey(this.e)) {
            throw new RuntimeException("Duplicate stat id: \"" + ((cyd)bpv.a.get((Object)this.e)).a + "\" and \"" + this.a + "\" at id " + this.e);
        }
        bpv.b.add(this);
        bpv.a.put(this.e, this);
        return this;
    }

    public boolean e() {
        return false;
    }

    public String a(int n2) {
        return this.b.a(n2);
    }

    public cbg f() {
        cbg cbg2 = this.a.f();
        cbg2.h().a(aug.h);
        cbg2.h().a(new dex(km.b, new aym(this.e)));
        return cbg2;
    }

    public cbg j() {
        cbg cbg2 = this.f();
        cbg cbg3 = new aym("[").a(cbg2).b("]");
        cbg3.a(cbg2.h());
        return cbg3;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        cyd cyd2 = (cyd)object;
        return this.e.equals(cyd2.e);
    }

    public int hashCode() {
        return this.e.hashCode();
    }

    public String toString() {
        return "Stat{id=" + this.e + ", nameId=" + this.a + ", awardLocallyOnly=" + this.f + ", formatter=" + this.b + ", objectiveCriteria=" + this.c + '}';
    }

    public bcu k() {
        return this.c;
    }

    public Class l() {
        return this.d;
    }

    public cyd b(Class class_) {
        this.d = class_;
        return this;
    }

    static /* synthetic */ NumberFormat m() {
        return k;
    }

    static /* synthetic */ DecimalFormat n() {
        return l;
    }
}

