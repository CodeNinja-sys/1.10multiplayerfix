/*
 * Decompiled with CFR 0.150.
 */
package io.netty.util;

import io.netty.util.c.u;
import java.io.InputStream;
import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashSet;
import java.util.Map;
import java.util.Properties;
import java.util.TreeMap;

public final class Version {
    private static final String a = ".version";
    private static final String b = ".buildDate";
    private static final String c = ".commitDate";
    private static final String d = ".shortCommitHash";
    private static final String e = ".longCommitHash";
    private static final String f = ".repoStatus";
    private final String g;
    private final String h;
    private final long i;
    private final long j;
    private final String k;
    private final String l;
    private final String m;

    public static Map a() {
        return Version.a(null);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static Map a(ClassLoader classLoader) {
        String string;
        Object object3;
        TreeMap<String, Version> treeMap;
        Object object2;
        if (classLoader == null) {
            classLoader = u.o();
        }
        Properties properties = new Properties();
        try {
            object2 = classLoader.getResources("META-INF/io.netty.versions.properties");
            while (object2.hasMoreElements()) {
                treeMap = (URL)object2.nextElement();
                object3 = ((URL)((Object)treeMap)).openStream();
                try {
                    properties.load((InputStream)object3);
                }
                finally {
                    try {
                        ((InputStream)object3).close();
                    }
                    catch (Exception exception) {}
                }
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
        object2 = new HashSet();
        for (Object object3 : properties.keySet()) {
            String string2;
            string = (String)object3;
            int n2 = string.indexOf(46);
            if (n2 <= 0 || !properties.containsKey((string2 = string.substring(0, n2)) + a) || !properties.containsKey(string2 + b) || !properties.containsKey(string2 + c) || !properties.containsKey(string2 + d) || !properties.containsKey(string2 + e) || !properties.containsKey(string2 + f)) continue;
            object2.add(string2);
        }
        treeMap = new TreeMap<String, Version>();
        object3 = object2.iterator();
        while (object3.hasNext()) {
            string = (String)object3.next();
            treeMap.put(string, new Version(string, properties.getProperty(string + a), Version.a(properties.getProperty(string + b)), Version.a(properties.getProperty(string + c)), properties.getProperty(string + d), properties.getProperty(string + e), properties.getProperty(string + f)));
        }
        return treeMap;
    }

    private static long a(String string) {
        try {
            return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss Z").parse(string).getTime();
        }
        catch (ParseException parseException) {
            return 0L;
        }
    }

    public static void main(String[] arrstring) {
        for (Version version : Version.a().values()) {
            System.err.println(version);
        }
    }

    private Version(String string, String string2, long l2, long l3, String string3, String string4, String string5) {
        this.g = string;
        this.h = string2;
        this.i = l2;
        this.j = l3;
        this.k = string3;
        this.l = string4;
        this.m = string5;
    }

    public String b() {
        return this.g;
    }

    public String c() {
        return this.h;
    }

    public long d() {
        return this.i;
    }

    public long e() {
        return this.j;
    }

    public String f() {
        return this.k;
    }

    public String g() {
        return this.l;
    }

    public String h() {
        return this.m;
    }

    public String toString() {
        return this.g + '-' + this.h + '.' + this.k + ("clean".equals(this.m) ? "" : " (repository: " + this.m + ')');
    }
}

