/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.d;

import com.ibm.icu.a.ar;
import com.ibm.icu.d.it;
import com.ibm.icu.d.v;
import com.ibm.icu.d.w;
import com.ibm.icu.util.dn;
import com.ibm.icu.util.du;
import java.lang.ref.SoftReference;
import java.text.CharacterIterator;
import java.text.StringCharacterIterator;
import java.util.Locale;
import java.util.MissingResourceException;

public abstract class u
implements Cloneable {
    private static final boolean g = ar.b("breakiterator");
    public static final int a = -1;
    public static final int b = 0;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 4;
    private static final int h = 5;
    private static final SoftReference[] i = new SoftReference[5];
    private static w j;
    private dn k;
    private dn l;

    protected u() {
    }

    public Object clone() {
        try {
            return super.clone();
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            throw new IllegalStateException();
        }
    }

    public abstract int a();

    public abstract int b();

    public abstract int a(int var1);

    public abstract int c();

    public abstract int d();

    public abstract int b(int var1);

    public int c(int n2) {
        int n3 = this.b(n2);
        while (n3 >= n2 && n3 != -1) {
            n3 = this.d();
        }
        return n3;
    }

    public boolean d(int n2) {
        if (n2 == 0) {
            return true;
        }
        return this.b(n2 - 1) == n2;
    }

    public abstract int e();

    public abstract CharacterIterator f();

    public void a(String string) {
        this.a(new StringCharacterIterator(string));
    }

    public abstract void a(CharacterIterator var1);

    public static u g() {
        return u.a(dn.b());
    }

    public static u a(Locale locale) {
        return u.a(dn.a(locale), 1);
    }

    public static u a(dn dn2) {
        return u.a(dn2, 1);
    }

    public static u h() {
        return u.b(dn.b());
    }

    public static u b(Locale locale) {
        return u.a(dn.a(locale), 2);
    }

    public static u b(dn dn2) {
        return u.a(dn2, 2);
    }

    public static u i() {
        return u.c(dn.b());
    }

    public static u c(Locale locale) {
        return u.a(dn.a(locale), 0);
    }

    public static u c(dn dn2) {
        return u.a(dn2, 0);
    }

    public static u j() {
        return u.d(dn.b());
    }

    public static u d(Locale locale) {
        return u.a(dn.a(locale), 3);
    }

    public static u d(dn dn2) {
        return u.a(dn2, 3);
    }

    public static u k() {
        return u.e(dn.b());
    }

    public static u e(Locale locale) {
        return u.a(dn.a(locale), 4);
    }

    public static u e(dn dn2) {
        return u.a(dn2, 4);
    }

    public static Object a(u u2, Locale locale, int n2) {
        return u.a(u2, dn.a(locale), n2);
    }

    public static Object a(u u2, dn dn2, int n2) {
        v v2;
        if (i[n2] != null && (v2 = (v)i[n2].get()) != null && v2.a().equals(dn2)) {
            u.i[n2] = null;
        }
        return u.n().a(u2, dn2, n2);
    }

    public static boolean a(Object object) {
        if (object == null) {
            throw new IllegalArgumentException("registry key must not be null");
        }
        if (j != null) {
            for (int i2 = 0; i2 < 5; ++i2) {
                u.i[i2] = null;
            }
            return j.a(object);
        }
        return false;
    }

    public static u a(dn dn2, int n2) {
        Object object;
        if (i[n2] != null && (object = (v)i[n2].get()) != null && ((v)object).a().equals(dn2)) {
            return ((v)object).b();
        }
        object = u.n().a(dn2, n2);
        v v2 = new v(dn2, (u)object);
        u.i[n2] = new SoftReference<v>(v2);
        if (object instanceof it) {
            it it2 = (it)object;
            it2.e(n2);
        }
        return object;
    }

    public static synchronized Locale[] l() {
        return u.n().a();
    }

    public static synchronized dn[] m() {
        return u.n().b();
    }

    private static w n() {
        if (j == null) {
            try {
                Class<?> class_ = Class.forName("com.ibm.icu.d.x");
                j = (w)class_.newInstance();
            }
            catch (MissingResourceException missingResourceException) {
                throw missingResourceException;
            }
            catch (Exception exception) {
                if (g) {
                    exception.printStackTrace();
                }
                throw new RuntimeException(exception.getMessage());
            }
        }
        return j;
    }

    public final dn a(du du2) {
        return du2 == dn.w ? this.l : this.k;
    }

    final void a(dn dn2, dn dn3) {
        if (dn2 == null != (dn3 == null)) {
            throw new IllegalArgumentException();
        }
        this.k = dn2;
        this.l = dn3;
    }
}

