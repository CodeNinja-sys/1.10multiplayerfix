/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.a.c;

import org.apache.commons.a.c.p;
import org.apache.commons.a.h;
import org.apache.commons.a.j;

public class n
implements j {
    public static final String a = "01360240043788015936020505";
    private static final char[] c = "01360240043788015936020505".toCharArray();
    private final char[] d;
    public static final n b = new n();

    public n() {
        this.d = c;
    }

    public n(char[] arrc) {
        this.d = new char[arrc.length];
        System.arraycopy(arrc, 0, this.d, 0, arrc.length);
    }

    public n(String string) {
        this.d = string.toCharArray();
    }

    public int a(String string, String string2) {
        return p.a(this, string, string2);
    }

    @Override
    public Object b(Object object) {
        if (!(object instanceof String)) {
            throw new h("Parameter supplied to RefinedSoundex encode is not of type java.lang.String");
        }
        return this.a((String)object);
    }

    @Override
    public String b(String string) {
        return this.a(string);
    }

    char a(char c2) {
        if (!Character.isLetter(c2)) {
            return '\u0000';
        }
        return this.d[Character.toUpperCase(c2) - 65];
    }

    public String a(String string) {
        if (string == null) {
            return null;
        }
        if ((string = p.a(string)).length() == 0) {
            return string;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string.charAt(0));
        char c2 = '*';
        for (int i2 = 0; i2 < string.length(); ++i2) {
            char c3 = this.a(string.charAt(i2));
            if (c3 == c2) continue;
            if (c3 != '\u0000') {
                stringBuilder.append(c3);
            }
            c2 = c3;
        }
        return stringBuilder.toString();
    }
}

