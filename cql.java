/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.b.cm;

final class cql
implements cm {
    final /* synthetic */ int a;
    final /* synthetic */ int b;

    cql(int n2, int n3) {
        this.a = n2;
        this.b = n3;
    }

    public boolean a(cpk cpk2) {
        if (!(cpk2 instanceof czt)) {
            return false;
        }
        czt czt2 = (czt)cpk2;
        return !(this.a > -1 && czt2.H < this.a || this.b > -1 && czt2.H > this.b);
    }

    @Override
    public /* synthetic */ boolean a(Object object) {
        return this.a((cpk)object);
    }
}

