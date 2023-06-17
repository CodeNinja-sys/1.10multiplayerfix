/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.a;

import a.a.a.a.a.dt;
import a.a.a.a.a.dx;
import a.a.a.a.a.dy;
import a.a.a.a.a.dz;
import a.a.a.a.a.ea;
import java.util.Random;

public class dv {
    public static final dx a = new dx();

    private dv() {
    }

    public static dt a(dt dt2, Random random) {
        int n2 = dt2.size();
        while (n2-- != 0) {
            int n3 = random.nextInt(n2 + 1);
            int n4 = dt2.q(n2);
            dt2.b(n2, dt2.q(n3));
            dt2.b(n3, n4);
        }
        return dt2;
    }

    public static dt a(int n2) {
        return new dy(n2, null);
    }

    public static dt a(Object object) {
        return new dy((Integer)object, null);
    }

    public static dt a(dt dt2) {
        return new dz(dt2);
    }

    public static dt a(dt dt2, Object object) {
        return new dz(dt2, object);
    }

    public static dt b(dt dt2) {
        return new ea(dt2);
    }
}

