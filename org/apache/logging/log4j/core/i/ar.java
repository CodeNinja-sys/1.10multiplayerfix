/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.i;

import org.apache.logging.log4j.core.h;
import org.apache.logging.log4j.core.i.ac;
import org.apache.logging.log4j.core.i.t;

public class ar {
    private final ac a;
    private final t b;

    public ar(ac ac2, t t2) {
        this.a = ac2;
        this.b = t2;
    }

    public void a(h h2, StringBuilder stringBuilder) {
        int n2 = stringBuilder.length();
        this.a.a(h2, stringBuilder);
        this.b.a(n2, stringBuilder);
    }

    public ac a() {
        return this.a;
    }

    public t b() {
        return this.b;
    }

    public boolean c() {
        return this.a.cO_();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString());
        stringBuilder.append("[converter=");
        stringBuilder.append(this.a);
        stringBuilder.append(", field=");
        stringBuilder.append(this.b);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

