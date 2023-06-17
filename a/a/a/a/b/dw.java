/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.b;

import a.a.a.a.b.du;
import a.a.a.a.b.dy;
import a.a.a.a.b.dz;
import a.a.a.a.b.ea;
import a.a.a.a.b.eb;
import java.util.Random;

public class dw {
    public static final dy a = new dy();

    private dw() {
    }

    public static du a(du du2, Random random) {
        int n2 = du2.size();
        while (n2-- != 0) {
            int n3 = random.nextInt(n2 + 1);
            long l2 = du2.l(n2);
            du2.b(n2, du2.l(n3));
            du2.b(n3, l2);
        }
        return du2;
    }

    public static du a(long l2) {
        return new dz(l2, null);
    }

    public static du a(Object object) {
        return new dz((Long)object, null);
    }

    public static du a(du du2) {
        return new ea(du2);
    }

    public static du a(du du2, Object object) {
        return new ea(du2, object);
    }

    public static du b(du du2) {
        return new eb(du2);
    }
}

