/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.d;

import com.ibm.icu.a.eb;
import com.ibm.icu.d.et;
import com.ibm.icu.d.ex;
import com.ibm.icu.d.ey;
import java.io.ObjectInputStream;
import java.text.FieldPosition;
import java.text.Format;
import java.text.ParsePosition;

public class iy
extends Format {
    private static final long b = 2993154333257524984L;
    private String c = null;
    private transient et d;

    public iy(String string) {
        this.a(string);
    }

    private void b() {
        this.c = null;
        if (this.d != null) {
            this.d.a();
        }
    }

    public void a(String string) {
        this.c = string;
        if (this.d == null) {
            this.d = new et();
        }
        try {
            this.d.d(string);
        }
        catch (RuntimeException runtimeException) {
            this.b();
            throw runtimeException;
        }
    }

    public String a() {
        return this.c;
    }

    static int a(et et2, int n2, String string) {
        ex ex2;
        ey ey2;
        int n3 = et2.k();
        int n4 = 0;
        while ((ey2 = (ex2 = et2.a(n2++)).a()) != ey.g) {
            assert (ey2 == ey.l);
            if (et2.a(ex2, string)) {
                return n2;
            }
            if (n4 == 0 && et2.a(ex2, "other")) {
                n4 = n2;
            }
            n2 = et2.e(n2);
            if (++n2 < n3) continue;
        }
        return n4;
    }

    public final String b(String string) {
        if (!eb.a((CharSequence)string)) {
            throw new IllegalArgumentException("Invalid formatting argument.");
        }
        if (this.d == null || this.d.k() == 0) {
            throw new IllegalStateException("Invalid format error.");
        }
        int n2 = iy.a(this.d, 0, string);
        if (!this.d.c()) {
            int n3 = this.d.e(n2);
            return this.d.d().substring(this.d.a(n2).d(), this.d.c(n3));
        }
        StringBuilder stringBuilder = null;
        int n4 = this.d.a(n2).d();
        int n5 = n2;
        while (true) {
            ex ex2 = this.d.a(++n5);
            ey ey2 = ex2.a();
            int n6 = ex2.b();
            if (ey2 == ey.b) {
                if (stringBuilder == null) {
                    return this.c.substring(n4, n6);
                }
                return stringBuilder.append(this.c, n4, n6).toString();
            }
            if (ey2 == ey.c) {
                if (stringBuilder == null) {
                    stringBuilder = new StringBuilder();
                }
                stringBuilder.append(this.c, n4, n6);
                n4 = ex2.d();
                continue;
            }
            if (ey2 != ey.f) continue;
            if (stringBuilder == null) {
                stringBuilder = new StringBuilder();
            }
            stringBuilder.append(this.c, n4, n6);
            n4 = n6;
            n5 = this.d.e(n5);
            n6 = this.d.a(n5).d();
            et.a(this.c, n4, n6, stringBuilder);
            n4 = n6;
        }
    }

    public StringBuffer format(Object object, StringBuffer stringBuffer, FieldPosition fieldPosition) {
        if (!(object instanceof String)) {
            throw new IllegalArgumentException("'" + object + "' is not a String");
        }
        stringBuffer.append(this.b((String)object));
        return stringBuffer;
    }

    public Object parseObject(String string, ParsePosition parsePosition) {
        throw new UnsupportedOperationException();
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        iy iy2 = (iy)object;
        return this.d == null ? iy2.d == null : this.d.equals(iy2.d);
    }

    public int hashCode() {
        if (this.c != null) {
            return this.c.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "pattern='" + this.c + "'";
    }

    private void a(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        if (this.c != null) {
            this.a(this.c);
        }
    }
}

