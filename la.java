/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.b.cm;

class la
implements cm {
    final /* synthetic */ afu a;

    la(afu afu2) {
        this.a = afu2;
    }

    public boolean a(bga bga2) {
        double d2 = this.a.f();
        if (bga2.ar_()) {
            d2 *= (double)0.8f;
        }
        if (bga2.ct()) {
            return false;
        }
        if ((double)bga2.k(afu.a(this.a)) > d2) {
            return false;
        }
        return cni.a(afu.a(this.a), bga2, false, true);
    }

    @Override
    public /* synthetic */ boolean a(Object object) {
        return this.a((bga)object);
    }
}

