/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.ov;
import com.a.a.d.sz;
import java.util.List;
import java.util.Map;

public class ckp {
    private final List a = ov.a();
    private final Map b = sz.a(bqk.class);
    private final clv c;
    private final boolean d;
    private ars e;
    private final boolean f;
    private final dfk g;

    public ckp(bfg bfg2, clv clv2) {
        this(bfg2.b(), bfg2.c(), bfg2.j(), clv2);
    }

    public ckp(dbk dbk2, bpi bpi2, ars ars2, cmz cmz2) {
        this(bpi2.a(), bpi2.b(), bpi2.e(), bpi2.f());
        this.e = bpi2.d();
        long l2 = cmk.a(cmz2);
        for (bqk bqk2 : bqk.values()) {
            this.a(dbk2, bpi2, ars2, bqk2, l2);
        }
        this.a(dbk2, bpi2, ars2, l2);
    }

    private ckp(boolean bl2, boolean bl3, dfk dfk2, clv clv2) {
        for (bqk bqk2 : bqk.values()) {
            this.b.put(bqk2, ov.a());
        }
        this.c = clv2;
        this.d = bl2;
        this.f = bl3;
        this.g = dfk2;
    }

    private void a(dbk dbk2, bpi bpi2, ars ars2, bqk bqk2, long l2) {
        for (crz crz2 : bpi2.a(dbk2, bqk2, l2)) {
            this.a(bqk2, new bdu(crz2, ars2));
        }
    }

    private void a(dbk dbk2, bpi bpi2, ars ars2, long l2) {
        for (crz crz2 : bpi2.a(dbk2, null, l2)) {
            this.a(new bdu(crz2, ars2));
        }
    }

    public ckp a(bqk bqk2, crz crz2) {
        ((List)this.b.get(bqk2)).add(crz2);
        return this;
    }

    public ckp a(crz crz2) {
        this.a.add(crz2);
        return this;
    }

    public ckp a(ars ars2) {
        this.e = ars2;
        return this;
    }

    public bpi a() {
        if (this.e == null) {
            throw new RuntimeException("Missing particle!");
        }
        return new ceo(this.a, this.b, this.d, this.f, this.e, this.g, this.c);
    }
}

