/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.c.i;

import java.util.Calendar;
import org.apache.commons.c.i.v;

class af
implements v {
    static final af a = new af();

    af() {
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
        stringBuffer.append((char)(n2 / 10 + 48));
        stringBuffer.append((char)(n2 % 10 + 48));
    }
}

