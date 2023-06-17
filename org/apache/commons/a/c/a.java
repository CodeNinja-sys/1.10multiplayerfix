/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.a.c;

import org.apache.commons.a.h;
import org.apache.commons.a.j;

public abstract class a
implements j {
    @Override
    public Object b(Object object) {
        if (!(object instanceof String)) {
            throw new h("Parameter supplied to Caverphone encode is not of type java.lang.String");
        }
        return this.b((String)object);
    }

    public boolean a(String string, String string2) {
        return this.b(string).equals(this.b(string2));
    }
}

