/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.u.d.b;

import com.a.a.b.dg;
import com.a.a.d.mq;
import com.a.a.d.sz;
import java.io.IOException;
import java.io.InputStream;
import java.util.IllegalFormatException;
import java.util.Map;
import java.util.regex.Pattern;
import org.apache.commons.b.t;

public class b {
    private static final Pattern a = Pattern.compile("%(\\d+\\$)?[\\d\\.]*[df]");
    private static final dg b = dg.a('=').b(2);
    private static final b c = new b();
    private final Map d = sz.c();
    private long e;

    public b() {
        try {
            InputStream inputStream = b.class.getResourceAsStream("/assets/minecraft/lang/en_US.lang");
            for (String string : t.c(inputStream, org.apache.commons.b.b.f)) {
                String[] arrstring;
                if (string.isEmpty() || string.charAt(0) == '#' || (arrstring = (String[])mq.a(b.a(string), String.class)) == null || arrstring.length != 2) continue;
                String string2 = arrstring[0];
                String string3 = a.matcher(arrstring[1]).replaceAll("%$1s");
                this.d.put(string2, string3);
            }
            this.e = System.currentTimeMillis();
        }
        catch (IOException iOException) {
            // empty catch block
        }
    }

    static b a() {
        return c;
    }

    public static synchronized void a(Map map) {
        net.minecraft.u.d.b.b.c.d.clear();
        net.minecraft.u.d.b.b.c.d.putAll(map);
        net.minecraft.u.d.b.b.c.e = System.currentTimeMillis();
    }

    public synchronized String a(String string) {
        return this.c(string);
    }

    public synchronized String a(String string, Object ... arrobject) {
        String string2 = this.c(string);
        try {
            return String.format(string2, arrobject);
        }
        catch (IllegalFormatException illegalFormatException) {
            return "Format error: " + string2;
        }
    }

    private String c(String string) {
        String string2 = (String)this.d.get(string);
        return string2 == null ? string : string2;
    }

    public synchronized boolean b(String string) {
        return this.d.containsKey(string);
    }

    public long b() {
        return this.e;
    }
}

