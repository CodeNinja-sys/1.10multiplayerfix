/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a;

import com.ibm.icu.a.dt;
import com.ibm.icu.a.dy;
import java.io.IOException;

public final class dx
implements Appendable {
    private final dt a;
    private final Appendable b;
    private final StringBuilder c;
    private final boolean d;
    private int e;
    private int f;
    private int g;
    private int h;

    public dx(dt dt2, Appendable appendable, int n2) {
        this.a = dt2;
        this.b = appendable;
        if (this.b instanceof StringBuilder) {
            this.d = true;
            this.c = (StringBuilder)appendable;
            this.c.ensureCapacity(n2);
            this.e = 0;
            if (this.c.length() == 0) {
                this.f = 0;
            } else {
                this.g();
                this.f = this.i();
                if (this.f > 1) {
                    while (this.i() > 1) {
                    }
                }
                this.e = this.h;
            }
        } else {
            this.d = false;
            this.c = new StringBuilder();
            this.e = 0;
            this.f = 0;
        }
    }

    public boolean a() {
        return this.c.length() == 0;
    }

    public int b() {
        return this.c.length();
    }

    public int c() {
        return this.f;
    }

    public StringBuilder d() {
        return this.c;
    }

    public boolean a(CharSequence charSequence, int n2, int n3) {
        return dy.a(this.c, 0, this.c.length(), charSequence, n2, n3);
    }

    public void a(char c2) {
        this.c.setCharAt(this.c.length() - 1, c2);
    }

    public void a(int n2, int n3) {
        if (this.f <= n3 || n3 == 0) {
            this.c.appendCodePoint(n2);
            this.f = n3;
            if (n3 <= 1) {
                this.e = this.c.length();
            }
        } else {
            this.b(n2, n3);
        }
    }

    public void a(CharSequence charSequence, int n2, int n3, int n4, int n5) {
        if (n2 == n3) {
            return;
        }
        if (this.f <= n4 || n4 == 0) {
            if (n5 <= 1) {
                this.e = this.c.length() + (n3 - n2);
            } else if (n4 <= 1) {
                this.e = this.c.length() + 1;
            }
            this.c.append(charSequence, n2, n3);
            this.f = n5;
        } else {
            int n6 = Character.codePointAt(charSequence, n2);
            n2 += Character.charCount(n6);
            this.b(n6, n4);
            while (n2 < n3) {
                n4 = (n2 += Character.charCount(n6 = Character.codePointAt(charSequence, n2))) < n3 ? dt.f(this.a.a(n6)) : n5;
                this.a(n6, n4);
            }
        }
    }

    public dx b(char c2) {
        this.c.append(c2);
        this.f = 0;
        this.e = this.c.length();
        return this;
    }

    public void a(int n2) {
        this.c.appendCodePoint(n2);
        this.f = 0;
        this.e = this.c.length();
    }

    public dx a(CharSequence charSequence) {
        if (charSequence.length() != 0) {
            this.c.append(charSequence);
            this.f = 0;
            this.e = this.c.length();
        }
        return this;
    }

    public dx b(CharSequence charSequence, int n2, int n3) {
        if (n2 != n3) {
            this.c.append(charSequence, n2, n3);
            this.f = 0;
            this.e = this.c.length();
        }
        return this;
    }

    public void e() {
        if (this.d) {
            this.e = this.c.length();
        } else {
            try {
                this.b.append(this.c);
                this.c.setLength(0);
                this.e = 0;
            }
            catch (IOException iOException) {
                throw new RuntimeException(iOException);
            }
        }
        this.f = 0;
    }

    public dx c(CharSequence charSequence, int n2, int n3) {
        if (this.d) {
            this.c.append(charSequence, n2, n3);
            this.e = this.c.length();
        } else {
            try {
                this.b.append(this.c).append(charSequence, n2, n3);
                this.c.setLength(0);
                this.e = 0;
            }
            catch (IOException iOException) {
                throw new RuntimeException(iOException);
            }
        }
        this.f = 0;
        return this;
    }

    public void f() {
        this.c.setLength(0);
        this.f = 0;
        this.e = 0;
    }

    public void b(int n2) {
        int n3 = this.c.length();
        this.c.delete(n3 - n2, n3);
        this.f = 0;
        this.e = this.c.length();
    }

    private void b(int n2, int n3) {
        this.g();
        this.h();
        while (this.i() > n3) {
        }
        if (n2 <= 65535) {
            this.c.insert(this.h, (char)n2);
            if (n3 <= 1) {
                this.e = this.h + 1;
            }
        } else {
            this.c.insert(this.h, Character.toChars(n2));
            if (n3 <= 1) {
                this.e = this.h + 2;
            }
        }
    }

    private void g() {
        this.g = this.c.length();
    }

    private void h() {
        this.h = this.g;
        this.g = this.c.offsetByCodePoints(this.g, -1);
    }

    private int i() {
        this.h = this.g;
        if (this.e >= this.g) {
            return 0;
        }
        int n2 = this.c.codePointBefore(this.g);
        this.g -= Character.charCount(n2);
        if (n2 < 768) {
            return 0;
        }
        return dt.f(this.a.a(n2));
    }

    public /* synthetic */ Appendable append(char c2) {
        return this.b(c2);
    }

    public /* synthetic */ Appendable append(CharSequence charSequence, int n2, int n3) {
        return this.b(charSequence, n2, n3);
    }

    public /* synthetic */ Appendable append(CharSequence charSequence) {
        return this.a(charSequence);
    }
}

