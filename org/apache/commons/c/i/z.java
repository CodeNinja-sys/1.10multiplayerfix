/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.c.i;

import java.util.Calendar;
import org.apache.commons.c.i.x;

class z
implements x {
    private final int a;
    private final String[] b;

    z(int n2, String[] arrstring) {
        this.a = n2;
        this.b = arrstring;
    }

    @Override
    public int a() {
        int n2 = 0;
        int n3 = this.b.length;
        while (--n3 >= 0) {
            int n4 = this.b[n3].length();
            if (n4 <= n2) continue;
            n2 = n4;
        }
        return n2;
    }

    @Override
    public void a(StringBuffer stringBuffer, Calendar calendar) {
        stringBuffer.append(this.b[calendar.get(this.a)]);
    }
}

