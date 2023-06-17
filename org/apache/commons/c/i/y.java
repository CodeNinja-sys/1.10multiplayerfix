/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.c.i;

import java.util.Calendar;
import org.apache.commons.c.i.x;

class y
implements x {
    private final String a;

    y(String string) {
        this.a = string;
    }

    @Override
    public int a() {
        return this.a.length();
    }

    @Override
    public void a(StringBuffer stringBuffer, Calendar calendar) {
        stringBuffer.append(this.a);
    }
}

