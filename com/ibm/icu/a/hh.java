/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a;

import com.ibm.icu.a.hg;
import com.ibm.icu.a.ip;
import com.ibm.icu.a.jd;

final class hh {
    static final int a = 0;
    static final int b = 1;
    private int c;
    private int d;
    private byte e;
    private byte f;
    private char[] g;
    private String h;
    private byte[] i;
    private StringBuffer j = new StringBuffer();
    private int[] k = new int[256];

    hh() {
    }

    boolean a(int n2, int n3, byte by2, byte by3) {
        if (n2 >= 0 && n2 <= n3 && n3 <= 0x10FFFF && (by2 == 0 || by2 == 1)) {
            this.c = n2;
            this.d = n3;
            this.e = by2;
            this.f = by3;
            return true;
        }
        return false;
    }

    boolean a(char[] arrc) {
        if (arrc.length == this.f) {
            this.g = arrc;
            return true;
        }
        return false;
    }

    boolean a(String string) {
        if (string != null && string.length() > 0) {
            this.h = string;
            return true;
        }
        return false;
    }

    boolean a(byte[] arrby) {
        this.i = arrby;
        return true;
    }

    boolean a(int n2) {
        return this.c <= n2 && n2 <= this.d;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    void a(int n2, StringBuffer stringBuffer) {
        stringBuffer.append(this.h);
        switch (this.e) {
            case 0: {
                stringBuffer.append(jd.a((long)n2, (int)this.f));
                return;
            }
            case 1: {
                int n3 = n2 - this.c;
                int[] arrn = this.k;
                int[] arrn2 = this.k;
                synchronized (this.k) {
                    for (int i2 = this.f - 1; i2 > 0; --i2) {
                        int n4 = this.g[i2] & 0xFF;
                        arrn[i2] = n3 % n4;
                        n3 /= n4;
                    }
                    arrn[0] = n3;
                    stringBuffer.append(this.b(arrn, this.f));
                    // ** MonitorExit[var6_5] (shouldn't be in output)
                    return;
                }
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    int b(String string) {
        int n2 = this.h.length();
        if (string.length() < n2) return -1;
        if (!this.h.equals(string.substring(0, n2))) {
            return -1;
        }
        switch (this.e) {
            case 0: {
                try {
                    int n3 = Integer.parseInt(string.substring(n2), 16);
                    if (this.c > n3) return -1;
                    if (n3 > this.d) return -1;
                    return n3;
                }
                catch (NumberFormatException numberFormatException) {
                    return -1;
                }
            }
            case 1: {
                int n4 = this.c;
                while (n4 <= this.d) {
                    int n5;
                    int n6 = n4 - this.c;
                    int[] arrn = this.k;
                    int[] arrn2 = this.k;
                    // MONITORENTER : this.k
                    for (int i2 = this.f - 1; i2 > 0; n6 /= n5, --i2) {
                        n5 = this.g[i2] & 0xFF;
                        arrn[i2] = n6 % n5;
                    }
                    arrn[0] = n6;
                    if (this.a(arrn, (int)this.f, string, n2)) {
                        // MONITOREXIT : arrn2
                        return n4;
                    }
                    // MONITOREXIT : arrn2
                    ++n4;
                }
                return -1;
            }
        }
        return -1;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    int a(int[] arrn, int n2) {
        int n3 = hg.a(arrn, this.h);
        switch (this.e) {
            case 0: {
                n3 += this.f;
                break;
            }
            case 1: {
                for (int i2 = this.f - 1; i2 > 0; --i2) {
                    int n4 = 0;
                    int n5 = 0;
                    for (int i3 = this.g[i2]; i3 > 0; --i3) {
                        StringBuffer stringBuffer = this.j;
                        synchronized (stringBuffer) {
                            this.j.delete(0, this.j.length());
                            n5 = ip.a(this.j, this.i, n5);
                            hg.a(arrn, this.j);
                            if (this.j.length() > n4) {
                                n4 = this.j.length();
                            }
                            continue;
                        }
                    }
                    n3 += n4;
                }
                break;
            }
        }
        if (n3 > n2) {
            return n3;
        }
        return n2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private String b(int[] arrn, int n2) {
        int n3 = this.g.length;
        if (arrn == null || n2 != n3) {
            return null;
        }
        StringBuffer stringBuffer = this.j;
        synchronized (stringBuffer) {
            this.j.delete(0, this.j.length());
            int n4 = 0;
            for (int i2 = 0; i2 <= --n3; ++i2) {
                char c2 = this.g[i2];
                n4 = ip.a(this.i, n4, arrn[i2]);
                n4 = ip.a(this.j, this.i, n4);
                if (i2 == n3) continue;
                n4 = ip.a(this.i, n4, c2 - arrn[i2] - 1);
            }
            return this.j.toString();
        }
    }

    private boolean a(int[] arrn, int n2, String string, int n3) {
        int n4 = this.g.length;
        if (arrn == null || n2 != n4) {
            return false;
        }
        int n5 = 0;
        int n6 = n3;
        for (int i2 = 0; i2 <= --n4; ++i2) {
            char c2 = this.g[i2];
            if ((n6 = ip.a(string, this.i, n6, n5 = ip.a(this.i, n5, arrn[i2]))) < 0) {
                return false;
            }
            if (i2 == n4) continue;
            n5 = ip.a(this.i, n5, c2 - arrn[i2]);
        }
        return n6 == string.length();
    }

    static /* synthetic */ int a(hh hh2) {
        return hh2.c;
    }

    static /* synthetic */ int b(hh hh2) {
        return hh2.d;
    }
}

