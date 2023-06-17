/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.c.i;

import java.util.Calendar;
import org.apache.commons.c.i.v;

class ai
implements v {
    static final ai a = new ai();

    ai() {
    }

    @Override
    public int a() {
        return 2;
    }

    @Override
    public void a(StringBuffer stringBuffer, Calendar calendar) {
        this.a(stringBuffer, calendar.get(2) + 1);
    }

    @Override
    public final void a(StringBuffer stringBuffer, int n2) {
        if (n2 < 10) {
            stringBuffer.append((char)(n2 + 48));
        } else {
            stringBuffer.append((char)(n2 / 10 + 48));
            stringBuffer.append((char)(n2 % 10 + 48));
        }
    }
}

