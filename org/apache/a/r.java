/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a;

import java.io.Serializable;
import java.net.InetAddress;
import java.util.Locale;
import org.apache.a.o.a;
import org.apache.a.o.i;

public final class r
implements Serializable,
Cloneable {
    private static final long g = -7529410654042457626L;
    public static final String a = "http";
    protected final String b;
    protected final String c;
    protected final int d;
    protected final String e;
    protected final InetAddress f;

    public r(String string, int n2, String string2) {
        this.b = (String)org.apache.a.o.a.b(string, "Host name");
        this.c = string.toLowerCase(Locale.ENGLISH);
        this.e = string2 != null ? string2.toLowerCase(Locale.ENGLISH) : a;
        this.d = n2;
        this.f = null;
    }

    public r(String string, int n2) {
        this(string, n2, null);
    }

    public r(String string) {
        this(string, -1, null);
    }

    public r(InetAddress inetAddress, int n2, String string) {
        this.f = (InetAddress)org.apache.a.o.a.a(inetAddress, "Inet address");
        this.b = inetAddress.getHostAddress();
        this.c = this.b.toLowerCase(Locale.ENGLISH);
        this.e = string != null ? string.toLowerCase(Locale.ENGLISH) : a;
        this.d = n2;
    }

    public r(InetAddress inetAddress, int n2) {
        this(inetAddress, n2, null);
    }

    public r(InetAddress inetAddress) {
        this(inetAddress, -1, null);
    }

    public r(r r2) {
        org.apache.a.o.a.a(r2, "HTTP host");
        this.b = r2.b;
        this.c = r2.c;
        this.e = r2.e;
        this.d = r2.d;
        this.f = r2.f;
    }

    public String a() {
        return this.b;
    }

    public int b() {
        return this.d;
    }

    public String c() {
        return this.e;
    }

    public InetAddress d() {
        return this.f;
    }

    public String e() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.e);
        stringBuilder.append("://");
        stringBuilder.append(this.b);
        if (this.d != -1) {
            stringBuilder.append(':');
            stringBuilder.append(Integer.toString(this.d));
        }
        return stringBuilder.toString();
    }

    public String f() {
        if (this.d != -1) {
            StringBuilder stringBuilder = new StringBuilder(this.b.length() + 6);
            stringBuilder.append(this.b);
            stringBuilder.append(":");
            stringBuilder.append(Integer.toString(this.d));
            return stringBuilder.toString();
        }
        return this.b;
    }

    public String toString() {
        return this.e();
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object instanceof r) {
            r r2 = (r)object;
            return this.c.equals(r2.c) && this.d == r2.d && this.e.equals(r2.e);
        }
        return false;
    }

    public int hashCode() {
        int n2 = 17;
        n2 = i.a(n2, (Object)this.c);
        n2 = i.a(n2, this.d);
        n2 = i.a(n2, (Object)this.e);
        return n2;
    }

    public Object clone() {
        return super.clone();
    }
}

