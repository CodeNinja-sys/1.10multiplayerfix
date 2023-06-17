/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.b.cm;

public class bqx
implements cm {
    private final bhl a;

    public bqx(bhl bhl2) {
        this.a = bhl2;
    }

    public boolean a(cpk cpk2) {
        if (!cpk2.bj()) {
            return false;
        }
        if (!(cpk2 instanceof bga)) {
            return false;
        }
        bga bga2 = (bga)cpk2;
        if (bga2.a(xy.c(this.a)) != null) {
            return false;
        }
        if (bga2 instanceof xy) {
            return ((xy)bga2).aD();
        }
        if (bga2 instanceof bdi) {
            return true;
        }
        return bga2 instanceof bdl;
    }

    @Override
    public /* synthetic */ boolean a(Object object) {
        return this.a((cpk)object);
    }
}

