/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.i;

import java.util.List;
import org.apache.logging.log4j.core.i.ak;
import org.apache.logging.log4j.core.i.ao;

class an
extends ak {
    private final ao[] a;

    public an(List list) {
        if (list.size() == 0) {
            throw new IllegalArgumentException("fragments must have at least one element");
        }
        this.a = new ao[list.size()];
        list.toArray(this.a);
    }

    @Override
    public String b(String string) {
        int n2 = 0;
        StringBuilder stringBuilder = new StringBuilder(string);
        for (int i2 = 0; i2 < this.a.length - 1 && n2 < string.length(); ++i2) {
            n2 = this.a[i2].a(stringBuilder, n2);
        }
        ao ao2 = this.a[this.a.length - 1];
        while (n2 < string.length() && n2 >= 0) {
            n2 = ao2.a(stringBuilder, n2);
        }
        return stringBuilder.toString();
    }
}

