/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i.a;

import org.apache.a.b.d;
import org.apache.a.b.e;
import org.apache.a.i.a.aa;
import org.apache.a.i.a.af;
import org.apache.a.l.j;

public class ab
implements e {
    private final af a;
    private final boolean b;

    public ab(af af2, boolean bl2) {
        this.a = af2;
        this.b = bl2;
    }

    public ab(af af2) {
        this(af2, false);
    }

    public ab() {
        this(null, false);
    }

    public d a(j j2) {
        return new aa(this.a, this.b);
    }

    public boolean a() {
        return this.b;
    }

    public af b() {
        return this.a;
    }
}

