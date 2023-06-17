/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.d;

import com.ibm.icu.a.cj;
import com.ibm.icu.a.iy;
import com.ibm.icu.d.eb;
import com.ibm.icu.d.ec;
import com.ibm.icu.d.ku;
import java.util.Collections;
import java.util.EnumSet;

public abstract class ea {
    public static final int b = 0;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 4;
    public static final int f = 8;
    public static final int g = 16;
    public static final int h = 32;
    public static final int i = 64;

    public static ea a(int n2) {
        return new iy(n2);
    }

    public abstract StringBuilder a(CharSequence var1, StringBuilder var2, ec var3);

    public abstract StringBuilder b(CharSequence var1, StringBuilder var2, ec var3);

    public abstract StringBuilder c(CharSequence var1, StringBuilder var2, ec var3);

    public abstract StringBuilder d(CharSequence var1, StringBuilder var2, ec var3);

    protected static void a(ec ec2) {
        ec.a(ec2);
    }

    protected static boolean a(ec ec2, EnumSet enumSet) {
        return !ec.b(ec2).isEmpty() && !Collections.disjoint(ec.b(ec2), enumSet);
    }

    protected static boolean b(ec ec2, EnumSet enumSet) {
        return !ec.c(ec2).isEmpty() && !Collections.disjoint(ec.c(ec2), enumSet);
    }

    protected static void a(ec ec2, eb eb2) {
        ec.c(ec2).add(eb2);
    }

    protected static void b(ec ec2) {
        if (!ec.c(ec2).isEmpty()) {
            ec.b(ec2).addAll(ec.c(ec2));
            ec.c(ec2).clear();
        }
    }

    protected static void b(ec ec2, eb eb2) {
        ec.b(ec2).add(eb2);
    }

    protected static void c(ec ec2) {
        ec.a(ec2, true);
    }

    protected static void d(ec ec2) {
        ec.b(ec2, true);
    }

    protected static boolean e(ec ec2) {
        return ec.d(ec2);
    }

    protected static void f(ec ec2) {
        ec.c(ec2, false);
    }

    protected static boolean g(ec ec2) {
        return ec.e(ec2);
    }

    protected ea() {
    }

    public static StringBuffer a(String string, int n2) {
        ku ku2 = ku.b(string);
        return ea.a(ku2, n2);
    }

    public static StringBuffer a(StringBuffer stringBuffer, int n2) {
        ku ku2 = ku.a(stringBuffer);
        return ea.a(ku2, n2);
    }

    public static StringBuffer a(ku ku2, int n2) {
        return cj.a(ku2, n2);
    }

    public static StringBuffer b(ku ku2, int n2) {
        return ea.b(ku2.i(), n2);
    }

    public static StringBuffer b(StringBuffer stringBuffer, int n2) {
        return ea.b(stringBuffer.toString(), n2);
    }

    public static StringBuffer b(String string, int n2) {
        return cj.a(string, n2);
    }

    public static StringBuffer c(String string, int n2) {
        ku ku2 = ku.b(string);
        return ea.c(ku2, n2);
    }

    public static StringBuffer c(StringBuffer stringBuffer, int n2) {
        ku ku2 = ku.a(stringBuffer);
        return ea.c(ku2, n2);
    }

    public static StringBuffer c(ku ku2, int n2) {
        return cj.b(ku2, n2);
    }

    public static StringBuffer d(ku ku2, int n2) {
        return ea.d(ku2.i(), n2);
    }

    public static StringBuffer d(StringBuffer stringBuffer, int n2) {
        return ea.d(stringBuffer.toString(), n2);
    }

    public static StringBuffer d(String string, int n2) {
        return cj.b(string, n2);
    }

    public static int a(StringBuffer stringBuffer, StringBuffer stringBuffer2, int n2) {
        if (stringBuffer == null || stringBuffer2 == null) {
            throw new IllegalArgumentException("One of the source buffers is null");
        }
        return cj.a(stringBuffer.toString(), stringBuffer2.toString(), n2);
    }

    public static int a(String string, String string2, int n2) {
        if (string == null || string2 == null) {
            throw new IllegalArgumentException("One of the source buffers is null");
        }
        return cj.a(string, string2, n2);
    }

    public static int a(ku ku2, ku ku3, int n2) {
        if (ku2 == null || ku3 == null) {
            throw new IllegalArgumentException("One of the source buffers is null");
        }
        return cj.a(ku2.i(), ku3.i(), n2);
    }
}

