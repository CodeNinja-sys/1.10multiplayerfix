/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.c.i;

import java.util.Calendar;
import org.apache.commons.c.i.j;
import org.apache.commons.c.i.p;

final class k
extends p {
    k(int n2) {
        super(n2);
    }

    @Override
    void a(j j2, Calendar calendar, String string) {
        int n2 = Integer.parseInt(string);
        if (n2 < 100) {
            n2 = j.a(j2, n2);
        }
        calendar.set(1, n2);
    }
}

