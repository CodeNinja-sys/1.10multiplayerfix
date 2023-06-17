/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i;

import java.util.Locale;
import org.apache.a.ak;
import org.apache.a.al;
import org.apache.a.an;
import org.apache.a.i.n;
import org.apache.a.k.j;
import org.apache.a.k.p;
import org.apache.a.n.g;
import org.apache.a.o.a;
import org.apache.a.x;
import org.apache.a.y;

public class l
implements y {
    public static final l a = new l();
    protected final al b;

    public l(al al2) {
        this.b = (al)org.apache.a.o.a.a(al2, "Reason phrase catalog");
    }

    public l() {
        this(n.a);
    }

    public x a(ak ak2, int n2, g g2) {
        org.apache.a.o.a.a(ak2, "HTTP version");
        Locale locale = this.a(g2);
        String string = this.b.a(n2, locale);
        p p2 = new p(ak2, n2, string);
        return new j(p2, this.b, locale);
    }

    public x a(an an2, g g2) {
        org.apache.a.o.a.a(an2, "Status line");
        return new j(an2, this.b, this.a(g2));
    }

    protected Locale a(g g2) {
        return Locale.getDefault();
    }
}

