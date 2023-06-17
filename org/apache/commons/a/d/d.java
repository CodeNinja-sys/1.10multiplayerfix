/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.a.d;

import java.nio.charset.Charset;
import org.apache.commons.a.a.m;
import org.apache.commons.a.f;

abstract class d {
    protected static final char a = '?';
    protected static final String b = "?=";
    protected static final String c = "=?";

    d() {
    }

    protected String b(String string, Charset charset) {
        if (string == null) {
            return null;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(c);
        stringBuilder.append(charset);
        stringBuilder.append('?');
        stringBuilder.append(this.a());
        stringBuilder.append('?');
        byte[] arrby = this.a(string.getBytes(charset));
        stringBuilder.append(m.b(arrby));
        stringBuilder.append(b);
        return stringBuilder.toString();
    }

    protected String b(String string, String string2) {
        if (string == null) {
            return null;
        }
        return this.b(string, Charset.forName(string2));
    }

    protected String c(String string) {
        if (string == null) {
            return null;
        }
        if (!string.startsWith(c) || !string.endsWith(b)) {
            throw new f("RFC 1522 violation: malformed encoded content");
        }
        int n2 = string.length() - 2;
        int n3 = 2;
        int n4 = string.indexOf(63, n3);
        if (n4 == n2) {
            throw new f("RFC 1522 violation: charset token not found");
        }
        String string2 = string.substring(n3, n4);
        if (string2.equals("")) {
            throw new f("RFC 1522 violation: charset not specified");
        }
        n3 = n4 + 1;
        if ((n4 = string.indexOf(63, n3)) == n2) {
            throw new f("RFC 1522 violation: encoding token not found");
        }
        String string3 = string.substring(n3, n4);
        if (!this.a().equalsIgnoreCase(string3)) {
            throw new f("This codec cannot decode " + string3 + " encoded content");
        }
        n3 = n4 + 1;
        n4 = string.indexOf(63, n3);
        byte[] arrby = m.b(string.substring(n3, n4));
        arrby = this.b(arrby);
        return new String(arrby, string2);
    }

    protected abstract String a();

    protected abstract byte[] a(byte[] var1);

    protected abstract byte[] b(byte[] var1);
}

