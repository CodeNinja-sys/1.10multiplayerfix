/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.a.c;

import org.apache.commons.a.c.d;
import org.apache.commons.a.h;
import org.apache.commons.a.j;

public class b
implements j {
    private final d a = new d();

    public String a(String string) {
        return this.a.b(string);
    }

    @Override
    public Object b(Object object) {
        if (!(object instanceof String)) {
            throw new h("Parameter supplied to Caverphone encode is not of type java.lang.String");
        }
        return this.a((String)object);
    }

    @Override
    public String b(String string) {
        return this.a(string);
    }

    public boolean a(String string, String string2) {
        return this.a(string).equals(this.a(string2));
    }
}

