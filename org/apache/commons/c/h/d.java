/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.c.h;

import java.util.Formattable;
import java.util.Formatter;
import org.apache.commons.c.aa;
import org.apache.commons.c.ao;

public class d {
    private static final String a = "%s";

    public static String a(Formattable formattable) {
        return String.format(a, formattable);
    }

    public static Formatter a(CharSequence charSequence, Formatter formatter, int n2, int n3, int n4) {
        return d.a(charSequence, formatter, n2, n3, n4, ' ', null);
    }

    public static Formatter a(CharSequence charSequence, Formatter formatter, int n2, int n3, int n4, char c2) {
        return d.a(charSequence, formatter, n2, n3, n4, c2, null);
    }

    public static Formatter a(CharSequence charSequence, Formatter formatter, int n2, int n3, int n4, CharSequence charSequence2) {
        return d.a(charSequence, formatter, n2, n3, n4, ' ', charSequence2);
    }

    public static Formatter a(CharSequence charSequence, Formatter formatter, int n2, int n3, int n4, char c2, CharSequence charSequence2) {
        ao.a(charSequence2 == null || n4 < 0 || charSequence2.length() <= n4, "Specified ellipsis '%1$s' exceeds precision of %2$s", new Object[]{charSequence2, n4});
        StringBuilder stringBuilder = new StringBuilder(charSequence);
        if (n4 >= 0 && n4 < charSequence.length()) {
            CharSequence charSequence3 = (CharSequence)aa.a((Object)charSequence2, (Object)"");
            stringBuilder.replace(n4 - charSequence3.length(), charSequence.length(), charSequence3.toString());
        }
        boolean bl2 = (n2 & 1) == 1;
        for (int i2 = stringBuilder.length(); i2 < n3; ++i2) {
            stringBuilder.insert(bl2 ? i2 : 0, c2);
        }
        formatter.format(stringBuilder.toString(), new Object[0]);
        return formatter;
    }
}

