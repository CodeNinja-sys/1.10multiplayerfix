/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.c.i;

import java.util.Calendar;
import org.apache.commons.c.i.x;

class ac
implements x {
    static final ac a = new ac(true);
    static final ac b = new ac(false);
    final boolean c;

    ac(boolean bl2) {
        this.c = bl2;
    }

    @Override
    public int a() {
        return 5;
    }

    @Override
    public void a(StringBuffer stringBuffer, Calendar calendar) {
        int n2 = calendar.get(15) + calendar.get(16);
        if (n2 < 0) {
            stringBuffer.append('-');
            n2 = -n2;
        } else {
            stringBuffer.append('+');
        }
        int n3 = n2 / 3600000;
        stringBuffer.append((char)(n3 / 10 + 48));
        stringBuffer.append((char)(n3 % 10 + 48));
        if (this.c) {
            stringBuffer.append(':');
        }
        int n4 = n2 / 60000 - 60 * n3;
        stringBuffer.append((char)(n4 / 10 + 48));
        stringBuffer.append((char)(n4 % 10 + 48));
    }
}

