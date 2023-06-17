/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.g;

import com.a.a.b.cl;
import com.a.a.g.ac;
import com.a.a.g.bk;
import com.a.a.g.u;
import java.io.Serializable;
import java.nio.charset.Charset;

class ab
implements u,
Serializable {
    private final Charset a;

    ab(Charset charset) {
        this.a = (Charset)cl.a(charset);
    }

    public void a(CharSequence charSequence, bk bk2) {
        bk2.b(charSequence, this.a);
    }

    public String toString() {
        return "Funnels.stringFunnel(" + this.a.name() + ")";
    }

    public boolean equals(Object object) {
        if (object instanceof ab) {
            ab ab2 = (ab)object;
            return this.a.equals(ab2.a);
        }
        return false;
    }

    public int hashCode() {
        return ab.class.hashCode() ^ this.a.hashCode();
    }

    Object a() {
        return new ac(this.a);
    }
}

