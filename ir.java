/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.l.i;
import com.a.a.n.a.dm;

class ir
implements Comparable {
    private final dm b;
    private final double c;
    final /* synthetic */ dfr a;

    public ir(dfr dfr2, dm dm2, double d2) {
        this.a = dfr2;
        this.b = dm2;
        this.c = d2;
    }

    public int a(ir ir2) {
        return i.a(this.c, ir2.c);
    }

    public /* synthetic */ int compareTo(Object object) {
        return this.a((ir)object);
    }

    static /* synthetic */ dm b(ir ir2) {
        return ir2.b;
    }
}

