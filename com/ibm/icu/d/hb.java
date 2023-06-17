/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.d;

import com.ibm.icu.a.jd;
import com.ibm.icu.d.et;
import com.ibm.icu.d.ex;
import com.ibm.icu.d.ey;
import com.ibm.icu.d.gq;
import com.ibm.icu.d.hd;
import com.ibm.icu.d.he;
import com.ibm.icu.d.hf;
import com.ibm.icu.d.ho;
import com.ibm.icu.d.kv;
import com.ibm.icu.util.dn;
import com.ibm.icu.util.dr;
import java.io.ObjectInputStream;
import java.text.FieldPosition;
import java.text.ParsePosition;
import java.util.Map;

public class hb
extends kv {
    private static final long b = 1L;
    private dn c = null;
    private hf d = null;
    private String e = null;
    private transient et f;
    private Map g = null;
    private gq h = null;
    private transient double i = 0.0;
    private transient he j = new he(this, null);

    public hb() {
        this.a(null, ho.a, dn.a(dr.b));
    }

    public hb(dn dn2) {
        this.a(null, ho.a, dn2);
    }

    public hb(hf hf2) {
        this.a(hf2, ho.a, dn.a(dr.b));
    }

    public hb(dn dn2, hf hf2) {
        this.a(hf2, ho.a, dn2);
    }

    public hb(dn dn2, ho ho2) {
        this.a(null, ho2, dn2);
    }

    public hb(String string) {
        this.a(null, ho.a, dn.a(dr.b));
        this.a(string);
    }

    public hb(dn dn2, String string) {
        this.a(null, ho.a, dn2);
        this.a(string);
    }

    public hb(hf hf2, String string) {
        this.a(hf2, ho.a, dn.a(dr.b));
        this.a(string);
    }

    public hb(dn dn2, hf hf2, String string) {
        this.a(hf2, ho.a, dn2);
        this.a(string);
    }

    public hb(dn dn2, ho ho2, String string) {
        this.a(null, ho2, dn2);
        this.a(string);
    }

    private void a(hf hf2, ho ho2, dn dn2) {
        this.c = dn2;
        this.d = hf2 == null ? hf.a(this.c, ho2) : hf2;
        this.b();
        this.h = gq.a(this.c);
    }

    private void b() {
        this.e = null;
        if (this.f != null) {
            this.f.a();
        }
        this.i = 0.0;
    }

    public void a(String string) {
        this.e = string;
        if (this.f == null) {
            this.f = new et();
        }
        try {
            this.f.c(string);
            this.i = this.f.d(0);
        }
        catch (RuntimeException runtimeException) {
            this.b();
            throw runtimeException;
        }
    }

    public String a() {
        return this.e;
    }

    static int a(et et2, int n2, hd hd2, double d2) {
        int n3 = et2.k();
        ex ex2 = et2.a(n2);
        double d3 = ex2.a().a() ? et2.b(ex2) : 0.0;
        String string = null;
        boolean bl2 = false;
        int n4 = 0;
        do {
            int n5 = ++n2;
            ++n2;
            ex2 = et2.a(n5);
            ey ey2 = ex2.a();
            if (ey2 == ey.g) break;
            assert (ey2 == ey.l);
            if (et2.b(n2).a()) {
                if (d2 == et2.b(ex2 = et2.a(n2++))) {
                    return n2;
                }
            } else if (!bl2) {
                if (et2.a(ex2, "other")) {
                    if (n4 == 0) {
                        n4 = n2;
                        if (string != null && string.equals("other")) {
                            bl2 = true;
                        }
                    }
                } else {
                    if (string == null) {
                        string = hd2.a(d2 - d3);
                        if (n4 != 0 && string.equals("other")) {
                            bl2 = true;
                        }
                    }
                    if (!bl2 && et2.a(ex2, string)) {
                        n4 = n2;
                        bl2 = true;
                    }
                }
            }
            n2 = et2.e(n2);
        } while (++n2 < n3);
        return n4;
    }

    public final String a(double d2) {
        if (this.f == null || this.f.k() == 0) {
            return this.h.d(d2);
        }
        int n2 = hb.a(this.f, 0, this.j, d2);
        d2 -= this.i;
        StringBuilder stringBuilder = null;
        int n3 = this.f.a(n2).d();
        while (true) {
            ex ex2 = this.f.a(++n2);
            ey ey2 = ex2.a();
            int n4 = ex2.b();
            if (ey2 == ey.b) {
                if (stringBuilder == null) {
                    return this.e.substring(n3, n4);
                }
                return stringBuilder.append(this.e, n3, n4).toString();
            }
            if (ey2 == ey.e || ey2 == ey.c && this.f.c()) {
                if (stringBuilder == null) {
                    stringBuilder = new StringBuilder();
                }
                stringBuilder.append(this.e, n3, n4);
                if (ey2 == ey.e) {
                    stringBuilder.append(this.h.d(d2));
                }
                n3 = ex2.d();
                continue;
            }
            if (ey2 != ey.f) continue;
            if (stringBuilder == null) {
                stringBuilder = new StringBuilder();
            }
            stringBuilder.append(this.e, n3, n4);
            n3 = n4;
            n2 = this.f.e(n2);
            n4 = this.f.a(n2).d();
            et.a(this.e, n3, n4, stringBuilder);
            n3 = n4;
        }
    }

    public StringBuffer format(Object object, StringBuffer stringBuffer, FieldPosition fieldPosition) {
        if (object instanceof Number) {
            stringBuffer.append(this.a(((Number)object).doubleValue()));
            return stringBuffer;
        }
        throw new IllegalArgumentException("'" + object + "' is not a Number");
    }

    public Number a(String string, ParsePosition parsePosition) {
        throw new UnsupportedOperationException();
    }

    public Object parseObject(String string, ParsePosition parsePosition) {
        throw new UnsupportedOperationException();
    }

    public void a(dn dn2) {
        if (dn2 == null) {
            dn2 = dn.a(dr.b);
        }
        this.a(null, ho.a, dn2);
    }

    public void a(gq gq2) {
        this.h = gq2;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        hb hb2 = (hb)object;
        return jd.b(this.c, hb2.c) && jd.b(this.d, hb2.d) && jd.b(this.f, hb2.f) && jd.b(this.h, hb2.h);
    }

    public boolean a(hb hb2) {
        return this.equals(hb2);
    }

    public int hashCode() {
        return this.d.hashCode() ^ ((Object)this.g).hashCode();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("locale=" + this.c);
        stringBuilder.append(", rules='" + this.d + "'");
        stringBuilder.append(", pattern='" + this.e + "'");
        stringBuilder.append(", format='" + this.h + "'");
        return stringBuilder.toString();
    }

    private void a(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.j = new he(this, null);
        this.g = null;
        if (this.e != null) {
            this.a(this.e);
        }
    }

    static /* synthetic */ hf b(hb hb2) {
        return hb2.d;
    }
}

