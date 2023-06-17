/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.b;

import com.ibm.icu.a.hg;
import com.ibm.icu.util.ed;
import com.ibm.icu.util.ee;

class x
implements ed {
    private hg a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f = -1;
    private int g = -1;
    private static char[] h = new char[33];
    private static char[] i = new char[33];

    public boolean a(ee ee2) {
        int n2;
        if (this.e >= this.d) {
            return false;
        }
        if ((this.b == 0 || this.b == 2) && this.g < (n2 = this.a.a())) {
            while (this.g < n2 && (this.g < 0 || this.a.k(this.g) < this.e)) {
                ++this.g;
            }
            if (this.g < n2) {
                int n3 = this.a.j(this.g);
                if (this.e < n3) {
                    int n4 = n3;
                    if (this.d <= n3) {
                        n4 = this.d;
                    }
                    if (!this.b(ee2, n4)) {
                        ++this.e;
                        return true;
                    }
                }
                if (this.e >= this.d) {
                    return false;
                }
                ee2.a = this.e;
                ee2.b = this.a.b(this.g, this.e);
                this.f = -1;
                ++this.e;
                return true;
            }
        }
        if (!this.b(ee2, this.d)) {
            ++this.e;
            return true;
        }
        if (this.b == 2 && !this.c(ee2, this.d)) {
            ++this.e;
            return true;
        }
        return false;
    }

    public void a() {
        this.e = this.c;
        this.f = -1;
        this.g = -1;
    }

    public void a(int n2, int n3) {
        if (n2 >= n3) {
            throw new IllegalArgumentException("start or limit has to be valid Unicode codepoints and start < limit");
        }
        this.c = n2 < 0 ? 0 : n2;
        this.d = n3 > 0x110000 ? 0x110000 : n3;
        this.e = this.c;
    }

    protected x(hg hg2, int n2) {
        if (hg2 == null) {
            throw new IllegalArgumentException("UCharacterName name argument cannot be null. Missing unames.icu?");
        }
        this.a = hg2;
        this.b = n2;
        this.c = 0;
        this.d = 0x110000;
        this.e = this.c;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private boolean a(ee ee2, int n2) {
        char[] arrc = h;
        synchronized (h) {
            char[] arrc2 = i;
            synchronized (i) {
                int n3 = this.a.a(this.f, h, i);
                while (this.e < n2) {
                    int n4 = hg.h(this.e);
                    String string = this.a.a(n3 + h[n4], i[n4], this.b);
                    if ((string == null || string.length() == 0) && this.b == 2) {
                        string = this.a.a(this.e);
                    }
                    if (string != null && string.length() > 0) {
                        ee2.a = this.e;
                        ee2.b = string;
                        // ** MonitorExit[var4_4] (shouldn't be in output)
                        // ** MonitorExit[var3_3] (shouldn't be in output)
                        return false;
                    }
                    ++this.e;
                }
                // ** MonitorExit[var4_4] (shouldn't be in output)
            }
            return true;
        }
    }

    private boolean b(ee ee2, int n2) {
        if (this.f < 0) {
            this.f = this.a.b(this.e);
        }
        while (this.f < this.a.c && this.e < n2) {
            int n3;
            int n4 = hg.e(this.e);
            if (n4 == (n3 = this.a.d(this.f))) {
                if (n4 == hg.e(n2 - 1)) {
                    return this.a(ee2, n2);
                }
                if (!this.a(ee2, hg.f(n3))) {
                    return false;
                }
                ++this.f;
                continue;
            }
            if (n4 > n3) {
                ++this.f;
                continue;
            }
            int n5 = hg.g(n3);
            if (n5 > n2) {
                n5 = n2;
            }
            if (this.b == 2 && !this.c(ee2, n5)) {
                return false;
            }
            this.e = n5;
        }
        return true;
    }

    private boolean c(ee ee2, int n2) {
        while (this.e < n2) {
            String string = this.a.c(this.e);
            if (string != null && string.length() > 0) {
                ee2.a = this.e;
                ee2.b = string;
                return false;
            }
            ++this.e;
        }
        return true;
    }
}

