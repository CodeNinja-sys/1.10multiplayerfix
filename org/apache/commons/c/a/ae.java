/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.c.a;

import org.apache.commons.c.a.a;
import org.apache.commons.c.a.ac;
import org.apache.commons.c.a.af;
import org.apache.commons.c.aa;

public class ae
implements a {
    private static volatile af a = af.a;
    private final StringBuffer b;
    private final Object c;
    private final af d;

    public static af f() {
        return a;
    }

    public static void a(af af2) {
        if (af2 == null) {
            throw new IllegalArgumentException("The style must not be null");
        }
        a = af2;
    }

    public static String c(Object object) {
        return ac.a(object);
    }

    public static String b(Object object, af af2) {
        return ac.a(object, af2);
    }

    public static String b(Object object, af af2, boolean bl2) {
        return ac.a(object, af2, bl2, false, null);
    }

    public static String a(Object object, af af2, boolean bl2, Class class_) {
        return ac.a(object, af2, bl2, false, class_);
    }

    public ae(Object object) {
        this(object, null, null);
    }

    public ae(Object object, af af2) {
        this(object, af2, null);
    }

    public ae(Object object, af af2, StringBuffer stringBuffer) {
        if (af2 == null) {
            af2 = ae.f();
        }
        if (stringBuffer == null) {
            stringBuffer = new StringBuffer(512);
        }
        this.b = stringBuffer;
        this.d = af2;
        this.c = object;
        af2.a(stringBuffer, object);
    }

    public ae c(boolean bl2) {
        this.d.a(this.b, (String)null, bl2);
        return this;
    }

    public ae a(boolean[] arrbl) {
        this.d.a(this.b, (String)null, arrbl, (Boolean)null);
        return this;
    }

    public ae a(byte by2) {
        this.d.a(this.b, (String)null, by2);
        return this;
    }

    public ae a(byte[] arrby) {
        this.d.a(this.b, (String)null, arrby, (Boolean)null);
        return this;
    }

    public ae a(char c2) {
        this.d.a(this.b, (String)null, c2);
        return this;
    }

    public ae a(char[] arrc) {
        this.d.a(this.b, (String)null, arrc, (Boolean)null);
        return this;
    }

    public ae a(double d2) {
        this.d.a(this.b, (String)null, d2);
        return this;
    }

    public ae a(double[] arrd) {
        this.d.a(this.b, (String)null, arrd, (Boolean)null);
        return this;
    }

    public ae a(float f2) {
        this.d.a(this.b, (String)null, f2);
        return this;
    }

    public ae a(float[] arrf) {
        this.d.a(this.b, (String)null, arrf, (Boolean)null);
        return this;
    }

    public ae a(int n2) {
        this.d.a(this.b, (String)null, n2);
        return this;
    }

    public ae a(int[] arrn) {
        this.d.a(this.b, (String)null, arrn, (Boolean)null);
        return this;
    }

    public ae a(long l2) {
        this.d.a(this.b, (String)null, l2);
        return this;
    }

    public ae a(long[] arrl) {
        this.d.a(this.b, (String)null, arrl, (Boolean)null);
        return this;
    }

    public ae d(Object object) {
        this.d.a(this.b, null, object, null);
        return this;
    }

    public ae b(Object[] arrobject) {
        this.d.a(this.b, (String)null, arrobject, (Boolean)null);
        return this;
    }

    public ae a(short s2) {
        this.d.a(this.b, (String)null, s2);
        return this;
    }

    public ae a(short[] arrs) {
        this.d.a(this.b, (String)null, arrs, (Boolean)null);
        return this;
    }

    public ae a(String string, boolean bl2) {
        this.d.a(this.b, string, bl2);
        return this;
    }

    public ae a(String string, boolean[] arrbl) {
        this.d.a(this.b, string, arrbl, (Boolean)null);
        return this;
    }

    public ae a(String string, boolean[] arrbl, boolean bl2) {
        this.d.a(this.b, string, arrbl, (Boolean)bl2);
        return this;
    }

    public ae a(String string, byte by2) {
        this.d.a(this.b, string, by2);
        return this;
    }

    public ae a(String string, byte[] arrby) {
        this.d.a(this.b, string, arrby, (Boolean)null);
        return this;
    }

    public ae a(String string, byte[] arrby, boolean bl2) {
        this.d.a(this.b, string, arrby, (Boolean)bl2);
        return this;
    }

    public ae a(String string, char c2) {
        this.d.a(this.b, string, c2);
        return this;
    }

    public ae a(String string, char[] arrc) {
        this.d.a(this.b, string, arrc, (Boolean)null);
        return this;
    }

    public ae a(String string, char[] arrc, boolean bl2) {
        this.d.a(this.b, string, arrc, (Boolean)bl2);
        return this;
    }

    public ae a(String string, double d2) {
        this.d.a(this.b, string, d2);
        return this;
    }

    public ae a(String string, double[] arrd) {
        this.d.a(this.b, string, arrd, (Boolean)null);
        return this;
    }

    public ae a(String string, double[] arrd, boolean bl2) {
        this.d.a(this.b, string, arrd, (Boolean)bl2);
        return this;
    }

    public ae a(String string, float f2) {
        this.d.a(this.b, string, f2);
        return this;
    }

    public ae a(String string, float[] arrf) {
        this.d.a(this.b, string, arrf, (Boolean)null);
        return this;
    }

    public ae a(String string, float[] arrf, boolean bl2) {
        this.d.a(this.b, string, arrf, (Boolean)bl2);
        return this;
    }

    public ae a(String string, int n2) {
        this.d.a(this.b, string, n2);
        return this;
    }

    public ae a(String string, int[] arrn) {
        this.d.a(this.b, string, arrn, (Boolean)null);
        return this;
    }

    public ae a(String string, int[] arrn, boolean bl2) {
        this.d.a(this.b, string, arrn, (Boolean)bl2);
        return this;
    }

    public ae a(String string, long l2) {
        this.d.a(this.b, string, l2);
        return this;
    }

    public ae a(String string, long[] arrl) {
        this.d.a(this.b, string, arrl, (Boolean)null);
        return this;
    }

    public ae a(String string, long[] arrl, boolean bl2) {
        this.d.a(this.b, string, arrl, (Boolean)bl2);
        return this;
    }

    public ae a(String string, Object object) {
        this.d.a(this.b, string, object, null);
        return this;
    }

    public ae a(String string, Object object, boolean bl2) {
        this.d.a(this.b, string, object, (Boolean)bl2);
        return this;
    }

    public ae a(String string, Object[] arrobject) {
        this.d.a(this.b, string, arrobject, (Boolean)null);
        return this;
    }

    public ae a(String string, Object[] arrobject, boolean bl2) {
        this.d.a(this.b, string, arrobject, (Boolean)bl2);
        return this;
    }

    public ae a(String string, short s2) {
        this.d.a(this.b, string, s2);
        return this;
    }

    public ae a(String string, short[] arrs) {
        this.d.a(this.b, string, arrs, (Boolean)null);
        return this;
    }

    public ae a(String string, short[] arrs, boolean bl2) {
        this.d.a(this.b, string, arrs, (Boolean)bl2);
        return this;
    }

    public ae e(Object object) {
        aa.a(this.h(), object);
        return this;
    }

    public ae a(String string) {
        if (string != null) {
            this.d.a(this.b, string);
        }
        return this;
    }

    public ae b(String string) {
        if (string != null) {
            this.d.b(this.b, string);
        }
        return this;
    }

    public Object g() {
        return this.c;
    }

    public StringBuffer h() {
        return this.b;
    }

    public af i() {
        return this.d;
    }

    public String toString() {
        if (this.g() == null) {
            this.h().append(this.i().p());
        } else {
            this.d.b(this.h(), this.g());
        }
        return this.h().toString();
    }

    public String j() {
        return this.toString();
    }

    @Override
    public /* synthetic */ Object a() {
        return this.j();
    }
}

