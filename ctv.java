/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.b.cm;
import com.a.a.d.sz;
import java.util.Map;

public enum ctv implements cm,
hn
{
    a("x", afj.a),
    b("y", afj.b),
    c("z", afj.a);

    private static final Map d;
    private final String e;
    private final afj f;

    /*
     * WARNING - void declaration
     */
    private ctv() {
        void var4_2;
        void var3_1;
        this.e = var3_1;
        this.f = var4_2;
    }

    public static ctv a(String string) {
        if (string == null) {
            return null;
        }
        return (ctv)d.get(string.toLowerCase());
    }

    public String b() {
        return this.e;
    }

    public boolean c() {
        return this.f == afj.b;
    }

    public boolean d() {
        return this.f == afj.a;
    }

    public String toString() {
        return this.e;
    }

    public boolean a(bqk bqk2) {
        return bqk2 != null && bqk2.l() == this;
    }

    public afj e() {
        return this.f;
    }

    @Override
    public String a() {
        return this.e;
    }

    @Override
    public /* synthetic */ boolean a(Object object) {
        return this.a((bqk)object);
    }

    static {
        d = sz.c();
        for (ctv ctv2 : ctv.values()) {
            d.put(ctv2.b().toLowerCase(), ctv2);
        }
    }
}

