/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a;

import com.ibm.icu.a.cl;
import com.ibm.icu.a.ge;
import com.ibm.icu.a.gu;
import com.ibm.icu.a.gv;
import com.ibm.icu.d.kx;
import java.io.DataOutputStream;
import java.io.OutputStream;
import java.util.Arrays;

public class cm
extends gu {
    protected int[] a;
    protected int b;
    private int v;

    public cm(cm cm2) {
        super(cm2);
        this.a = new int[this.f];
        System.arraycopy(cm2.a, 0, this.a, 0, this.g);
        this.b = cm2.b;
        this.v = cm2.v;
    }

    public cm(int[] arrn, int n2, int n3, int n4, boolean bl2) {
        if (n2 < 32 || bl2 && n2 < 1024) {
            throw new IllegalArgumentException("Argument maxdatalength is too small");
        }
        this.a = arrn != null ? arrn : new int[n2];
        int n5 = 32;
        if (bl2) {
            int n6 = 0;
            do {
                this.d[n6++] = n5;
                n5 += 32;
            } while (n6 < 8);
        }
        this.g = n5;
        Arrays.fill(this.a, 0, this.g, n3);
        this.b = n3;
        this.v = n4;
        this.f = n2;
        this.h = bl2;
        this.i = false;
    }

    public int a(int n2) {
        if (this.i || n2 > 0x10FFFF || n2 < 0) {
            return 0;
        }
        int n3 = this.d[n2 >> 5];
        return this.a[Math.abs(n3) + (n2 & 0x1F)];
    }

    public int a(int n2, boolean[] arrbl) {
        if (this.i || n2 > 0x10FFFF || n2 < 0) {
            if (arrbl != null) {
                arrbl[0] = true;
            }
            return 0;
        }
        int n3 = this.d[n2 >> 5];
        if (arrbl != null) {
            arrbl[0] = n3 == 0;
        }
        return this.a[Math.abs(n3) + (n2 & 0x1F)];
    }

    public boolean a(int n2, int n3) {
        if (this.i || n2 > 0x10FFFF || n2 < 0) {
            return false;
        }
        int n4 = this.c(n2);
        if (n4 < 0) {
            return false;
        }
        this.a[n4 + (n2 & 31)] = n3;
        return true;
    }

    public cl a(gv gv2, ge ge2) {
        int n2;
        if (gv2 == null) {
            throw new IllegalArgumentException("Parameters can not be null");
        }
        if (!this.i) {
            this.a(false);
            this.a(gv2);
            this.a(true);
            this.i = true;
        }
        if (this.g >= 262144) {
            throw new ArrayIndexOutOfBoundsException("Data length too small");
        }
        char[] arrc = new char[this.e];
        int[] arrn = new int[this.g];
        for (n2 = 0; n2 < this.e; ++n2) {
            arrc[n2] = (char)(this.d[n2] >>> 2);
        }
        System.arraycopy(this.a, 0, arrn, 0, this.g);
        n2 = 37;
        n2 |= 0x100;
        if (this.h) {
            n2 |= 0x200;
        }
        return new cl(arrc, arrn, this.b, n2, ge2);
    }

    public int a(OutputStream outputStream, boolean bl2, gv gv2) {
        int n2;
        if (gv2 == null) {
            throw new IllegalArgumentException("Parameters can not be null");
        }
        if (!this.i) {
            this.a(false);
            this.a(gv2);
            this.a(true);
            this.i = true;
        }
        if ((n2 = bl2 ? this.g + this.e : this.g) >= 262144) {
            throw new ArrayIndexOutOfBoundsException("Data length too small");
        }
        n2 = 16 + 2 * this.e;
        n2 = bl2 ? (n2 += 2 * this.g) : (n2 += 4 * this.g);
        if (outputStream == null) {
            return n2;
        }
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
        dataOutputStream.writeInt(1416784229);
        int n3 = 37;
        if (!bl2) {
            n3 |= 0x100;
        }
        if (this.h) {
            n3 |= 0x200;
        }
        dataOutputStream.writeInt(n3);
        dataOutputStream.writeInt(this.e);
        dataOutputStream.writeInt(this.g);
        if (bl2) {
            int n4;
            int n5;
            for (n5 = 0; n5 < this.e; ++n5) {
                n4 = this.d[n5] + this.e >>> 2;
                dataOutputStream.writeChar(n4);
            }
            for (n5 = 0; n5 < this.g; ++n5) {
                n4 = this.a[n5] & 0xFFFF;
                dataOutputStream.writeChar(n4);
            }
        } else {
            int n6;
            for (n6 = 0; n6 < this.e; ++n6) {
                int n7 = this.d[n6] >>> 2;
                dataOutputStream.writeChar(n7);
            }
            for (n6 = 0; n6 < this.g; ++n6) {
                dataOutputStream.writeInt(this.a[n6]);
            }
        }
        return n2;
    }

    public boolean a(int n2, int n3, int n4, boolean bl2) {
        int n5;
        int n6;
        int n7;
        if (this.i || n2 < 0 || n2 > 0x10FFFF || n3 < 0 || n3 > 0x110000 || n2 > n3) {
            return false;
        }
        if (n2 == n3) {
            return true;
        }
        if ((n2 & 0x1F) != 0) {
            n7 = this.c(n2);
            if (n7 < 0) {
                return false;
            }
            n6 = n2 + 32 & 0xFFFFFFE0;
            if (n6 <= n3) {
                this.a(n7, n2 & 0x1F, 32, n4, bl2);
                n2 = n6;
            } else {
                this.a(n7, n2 & 0x1F, n3 & 0x1F, n4, bl2);
                return true;
            }
        }
        n7 = n3 & 0x1F;
        n3 &= 0xFFFFFFE0;
        n6 = 0;
        if (n4 != this.b) {
            n6 = -1;
        }
        while (n2 < n3) {
            n5 = this.d[n2 >> 5];
            if (n5 > 0) {
                this.a(n5, 0, 32, n4, bl2);
            } else if (this.a[-n5] != n4 && (n5 == 0 || bl2)) {
                if (n6 >= 0) {
                    this.d[n2 >> 5] = -n6;
                } else {
                    n6 = this.c(n2);
                    if (n6 < 0) {
                        return false;
                    }
                    this.d[n2 >> 5] = -n6;
                    this.a(n6, 0, 32, n4, true);
                }
            }
            n2 += 32;
        }
        if (n7 > 0) {
            n5 = this.c(n2);
            if (n5 < 0) {
                return false;
            }
            this.a(n5, 0, n7, n4, bl2);
        }
        return true;
    }

    private int b() {
        int n2 = this.g;
        int n3 = n2 + 32;
        if (n3 > this.f) {
            return -1;
        }
        this.g = n3;
        return n2;
    }

    private int c(int n2) {
        int n3 = this.d[n2 >>= 5];
        if (n3 > 0) {
            return n3;
        }
        int n4 = this.b();
        if (n4 < 0) {
            return -1;
        }
        this.d[n2] = n4;
        System.arraycopy(this.a, Math.abs(n3), this.a, n4, 128);
        return n4;
    }

    private void a(boolean bl2) {
        int n2;
        int n3;
        if (this.i) {
            return;
        }
        this.a();
        int n4 = 32;
        if (this.h) {
            n4 += 256;
        }
        int n5 = n3 = 32;
        while (n5 < this.g) {
            if (this.j[n5 >>> 5] < 0) {
                n5 += 32;
                continue;
            }
            if (n5 >= n4 && (n2 = cm.b(this.a, n3, n5, bl2 ? 4 : 32)) >= 0) {
                this.j[n5 >>> 5] = n2;
                n5 += 32;
                continue;
            }
            if (bl2 && n5 >= n4) {
                for (n2 = 28; n2 > 0 && !cm.a(this.a, n3 - n2, n5, n2); n2 -= 4) {
                }
            } else {
                n2 = 0;
            }
            if (n2 > 0) {
                this.j[n5 >>> 5] = n3 - n2;
                n5 += n2;
                for (n2 = 32 - n2; n2 > 0; --n2) {
                    this.a[n3++] = this.a[n5++];
                }
                continue;
            }
            if (n3 < n5) {
                this.j[n5 >>> 5] = n3;
                for (n2 = 32; n2 > 0; --n2) {
                    this.a[n3++] = this.a[n5++];
                }
                continue;
            }
            this.j[n5 >>> 5] = n5;
            n5 = n3 += 32;
        }
        for (n2 = 0; n2 < this.e; ++n2) {
            this.d[n2] = this.j[Math.abs(this.d[n2]) >>> 5];
        }
        this.g = n3;
    }

    private static final int b(int[] arrn, int n2, int n3, int n4) {
        for (int i2 = 0; i2 <= (n2 -= 32); i2 += n4) {
            if (!cm.a(arrn, i2, n3, 32)) continue;
            return i2;
        }
        return -1;
    }

    private final void a(gv gv2) {
        int n2;
        int[] arrn = new int[32];
        int[] arrn2 = this.d;
        System.arraycopy(arrn2, 1728, arrn, 0, 32);
        int n3 = 0;
        if (this.v != this.b) {
            n3 = this.b();
            if (n3 < 0) {
                throw new IllegalStateException("Internal error: Out of memory space");
            }
            this.a(n3, 0, 32, this.v, true);
            n3 = -n3;
        }
        for (n2 = 1728; n2 < 1760; ++n2) {
            this.d[n2] = n3;
        }
        n2 = 2048;
        int n4 = 65536;
        while (n4 < 0x110000) {
            if (arrn2[n4 >> 5] != 0) {
                int n5;
                if ((n5 = gv2.a(n4 &= 0xFFFFFC00, (n3 = cm.a(arrn2, n2, n4 >> 5)) + 32)) != this.a(kx.b(n4))) {
                    if (!this.a((int)kx.b(n4), n5)) {
                        throw new ArrayIndexOutOfBoundsException("Data table overflow");
                    }
                    if (n3 == n2) {
                        System.arraycopy(arrn2, n4 >> 5, arrn2, n2, 32);
                        n2 += 32;
                    }
                }
                n4 += 1024;
                continue;
            }
            n4 += 32;
        }
        if (n2 >= 34816) {
            throw new ArrayIndexOutOfBoundsException("Index table overflow");
        }
        System.arraycopy(arrn2, 2048, arrn2, 2080, n2 - 2048);
        System.arraycopy(arrn, 0, arrn2, 2048, 32);
        this.e = n2 += 32;
    }

    private void a(int n2, int n3, int n4, int n5, boolean bl2) {
        n4 += n2;
        n2 += n3;
        if (bl2) {
            while (n2 < n4) {
                this.a[n2++] = n5;
            }
        } else {
            while (n2 < n4) {
                if (this.a[n2] == this.b) {
                    this.a[n2] = n5;
                }
                ++n2;
            }
        }
    }
}

