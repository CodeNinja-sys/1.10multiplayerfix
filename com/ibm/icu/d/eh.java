/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.d;

import com.ibm.icu.d.ej;
import com.ibm.icu.util.dn;
import com.ibm.icu.util.dr;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;

public final class eh {
    private final String c;
    private final String d;
    private final String e;
    private final String f;
    static Map a = new HashMap();
    static ej b = new ej(null);

    public eh(String string, String string2, String string3, String string4) {
        this.c = string;
        this.d = string2;
        this.e = string3;
        this.f = string4;
    }

    public static eh a(dn dn2) {
        return b.a(dn2);
    }

    public static eh a(Locale locale) {
        return eh.a(dn.a(locale));
    }

    public static eh a() {
        return eh.a(dn.a(dr.b));
    }

    public String a(Object ... arrobject) {
        return this.a(Arrays.asList(arrobject));
    }

    public String a(Collection collection) {
        Iterator iterator = collection.iterator();
        int n2 = collection.size();
        switch (n2) {
            case 0: {
                return "";
            }
            case 1: {
                return iterator.next().toString();
            }
            case 2: {
                return this.a(this.c, iterator.next(), iterator.next());
            }
        }
        String string = iterator.next().toString();
        string = this.a(this.d, (Object)string, iterator.next());
        n2 -= 3;
        while (n2 > 0) {
            string = this.a(this.e, (Object)string, iterator.next());
            --n2;
        }
        return this.a(this.f, (Object)string, iterator.next());
    }

    private String a(String string, Object object, Object object2) {
        int n2 = string.indexOf("{0}");
        int n3 = string.indexOf("{1}");
        if (n2 < 0 || n3 < 0) {
            throw new IllegalArgumentException("Missing {0} or {1} in pattern " + string);
        }
        if (n2 < n3) {
            return string.substring(0, n2) + object + string.substring(n2 + 3, n3) + object2 + string.substring(n3 + 3);
        }
        return string.substring(0, n3) + object2 + string.substring(n3 + 3, n2) + object + string.substring(n2 + 3);
    }

    static void a(String string, String ... arrstring) {
        a.put(new dn(string), new eh(arrstring[0], arrstring[1], arrstring[2], arrstring[3]));
    }
}

