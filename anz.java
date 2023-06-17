/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.sz;
import java.util.List;
import java.util.Map;

public class anz
extends azg {
    private static final Map a = sz.c();
    private final bi b;
    private final String c;

    protected anz(String string, bi bi2) {
        this.c = "item.record." + string + ".desc";
        this.b = bi2;
        this.k = 1;
        this.a(zm.f);
        a.put(this.b, this);
    }

    @Override
    public cey a(bhl bhl2, bdl bdl2, iu iu2, cmz cmz2, bqp bqp2, bqk bqk2, float f2, float f3, float f4) {
        dbk dbk2 = iu2.n(cmz2);
        if (dbk2.t() != blg.aN || ((Boolean)dbk2.b(cdu.a)).booleanValue()) {
            return cey.b;
        }
        if (!iu2.C) {
            ((cdu)blg.aN).a(iu2, cmz2, dbk2, bhl2);
            iu2.a(null, 1010, cmz2, azg.a(this));
            --bhl2.b;
            bdl2.a(bpv.Z);
        }
        return cey.a;
    }

    @Override
    public void a(bhl bhl2, bdl bdl2, List list, boolean bl2) {
        list.add(this.f());
    }

    public String f() {
        return caf.a(this.c);
    }

    @Override
    public abj b_(bhl bhl2) {
        return abj.c;
    }

    public static anz a(bi bi2) {
        return (anz)a.get(bi2);
    }

    public bi g() {
        return this.b;
    }
}

