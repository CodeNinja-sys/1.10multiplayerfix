/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.b.cm;

class cpg
implements cm {
    final /* synthetic */ cqs a;

    cpg(cqs cqs2) {
        this.a = cqs2;
    }

    public boolean a(cpk cpk2) {
        if (!(cpk2 instanceof bdl)) {
            return false;
        }
        if (((bdl)cpk2).G.a) {
            return false;
        }
        double d2 = this.a.f();
        if (cpk2.ar_()) {
            d2 *= (double)0.8f;
        }
        if (cpk2.ct()) {
            float f2 = ((bdl)cpk2).am();
            if (f2 < 0.1f) {
                f2 = 0.1f;
            }
            d2 *= (double)(0.7f * f2);
        }
        if ((double)cpk2.k(cqs.a(this.a)) > d2) {
            return false;
        }
        return cni.a(cqs.a(this.a), (bga)cpk2, false, true);
    }

    @Override
    public /* synthetic */ boolean a(Object object) {
        return this.a((cpk)object);
    }
}

