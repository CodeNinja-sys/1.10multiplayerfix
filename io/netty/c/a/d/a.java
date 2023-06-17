/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a.d;

import io.netty.c.a.d.c;
import io.netty.c.a.d.e;
import io.netty.c.a.d.g;
import java.util.Iterator;

public final class a {
    public static String a(String string, String string2) {
        return a.a((c)new g(string, string2));
    }

    public static String a(c c2) {
        if (c2 == null) {
            throw new NullPointerException("cookie");
        }
        StringBuilder stringBuilder = e.a();
        a.a(stringBuilder, c2);
        return e.a(stringBuilder);
    }

    public static String a(c ... arrc) {
        if (arrc == null) {
            throw new NullPointerException("cookies");
        }
        StringBuilder stringBuilder = e.a();
        for (c c2 : arrc) {
            if (c2 == null) break;
            a.a(stringBuilder, c2);
        }
        return e.a(stringBuilder);
    }

    public static String a(Iterable iterable) {
        c c2;
        if (iterable == null) {
            throw new NullPointerException("cookies");
        }
        StringBuilder stringBuilder = e.a();
        Iterator iterator = iterable.iterator();
        while (iterator.hasNext() && (c2 = (c)iterator.next()) != null) {
            a.a(stringBuilder, c2);
        }
        return e.a(stringBuilder);
    }

    private static void a(StringBuilder stringBuilder, c c2) {
        if (c2.g() >= 1) {
            e.a(stringBuilder, "$Version", 1L);
        }
        e.a(stringBuilder, c2.a(), c2.b());
        if (c2.d() != null) {
            e.a(stringBuilder, "$Path", c2.d());
        }
        if (c2.c() != null) {
            e.a(stringBuilder, "$Domain", c2.c());
        }
        if (c2.g() >= 1 && !c2.l().isEmpty()) {
            stringBuilder.append('$');
            stringBuilder.append("Port");
            stringBuilder.append('=');
            stringBuilder.append('\"');
            Iterator iterator = c2.l().iterator();
            while (iterator.hasNext()) {
                int n2 = (Integer)iterator.next();
                stringBuilder.append(n2);
                stringBuilder.append(',');
            }
            stringBuilder.setCharAt(stringBuilder.length() - 1, '\"');
            stringBuilder.append(';');
            stringBuilder.append(' ');
        }
    }

    private a() {
    }
}

