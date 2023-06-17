/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.cc;
import com.a.a.b.cl;
import com.a.a.d.aer;
import com.a.a.d.xe;
import com.a.a.d.xo;
import java.util.Comparator;

final class aez
extends xo {
    private final Object a;
    private int b;
    private int c;
    private long d;
    private int e;
    private aez f;
    private aez g;
    private aez h;
    private aez i;

    aez(Object object, int n2) {
        cl.a(n2 > 0);
        this.a = object;
        this.b = n2;
        this.d = n2;
        this.c = 1;
        this.e = 1;
        this.f = null;
        this.g = null;
    }

    public int a(Comparator comparator, Object object) {
        int n2 = comparator.compare(object, this.a);
        if (n2 < 0) {
            return this.f == null ? 0 : this.f.a(comparator, object);
        }
        if (n2 > 0) {
            return this.g == null ? 0 : this.g.a(comparator, object);
        }
        return this.b;
    }

    private aez a(Object object, int n2) {
        this.g = new aez(object, n2);
        aer.a(this, this.g, this.i);
        this.e = Math.max(2, this.e);
        ++this.c;
        this.d += (long)n2;
        return this;
    }

    private aez b(Object object, int n2) {
        this.f = new aez(object, n2);
        aer.a(this.h, this.f, this);
        this.e = Math.max(2, this.e);
        ++this.c;
        this.d += (long)n2;
        return this;
    }

    aez a(Comparator comparator, Object object, int n2, int[] arrn) {
        int n3 = comparator.compare(object, this.a);
        if (n3 < 0) {
            aez aez2 = this.f;
            if (aez2 == null) {
                arrn[0] = 0;
                return this.b(object, n2);
            }
            int n4 = aez2.e;
            this.f = aez2.a(comparator, object, n2, arrn);
            if (arrn[0] == 0) {
                ++this.c;
            }
            this.d += (long)n2;
            return this.f.e == n4 ? this : this.g();
        }
        if (n3 > 0) {
            aez aez3 = this.g;
            if (aez3 == null) {
                arrn[0] = 0;
                return this.a(object, n2);
            }
            int n5 = aez3.e;
            this.g = aez3.a(comparator, object, n2, arrn);
            if (arrn[0] == 0) {
                ++this.c;
            }
            this.d += (long)n2;
            return this.g.e == n5 ? this : this.g();
        }
        arrn[0] = this.b;
        long l2 = (long)this.b + (long)n2;
        cl.a(l2 <= Integer.MAX_VALUE);
        this.b += n2;
        this.d += (long)n2;
        return this;
    }

    aez b(Comparator comparator, Object object, int n2, int[] arrn) {
        int n3 = comparator.compare(object, this.a);
        if (n3 < 0) {
            aez aez2 = this.f;
            if (aez2 == null) {
                arrn[0] = 0;
                return this;
            }
            this.f = aez2.b(comparator, object, n2, arrn);
            if (arrn[0] > 0) {
                if (n2 >= arrn[0]) {
                    --this.c;
                    this.d -= (long)arrn[0];
                } else {
                    this.d -= (long)n2;
                }
            }
            return arrn[0] == 0 ? this : this.g();
        }
        if (n3 > 0) {
            aez aez3 = this.g;
            if (aez3 == null) {
                arrn[0] = 0;
                return this;
            }
            this.g = aez3.b(comparator, object, n2, arrn);
            if (arrn[0] > 0) {
                if (n2 >= arrn[0]) {
                    --this.c;
                    this.d -= (long)arrn[0];
                } else {
                    this.d -= (long)n2;
                }
            }
            return this.g();
        }
        arrn[0] = this.b;
        if (n2 >= this.b) {
            return this.c();
        }
        this.b -= n2;
        this.d -= (long)n2;
        return this;
    }

    aez c(Comparator comparator, Object object, int n2, int[] arrn) {
        int n3 = comparator.compare(object, this.a);
        if (n3 < 0) {
            aez aez2 = this.f;
            if (aez2 == null) {
                arrn[0] = 0;
                return n2 > 0 ? this.b(object, n2) : this;
            }
            this.f = aez2.c(comparator, object, n2, arrn);
            if (n2 == 0 && arrn[0] != 0) {
                --this.c;
            } else if (n2 > 0 && arrn[0] == 0) {
                ++this.c;
            }
            this.d += (long)(n2 - arrn[0]);
            return this.g();
        }
        if (n3 > 0) {
            aez aez3 = this.g;
            if (aez3 == null) {
                arrn[0] = 0;
                return n2 > 0 ? this.a(object, n2) : this;
            }
            this.g = aez3.c(comparator, object, n2, arrn);
            if (n2 == 0 && arrn[0] != 0) {
                --this.c;
            } else if (n2 > 0 && arrn[0] == 0) {
                ++this.c;
            }
            this.d += (long)(n2 - arrn[0]);
            return this.g();
        }
        arrn[0] = this.b;
        if (n2 == 0) {
            return this.c();
        }
        this.d += (long)(n2 - this.b);
        this.b = n2;
        return this;
    }

    aez a(Comparator comparator, Object object, int n2, int n3, int[] arrn) {
        int n4 = comparator.compare(object, this.a);
        if (n4 < 0) {
            aez aez2 = this.f;
            if (aez2 == null) {
                arrn[0] = 0;
                if (n2 == 0 && n3 > 0) {
                    return this.b(object, n3);
                }
                return this;
            }
            this.f = aez2.a(comparator, object, n2, n3, arrn);
            if (arrn[0] == n2) {
                if (n3 == 0 && arrn[0] != 0) {
                    --this.c;
                } else if (n3 > 0 && arrn[0] == 0) {
                    ++this.c;
                }
                this.d += (long)(n3 - arrn[0]);
            }
            return this.g();
        }
        if (n4 > 0) {
            aez aez3 = this.g;
            if (aez3 == null) {
                arrn[0] = 0;
                if (n2 == 0 && n3 > 0) {
                    return this.a(object, n3);
                }
                return this;
            }
            this.g = aez3.a(comparator, object, n2, n3, arrn);
            if (arrn[0] == n2) {
                if (n3 == 0 && arrn[0] != 0) {
                    --this.c;
                } else if (n3 > 0 && arrn[0] == 0) {
                    ++this.c;
                }
                this.d += (long)(n3 - arrn[0]);
            }
            return this.g();
        }
        arrn[0] = this.b;
        if (n2 == this.b) {
            if (n3 == 0) {
                return this.c();
            }
            this.d += (long)(n3 - this.b);
            this.b = n3;
        }
        return this;
    }

    private aez c() {
        int n2 = this.b;
        this.b = 0;
        aer.a(this.h, this.i);
        if (this.f == null) {
            return this.g;
        }
        if (this.g == null) {
            return this.f;
        }
        if (this.f.e >= this.g.e) {
            aez aez2 = this.h;
            aez2.f = this.f.j(aez2);
            aez2.g = this.g;
            aez2.c = this.c - 1;
            aez2.d = this.d - (long)n2;
            return aez2.g();
        }
        aez aez3 = this.i;
        aez3.g = this.g.i(aez3);
        aez3.f = this.f;
        aez3.c = this.c - 1;
        aez3.d = this.d - (long)n2;
        return aez3.g();
    }

    private aez i(aez aez2) {
        if (this.f == null) {
            return this.g;
        }
        this.f = this.f.i(aez2);
        --this.c;
        this.d -= (long)aez2.b;
        return this.g();
    }

    private aez j(aez aez2) {
        if (this.g == null) {
            return this.f;
        }
        this.g = this.g.j(aez2);
        --this.c;
        this.d -= (long)aez2.b;
        return this.g();
    }

    private void d() {
        this.c = 1 + aer.a(this.f) + aer.a(this.g);
        this.d = (long)this.b + aez.k(this.f) + aez.k(this.g);
    }

    private void e() {
        this.e = 1 + Math.max(aez.l(this.f), aez.l(this.g));
    }

    private void f() {
        this.d();
        this.e();
    }

    private aez g() {
        switch (this.h()) {
            case -2: {
                if (this.g.h() > 0) {
                    this.g = this.g.j();
                }
                return this.i();
            }
            case 2: {
                if (this.f.h() < 0) {
                    this.f = this.f.i();
                }
                return this.j();
            }
        }
        this.e();
        return this;
    }

    private int h() {
        return aez.l(this.f) - aez.l(this.g);
    }

    private aez i() {
        cl.b(this.g != null);
        aez aez2 = this.g;
        this.g = aez2.f;
        aez2.f = this;
        aez2.d = this.d;
        aez2.c = this.c;
        this.f();
        aez2.e();
        return aez2;
    }

    private aez j() {
        cl.b(this.f != null);
        aez aez2 = this.f;
        this.f = aez2.g;
        aez2.g = this;
        aez2.d = this.d;
        aez2.c = this.c;
        this.f();
        aez2.e();
        return aez2;
    }

    private static long k(aez aez2) {
        return aez2 == null ? 0L : aez2.d;
    }

    private static int l(aez aez2) {
        return aez2 == null ? 0 : aez2.e;
    }

    private aez b(Comparator comparator, Object object) {
        int n2 = comparator.compare(object, this.a);
        if (n2 < 0) {
            return this.f == null ? this : (aez)cc.b(this.f.b(comparator, object), this);
        }
        if (n2 == 0) {
            return this;
        }
        return this.g == null ? null : this.g.b(comparator, object);
    }

    private aez c(Comparator comparator, Object object) {
        int n2 = comparator.compare(object, this.a);
        if (n2 > 0) {
            return this.g == null ? this : (aez)cc.b(this.g.c(comparator, object), this);
        }
        if (n2 == 0) {
            return this;
        }
        return this.f == null ? null : this.f.c(comparator, object);
    }

    @Override
    public Object a() {
        return this.a;
    }

    @Override
    public int b() {
        return this.b;
    }

    @Override
    public String toString() {
        return xe.a(this.a(), this.b()).toString();
    }

    static /* synthetic */ int a(aez aez2) {
        return aez2.b;
    }

    static /* synthetic */ long b(aez aez2) {
        return aez2.d;
    }

    static /* synthetic */ int c(aez aez2) {
        return aez2.c;
    }

    static /* synthetic */ Object d(aez aez2) {
        return aez2.a;
    }

    static /* synthetic */ aez e(aez aez2) {
        return aez2.f;
    }

    static /* synthetic */ aez f(aez aez2) {
        return aez2.g;
    }

    static /* synthetic */ aez a(aez aez2, Comparator comparator, Object object) {
        return aez2.b(comparator, object);
    }

    static /* synthetic */ aez g(aez aez2) {
        return aez2.i;
    }

    static /* synthetic */ aez b(aez aez2, Comparator comparator, Object object) {
        return aez2.c(comparator, object);
    }

    static /* synthetic */ aez h(aez aez2) {
        return aez2.h;
    }

    static /* synthetic */ aez a(aez aez2, aez aez3) {
        aez2.i = aez3;
        return aez2.i;
    }

    static /* synthetic */ aez b(aez aez2, aez aez3) {
        aez2.h = aez3;
        return aez2.h;
    }
}

