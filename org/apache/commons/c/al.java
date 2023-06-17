/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.c;

import java.io.Writer;
import org.apache.commons.c.am;
import org.apache.commons.c.h.a.b;

class al
extends b {
    private static final char a = ',';
    private static final char b = '\"';
    private static final String c = String.valueOf('\"');
    private static final char[] d = new char[]{',', '\"', '\r', '\n'};

    al() {
    }

    @Override
    public int a(CharSequence charSequence, int n2, Writer writer) {
        if (n2 != 0) {
            throw new IllegalStateException("CsvUnescaper should never reach the [1] index");
        }
        if (charSequence.charAt(0) != '\"' || charSequence.charAt(charSequence.length() - 1) != '\"') {
            writer.write(charSequence.toString());
            return Character.codePointCount(charSequence, 0, charSequence.length());
        }
        String string = charSequence.subSequence(1, charSequence.length() - 1).toString();
        if (am.b((CharSequence)string, d)) {
            writer.write(am.e(string, c + c, c));
        } else {
            writer.write(charSequence.toString());
        }
        return Character.codePointCount(charSequence, 0, charSequence.length());
    }
}

