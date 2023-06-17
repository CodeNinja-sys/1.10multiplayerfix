/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.o;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Map;
import java.util.Properties;
import org.apache.a.o.a;

public class l {
    public static final String a = "UNAVAILABLE";
    public static final String b = "version.properties";
    public static final String c = "info.module";
    public static final String d = "info.release";
    public static final String e = "info.timestamp";
    private final String f;
    private final String g;
    private final String h;
    private final String i;
    private final String j;

    protected l(String string, String string2, String string3, String string4, String string5) {
        org.apache.a.o.a.a((Object)string, "Package identifier");
        this.f = string;
        this.g = string2 != null ? string2 : a;
        this.h = string3 != null ? string3 : a;
        this.i = string4 != null ? string4 : a;
        this.j = string5 != null ? string5 : a;
    }

    public final String a() {
        return this.f;
    }

    public final String b() {
        return this.g;
    }

    public final String c() {
        return this.h;
    }

    public final String d() {
        return this.i;
    }

    public final String e() {
        return this.j;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(20 + this.f.length() + this.g.length() + this.h.length() + this.i.length() + this.j.length());
        stringBuilder.append("VersionInfo(").append(this.f).append(':').append(this.g);
        if (!a.equals(this.h)) {
            stringBuilder.append(':').append(this.h);
        }
        if (!a.equals(this.i)) {
            stringBuilder.append(':').append(this.i);
        }
        stringBuilder.append(')');
        if (!a.equals(this.j)) {
            stringBuilder.append('@').append(this.j);
        }
        return stringBuilder.toString();
    }

    public static l[] a(String[] arrstring, ClassLoader classLoader) {
        org.apache.a.o.a.a(arrstring, "Package identifier array");
        ArrayList<l> arrayList = new ArrayList<l>(arrstring.length);
        for (String string : arrstring) {
            l l2 = l.a(string, classLoader);
            if (l2 == null) continue;
            arrayList.add(l2);
        }
        return arrayList.toArray(new l[arrayList.size()]);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static l a(String string, ClassLoader classLoader) {
        Object object;
        Properties properties;
        ClassLoader classLoader2;
        block6: {
            org.apache.a.o.a.a((Object)string, "Package identifier");
            classLoader2 = classLoader != null ? classLoader : Thread.currentThread().getContextClassLoader();
            properties = null;
            try {
                object = classLoader2.getResourceAsStream(string.replace('.', '/') + "/" + b);
                if (object == null) break block6;
                try {
                    Properties properties2 = new Properties();
                    properties2.load((InputStream)object);
                    properties = properties2;
                }
                finally {
                    ((InputStream)object).close();
                }
            }
            catch (IOException iOException) {
                // empty catch block
            }
        }
        object = null;
        if (properties != null) {
            object = l.a(string, properties, classLoader2);
        }
        return object;
    }

    protected static l a(String string, Map map, ClassLoader classLoader) {
        org.apache.a.o.a.a((Object)string, "Package identifier");
        String string2 = null;
        String string3 = null;
        String string4 = null;
        if (map != null) {
            string2 = (String)map.get(c);
            if (string2 != null && string2.length() < 1) {
                string2 = null;
            }
            if ((string3 = (String)map.get(d)) != null && (string3.length() < 1 || string3.equals("${pom.version}"))) {
                string3 = null;
            }
            if ((string4 = (String)map.get(e)) != null && (string4.length() < 1 || string4.equals("${mvn.timestamp}"))) {
                string4 = null;
            }
        }
        String string5 = null;
        if (classLoader != null) {
            string5 = classLoader.toString();
        }
        return new l(string, string2, string3, string4, string5);
    }

    public static String a(String string, String string2, Class class_) {
        l l2 = l.a(string2, class_.getClassLoader());
        String string3 = l2 != null ? l2.c() : a;
        String string4 = System.getProperty("java.version");
        return string + "/" + string3 + " (Java 1.5 minimum; Java/" + string4 + ")";
    }
}

