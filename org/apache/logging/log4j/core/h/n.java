/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.h;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import org.apache.logging.log4j.core.h.f;
import org.apache.logging.log4j.core.h.g;
import org.apache.logging.log4j.core.h.h;

public class n {
    public static final char a = '$';
    public static final h b = org.apache.logging.log4j.core.h.h.b("${");
    public static final h c = org.apache.logging.log4j.core.h.h.b("}");
    private static final int d = 256;
    private char e;
    private h f;
    private h g;
    private g h;
    private boolean i;

    public n() {
        this(null, b, c, '$');
    }

    public n(Map map) {
        this((g)new f(map), b, c, '$');
    }

    public n(Map map, String string, String string2) {
        this((g)new f(map), string, string2, '$');
    }

    public n(Map map, String string, String string2, char c2) {
        this((g)new f(map), string, string2, c2);
    }

    public n(g g2) {
        this(g2, b, c, '$');
    }

    public n(g g2, String string, String string2, char c2) {
        this.a(g2);
        this.b(string);
        this.c(string2);
        this.a(c2);
    }

    public n(g g2, h h2, h h3, char c2) {
        this.a(g2);
        this.a(h2);
        this.b(h3);
        this.a(c2);
    }

    public static String a(Object object, Map map) {
        return new n(map).a(object);
    }

    public static String a(Object object, Map map, String string, String string2) {
        return new n(map, string, string2).a(object);
    }

    public static String a(Object object, Properties properties) {
        if (properties == null) {
            return object.toString();
        }
        HashMap<String, String> hashMap = new HashMap<String, String>();
        Enumeration<?> enumeration = properties.propertyNames();
        while (enumeration.hasMoreElements()) {
            String string = (String)enumeration.nextElement();
            String string2 = properties.getProperty(string);
            hashMap.put(string, string2);
        }
        return n.a(object, hashMap);
    }

    public String a(String string) {
        return this.a(null, string);
    }

    public String a(org.apache.logging.log4j.core.h h2, String string) {
        if (string == null) {
            return null;
        }
        StringBuilder stringBuilder = new StringBuilder(string);
        if (!this.c(h2, stringBuilder, 0, string.length())) {
            return string;
        }
        return stringBuilder.toString();
    }

    public String a(String string, int n2, int n3) {
        return this.a(null, string, n2, n3);
    }

    public String a(org.apache.logging.log4j.core.h h2, String string, int n2, int n3) {
        if (string == null) {
            return null;
        }
        StringBuilder stringBuilder = new StringBuilder(n3).append(string, n2, n3);
        if (!this.c(h2, stringBuilder, 0, n3)) {
            return string.substring(n2, n2 + n3);
        }
        return stringBuilder.toString();
    }

    public String a(char[] arrc) {
        return this.a((org.apache.logging.log4j.core.h)null, arrc);
    }

    public String a(org.apache.logging.log4j.core.h h2, char[] arrc) {
        if (arrc == null) {
            return null;
        }
        StringBuilder stringBuilder = new StringBuilder(arrc.length).append(arrc);
        this.c(h2, stringBuilder, 0, arrc.length);
        return stringBuilder.toString();
    }

    public String a(char[] arrc, int n2, int n3) {
        return this.a(null, arrc, n2, n3);
    }

    public String a(org.apache.logging.log4j.core.h h2, char[] arrc, int n2, int n3) {
        if (arrc == null) {
            return null;
        }
        StringBuilder stringBuilder = new StringBuilder(n3).append(arrc, n2, n3);
        this.c(h2, stringBuilder, 0, n3);
        return stringBuilder.toString();
    }

    public String a(StringBuffer stringBuffer) {
        return this.a(null, stringBuffer);
    }

    public String a(org.apache.logging.log4j.core.h h2, StringBuffer stringBuffer) {
        if (stringBuffer == null) {
            return null;
        }
        StringBuilder stringBuilder = new StringBuilder(stringBuffer.length()).append(stringBuffer);
        this.c(h2, stringBuilder, 0, stringBuilder.length());
        return stringBuilder.toString();
    }

    public String a(StringBuffer stringBuffer, int n2, int n3) {
        return this.a(null, stringBuffer, n2, n3);
    }

    public String a(org.apache.logging.log4j.core.h h2, StringBuffer stringBuffer, int n2, int n3) {
        if (stringBuffer == null) {
            return null;
        }
        StringBuilder stringBuilder = new StringBuilder(n3).append(stringBuffer, n2, n3);
        this.c(h2, stringBuilder, 0, n3);
        return stringBuilder.toString();
    }

    public String a(StringBuilder stringBuilder) {
        return this.a(null, stringBuilder);
    }

    public String a(org.apache.logging.log4j.core.h h2, StringBuilder stringBuilder) {
        if (stringBuilder == null) {
            return null;
        }
        StringBuilder stringBuilder2 = new StringBuilder(stringBuilder.length()).append((CharSequence)stringBuilder);
        this.c(h2, stringBuilder2, 0, stringBuilder2.length());
        return stringBuilder2.toString();
    }

    public String a(StringBuilder stringBuilder, int n2, int n3) {
        return this.a(null, stringBuilder, n2, n3);
    }

    public String a(org.apache.logging.log4j.core.h h2, StringBuilder stringBuilder, int n2, int n3) {
        if (stringBuilder == null) {
            return null;
        }
        StringBuilder stringBuilder2 = new StringBuilder(n3).append(stringBuilder, n2, n3);
        this.c(h2, stringBuilder2, 0, n3);
        return stringBuilder2.toString();
    }

    public String a(Object object) {
        return this.a(null, object);
    }

    public String a(org.apache.logging.log4j.core.h h2, Object object) {
        if (object == null) {
            return null;
        }
        StringBuilder stringBuilder = new StringBuilder().append(object);
        this.c(h2, stringBuilder, 0, stringBuilder.length());
        return stringBuilder.toString();
    }

    public boolean b(StringBuffer stringBuffer) {
        if (stringBuffer == null) {
            return false;
        }
        return this.b(stringBuffer, 0, stringBuffer.length());
    }

    public boolean b(StringBuffer stringBuffer, int n2, int n3) {
        return this.b(null, stringBuffer, n2, n3);
    }

    public boolean b(org.apache.logging.log4j.core.h h2, StringBuffer stringBuffer, int n2, int n3) {
        if (stringBuffer == null) {
            return false;
        }
        StringBuilder stringBuilder = new StringBuilder(n3).append(stringBuffer, n2, n3);
        if (!this.c(h2, stringBuilder, 0, n3)) {
            return false;
        }
        stringBuffer.replace(n2, n2 + n3, stringBuilder.toString());
        return true;
    }

    public boolean b(StringBuilder stringBuilder) {
        return this.b(null, stringBuilder);
    }

    public boolean b(org.apache.logging.log4j.core.h h2, StringBuilder stringBuilder) {
        if (stringBuilder == null) {
            return false;
        }
        return this.c(h2, stringBuilder, 0, stringBuilder.length());
    }

    public boolean b(StringBuilder stringBuilder, int n2, int n3) {
        return this.b(null, stringBuilder, n2, n3);
    }

    public boolean b(org.apache.logging.log4j.core.h h2, StringBuilder stringBuilder, int n2, int n3) {
        if (stringBuilder == null) {
            return false;
        }
        return this.c(h2, stringBuilder, n2, n3);
    }

    protected boolean c(org.apache.logging.log4j.core.h h2, StringBuilder stringBuilder, int n2, int n3) {
        return this.a(h2, stringBuilder, n2, n3, null) > 0;
    }

    private int a(org.apache.logging.log4j.core.h h2, StringBuilder stringBuilder, int n2, int n3, List arrayList) {
        h h3 = this.b();
        h h4 = this.c();
        char c2 = this.a();
        boolean bl2 = arrayList == null;
        boolean bl3 = false;
        int n4 = 0;
        char[] arrc = this.c(stringBuilder);
        int n5 = n2 + n3;
        int n6 = n2;
        block0: while (n6 < n5) {
            int n7 = h3.a(arrc, n6, n2, n5);
            if (n7 == 0) {
                ++n6;
                continue;
            }
            if (n6 > n2 && arrc[n6 - 1] == c2) {
                stringBuilder.deleteCharAt(n6 - 1);
                arrc = this.c(stringBuilder);
                --n4;
                bl3 = true;
                --n5;
                continue;
            }
            int n8 = n6;
            n6 += n7;
            int n9 = 0;
            int n10 = 0;
            while (n6 < n5) {
                if (this.e() && (n9 = h3.a(arrc, n6, n2, n5)) != 0) {
                    ++n10;
                    n6 += n9;
                    continue;
                }
                n9 = h4.a(arrc, n6, n2, n5);
                if (n9 == 0) {
                    ++n6;
                    continue;
                }
                if (n10 == 0) {
                    String string = new String(arrc, n8 + n7, n6 - n8 - n7);
                    if (this.e()) {
                        StringBuilder stringBuilder2 = new StringBuilder(string);
                        this.c(h2, stringBuilder2, 0, stringBuilder2.length());
                        string = stringBuilder2.toString();
                    }
                    int n11 = n6 += n9;
                    if (arrayList == null) {
                        arrayList = new ArrayList<String>();
                        arrayList.add(new String(arrc, n2, n3));
                    }
                    this.a(string, arrayList);
                    arrayList.add(string);
                    String string2 = this.a(h2, string, stringBuilder, n8, n11);
                    if (string2 != null) {
                        int n12 = string2.length();
                        stringBuilder.replace(n8, n11, string2);
                        bl3 = true;
                        int n13 = this.a(h2, stringBuilder, n8, n12, arrayList);
                        n6 += (n13 += n12 - (n11 - n8));
                        n5 += n13;
                        n4 += n13;
                        arrc = this.c(stringBuilder);
                    }
                    arrayList.remove(arrayList.size() - 1);
                    continue block0;
                }
                --n10;
                n6 += n9;
            }
        }
        if (bl2) {
            return bl3 ? 1 : 0;
        }
        return n4;
    }

    private void a(String string, List list) {
        if (!list.contains(string)) {
            return;
        }
        StringBuilder stringBuilder = new StringBuilder(256);
        stringBuilder.append("Infinite loop in property interpolation of ");
        stringBuilder.append((String)list.remove(0));
        stringBuilder.append(": ");
        this.a(stringBuilder, list, "->");
        throw new IllegalStateException(stringBuilder.toString());
    }

    protected String a(org.apache.logging.log4j.core.h h2, String string, StringBuilder stringBuilder, int n2, int n3) {
        g g2 = this.d();
        if (g2 == null) {
            return null;
        }
        return g2.a(h2, string);
    }

    public char a() {
        return this.e;
    }

    public void a(char c2) {
        this.e = c2;
    }

    public h b() {
        return this.f;
    }

    public n a(h h2) {
        if (h2 == null) {
            throw new IllegalArgumentException("Variable prefix matcher must not be null!");
        }
        this.f = h2;
        return this;
    }

    public n b(char c2) {
        return this.a(org.apache.logging.log4j.core.h.h.a(c2));
    }

    public n b(String string) {
        if (string == null) {
            throw new IllegalArgumentException("Variable prefix must not be null!");
        }
        return this.a(org.apache.logging.log4j.core.h.h.b(string));
    }

    public h c() {
        return this.g;
    }

    public n b(h h2) {
        if (h2 == null) {
            throw new IllegalArgumentException("Variable suffix matcher must not be null!");
        }
        this.g = h2;
        return this;
    }

    public n c(char c2) {
        return this.b(org.apache.logging.log4j.core.h.h.a(c2));
    }

    public n c(String string) {
        if (string == null) {
            throw new IllegalArgumentException("Variable suffix must not be null!");
        }
        return this.b(org.apache.logging.log4j.core.h.h.b(string));
    }

    public g d() {
        return this.h;
    }

    public void a(g g2) {
        this.h = g2;
    }

    public boolean e() {
        return this.i;
    }

    public void a(boolean bl2) {
        this.i = bl2;
    }

    private char[] c(StringBuilder stringBuilder) {
        char[] arrc = new char[stringBuilder.length()];
        stringBuilder.getChars(0, stringBuilder.length(), arrc, 0);
        return arrc;
    }

    public void a(StringBuilder stringBuilder, Iterable iterable, String string) {
        if (iterable != null) {
            string = string == null ? "" : string;
            Iterator iterator = iterable.iterator();
            while (iterator.hasNext()) {
                stringBuilder.append(iterator.next());
                if (!iterator.hasNext()) continue;
                stringBuilder.append(string);
            }
        }
    }

    public String toString() {
        return "StrSubstitutor(" + this.h.toString() + ")";
    }
}

