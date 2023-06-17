/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.compress.b;

import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class e {
    private final Map a = new HashMap();
    private final Map b;
    private final int c;
    private final int d;
    private final int e;
    private final int f;
    private final String g;

    public e(Map map, String string) {
        this.b = Collections.unmodifiableMap(map);
        int n2 = Integer.MIN_VALUE;
        int n3 = Integer.MAX_VALUE;
        int n4 = Integer.MIN_VALUE;
        int n5 = Integer.MAX_VALUE;
        for (Map.Entry entry : map.entrySet()) {
            String string2;
            int n6;
            int n7 = ((String)entry.getKey()).length();
            if (n7 > n2) {
                n2 = n7;
            }
            if (n7 < n3) {
                n3 = n7;
            }
            if ((n6 = (string2 = (String)entry.getValue()).length()) <= 0) continue;
            if (!this.a.containsKey(string2)) {
                this.a.put(string2, entry.getKey());
            }
            if (n6 > n4) {
                n4 = n6;
            }
            if (n6 >= n5) continue;
            n5 = n6;
        }
        this.c = n2;
        this.e = n4;
        this.d = n3;
        this.f = n5;
        this.g = string;
    }

    public boolean a(String string) {
        String string2 = string.toLowerCase(Locale.ENGLISH);
        int n2 = string2.length();
        for (int i2 = this.d; i2 <= this.c && i2 < n2; ++i2) {
            if (!this.b.containsKey(string2.substring(n2 - i2))) continue;
            return true;
        }
        return false;
    }

    public String b(String string) {
        String string2 = string.toLowerCase(Locale.ENGLISH);
        int n2 = string2.length();
        for (int i2 = this.d; i2 <= this.c && i2 < n2; ++i2) {
            String string3 = (String)this.b.get(string2.substring(n2 - i2));
            if (string3 == null) continue;
            return string.substring(0, n2 - i2) + string3;
        }
        return string;
    }

    public String c(String string) {
        String string2 = string.toLowerCase(Locale.ENGLISH);
        int n2 = string2.length();
        for (int i2 = this.f; i2 <= this.e && i2 < n2; ++i2) {
            String string3 = (String)this.a.get(string2.substring(n2 - i2));
            if (string3 == null) continue;
            return string.substring(0, n2 - i2) + string3;
        }
        return string + this.g;
    }
}

