/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.a;

import java.util.Map;
import org.apache.logging.log4j.a.j;
import org.apache.logging.log4j.a.x;
import org.apache.logging.log4j.a.z;
import org.apache.logging.log4j.e.a;

public class y
extends j {
    private static final long a = 1703221292892071920L;
    private static final int b = 32;
    private static final int c = 31;
    private x d;
    private String e;
    private String f;

    public y(String string, String string2, String string3) {
        this.d = new x(string, null, null);
        this.e = string2;
        this.f = string3;
    }

    public y(String string, String string2, String string3, Map map) {
        super(map);
        this.d = new x(string, null, null);
        this.e = string2;
        this.f = string3;
    }

    public y(x x2, String string, String string2) {
        this.d = x2;
        this.e = string;
        this.f = string2;
    }

    public y(x x2, String string, String string2, Map map) {
        super(map);
        this.d = x2;
        this.e = string;
        this.f = string2;
    }

    private y(y y2, Map map) {
        super(map);
        this.d = y2.d;
        this.e = y2.e;
        this.f = y2.f;
    }

    protected y() {
    }

    @Override
    public String[] e() {
        String[] arrstring = new String[z.values().length];
        int n2 = 0;
        for (z z2 : z.values()) {
            arrstring[n2++] = z2.name();
        }
        return arrstring;
    }

    public x i() {
        return this.d;
    }

    protected void d(String string) {
        this.d = new x(string, null, null);
    }

    protected void a(x x2) {
        this.d = x2;
    }

    public String j() {
        return this.f;
    }

    protected void e(String string) {
        if (string.length() > 32) {
            throw new IllegalArgumentException("structured data type exceeds maximum length of 32 characters: " + string);
        }
        this.f = string;
    }

    @Override
    public String b() {
        return this.e;
    }

    protected void f(String string) {
        this.e = string;
    }

    @Override
    protected void b(String string, String string2) {
        this.g(string);
    }

    private void g(String string) {
        char[] arrc;
        if (string.length() > 32) {
            throw new IllegalArgumentException("Structured data keys are limited to 32 characters. key: " + string);
        }
        for (char c2 : arrc = string.toCharArray()) {
            if (c2 >= '!' && c2 <= '~' && c2 != '=' && c2 != ']' && c2 != '\"') continue;
            throw new IllegalArgumentException("Structured data keys must contain printable US ASCII charactersand may not contain a space, =, ], or \"");
        }
    }

    @Override
    public String h() {
        return this.a(z.b, null);
    }

    @Override
    public String c(String string) {
        try {
            return this.a((z)org.apache.logging.log4j.e.a.a(z.class, string), null);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            return this.h();
        }
    }

    public final String a(z z2, x x2) {
        String string;
        Object object;
        StringBuilder stringBuilder = new StringBuilder();
        boolean bl2 = z.b.equals((Object)z2);
        if (bl2) {
            object = this.j();
            if (object == null) {
                return stringBuilder.toString();
            }
            stringBuilder.append(this.j()).append(" ");
        }
        if ((object = (object = this.i()) != null ? ((x)object).a(x2) : x2) == null || ((x)object).c() == null) {
            return stringBuilder.toString();
        }
        stringBuilder.append("[");
        stringBuilder.append(object);
        stringBuilder.append(" ");
        this.b(stringBuilder);
        stringBuilder.append("]");
        if (bl2 && (string = this.b()) != null) {
            stringBuilder.append(" ").append(string);
        }
        return stringBuilder.toString();
    }

    @Override
    public String a() {
        return this.a(z.b, null);
    }

    @Override
    public String a(String[] arrstring) {
        if (arrstring != null && arrstring.length > 0) {
            for (String string : arrstring) {
                if (z.a.name().equalsIgnoreCase(string)) {
                    return this.k();
                }
                if (!z.b.name().equalsIgnoreCase(string)) continue;
                return this.a(z.b, null);
            }
            return this.a((z)null, (x)null);
        }
        return this.a(z.b, null);
    }

    private String k() {
        StringBuilder stringBuilder = new StringBuilder();
        x x2 = this.i();
        if (x2 == null || x2.c() == null || this.f == null) {
            return stringBuilder.toString();
        }
        stringBuilder.append("<StructuredData>\n");
        stringBuilder.append("<type>").append(this.f).append("</type>\n");
        stringBuilder.append("<id>").append(x2).append("</id>\n");
        super.a(stringBuilder);
        stringBuilder.append("</StructuredData>\n");
        return stringBuilder.toString();
    }

    @Override
    public String toString() {
        return this.a((z)null, (x)null);
    }

    @Override
    public j b(Map map) {
        return new y(this, map);
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        y y2 = (y)object;
        if (!super.equals(object)) {
            return false;
        }
        if (this.f != null ? !this.f.equals(y2.f) : y2.f != null) {
            return false;
        }
        if (this.d != null ? !this.d.equals(y2.d) : y2.d != null) {
            return false;
        }
        return !(this.e != null ? !this.e.equals(y2.e) : y2.e != null);
    }

    @Override
    public int hashCode() {
        int n2 = super.hashCode();
        n2 = 31 * n2 + (this.f != null ? this.f.hashCode() : 0);
        n2 = 31 * n2 + (this.d != null ? this.d.hashCode() : 0);
        n2 = 31 * n2 + (this.e != null ? this.e.hashCode() : 0);
        return n2;
    }
}

