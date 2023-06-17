/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.a.c.a;

import java.io.InputStream;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import org.apache.commons.a.c.a.f;
import org.apache.commons.a.c.a.g;
import org.apache.commons.a.c.a.h;
import org.apache.commons.a.c.a.j;

public class e {
    public static final String a = "any";
    private static final Map d = new EnumMap(j.class);
    private final Set e;
    public static final h b;
    public static final h c;

    public static e a(j j2) {
        return (e)d.get((Object)j2);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static e a(String string) {
        HashSet<String> hashSet = new HashSet<String>();
        InputStream inputStream = e.class.getClassLoader().getResourceAsStream(string);
        if (inputStream == null) {
            throw new IllegalArgumentException("Unable to resolve required resource: " + string);
        }
        Scanner scanner = new Scanner(inputStream, "UTF-8");
        try {
            boolean bl2 = false;
            while (scanner.hasNextLine()) {
                String string2 = scanner.nextLine().trim();
                if (bl2) {
                    if (!string2.endsWith("*/")) continue;
                    bl2 = false;
                    continue;
                }
                if (string2.startsWith("/*")) {
                    bl2 = true;
                    continue;
                }
                if (string2.length() <= 0) continue;
                hashSet.add(string2);
            }
        }
        finally {
            scanner.close();
        }
        return new e(Collections.unmodifiableSet(hashSet));
    }

    private static String b(j j2) {
        return String.format("org/apache/commons/codec/language/bm/%s_languages.txt", j2.a());
    }

    private e(Set set) {
        this.e = set;
    }

    public Set a() {
        return this.e;
    }

    static {
        for (j j2 : j.values()) {
            d.put(j2, org.apache.commons.a.c.a.e.a(org.apache.commons.a.c.a.e.b(j2)));
        }
        b = new f();
        c = new g();
    }
}

