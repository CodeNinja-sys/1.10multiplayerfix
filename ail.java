/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.b.cm;
import com.a.a.d.sz;
import java.util.Map;

public class ail
implements cm {
    public static final cm a = new cww();
    private final bkp b;
    private final Map c = sz.c();

    private ail(bkp bkp2) {
        this.b = bkp2;
    }

    public static ail a(bfa bfa2) {
        return new ail(bfa2.r());
    }

    public boolean a(dbk dbk2) {
        if (dbk2 == null || !dbk2.t().equals(this.b.c())) {
            return false;
        }
        for (Map.Entry entry : this.c.entrySet()) {
            if (this.a(dbk2, (bvs)entry.getKey(), (cm)entry.getValue())) continue;
            return false;
        }
        return true;
    }

    protected boolean a(dbk dbk2, bvs bvs2, cm cm2) {
        return cm2.a(dbk2.b(bvs2));
    }

    public ail a(bvs bvs2, cm cm2) {
        if (!this.b.d().contains(bvs2)) {
            throw new IllegalArgumentException(this.b + " cannot support property " + bvs2);
        }
        this.c.put(bvs2, cm2);
        return this;
    }

    @Override
    public /* synthetic */ boolean a(Object object) {
        return this.a((dbk)object);
    }
}

