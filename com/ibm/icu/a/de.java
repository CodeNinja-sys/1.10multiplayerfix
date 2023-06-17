/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a;

import com.ibm.icu.a.dd;
import java.util.Comparator;

class de
implements Comparator {
    final /* synthetic */ dd a;

    de(dd dd2) {
        this.a = dd2;
    }

    public int a(String string, String string2) {
        return string.compareTo(string2);
    }

    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((String)object, (String)object2);
    }
}

