/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.d;

import com.ibm.icu.d.u;
import java.text.CharacterIterator;

public abstract class ix {
    public static final int a = -1;
    protected u b;
    protected CharacterIterator c;
    protected int d;
    private boolean e;
    private boolean f;
    private boolean g;
    private int h;
    private int i;

    public void a(int n2) {
        if (n2 < this.c.getBeginIndex() || n2 > this.c.getEndIndex()) {
            throw new IndexOutOfBoundsException("setIndex(int) expected position to be between " + this.c.getBeginIndex() + " and " + this.c.getEndIndex());
        }
        this.h = n2;
        this.g = false;
        this.d = 0;
    }

    public void a(boolean bl2) {
        this.f = bl2;
    }

    public void a(u u2) {
        this.b = u2;
        if (this.b != null) {
            this.b.a(this.c);
        }
    }

    public void a(CharacterIterator characterIterator) {
        if (characterIterator == null || characterIterator.getEndIndex() == characterIterator.getIndex()) {
            throw new IllegalArgumentException("Illegal null or empty text");
        }
        this.c = characterIterator;
        this.c.setIndex(this.c.getBeginIndex());
        this.d = 0;
        this.g = true;
        this.e = true;
        if (this.b != null) {
            this.b.a(this.c);
        }
    }

    public int a() {
        return this.i;
    }

    public abstract int b();

    public int c() {
        return this.d;
    }

    public u d() {
        return this.b;
    }

    public CharacterIterator e() {
        return this.c;
    }

    public String f() {
        if (this.d > 0) {
            int n2 = this.i + this.d;
            StringBuilder stringBuilder = new StringBuilder(this.d);
            stringBuilder.append(this.c.current());
            this.c.next();
            while (this.c.getIndex() < n2) {
                stringBuilder.append(this.c.current());
                this.c.next();
            }
            this.c.setIndex(this.i);
            return stringBuilder.toString();
        }
        return null;
    }

    public int g() {
        int n2 = this.c.getIndex();
        if (this.h != -1) {
            n2 = this.h;
            this.h = -1;
        }
        if (this.e) {
            if (!this.g && n2 + this.d >= this.c.getEndIndex()) {
                this.d = 0;
                this.c.setIndex(this.c.getEndIndex());
                this.i = -1;
                return -1;
            }
            this.g = false;
        } else {
            this.e = true;
            if (n2 != -1) {
                return n2;
            }
        }
        if (n2 == -1) {
            n2 = this.c.getBeginIndex();
        }
        if (this.d > 0) {
            n2 = this.f ? ++n2 : (n2 += this.d);
        }
        this.i = this.e(n2);
        return this.i;
    }

    public int h() {
        int n2 = this.c.getIndex();
        if (this.h != -1) {
            n2 = this.h;
            this.h = -1;
        }
        if (this.g) {
            this.e = false;
            this.g = false;
            n2 = this.c.getEndIndex();
        }
        if (this.e) {
            this.e = false;
            if (n2 != this.c.getEndIndex()) {
                return n2;
            }
        } else if (n2 == this.c.getBeginIndex()) {
            this.d = 0;
            this.c.setIndex(this.c.getBeginIndex());
            this.i = -1;
            return -1;
        }
        this.i = this.f(n2);
        return this.i;
    }

    public boolean i() {
        return this.f;
    }

    public void j() {
        this.d = 0;
        this.a(this.c.getBeginIndex());
        this.f = false;
        this.e = true;
        this.g = true;
        this.h = -1;
    }

    public final int k() {
        this.e = true;
        this.a(this.c.getBeginIndex());
        return this.g();
    }

    public final int b(int n2) {
        this.e = true;
        this.a(n2);
        return this.g();
    }

    public final int l() {
        this.e = false;
        this.a(this.c.getEndIndex());
        return this.h();
    }

    public final int c(int n2) {
        this.e = false;
        this.a(n2);
        return this.h();
    }

    protected ix(CharacterIterator characterIterator, u u2) {
        if (characterIterator == null || characterIterator.getEndIndex() - characterIterator.getBeginIndex() == 0) {
            throw new IllegalArgumentException("Illegal argument target.  Argument can not be null or of length 0");
        }
        this.c = characterIterator;
        this.b = u2;
        if (this.b != null) {
            this.b.a(characterIterator);
        }
        this.d = 0;
        this.i = -1;
        this.f = false;
        this.e = true;
        this.g = true;
        this.h = -1;
    }

    protected void d(int n2) {
        this.d = n2;
    }

    protected abstract int e(int var1);

    protected abstract int f(int var1);
}

