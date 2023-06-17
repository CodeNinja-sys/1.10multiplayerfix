/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.n;

import org.apache.a.n.g;
import org.apache.a.o.a;

public final class d
implements g {
    private final g a;
    private final g b;

    public d(g g2, g g3) {
        this.a = (g)org.apache.a.o.a.a(g2, "HTTP context");
        this.b = g3;
    }

    public Object a(String string) {
        Object object = this.a.a(string);
        if (object == null) {
            return this.b.a(string);
        }
        return object;
    }

    public Object b(String string) {
        return this.a.b(string);
    }

    public void a(String string, Object object) {
        this.a.a(string, object);
    }

    public g a() {
        return this.b;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[local: ").append(this.a);
        stringBuilder.append("defaults: ").append(this.b);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

