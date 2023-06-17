/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.d;

import com.ibm.icu.a.en;
import com.ibm.icu.a.he;
import com.ibm.icu.a.hf;
import com.ibm.icu.a.hk;
import com.ibm.icu.a.v;
import com.ibm.icu.d.iq;
import com.ibm.icu.d.kw;
import com.ibm.icu.d.kx;
import java.text.CharacterIterator;

public abstract class ku
implements kw,
Cloneable {
    protected ku() {
    }

    public static final ku a(iq iq2) {
        return new en(iq2);
    }

    public static final ku b(String string) {
        return new en(string);
    }

    public static final ku a(char[] arrc) {
        return ku.a(arrc, 0, arrc.length);
    }

    public static final ku a(char[] arrc, int n2, int n3) {
        return new he(arrc, n2, n3);
    }

    public static final ku a(StringBuffer stringBuffer) {
        return new en(stringBuffer);
    }

    public static final ku a(CharacterIterator characterIterator) {
        return new v(characterIterator);
    }

    public CharacterIterator g() {
        return new hf(this);
    }

    public abstract int a();

    public int h() {
        int n2 = this.a();
        if (kx.c((char)n2)) {
            this.d();
            int n3 = this.a();
            this.e();
            if (kx.b((char)n3)) {
                return hk.a((char)n2, (char)n3);
            }
        }
        return n2;
    }

    public abstract int b();

    public abstract int c();

    public abstract int d();

    public int j() {
        int n2 = this.d();
        if (kx.c((char)n2)) {
            int n3 = this.d();
            if (kx.b((char)n3)) {
                return hk.a((char)n2, (char)n3);
            }
            if (n3 != -1) {
                this.e();
            }
        }
        return n2;
    }

    public abstract int e();

    public int k() {
        int n2 = this.e();
        if (kx.b((char)n2)) {
            int n3 = this.e();
            if (kx.c((char)n3)) {
                return hk.a((char)n3, (char)n2);
            }
            if (n3 != -1) {
                this.d();
            }
        }
        return n2;
    }

    public abstract void a(int var1);

    public void f() {
        this.a(this.b());
    }

    public void l() {
        this.a(0);
    }

    public abstract int a(char[] var1, int var2);

    public final int b(char[] arrc) {
        return this.a(arrc, 0);
    }

    public String i() {
        char[] arrc = new char[this.b()];
        this.b(arrc);
        return new String(arrc);
    }

    public int b(int n2) {
        int n3 = Math.max(0, Math.min(this.c() + n2, this.b()));
        this.a(n3);
        return n3;
    }

    public int c(int n2) {
        if (n2 > 0) {
            while (n2 > 0 && this.j() != -1) {
                --n2;
            }
        } else {
            while (n2 < 0 && this.k() != -1) {
                ++n2;
            }
        }
        if (n2 != 0) {
            throw new IndexOutOfBoundsException();
        }
        return this.c();
    }

    public Object clone() {
        return super.clone();
    }
}

