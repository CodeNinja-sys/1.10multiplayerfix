/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.c.h.a;

import java.io.Writer;
import java.util.Arrays;
import java.util.EnumSet;
import org.apache.commons.c.h.a.b;
import org.apache.commons.c.h.a.i;

public class h
extends b {
    private final EnumSet a;

    public h(i ... arri) {
        this.a = arri.length > 0 ? EnumSet.copyOf(Arrays.asList(arri)) : EnumSet.copyOf(Arrays.asList(new i[]{i.a}));
    }

    public boolean a(i i2) {
        return this.a == null ? false : this.a.contains((Object)i2);
    }

    @Override
    public int a(CharSequence charSequence, int n2, Writer writer) {
        int n3 = charSequence.length();
        if (charSequence.charAt(n2) == '&' && n2 < n3 - 2 && charSequence.charAt(n2 + 1) == '#') {
            int n4;
            boolean bl2;
            int n5;
            int n6 = n2 + 2;
            boolean bl3 = false;
            char c2 = charSequence.charAt(n6);
            if (c2 == 'x' || c2 == 'X') {
                bl3 = true;
                if (++n6 == n3) {
                    return 0;
                }
            }
            for (n5 = n6; n5 < n3 && (charSequence.charAt(n5) >= '0' && charSequence.charAt(n5) <= '9' || charSequence.charAt(n5) >= 'a' && charSequence.charAt(n5) <= 'f' || charSequence.charAt(n5) >= 'A' && charSequence.charAt(n5) <= 'F'); ++n5) {
            }
            boolean bl4 = bl2 = n5 != n3 && charSequence.charAt(n5) == ';';
            if (!bl2) {
                if (this.a(i.a)) {
                    return 0;
                }
                if (this.a(i.c)) {
                    throw new IllegalArgumentException("Semi-colon required at end of numeric entity");
                }
            }
            try {
                n4 = bl3 ? Integer.parseInt(charSequence.subSequence(n6, n5).toString(), 16) : Integer.parseInt(charSequence.subSequence(n6, n5).toString(), 10);
            }
            catch (NumberFormatException numberFormatException) {
                return 0;
            }
            if (n4 > 65535) {
                char[] arrc = Character.toChars(n4);
                writer.write(arrc[0]);
                writer.write(arrc[1]);
            } else {
                writer.write(n4);
            }
            return 2 + n5 - n6 + (bl3 ? 1 : 0) + (bl2 ? 1 : 0);
        }
        return 0;
    }
}

