/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.c.h.a;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Locale;
import org.apache.commons.c.h.a.a;

public abstract class b {
    public abstract int a(CharSequence var1, int var2, Writer var3);

    public final String a(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        try {
            StringWriter stringWriter = new StringWriter(charSequence.length() * 2);
            this.a(charSequence, stringWriter);
            return stringWriter.toString();
        }
        catch (IOException iOException) {
            throw new RuntimeException(iOException);
        }
    }

    public final void a(CharSequence charSequence, Writer writer) {
        if (writer == null) {
            throw new IllegalArgumentException("The Writer must not be null");
        }
        if (charSequence == null) {
            return;
        }
        int n2 = 0;
        int n3 = charSequence.length();
        while (n2 < n3) {
            int n4 = this.a(charSequence, n2, writer);
            if (n4 == 0) {
                char[] arrc = Character.toChars(Character.codePointAt(charSequence, n2));
                writer.write(arrc);
                n2 += arrc.length;
                continue;
            }
            for (int i2 = 0; i2 < n4; ++i2) {
                n2 += Character.charCount(Character.codePointAt(charSequence, n2));
            }
        }
    }

    public final b a(b ... arrb) {
        b[] arrb2 = new b[arrb.length + 1];
        arrb2[0] = this;
        System.arraycopy(arrb, 0, arrb2, 1, arrb.length);
        return new a(arrb2);
    }

    public static String a(int n2) {
        return Integer.toHexString(n2).toUpperCase(Locale.ENGLISH);
    }
}

