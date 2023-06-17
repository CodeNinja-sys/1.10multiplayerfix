/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.c.i;

import java.util.Calendar;
import org.apache.commons.c.i.v;

class aj
implements v {
    private final int a;

    aj(int n2) {
        this.a = n2;
    }

    @Override
    public int a() {
        return 4;
    }

    @Override
    public void a(StringBuffer stringBuffer, Calendar calendar) {
        this.a(stringBuffer, calendar.get(this.a));
    }

    @Override
    public final void a(StringBuffer stringBuffer, int n2) {
        if (n2 < 10) {
            stringBuffer.append((char)(n2 + 48));
        } else if (n2 < 100) {
            stringBuffer.append((char)(n2 / 10 + 48));
            stringBuffer.append((char)(n2 % 10 + 48));
        } else {
            stringBuffer.append(Integer.toString(n2));
        }
    }
}

