/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.a.c.a;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Pattern;
import org.apache.commons.a.c.a.d;
import org.apache.commons.a.c.a.e;
import org.apache.commons.a.c.a.h;
import org.apache.commons.a.c.a.j;

public class b {
    private static final Map a = new EnumMap(j.class);
    private static final String b = "org/apache/commons/codec/language/bm/lang.txt";
    private final e c;
    private final List d;

    public static b a(j j2) {
        return (b)a.get((Object)j2);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static b a(String string, e e2) {
        ArrayList<d> arrayList = new ArrayList<d>();
        InputStream inputStream = b.class.getClassLoader().getResourceAsStream(string);
        if (inputStream == null) {
            throw new IllegalStateException("Unable to resolve required resource:org/apache/commons/codec/language/bm/lang.txt");
        }
        Scanner scanner = new Scanner(inputStream, "UTF-8");
        try {
            boolean bl2 = false;
            while (scanner.hasNextLine()) {
                String string2;
                String string3 = string2 = scanner.nextLine();
                if (bl2) {
                    if (!string3.endsWith("*/")) continue;
                    bl2 = false;
                    continue;
                }
                if (string3.startsWith("/*")) {
                    bl2 = true;
                    continue;
                }
                int n2 = string3.indexOf("//");
                if (n2 >= 0) {
                    string3 = string3.substring(0, n2);
                }
                if ((string3 = string3.trim()).length() == 0) continue;
                String[] arrstring = string3.split("\\s+");
                if (arrstring.length != 3) {
                    throw new IllegalArgumentException("Malformed line '" + string2 + "' in language resource '" + string + "'");
                }
                Pattern pattern = Pattern.compile(arrstring[0]);
                String[] arrstring2 = arrstring[1].split("\\+");
                boolean bl3 = arrstring[2].equals("true");
                arrayList.add(new d(pattern, new HashSet<String>(Arrays.asList(arrstring2)), bl3, null));
            }
        }
        finally {
            scanner.close();
        }
        return new b(arrayList, e2);
    }

    private b(List list, e e2) {
        this.d = Collections.unmodifiableList(list);
        this.c = e2;
    }

    public String a(String string) {
        h h2 = this.b(string);
        return h2.c() ? h2.a() : "any";
    }

    public h b(String string) {
        String string2 = string.toLowerCase(Locale.ENGLISH);
        HashSet hashSet = new HashSet(this.c.a());
        for (d d2 : this.d) {
            if (!d2.a(string2)) continue;
            if (org.apache.commons.a.c.a.d.a(d2)) {
                hashSet.retainAll(org.apache.commons.a.c.a.d.b(d2));
                continue;
            }
            hashSet.removeAll(org.apache.commons.a.c.a.d.b(d2));
        }
        h h2 = h.a(hashSet);
        return h2.equals(e.b) ? e.c : h2;
    }

    static {
        for (j j2 : j.values()) {
            a.put(j2, org.apache.commons.a.c.a.b.a(b, e.a(j2)));
        }
    }
}

