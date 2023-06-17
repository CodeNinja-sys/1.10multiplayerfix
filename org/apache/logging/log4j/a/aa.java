/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.a;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.lang.management.ThreadInfo;
import java.lang.reflect.Method;
import java.util.Map;
import org.apache.logging.log4j.a.ab;
import org.apache.logging.log4j.a.ac;
import org.apache.logging.log4j.a.ad;
import org.apache.logging.log4j.a.ae;
import org.apache.logging.log4j.a.af;
import org.apache.logging.log4j.a.ag;
import org.apache.logging.log4j.a.m;

public class aa
implements m {
    private static final long a = -1103400781608841088L;
    private static final af b;
    private volatile Map c;
    private final String d;
    private String e;

    public aa(String string) {
        this.d = string == null ? "" : string;
        this.c = b.a();
    }

    private aa(String string, String string2) {
        this.e = string;
        this.d = string2 == null ? "" : string2;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("ThreadDumpMessage[");
        if (this.d.length() > 0) {
            stringBuilder.append("Title=\"").append(this.d).append("\"");
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    @Override
    public String a() {
        if (this.e != null) {
            return this.e;
        }
        StringBuilder stringBuilder = new StringBuilder(this.d);
        if (this.d.length() > 0) {
            stringBuilder.append("\n");
        }
        for (Map.Entry entry : this.c.entrySet()) {
            ag ag2 = (ag)entry.getKey();
            ag2.a(stringBuilder);
            ag2.a(stringBuilder, (StackTraceElement[])entry.getValue());
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

    @Override
    public String b() {
        return this.d == null ? "" : this.d;
    }

    @Override
    public Object[] c() {
        return null;
    }

    protected Object e() {
        return new ae(this);
    }

    private void a(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Proxy required");
    }

    @Override
    public Throwable d() {
        return null;
    }

    static /* synthetic */ String a(aa aa2) {
        return aa2.d;
    }

    /* synthetic */ aa(String string, String string2, ab ab2) {
        this(string, string2);
    }

    static {
        Method[] arrmethod = ThreadInfo.class.getMethods();
        boolean bl2 = true;
        for (Method method : arrmethod) {
            if (!method.getName().equals("getLockInfo")) continue;
            bl2 = false;
            break;
        }
        b = bl2 ? new ac(null) : new ad(null);
    }
}

