/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.b.cm;
import com.a.a.d.ov;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class boe
implements bpi {
    private final Map f;
    protected final boolean a;
    protected final boolean b;
    protected final ars c;
    protected final dfk d;
    protected final clv e;

    public boe(Map map) {
        this.f = map;
        bpi bpi2 = (bpi)map.values().iterator().next();
        this.a = bpi2.a();
        this.b = bpi2.b();
        this.c = bpi2.d();
        this.d = bpi2.e();
        this.e = bpi2.f();
    }

    @Override
    public List a(dbk dbk2, bqk bqk2, long l2) {
        ArrayList arrayList = ov.a();
        if (dbk2 != null) {
            for (Map.Entry entry : this.f.entrySet()) {
                if (!((cm)entry.getKey()).a(dbk2)) continue;
                arrayList.addAll(((bpi)entry.getValue()).a(dbk2, bqk2, l2++));
            }
        }
        return arrayList;
    }

    @Override
    public boolean a() {
        return this.a;
    }

    @Override
    public boolean b() {
        return this.b;
    }

    @Override
    public boolean c() {
        return false;
    }

    @Override
    public ars d() {
        return this.c;
    }

    @Override
    public dfk e() {
        return this.d;
    }

    @Override
    public clv f() {
        return this.e;
    }
}

