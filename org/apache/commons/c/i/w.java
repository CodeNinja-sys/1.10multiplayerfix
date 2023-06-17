/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.c.i;

import java.util.Calendar;
import org.apache.commons.c.ao;
import org.apache.commons.c.i.v;

class w
implements v {
    private final int a;
    private final int b;

    w(int n2, int n3) {
        if (n3 < 3) {
            throw new IllegalArgumentException();
        }
        this.a = n2;
        this.b = n3;
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
        if (n2 < 100) {
            int n3 = this.b;
            while (--n3 >= 2) {
                stringBuffer.append('0');
            }
            stringBuffer.append((char)(n2 / 10 + 48));
            stringBuffer.append((char)(n2 % 10 + 48));
        } else {
            int n4;
            if (n2 < 1000) {
                n4 = 3;
            } else {
                ao.a(n2 > -1, "Negative values should not be possible", (long)n2);
                n4 = Integer.toString(n2).length();
            }
            int n5 = this.b;
            while (--n5 >= n4) {
                stringBuffer.append('0');
            }
            stringBuffer.append(Integer.toString(n2));
        }
    }
}

