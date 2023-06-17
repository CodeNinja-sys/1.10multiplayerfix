/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.b.cm;

class yx
implements cm {
    final /* synthetic */ cm a;
    final /* synthetic */ cyx b;

    yx(cyx cyx2, cm cm2) {
        this.b = cyx2;
        this.a = cm2;
    }

    public boolean a(bga bga2) {
        if (bga2 == null) {
            return false;
        }
        if (this.a != null && !this.a.a(bga2)) {
            return false;
        }
        if (!auxx.e.a(bga2)) {
            return false;
        }
        return this.b.a(bga2, false);
    }

    @Override
    public /* synthetic */ boolean a(Object object) {
        return this.a((bga)object);
    }
}

