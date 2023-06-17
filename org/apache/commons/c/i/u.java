/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.c.i;

import java.util.Calendar;
import org.apache.commons.c.i.x;

class u
implements x {
    private final char a;

    u(char c2) {
        this.a = c2;
    }

    @Override
    public int a() {
        return 1;
    }

    @Override
    public void a(StringBuffer stringBuffer, Calendar calendar) {
        stringBuffer.append(this.a);
    }
}

