/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.g;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.apache.logging.log4j.a.m;
import org.apache.logging.log4j.a.q;
import org.apache.logging.log4j.core.d.x;
import org.apache.logging.log4j.core.d.y;
import org.apache.logging.log4j.core.g.b;
import org.apache.logging.log4j.core.h;

public class e
extends b {
    private static final int d = 256;
    private static final String e = "\r\n";
    private static final String f = "";
    private static final String g = "  ";
    private static final String h = "";
    private static final String[] i = new String[]{"json"};
    private final boolean j;
    private final boolean k;
    private final boolean l;
    private final String m;
    private final String n;
    private final String o;
    private final String p;
    private final String q;
    private volatile boolean r;

    protected e(boolean bl2, boolean bl3, boolean bl4, boolean bl5, Charset charset) {
        super(charset);
        this.j = bl2;
        this.k = bl3;
        this.l = bl4;
        this.m = bl5 ? "" : e;
        this.n = bl5 ? "" : g;
        this.o = this.n + this.n;
        this.p = this.o + this.n;
        this.q = this.p + this.n;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public String c(h h2) {
        Throwable throwable;
        Object object;
        Object object2;
        StringBuilder stringBuilder = new StringBuilder(256);
        boolean bl2 = this.r;
        if (!this.r) {
            object2 = this;
            synchronized (object2) {
                bl2 = this.r;
                if (!bl2) {
                    this.r = true;
                } else {
                    stringBuilder.append(',');
                    stringBuilder.append(this.m);
                }
            }
        } else {
            stringBuilder.append(',');
            stringBuilder.append(this.m);
        }
        stringBuilder.append(this.n);
        stringBuilder.append('{');
        stringBuilder.append(this.m);
        stringBuilder.append(this.o);
        stringBuilder.append("\"logger\":\"");
        object2 = h2.b();
        if (((String)object2).isEmpty()) {
            object2 = "root";
        }
        stringBuilder.append(y.b((String)object2));
        stringBuilder.append("\",");
        stringBuilder.append(this.m);
        stringBuilder.append(this.o);
        stringBuilder.append("\"timestamp\":\"");
        stringBuilder.append(h2.g());
        stringBuilder.append("\",");
        stringBuilder.append(this.m);
        stringBuilder.append(this.o);
        stringBuilder.append("\"level\":\"");
        stringBuilder.append(y.b(String.valueOf((Object)h2.a())));
        stringBuilder.append("\",");
        stringBuilder.append(this.m);
        stringBuilder.append(this.o);
        stringBuilder.append("\"thread\":\"");
        stringBuilder.append(y.b(h2.f()));
        stringBuilder.append("\",");
        stringBuilder.append(this.m);
        m m2 = h2.d();
        if (m2 != null) {
            boolean bl3 = false;
            if (m2 instanceof q) {
                for (String string : object = ((q)m2).e()) {
                    if (!string.equalsIgnoreCase("JSON")) continue;
                    bl3 = true;
                    break;
                }
            }
            stringBuilder.append(this.o);
            stringBuilder.append("\"message\":\"");
            if (bl3) {
                stringBuilder.append(((q)m2).a(i));
            } else {
                y.a(stringBuilder, h2.d().a());
            }
            stringBuilder.append('\"');
        }
        if (h2.j().c() > 0) {
            stringBuilder.append(",");
            stringBuilder.append(this.m);
            stringBuilder.append("\"ndc\":");
            y.a(stringBuilder, h2.j().toString());
            stringBuilder.append("\"");
        }
        if ((throwable = h2.h()) != null) {
            stringBuilder.append(",");
            stringBuilder.append(this.m);
            stringBuilder.append(this.o);
            stringBuilder.append("\"throwable\":\"");
            object = x.a(throwable);
            Iterator iterator = object.iterator();
            while (iterator.hasNext()) {
                String string = (String)iterator.next();
                stringBuilder.append(y.b(string));
                stringBuilder.append("\\\\n");
            }
            stringBuilder.append("\"");
        }
        if (this.j) {
            object = h2.c();
            stringBuilder.append(",");
            stringBuilder.append(this.m);
            stringBuilder.append(this.o);
            stringBuilder.append("\"LocationInfo\":{");
            stringBuilder.append(this.m);
            stringBuilder.append(this.p);
            stringBuilder.append("\"class\":\"");
            stringBuilder.append(y.b(((StackTraceElement)object).getClassName()));
            stringBuilder.append("\",");
            stringBuilder.append(this.m);
            stringBuilder.append(this.p);
            stringBuilder.append("\"method\":\"");
            stringBuilder.append(y.b(((StackTraceElement)object).getMethodName()));
            stringBuilder.append("\",");
            stringBuilder.append(this.m);
            stringBuilder.append(this.p);
            stringBuilder.append("\"file\":\"");
            stringBuilder.append(y.b(((StackTraceElement)object).getFileName()));
            stringBuilder.append("\",");
            stringBuilder.append(this.m);
            stringBuilder.append(this.p);
            stringBuilder.append("\"line\":\"");
            stringBuilder.append(((StackTraceElement)object).getLineNumber());
            stringBuilder.append("\"");
            stringBuilder.append(this.m);
            stringBuilder.append(this.o);
            stringBuilder.append("}");
        }
        if (this.k && h2.i().size() > 0) {
            stringBuilder.append(",");
            stringBuilder.append(this.m);
            stringBuilder.append(this.o);
            stringBuilder.append("\"Properties\":[");
            stringBuilder.append(this.m);
            object = h2.i().entrySet();
            int n2 = 1;
            Iterator iterator = object.iterator();
            while (iterator.hasNext()) {
                Map.Entry entry = (Map.Entry)iterator.next();
                stringBuilder.append(this.p);
                stringBuilder.append('{');
                stringBuilder.append(this.m);
                stringBuilder.append(this.q);
                stringBuilder.append("\"name\":\"");
                stringBuilder.append(y.b((String)entry.getKey()));
                stringBuilder.append("\",");
                stringBuilder.append(this.m);
                stringBuilder.append(this.q);
                stringBuilder.append("\"value\":\"");
                stringBuilder.append(y.b(String.valueOf(entry.getValue())));
                stringBuilder.append("\"");
                stringBuilder.append(this.m);
                stringBuilder.append(this.p);
                stringBuilder.append("}");
                if (n2 < object.size()) {
                    stringBuilder.append(",");
                }
                stringBuilder.append(this.m);
                ++n2;
            }
            stringBuilder.append(this.o);
            stringBuilder.append("]");
        }
        stringBuilder.append(this.m);
        stringBuilder.append(this.n);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    @Override
    public byte[] b() {
        if (!this.l) {
            return null;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('[');
        stringBuilder.append(this.m);
        return stringBuilder.toString().getBytes(this.e());
    }

    @Override
    public byte[] a() {
        if (!this.l) {
            return null;
        }
        return (this.m + "]" + this.m).getBytes(this.e());
    }

    @Override
    public Map d() {
        HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("version", "2.0");
        return hashMap;
    }

    @Override
    public String c() {
        return "application/json; charset=" + this.e();
    }

    public static e a(String string, String string2, String string3, String string4, String string5) {
        Charset charset = org.apache.logging.log4j.core.d.e.a(string5, org.apache.logging.log4j.core.d.e.a);
        boolean bl2 = Boolean.parseBoolean(string);
        boolean bl3 = Boolean.parseBoolean(string2);
        boolean bl4 = Boolean.parseBoolean(string3);
        boolean bl5 = Boolean.parseBoolean(string4);
        return new e(bl2, bl3, bl4, bl5, charset);
    }

    @Override
    public /* synthetic */ Serializable b(h h2) {
        return this.c(h2);
    }
}

