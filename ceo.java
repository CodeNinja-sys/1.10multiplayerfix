/*
 * Decompiled with CFR 0.150.
 */
import java.util.List;
import java.util.Map;

public class ceo
implements bpi {
    protected final List a;
    protected final Map b;
    protected final boolean c;
    protected final boolean d;
    protected final ars e;
    protected final dfk f;
    protected final clv g;

    public ceo(List list, Map map, boolean bl2, boolean bl3, ars ars2, dfk dfk2, clv clv2) {
        this.a = list;
        this.b = map;
        this.c = bl2;
        this.d = bl3;
        this.e = ars2;
        this.f = dfk2;
        this.g = clv2;
    }

    @Override
    public List a(dbk dbk2, bqk bqk2, long l2) {
        return bqk2 == null ? this.a : (List)this.b.get(bqk2);
    }

    @Override
    public boolean a() {
        return this.c;
    }

    @Override
    public boolean b() {
        return this.d;
    }

    @Override
    public boolean c() {
        return false;
    }

    @Override
    public ars d() {
        return this.e;
    }

    @Override
    public dfk e() {
        return this.f;
    }

    @Override
    public clv f() {
        return this.g;
    }
}

