/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.c;

import java.io.Writer;
import org.apache.commons.c.am;
import org.apache.commons.c.h.a.b;

class ak
extends b {
    private static final char a = ',';
    private static final char b = '\"';
    private static final String c = String.valueOf('\"');
    private static final char[] d = new char[]{',', '\"', '\r', '\n'};

    ak() {
    }

    @Override
    public int a(CharSequence charSequence, int n2, Writer writer) {
        if (n2 != 0) {
            throw new IllegalStateException("CsvEscaper should never reach the [1] index");
        }
        if (am.e((CharSequence)charSequence.toString(), d)) {
            writer.write(charSequence.toString());
        } else {
            writer.write(34);
            writer.write(am.e(charSequence.toString(), c, c + c));
            writer.write(34);
        }
        return Character.codePointCount(charSequence, 0, charSequence.length());
    }
}

