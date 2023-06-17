/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.cv;

class bdd
extends bsq
implements Comparable {
    protected final bpi a;

    public bdd(bpi bpi2, int n2) {
        super(n2);
        this.a = bpi2;
    }

    public int a(bdd bdd2) {
        return cv.a().a(bdd2.c, this.c).b();
    }

    public String toString() {
        return "MyWeighedRandomItem{weight=" + this.c + ", model=" + this.a + '}';
    }

    public /* synthetic */ int compareTo(Object object) {
        return this.a((bdd)object);
    }
}

