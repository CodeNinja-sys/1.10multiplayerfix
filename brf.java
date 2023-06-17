/*
 * Decompiled with CFR 0.150.
 */
import java.util.Comparator;

class brf
implements Comparator {
    final /* synthetic */ bjs a;
    final /* synthetic */ ayz b;

    brf(ayz ayz2, bjs bjs2) {
        this.b = ayz2;
        this.a = bjs2;
    }

    public int a(va va2, va va3) {
        azg azg2 = va2.a();
        azg azg3 = va3.a();
        int n2 = azg.a(azg2);
        int n3 = azg.a(azg3);
        cyd cyd2 = null;
        cyd cyd3 = null;
        if (this.b.x == 0) {
            cyd2 = bpv.c(azg2);
            cyd3 = bpv.c(azg3);
        } else if (this.b.x == 1) {
            cyd2 = bpv.a(azg2);
            cyd3 = bpv.a(azg3);
        } else if (this.b.x == 2) {
            cyd2 = bpv.b(azg2);
            cyd3 = bpv.b(azg3);
        } else if (this.b.x == 3) {
            cyd2 = bpv.d(azg2);
            cyd3 = bpv.d(azg3);
        } else if (this.b.x == 4) {
            cyd2 = bpv.e(azg2);
            cyd3 = bpv.e(azg3);
        }
        if (cyd2 != null || cyd3 != null) {
            int n4;
            if (cyd2 == null) {
                return 1;
            }
            if (cyd3 == null) {
                return -1;
            }
            int n5 = bjs.b(this.b.A).a(cyd2);
            if (n5 != (n4 = bjs.b(this.b.A).a(cyd3))) {
                return (n5 - n4) * this.b.y;
            }
        }
        return n2 - n3;
    }

    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((va)object, (va)object2);
    }
}

