/*
 * Decompiled with CFR 0.150.
 */
package d.b.a.c.a;

import com.sun.jna.a.d.ac;
import com.sun.jna.a.d.ej;
import com.sun.jna.a.d.gf;
import com.sun.jna.b.e;

public class c {
    private ej a = null;

    public c() {
        ej ej2 = new ej();
        ac.g.a(ej2);
        try {
            e e2 = new e();
            gf gf2 = ac.g.e();
            if (ac.g.b(gf2, e2) && e2.d() > 0) {
                ac.g.b(ej2);
            }
        }
        catch (UnsatisfiedLinkError unsatisfiedLinkError) {
            // empty catch block
        }
        this.a = ej2;
    }

    public c(ej ej2) {
        this.a = ej2;
    }

    public int a() {
        return this.a.H.intValue();
    }
}

