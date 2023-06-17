/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.d;

import com.ibm.icu.a.b.a;
import com.ibm.icu.d.kv;
import com.ibm.icu.util.dn;
import java.text.FieldPosition;
import java.text.ParsePosition;
import java.util.Date;

public abstract class dx
extends kv {
    private static final long a = -2076961954727774282L;

    public static dx b(dn dn2) {
        return com.ibm.icu.a.b.a.a(dn2);
    }

    protected dx() {
    }

    protected dx(dn dn2) {
        this.a(dn2, dn2);
    }

    public abstract StringBuffer format(Object var1, StringBuffer var2, FieldPosition var3);

    public Object parseObject(String string, ParsePosition parsePosition) {
        throw new UnsupportedOperationException();
    }

    public abstract String a(Date var1);

    public abstract String a(long var1);

    public abstract String a(long var1, long var3);
}

