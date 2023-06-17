/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.c.h.a;

import java.io.Writer;
import org.apache.commons.c.h.a.b;

public class j
extends b {
    @Override
    public int a(CharSequence charSequence, int n2, Writer writer) {
        int n3 = charSequence.length() - n2 - 1;
        StringBuilder stringBuilder = new StringBuilder();
        if (charSequence.charAt(n2) == '\\' && n3 > 0 && this.a(charSequence.charAt(n2 + 1))) {
            int n4 = n2 + 1;
            int n5 = n2 + 2;
            int n6 = n2 + 3;
            stringBuilder.append(charSequence.charAt(n4));
            if (n3 > 1 && this.a(charSequence.charAt(n5))) {
                stringBuilder.append(charSequence.charAt(n5));
                if (n3 > 2 && this.b(charSequence.charAt(n4)) && this.a(charSequence.charAt(n6))) {
                    stringBuilder.append(charSequence.charAt(n6));
                }
            }
            writer.write(Integer.parseInt(stringBuilder.toString(), 8));
            return 1 + stringBuilder.length();
        }
        return 0;
    }

    private boolean a(char c2) {
        return c2 >= '0' && c2 <= '7';
    }

    private boolean b(char c2) {
        return c2 >= '0' && c2 <= '3';
    }
}

