/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a.d.b;

import java.io.Serializable;
import java.util.Comparator;

final class e
implements Serializable,
Comparator {
    private static final long b = 4582133183775373862L;
    static final e a = new e();

    private e() {
    }

    public int a(CharSequence charSequence, CharSequence charSequence2) {
        int n2 = charSequence.length();
        int n3 = charSequence2.length();
        int n4 = Math.min(n2, n3);
        for (int i2 = 0; i2 < n4; ++i2) {
            char c2;
            char c3 = charSequence.charAt(i2);
            if (c3 == (c2 = charSequence2.charAt(i2)) || (c3 = Character.toUpperCase(c3)) == (c2 = Character.toUpperCase(c2)) || (c3 = Character.toLowerCase(c3)) == (c2 = Character.toLowerCase(c2))) continue;
            return c3 - c2;
        }
        return n2 - n3;
    }

    private Object a() {
        return a;
    }

    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((CharSequence)object, (CharSequence)object2);
    }
}

