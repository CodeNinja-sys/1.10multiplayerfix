/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.c.i;

import java.util.Calendar;
import org.apache.commons.c.i.v;

class ae
implements v {
    private final v a;

    ae(v v2) {
        this.a = v2;
    }

    @Override
    public int a() {
        return this.a.a();
    }

    @Override
    public void a(StringBuffer stringBuffer, Calendar calendar) {
        int n2 = calendar.get(11);
        if (n2 == 0) {
            n2 = calendar.getMaximum(11) + 1;
        }
        this.a.a(stringBuffer, n2);
    }

    @Override
    public void a(StringBuffer stringBuffer, int n2) {
        this.a.a(stringBuffer, n2);
    }
}

