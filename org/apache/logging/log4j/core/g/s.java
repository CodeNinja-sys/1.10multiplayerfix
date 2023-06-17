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
import org.apache.logging.log4j.core.d.e;
import org.apache.logging.log4j.core.d.v;
import org.apache.logging.log4j.core.d.x;
import org.apache.logging.log4j.core.d.y;
import org.apache.logging.log4j.core.g.b;
import org.apache.logging.log4j.core.h;

public class s
extends b {
    private static final String d = "http://logging.apache.org/log4j/2.0/events";
    private static final String e = "Events";
    private static final int f = 256;
    private static final String g = "\r\n";
    private static final String h = "";
    private static final String i = "  ";
    private static final String j = "";
    private static final String k = "log4j";
    private static final String[] l = new String[]{"xml"};
    private final boolean m;
    private final boolean n;
    private final boolean o;
    private final String p;
    private final String q;
    private final String r;
    private final String s;
    private final String t;

    protected s(boolean bl2, boolean bl3, boolean bl4, boolean bl5, String string, Charset charset) {
        super(charset);
        this.m = bl2;
        this.n = bl3;
        this.o = bl4;
        this.q = bl5 ? "" : g;
        this.r = bl5 ? "" : i;
        this.s = this.r + this.r;
        this.t = this.s + this.r;
        this.p = (v.a(string) ? k : string) + ":";
    }

    public String c(h h2) {
        Throwable throwable;
        Object object;
        StringBuilder stringBuilder = new StringBuilder(256);
        stringBuilder.append(this.r);
        stringBuilder.append('<');
        if (!this.o) {
            stringBuilder.append(this.p);
        }
        stringBuilder.append("Event logger=\"");
        String string = h2.b();
        if (string.isEmpty()) {
            string = "root";
        }
        stringBuilder.append(y.a(string));
        stringBuilder.append("\" timestamp=\"");
        stringBuilder.append(h2.g());
        stringBuilder.append("\" level=\"");
        stringBuilder.append(y.a(String.valueOf((Object)h2.a())));
        stringBuilder.append("\" thread=\"");
        stringBuilder.append(y.a(h2.f()));
        stringBuilder.append("\">");
        stringBuilder.append(this.q);
        m m2 = h2.d();
        if (m2 != null) {
            boolean bl2 = false;
            if (m2 instanceof q) {
                object = ((q)m2).e();
                for (String string2 : object) {
                    if (!string2.equalsIgnoreCase("XML")) continue;
                    bl2 = true;
                    break;
                }
            }
            stringBuilder.append(this.s);
            stringBuilder.append('<');
            if (!this.o) {
                stringBuilder.append(this.p);
            }
            stringBuilder.append("Message>");
            if (bl2) {
                stringBuilder.append(((q)m2).a(l));
            } else {
                stringBuilder.append("<![CDATA[");
                y.a(stringBuilder, h2.d().a());
                stringBuilder.append("]]>");
            }
            stringBuilder.append("</");
            if (!this.o) {
                stringBuilder.append(this.p);
            }
            stringBuilder.append("Message>");
            stringBuilder.append(this.q);
        }
        if (h2.j().c() > 0) {
            stringBuilder.append(this.s);
            stringBuilder.append('<');
            if (!this.o) {
                stringBuilder.append(this.p);
            }
            stringBuilder.append("NDC><![CDATA[");
            y.a(stringBuilder, h2.j().toString());
            stringBuilder.append("]]></");
            if (!this.o) {
                stringBuilder.append(this.p);
            }
            stringBuilder.append("NDC>");
            stringBuilder.append(this.q);
        }
        if ((throwable = h2.h()) != null) {
            object = x.a(throwable);
            stringBuilder.append(this.s);
            stringBuilder.append('<');
            if (!this.o) {
                stringBuilder.append(this.p);
            }
            stringBuilder.append("Throwable><![CDATA[");
            Iterator iterator = object.iterator();
            while (iterator.hasNext()) {
                String string3 = (String)iterator.next();
                y.a(stringBuilder, string3);
                stringBuilder.append(this.q);
            }
            stringBuilder.append("]]></");
            if (!this.o) {
                stringBuilder.append(this.p);
            }
            stringBuilder.append("Throwable>");
            stringBuilder.append(this.q);
        }
        if (this.m) {
            object = h2.c();
            stringBuilder.append(this.s);
            stringBuilder.append('<');
            if (!this.o) {
                stringBuilder.append(this.p);
            }
            stringBuilder.append("LocationInfo class=\"");
            stringBuilder.append(y.a(((StackTraceElement)object).getClassName()));
            stringBuilder.append("\" method=\"");
            stringBuilder.append(y.a(((StackTraceElement)object).getMethodName()));
            stringBuilder.append("\" file=\"");
            stringBuilder.append(y.a(((StackTraceElement)object).getFileName()));
            stringBuilder.append("\" line=\"");
            stringBuilder.append(((StackTraceElement)object).getLineNumber());
            stringBuilder.append("\"/>");
            stringBuilder.append(this.q);
        }
        if (this.n && h2.i().size() > 0) {
            stringBuilder.append(this.s);
            stringBuilder.append('<');
            if (!this.o) {
                stringBuilder.append(this.p);
            }
            stringBuilder.append("Properties>");
            stringBuilder.append(this.q);
            for (Map.Entry entry : h2.i().entrySet()) {
                stringBuilder.append(this.t);
                stringBuilder.append('<');
                if (!this.o) {
                    stringBuilder.append(this.p);
                }
                stringBuilder.append("Data name=\"");
                stringBuilder.append(y.a((String)entry.getKey()));
                stringBuilder.append("\" value=\"");
                stringBuilder.append(y.a(String.valueOf(entry.getValue())));
                stringBuilder.append("\"/>");
                stringBuilder.append(this.q);
            }
            stringBuilder.append(this.s);
            stringBuilder.append("</");
            if (!this.o) {
                stringBuilder.append(this.p);
            }
            stringBuilder.append("Properties>");
            stringBuilder.append(this.q);
        }
        stringBuilder.append(this.r);
        stringBuilder.append("</");
        if (!this.o) {
            stringBuilder.append(this.p);
        }
        stringBuilder.append("Event>");
        stringBuilder.append(this.q);
        return stringBuilder.toString();
    }

    @Override
    public byte[] b() {
        if (!this.o) {
            return null;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("<?xml version=\"1.0\" encoding=\"");
        stringBuilder.append(this.e().name());
        stringBuilder.append("\"?>");
        stringBuilder.append(this.q);
        stringBuilder.append('<');
        stringBuilder.append(e);
        stringBuilder.append(" xmlns=\"http://logging.apache.org/log4j/2.0/events\">");
        stringBuilder.append(this.q);
        return stringBuilder.toString().getBytes(this.e());
    }

    @Override
    public byte[] a() {
        if (!this.o) {
            return null;
        }
        return ("</Events>" + this.q).getBytes(this.e());
    }

    @Override
    public Map d() {
        HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("xsd", "log4j-events.xsd");
        hashMap.put("version", "2.0");
        return hashMap;
    }

    @Override
    public String c() {
        return "text/xml; charset=" + this.e();
    }

    public static s a(String string, String string2, String string3, String string4, String string5, String string6) {
        Charset charset = org.apache.logging.log4j.core.d.e.a(string6, org.apache.logging.log4j.core.d.e.a);
        boolean bl2 = Boolean.parseBoolean(string);
        boolean bl3 = Boolean.parseBoolean(string2);
        boolean bl4 = Boolean.parseBoolean(string3);
        boolean bl5 = Boolean.parseBoolean(string4);
        return new s(bl2, bl3, bl4, bl5, string5, charset);
    }

    @Override
    public /* synthetic */ Serializable b(h h2) {
        return this.c(h2);
    }
}

