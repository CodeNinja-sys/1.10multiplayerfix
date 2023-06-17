/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a;

import com.ibm.icu.a.eb;
import com.ibm.icu.a.jd;
import com.ibm.icu.d.jy;
import com.ibm.icu.d.kx;
import java.text.ParsePosition;

public class ev {
    private String e;
    private ParsePosition f;
    private jy g;
    private char[] h;
    private int i;
    private boolean j;
    public static final int a = -1;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 4;

    public ev(String string, jy jy2, ParsePosition parsePosition) {
        if (string == null || parsePosition.getIndex() > string.length()) {
            throw new IllegalArgumentException();
        }
        this.e = string;
        this.g = jy2;
        this.f = parsePosition;
        this.h = null;
    }

    public boolean a() {
        return this.h == null && this.f.getIndex() == this.e.length();
    }

    public int a(int n2) {
        int n3;
        block6: {
            Object object;
            n3 = -1;
            this.j = false;
            while (true) {
                n3 = this.e();
                this.d(kx.a(n3));
                if (n3 == 36 && this.h == null && (n2 & 1) != 0 && this.g != null) {
                    object = this.g.a(this.e, this.f, this.e.length());
                    if (object != null) {
                        this.i = 0;
                        this.h = this.g.a((String)object);
                        if (this.h == null) {
                            throw new IllegalArgumentException("Undefined variable: " + (String)object);
                        }
                        if (this.h.length != 0) continue;
                        this.h = null;
                        continue;
                    }
                    break block6;
                }
                if ((n2 & 4) == 0 || !eb.c(n3)) break;
            }
            if (n3 == 92 && (n2 & 2) != 0) {
                object = new int[]{0};
                n3 = jd.a(this.d(), object);
                this.c(object[0]);
                this.j = true;
                if (n3 < 0) {
                    throw new IllegalArgumentException("Invalid escape");
                }
            }
        }
        return n3;
    }

    public boolean b() {
        return this.j;
    }

    public boolean c() {
        return this.h != null;
    }

    public Object a(Object object) {
        if (object == null) {
            return new Object[]{this.h, new int[]{this.f.getIndex(), this.i}};
        }
        Object[] arrobject = (Object[])object;
        arrobject[0] = this.h;
        int[] arrn = (int[])arrobject[1];
        arrn[0] = this.f.getIndex();
        arrn[1] = this.i;
        return object;
    }

    public void b(Object object) {
        Object[] arrobject = (Object[])object;
        this.h = (char[])arrobject[0];
        int[] arrn = (int[])arrobject[1];
        this.f.setIndex(arrn[0]);
        this.i = arrn[1];
    }

    public void b(int n2) {
        if ((n2 & 4) != 0) {
            int n3;
            while (eb.c(n3 = this.e())) {
                this.d(kx.a(n3));
            }
        }
    }

    public String d() {
        if (this.h != null) {
            return new String(this.h, this.i, this.h.length - this.i);
        }
        return this.e.substring(this.f.getIndex());
    }

    public void c(int n2) {
        if (n2 < 0) {
            throw new IllegalArgumentException();
        }
        if (this.h != null) {
            this.i += n2;
            if (this.i > this.h.length) {
                throw new IllegalArgumentException();
            }
            if (this.i == this.h.length) {
                this.h = null;
            }
        } else {
            int n3 = this.f.getIndex() + n2;
            this.f.setIndex(n3);
            if (n3 > this.e.length()) {
                throw new IllegalArgumentException();
            }
        }
    }

    public String toString() {
        int n2 = this.f.getIndex();
        return this.e.substring(0, n2) + '|' + this.e.substring(n2);
    }

    private int e() {
        if (this.h != null) {
            return kx.a(this.h, 0, this.h.length, this.i);
        }
        int n2 = this.f.getIndex();
        return n2 < this.e.length() ? kx.a(this.e, n2) : -1;
    }

    private void d(int n2) {
        if (this.h != null) {
            this.i += n2;
            if (this.i == this.h.length) {
                this.h = null;
            }
        } else {
            this.f.setIndex(this.f.getIndex() + n2);
            if (this.f.getIndex() > this.e.length()) {
                this.f.setIndex(this.e.length());
            }
        }
    }
}

