/*
 * Decompiled with CFR 0.150.
 */
import java.util.Comparator;

public class bay
implements Comparator {
    private final cpk a;

    public bay(cpk cpk2) {
        this.a = cpk2;
    }

    public int a(cpk cpk2, cpk cpk3) {
        double d2;
        double d3 = this.a.l(cpk2);
        if (d3 < (d2 = this.a.l(cpk3))) {
            return -1;
        }
        if (d3 > d2) {
            return 1;
        }
        return 0;
    }

    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((cpk)object, (cpk)object2);
    }
}

