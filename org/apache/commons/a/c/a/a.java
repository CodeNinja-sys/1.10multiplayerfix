/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.a.c.a;

import org.apache.commons.a.c.a.af;
import org.apache.commons.a.c.a.k;
import org.apache.commons.a.h;
import org.apache.commons.a.j;

public class a
implements j {
    private k a = new k(org.apache.commons.a.c.a.j.b, af.a, true);

    @Override
    public Object b(Object object) {
        if (!(object instanceof String)) {
            throw new h("BeiderMorseEncoder encode parameter is not of type String");
        }
        return this.b((String)object);
    }

    @Override
    public String b(String string) {
        if (string == null) {
            return null;
        }
        return this.a.a(string);
    }

    public org.apache.commons.a.c.a.j a() {
        return this.a.b();
    }

    public af b() {
        return this.a.c();
    }

    public boolean c() {
        return this.a.d();
    }

    public void a(boolean bl2) {
        this.a = new k(this.a.b(), this.a.c(), bl2, this.a.e());
    }

    public void a(org.apache.commons.a.c.a.j j2) {
        this.a = new k(j2, this.a.c(), this.a.d(), this.a.e());
    }

    public void a(af af2) {
        this.a = new k(this.a.b(), af2, this.a.d(), this.a.e());
    }

    public void a(int n2) {
        this.a = new k(this.a.b(), this.a.c(), this.a.d(), n2);
    }
}

