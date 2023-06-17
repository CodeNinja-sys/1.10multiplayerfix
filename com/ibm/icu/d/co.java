/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.d;

import com.ibm.icu.d.en;
import com.ibm.icu.d.gq;
import com.ibm.icu.util.ao;
import com.ibm.icu.util.dn;
import java.text.FieldPosition;
import java.text.ParsePosition;

class co
extends en {
    static final long a = -931679363692504634L;
    private gq c;

    public co(dn dn2) {
        this.c = gq.d(dn2.a());
    }

    public StringBuffer format(Object object, StringBuffer stringBuffer, FieldPosition fieldPosition) {
        try {
            ao ao2 = (ao)object;
            this.c.a(ao2.a());
            return this.c.format(ao2.b(), stringBuffer, fieldPosition);
        }
        catch (ClassCastException classCastException) {
            throw new IllegalArgumentException("Invalid type: " + object.getClass().getName());
        }
    }

    public Object parseObject(String string, ParsePosition parsePosition) {
        return this.c.a((CharSequence)string, parsePosition);
    }
}

