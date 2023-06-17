/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.c.h.a;

import java.io.Writer;
import java.util.HashMap;
import org.apache.commons.c.h.a.b;

public class f
extends b {
    private final HashMap a = new HashMap();
    private final int b;
    private final int c;

    public f(CharSequence[] ... arrcharSequence) {
        int n2 = Integer.MAX_VALUE;
        int n3 = 0;
        if (arrcharSequence != null) {
            for (CharSequence[] arrcharSequence2 : arrcharSequence) {
                this.a.put(arrcharSequence2[0].toString(), arrcharSequence2[1]);
                int n4 = arrcharSequence2[0].length();
                if (n4 < n2) {
                    n2 = n4;
                }
                if (n4 <= n3) continue;
                n3 = n4;
            }
        }
        this.b = n2;
        this.c = n3;
    }

    @Override
    public int a(CharSequence charSequence, int n2, Writer writer) {
        int n3 = this.c;
        if (n2 + this.c > charSequence.length()) {
            n3 = charSequence.length() - n2;
        }
        for (int i2 = n3; i2 >= this.b; --i2) {
            CharSequence charSequence2 = charSequence.subSequence(n2, n2 + i2);
            CharSequence charSequence3 = (CharSequence)this.a.get(charSequence2.toString());
            if (charSequence3 == null) continue;
            writer.write(charSequence3.toString());
            return i2;
        }
        return 0;
    }
}

