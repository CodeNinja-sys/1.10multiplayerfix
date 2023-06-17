/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a.d;

import io.netty.c.a.d.am;
import io.netty.c.a.d.c;
import io.netty.c.a.d.e;
import io.netty.c.a.d.g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public final class bx {
    public static String a(String string, String string2) {
        return bx.a((c)new g(string, string2));
    }

    public static String a(c c2) {
        if (c2 == null) {
            throw new NullPointerException("cookie");
        }
        StringBuilder stringBuilder = e.a();
        e.a(stringBuilder, c2.a(), c2.b());
        if (c2.f() != Long.MIN_VALUE) {
            if (c2.g() == 0) {
                e.b(stringBuilder, "Expires", am.a().format(new Date(System.currentTimeMillis() + c2.f() * 1000L)));
            } else {
                e.a(stringBuilder, "Max-Age", c2.f());
            }
        }
        if (c2.d() != null) {
            if (c2.g() > 0) {
                e.a(stringBuilder, "Path", c2.d());
            } else {
                e.b(stringBuilder, "Path", c2.d());
            }
        }
        if (c2.c() != null) {
            if (c2.g() > 0) {
                e.a(stringBuilder, "Domain", c2.c());
            } else {
                e.b(stringBuilder, "Domain", c2.c());
            }
        }
        if (c2.h()) {
            stringBuilder.append("Secure");
            stringBuilder.append(';');
            stringBuilder.append(' ');
        }
        if (c2.i()) {
            stringBuilder.append("HTTPOnly");
            stringBuilder.append(';');
            stringBuilder.append(' ');
        }
        if (c2.g() >= 1) {
            if (c2.e() != null) {
                e.a(stringBuilder, "Comment", c2.e());
            }
            e.a(stringBuilder, "Version", 1L);
            if (c2.j() != null) {
                e.c(stringBuilder, "CommentURL", c2.j());
            }
            if (!c2.l().isEmpty()) {
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
            if (c2.k()) {
                stringBuilder.append("Discard");
                stringBuilder.append(';');
                stringBuilder.append(' ');
            }
        }
        return e.a(stringBuilder);
    }

    public static List a(c ... arrc) {
        if (arrc == null) {
            throw new NullPointerException("cookies");
        }
        ArrayList<String> arrayList = new ArrayList<String>(arrc.length);
        for (c c2 : arrc) {
            if (c2 == null) break;
            arrayList.add(bx.a(c2));
        }
        return arrayList;
    }

    public static List a(Collection collection) {
        c c2;
        if (collection == null) {
            throw new NullPointerException("cookies");
        }
        ArrayList<String> arrayList = new ArrayList<String>(collection.size());
        Iterator iterator = collection.iterator();
        while (iterator.hasNext() && (c2 = (c)iterator.next()) != null) {
            arrayList.add(bx.a(c2));
        }
        return arrayList;
    }

    public static List a(Iterable iterable) {
        c c2;
        if (iterable == null) {
            throw new NullPointerException("cookies");
        }
        ArrayList<String> arrayList = new ArrayList<String>();
        Iterator iterator = iterable.iterator();
        while (iterator.hasNext() && (c2 = (c)iterator.next()) != null) {
            arrayList.add(bx.a(c2));
        }
        return arrayList;
    }

    private bx() {
    }
}

