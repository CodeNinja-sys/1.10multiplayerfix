/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i.d;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import org.apache.a.i.d.ab;

public class ac {
    private static final int a = 256;
    private final ab b;

    ac(ab ab2) {
        this.b = ab2;
    }

    public void a(Reader reader) {
        ArrayList<String> arrayList = new ArrayList<String>();
        ArrayList<String> arrayList2 = new ArrayList<String>();
        BufferedReader bufferedReader = new BufferedReader(reader);
        StringBuilder stringBuilder = new StringBuilder(256);
        boolean bl2 = true;
        while (bl2) {
            boolean bl3;
            bl2 = this.a(bufferedReader, stringBuilder);
            String string = stringBuilder.toString();
            if (string.length() == 0 || string.startsWith("//")) continue;
            if (string.startsWith(".")) {
                string = string.substring(1);
            }
            if (bl3 = string.startsWith("!")) {
                string = string.substring(1);
            }
            if (bl3) {
                arrayList2.add(string);
                continue;
            }
            arrayList.add(string);
        }
        this.b.a(arrayList);
        this.b.b(arrayList2);
    }

    private boolean a(Reader reader, StringBuilder stringBuilder) {
        char c2;
        int n2;
        stringBuilder.setLength(0);
        boolean bl2 = false;
        while ((n2 = reader.read()) != -1 && (c2 = (char)n2) != '\n') {
            if (Character.isWhitespace(c2)) {
                bl2 = true;
            }
            if (!bl2) {
                stringBuilder.append(c2);
            }
            if (stringBuilder.length() <= 256) continue;
            throw new IOException("Line too long");
        }
        return n2 != -1;
    }
}

