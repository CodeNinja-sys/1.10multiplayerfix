/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.c.i;

import java.util.Calendar;
import org.apache.commons.c.i.j;
import org.apache.commons.c.i.q;

class p
extends q {
    private final int a;

    p(int n2) {
        super(null);
        this.a = n2;
    }

    @Override
    boolean a() {
        return true;
    }

    @Override
    boolean a(j j2, StringBuilder stringBuilder) {
        if (j2.e()) {
            stringBuilder.append("(\\p{Nd}{").append(j2.f()).append("}+)");
        } else {
            stringBuilder.append("(\\p{Nd}++)");
        }
        return true;
    }

    @Override
    void a(j j2, Calendar calendar, String string) {
        calendar.set(this.a, this.a(Integer.parseInt(string)));
    }

    int a(int n2) {
        return n2;
    }
}

