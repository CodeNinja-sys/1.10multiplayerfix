/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.c.h;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import org.apache.commons.c.am;
import org.apache.commons.c.h.e;
import org.apache.commons.c.h.i;
import org.apache.commons.c.h.k;

public class q {
    public static final char a = '$';
    public static final k b = k.b("${");
    public static final k c = k.b("}");
    public static final k d = k.b(":-");
    private char e;
    private k f;
    private k g;
    private k h;
    private i i;
    private boolean j;

    public static String a(Object object, Map map) {
        return new q(map).b(object);
    }

    public static String a(Object object, Map map, String string, String string2) {
        return new q(map, string, string2).b(object);
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
        return q.a(object, hashMap);
    }

    public static String a(Object object) {
        return new q(org.apache.commons.c.h.i.b()).b(object);
    }

    public q() {
        this((i)null, b, c, '$');
    }

    public q(Map map) {
        this(org.apache.commons.c.h.i.a(map), b, c, '$');
    }

    public q(Map map, String string, String string2) {
        this(org.apache.commons.c.h.i.a(map), string, string2, '$');
    }

    public q(Map map, String string, String string2, char c2) {
        this(org.apache.commons.c.h.i.a(map), string, string2, c2);
    }

    public q(Map map, String string, String string2, char c2, String string3) {
        this(org.apache.commons.c.h.i.a(map), string, string2, c2, string3);
    }

    public q(i i2) {
        this(i2, b, c, '$');
    }

    public q(i i2, String string, String string2, char c2) {
        this.a(i2);
        this.b(string);
        this.c(string2);
        this.a(c2);
        this.c(d);
    }

    public q(i i2, String string, String string2, char c2, String string3) {
        this.a(i2);
        this.b(string);
        this.c(string2);
        this.a(c2);
        this.d(string3);
    }

    public q(i i2, k k2, k k3, char c2) {
        this(i2, k2, k3, c2, d);
    }

    public q(i i2, k k2, k k3, char c2, k k4) {
        this.a(i2);
        this.a(k2);
        this.b(k3);
        this.a(c2);
        this.c(k4);
    }

    public String a(String string) {
        if (string == null) {
            return null;
        }
        e e2 = new e(string);
        if (!this.c(e2, 0, string.length())) {
            return string;
        }
        return e2.toString();
    }

    public String a(String string, int n2, int n3) {
        if (string == null) {
            return null;
        }
        e e2 = new e(n3).a(string, n2, n3);
        if (!this.c(e2, 0, n3)) {
            return string.substring(n2, n2 + n3);
        }
        return e2.toString();
    }

    public String a(char[] arrc) {
        if (arrc == null) {
            return null;
        }
        e e2 = new e(arrc.length).b(arrc);
        this.c(e2, 0, arrc.length);
        return e2.toString();
    }

    public String a(char[] arrc, int n2, int n3) {
        if (arrc == null) {
            return null;
        }
        e e2 = new e(n3).a(arrc, n2, n3);
        this.c(e2, 0, n3);
        return e2.toString();
    }

    public String a(StringBuffer stringBuffer) {
        if (stringBuffer == null) {
            return null;
        }
        e e2 = new e(stringBuffer.length()).a(stringBuffer);
        this.c(e2, 0, e2.length());
        return e2.toString();
    }

    public String a(StringBuffer stringBuffer, int n2, int n3) {
        if (stringBuffer == null) {
            return null;
        }
        e e2 = new e(n3).a(stringBuffer, n2, n3);
        this.c(e2, 0, n3);
        return e2.toString();
    }

    public String a(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        return this.a(charSequence, 0, charSequence.length());
    }

    public String a(CharSequence charSequence, int n2, int n3) {
        if (charSequence == null) {
            return null;
        }
        e e2 = new e(n3).a(charSequence, n2, n3);
        this.c(e2, 0, n3);
        return e2.toString();
    }

    public String a(e e2) {
        if (e2 == null) {
            return null;
        }
        e e3 = new e(e2.length()).a(e2);
        this.c(e3, 0, e3.length());
        return e3.toString();
    }

    public String a(e e2, int n2, int n3) {
        if (e2 == null) {
            return null;
        }
        e e3 = new e(n3).a(e2, n2, n3);
        this.c(e3, 0, n3);
        return e3.toString();
    }

    public String b(Object object) {
        if (object == null) {
            return null;
        }
        e e2 = new e().a(object);
        this.c(e2, 0, e2.length());
        return e2.toString();
    }

    public boolean b(StringBuffer stringBuffer) {
        if (stringBuffer == null) {
            return false;
        }
        return this.b(stringBuffer, 0, stringBuffer.length());
    }

    public boolean b(StringBuffer stringBuffer, int n2, int n3) {
        if (stringBuffer == null) {
            return false;
        }
        e e2 = new e(n3).a(stringBuffer, n2, n3);
        if (!this.c(e2, 0, n3)) {
            return false;
        }
        stringBuffer.replace(n2, n2 + n3, e2.toString());
        return true;
    }

    public boolean a(StringBuilder stringBuilder) {
        if (stringBuilder == null) {
            return false;
        }
        return this.a(stringBuilder, 0, stringBuilder.length());
    }

    public boolean a(StringBuilder stringBuilder, int n2, int n3) {
        if (stringBuilder == null) {
            return false;
        }
        e e2 = new e(n3).a(stringBuilder, n2, n3);
        if (!this.c(e2, 0, n3)) {
            return false;
        }
        stringBuilder.replace(n2, n2 + n3, e2.toString());
        return true;
    }

    public boolean b(e e2) {
        if (e2 == null) {
            return false;
        }
        return this.c(e2, 0, e2.length());
    }

    public boolean b(e e2, int n2, int n3) {
        if (e2 == null) {
            return false;
        }
        return this.c(e2, n2, n3);
    }

    protected boolean c(e e2, int n2, int n3) {
        return this.a(e2, n2, n3, null) > 0;
    }

    private int a(e e2, int n2, int n3, List arrayList) {
        k k2 = this.b();
        k k3 = this.c();
        char c2 = this.a();
        k k4 = this.d();
        boolean bl2 = this.f();
        boolean bl3 = arrayList == null;
        boolean bl4 = false;
        int n4 = 0;
        char[] arrc = e2.b;
        int n5 = n2 + n3;
        int n6 = n2;
        block0: while (n6 < n5) {
            int n7 = k2.a(arrc, n6, n2, n5);
            if (n7 == 0) {
                ++n6;
                continue;
            }
            if (n6 > n2 && arrc[n6 - 1] == c2) {
                e2.c(n6 - 1);
                arrc = e2.b;
                --n4;
                bl4 = true;
                --n5;
                continue;
            }
            int n8 = n6;
            n6 += n7;
            int n9 = 0;
            int n10 = 0;
            while (n6 < n5) {
                if (bl2 && (n9 = k2.a(arrc, n6, n2, n5)) != 0) {
                    ++n10;
                    n6 += n9;
                    continue;
                }
                n9 = k3.a(arrc, n6, n2, n5);
                if (n9 == 0) {
                    ++n6;
                    continue;
                }
                if (n10 == 0) {
                    int n11;
                    int n12;
                    Object object;
                    String string = new String(arrc, n8 + n7, n6 - n8 - n7);
                    if (bl2) {
                        e e3 = new e(string);
                        this.c(e3, 0, e3.length());
                        string = e3.toString();
                    }
                    int n13 = n6 += n9;
                    String string2 = string;
                    String string3 = null;
                    if (k4 != null) {
                        object = string.toCharArray();
                        n12 = 0;
                        for (n11 = 0; n11 < ((char[])object).length && (bl2 || k2.a((char[])object, n11, n11, ((char[])object).length) == 0); ++n11) {
                            n12 = k4.a((char[])object, n11);
                            if (n12 == 0) continue;
                            string2 = string.substring(0, n11);
                            string3 = string.substring(n11 + n12);
                            break;
                        }
                    }
                    if (arrayList == null) {
                        arrayList = new ArrayList<String>();
                        arrayList.add(new String(arrc, n2, n3));
                    }
                    this.a(string2, arrayList);
                    arrayList.add(string2);
                    object = this.a(string2, e2, n8, n13);
                    if (object == null) {
                        object = string3;
                    }
                    if (object != null) {
                        n12 = ((String)object).length();
                        e2.a(n8, n13, (String)object);
                        bl4 = true;
                        n11 = this.a(e2, n8, n12, arrayList);
                        n11 = n11 + n12 - (n13 - n8);
                        n6 += n11;
                        n5 += n11;
                        n4 += n11;
                        arrc = e2.b;
                    }
                    arrayList.remove(arrayList.size() - 1);
                    continue block0;
                }
                --n10;
                n6 += n9;
            }
        }
        if (bl3) {
            return bl4 ? 1 : 0;
        }
        return n4;
    }

    private void a(String string, List list) {
        if (!list.contains(string)) {
            return;
        }
        e e2 = new e(256);
        e2.c("Infinite loop in property interpolation of ");
        e2.c((String)list.remove(0));
        e2.c(": ");
        e2.a(list, "->");
        throw new IllegalStateException(e2.toString());
    }

    protected String a(String string, e e2, int n2, int n3) {
        i i2 = this.e();
        if (i2 == null) {
            return null;
        }
        return i2.a(string);
    }

    public char a() {
        return this.e;
    }

    public void a(char c2) {
        this.e = c2;
    }

    public k b() {
        return this.f;
    }

    public q a(k k2) {
        if (k2 == null) {
            throw new IllegalArgumentException("Variable prefix matcher must not be null!");
        }
        this.f = k2;
        return this;
    }

    public q b(char c2) {
        return this.a(k.a(c2));
    }

    public q b(String string) {
        if (string == null) {
            throw new IllegalArgumentException("Variable prefix must not be null!");
        }
        return this.a(k.b(string));
    }

    public k c() {
        return this.g;
    }

    public q b(k k2) {
        if (k2 == null) {
            throw new IllegalArgumentException("Variable suffix matcher must not be null!");
        }
        this.g = k2;
        return this;
    }

    public q c(char c2) {
        return this.b(k.a(c2));
    }

    public q c(String string) {
        if (string == null) {
            throw new IllegalArgumentException("Variable suffix must not be null!");
        }
        return this.b(k.b(string));
    }

    public k d() {
        return this.h;
    }

    public q c(k k2) {
        this.h = k2;
        return this;
    }

    public q d(char c2) {
        return this.c(k.a(c2));
    }

    public q d(String string) {
        if (am.a((CharSequence)string)) {
            this.c((k)null);
            return this;
        }
        return this.c(k.b(string));
    }

    public i e() {
        return this.i;
    }

    public void a(i i2) {
        this.i = i2;
    }

    public boolean f() {
        return this.j;
    }

    public void a(boolean bl2) {
        this.j = bl2;
    }
}

