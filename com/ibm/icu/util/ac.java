/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.util;

import com.ibm.icu.util.aa;
import com.ibm.icu.util.ab;
import com.ibm.icu.util.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

public final class ac
implements Iterator {
    private CharSequence a;
    private int b;
    private int c;
    private int d;
    private int e;
    private boolean f;
    private StringBuilder g = new StringBuilder();
    private int h;
    private ab i = new ab(null);
    private ArrayList j = new ArrayList();

    private ac(CharSequence charSequence, int n2, int n3, int n4) {
        this.a = charSequence;
        this.b = this.c = n2;
        this.d = this.e = n3;
        this.h = n4;
        int n5 = this.d;
        if (n5 >= 0) {
            if (this.h > 0 && ++n5 > this.h) {
                n5 = this.h;
            }
            this.g.append(this.a, this.b, this.b + n5);
            this.b += n5;
            this.d -= n5;
        }
    }

    public ac a() {
        this.b = this.c;
        this.d = this.e;
        this.f = false;
        int n2 = this.d + 1;
        if (this.h > 0 && n2 > this.h) {
            n2 = this.h;
        }
        this.g.setLength(n2);
        this.b += n2;
        this.d -= n2;
        this.j.clear();
        return this;
    }

    public boolean hasNext() {
        return this.b >= 0 || !this.j.isEmpty();
    }

    public ab b() {
        int n2 = this.b;
        if (n2 < 0) {
            if (this.j.isEmpty()) {
                throw new NoSuchElementException();
            }
            long l2 = (Long)this.j.remove(this.j.size() - 1);
            int n3 = (int)l2;
            n2 = (int)(l2 >> 32);
            this.g.setLength(n3 & 0xFFFF);
            if ((n3 >>>= 16) > 1) {
                if ((n2 = this.a(n2, n3)) < 0) {
                    return this.i;
                }
            } else {
                this.g.append(this.a.charAt(n2++));
            }
        }
        if (this.d >= 0) {
            return this.c();
        }
        while (true) {
            int n4;
            int n5;
            if ((n5 = this.a.charAt(n2++)) >= 64) {
                if (this.f) {
                    n2 = z.a(n2, n5);
                    n5 &= 0x3F;
                    this.f = false;
                } else {
                    n4 = (n5 & 0x8000) != 0 ? 1 : 0;
                    this.i.b = n4 != 0 ? z.c(this.a, n2, n5 & 0x7FFF) : z.d(this.a, n2, n5);
                    if (n4 != 0 || this.h > 0 && this.g.length() == this.h) {
                        this.b = -1;
                    } else {
                        this.b = n2 - 1;
                        this.f = true;
                    }
                    this.i.a = this.g;
                    return this.i;
                }
            }
            if (this.h > 0 && this.g.length() == this.h) {
                return this.c();
            }
            if (n5 < 48) {
                if (n5 == 0) {
                    n5 = this.a.charAt(n2++);
                }
                if ((n2 = this.a(n2, n5 + 1)) >= 0) continue;
                return this.i;
            }
            n4 = n5 - 48 + 1;
            if (this.h > 0 && this.g.length() + n4 > this.h) {
                this.g.append(this.a, n2, n2 + this.h - this.g.length());
                return this.c();
            }
            this.g.append(this.a, n2, n2 + n4);
            n2 += n4;
        }
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }

    private ab c() {
        this.b = -1;
        this.i.a = this.g;
        this.i.b = -1;
        return this.i;
    }

    private int a(int n2, int n3) {
        int n4;
        while (n3 > 5) {
            this.j.add((long)z.a(this.a, ++n2) << 32 | (long)(n3 - (n3 >> 1) << 16) | (long)this.g.length());
            n3 >>= 1;
            n2 = z.b(this.a, n2);
        }
        char c2 = this.a.charAt(n2++);
        boolean bl2 = ((n4 = this.a.charAt(n2++)) & 0x8000) != 0;
        int n5 = z.c(this.a, n2, n4 &= 0x7FFF);
        n2 = z.b(n2, n4);
        this.j.add((long)n2 << 32 | (long)(n3 - 1 << 16) | (long)this.g.length());
        this.g.append(c2);
        if (bl2) {
            this.b = -1;
            this.i.a = this.g;
            this.i.b = n5;
            return -1;
        }
        return n2 + n5;
    }

    public /* synthetic */ Object next() {
        return this.b();
    }

    /* synthetic */ ac(CharSequence charSequence, int n2, int n3, int n4, aa aa2) {
        this(charSequence, n2, n3, n4);
    }
}

