/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.d;

import com.ibm.icu.d.et;
import com.ibm.icu.d.ew;
import com.ibm.icu.d.ex;
import com.ibm.icu.d.ey;
import com.ibm.icu.d.fb;
import com.ibm.icu.d.fc;
import com.ibm.icu.d.fd;
import com.ibm.icu.d.ff;
import com.ibm.icu.d.fh;
import com.ibm.icu.d.fi;

public final class ez {
    private ez() {
    }

    public static ff a(String string) {
        return ez.a(new et(string));
    }

    public static ff a(et et2) {
        int n2 = et2.k() - 1;
        if (n2 < 0) {
            throw new IllegalArgumentException("The MessagePattern is empty");
        }
        if (et2.b(0) != ey.a) {
            throw new IllegalArgumentException("The MessagePattern does not represent a MessageFormat pattern");
        }
        return ez.a(et2, 0, n2);
    }

    private static ff a(et et2, int n2, int n3) {
        int n4 = et2.a(n2).d();
        ff ff2 = new ff(null);
        int n5 = n2 + 1;
        while (true) {
            ex ex2;
            int n6;
            if (n4 < (n6 = (ex2 = et2.a(n5)).b())) {
                ff.a(ff2, new fh(et2.d().substring(n4, n6), null));
            }
            if (n5 == n3) break;
            ey ey2 = ex2.a();
            if (ey2 == ey.f) {
                int n7 = et2.e(n5);
                ff.a(ff2, ez.b(et2, n5, n7));
                n5 = n7;
                ex2 = et2.a(n5);
            } else if (ey2 == ey.e) {
                ff.a(ff2, fd.i());
            }
            n4 = ex2.d();
            ++n5;
        }
        return ff.a(ff2);
    }

    private static fb b(et et2, int n2, int n3) {
        fb fb2 = fb.g();
        ex ex2 = et2.a(n2);
        ew ew2 = fb.a(fb2, ex2.f());
        ex2 = et2.a(++n2);
        fb.a(fb2, et2.a(ex2));
        if (ex2.a() == ey.h) {
            fb.a(fb2, ex2.e());
        }
        ++n2;
        switch (ew2) {
            case b: {
                fb.b(fb2, et2.a(et2.a(n2++)));
                if (n2 >= n3) break;
                fb.c(fb2, et2.a(et2.a(n2)));
                break;
            }
            case c: {
                fb.b(fb2, "choice");
                fb.a(fb2, ez.c(et2, n2, n3));
                break;
            }
            case d: {
                fb.b(fb2, "plural");
                fb.a(fb2, ez.a(et2, n2, n3, ew2));
                break;
            }
            case e: {
                fb.b(fb2, "select");
                fb.a(fb2, ez.d(et2, n2, n3));
                break;
            }
            case f: {
                fb.b(fb2, "selectordinal");
                fb.a(fb2, ez.a(et2, n2, n3, ew2));
                break;
            }
        }
        return fb2;
    }

    private static fc c(et et2, int n2, int n3) {
        fc fc2 = new fc(ew.c, null);
        while (n2 < n3) {
            int n4 = n2;
            ex ex2 = et2.a(n2);
            double d2 = et2.b(ex2);
            int n5 = et2.e(n2 += 2);
            fi fi2 = new fi(null);
            fi.a(fi2, et2.a(et2.a(n4 + 1)));
            fi.a(fi2, d2);
            fi.a(fi2, ez.a(et2, n2, n5));
            fc.a(fc2, fi2);
            n2 = n5 + 1;
        }
        return fc.a(fc2);
    }

    private static fc a(et et2, int n2, int n3, ew ew2) {
        fc fc2 = new fc(ew2, null);
        ex ex2 = et2.a(n2);
        if (ex2.a().a()) {
            fc.a(fc2, true);
            fc.a(fc2, et2.b(ex2));
            ++n2;
        }
        while (n2 < n3) {
            ex ex3 = et2.a(n2++);
            double d2 = -1.23456789E8;
            ex ex4 = et2.a(n2);
            if (ex4.a().a()) {
                d2 = et2.b(ex4);
                ++n2;
            }
            int n4 = et2.e(n2);
            fi fi2 = new fi(null);
            fi.a(fi2, et2.a(ex3));
            fi.a(fi2, d2);
            fi.a(fi2, ez.a(et2, n2, n4));
            fc.a(fc2, fi2);
            n2 = n4 + 1;
        }
        return fc.a(fc2);
    }

    private static fc d(et et2, int n2, int n3) {
        fc fc2 = new fc(ew.e, null);
        while (n2 < n3) {
            ex ex2 = et2.a(n2++);
            int n4 = et2.e(n2);
            fi fi2 = new fi(null);
            fi.a(fi2, et2.a(ex2));
            fi.a(fi2, ez.a(et2, n2, n4));
            fc.a(fc2, fi2);
            n2 = n4 + 1;
        }
        return fc.a(fc2);
    }
}

