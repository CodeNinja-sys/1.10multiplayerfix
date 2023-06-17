/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.sz;
import java.util.Map;

public class csl
implements ds {
    private Map a;

    public csl() {
    }

    public csl(Map map) {
        this.a = map;
    }

    public void a(bfz bfz2) {
        bfz2.a(this);
    }

    @Override
    public void a(si si2) {
        int n2 = si2.e();
        this.a = sz.c();
        for (int i2 = 0; i2 < n2; ++i2) {
            cyd cyd2 = bpv.a(si2.e(32767));
            int n3 = si2.e();
            if (cyd2 == null) continue;
            this.a.put(cyd2, n3);
        }
    }

    @Override
    public void b(si si2) {
        si2.d(this.a.size());
        for (Map.Entry entry : this.a.entrySet()) {
            si2.a(((cyd)entry.getKey()).e);
            si2.d((Integer)entry.getValue());
        }
    }

    public Map a() {
        return this.a;
    }
}

