/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.i;

import org.apache.logging.log4j.core.e.d;
import org.apache.logging.log4j.core.e.k;
import org.apache.logging.log4j.core.h;
import org.apache.logging.log4j.core.i.bc;

public final class ay
extends bc {
    private ay(String[] arrstring) {
        super("RootThrowable", "throwable", arrstring);
    }

    public static ay a(String[] arrstring) {
        return new ay(arrstring);
    }

    @Override
    public void a(h h2, StringBuilder stringBuilder) {
        Throwable throwable;
        k k2 = null;
        if (h2 instanceof d) {
            k2 = ((d)h2).n();
        }
        if ((throwable = h2.h()) != null && this.b.e()) {
            if (k2 == null) {
                super.a(h2, stringBuilder);
                return;
            }
            String string = k2.a(this.b.c());
            int n2 = stringBuilder.length();
            if (n2 > 0 && !Character.isWhitespace(stringBuilder.charAt(n2 - 1))) {
                stringBuilder.append(" ");
            }
            if (!this.b.d() || !org.apache.logging.log4j.core.d.k.e.equals(this.b.b())) {
                StringBuilder stringBuilder2 = new StringBuilder();
                String[] arrstring = string.split(org.apache.logging.log4j.core.d.k.e);
                int n3 = this.b.a(arrstring.length) - 1;
                for (int i2 = 0; i2 <= n3; ++i2) {
                    stringBuilder2.append(arrstring[i2]);
                    if (i2 >= n3) continue;
                    stringBuilder2.append(this.b.b());
                }
                stringBuilder.append(stringBuilder2.toString());
            } else {
                stringBuilder.append(string);
            }
        }
    }
}

