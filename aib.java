/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.b.cm;

final class aib
implements cm {
    final /* synthetic */ amj a;
    final /* synthetic */ boolean b;
    final /* synthetic */ double c;
    final /* synthetic */ boolean d;
    final /* synthetic */ double e;

    aib(amj amj2, boolean bl2, double d2, boolean bl3, double d3) {
        this.a = amj2;
        this.b = bl2;
        this.c = d2;
        this.d = bl3;
        this.e = d3;
    }

    public boolean a(cpk cpk2) {
        if (cpk2 == null) {
            return false;
        }
        double d2 = this.a.c(cpk2.aU, cpk2.aV, cpk2.aW);
        return (this.b || d2 >= this.c) && (this.d || d2 <= this.e);
    }

    @Override
    public /* synthetic */ boolean a(Object object) {
        return this.a((cpk)object);
    }
}

