/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.b.cm;

final class cvl
implements cm {
    final /* synthetic */ cpk a;
    final /* synthetic */ ccw b;
    final /* synthetic */ bfo c;

    cvl(cpk cpk2, ccw ccw2, bfo bfo2) {
        this.a = cpk2;
        this.b = ccw2;
        this.c = bfo2;
    }

    public boolean a(cpk cpk2) {
        boolean bl2;
        bfo bfo2;
        if (!cpk2.P()) {
            return false;
        }
        if (!(!this.a.aQ.C || cpk2 instanceof bdl && ((bdl)cpk2).z())) {
            return false;
        }
        ccw ccw2 = cpk2.as_();
        bfo bfo3 = bfo2 = ccw2 == null ? bfo.a : ccw2.j();
        if (bfo2 == bfo.b) {
            return false;
        }
        boolean bl3 = bl2 = this.b != null && this.b.a(ccw2);
        if ((this.c == bfo.d || bfo2 == bfo.d) && bl2) {
            return false;
        }
        return this.c != bfo.c && bfo2 != bfo.c || bl2;
    }

    @Override
    public /* synthetic */ boolean a(Object object) {
        return this.a((cpk)object);
    }
}

