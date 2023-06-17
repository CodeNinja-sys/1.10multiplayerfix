/*
 * Decompiled with CFR 0.150.
 */
import java.util.Set;

class dgt
implements iz {
    final /* synthetic */ Set a;
    final /* synthetic */ yf b;

    dgt(yf yf2, Set set) {
        this.b = yf2;
        this.a = set;
    }

    @Override
    public void a(dam dam2) {
        for (bpx bpx2 : this.a) {
            ars ars2 = dam2.a(bpx2);
            yf.a(this.b).put(bpx2, ars2);
        }
    }
}

