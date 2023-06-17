/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.a.a;

import org.apache.commons.a.a.g;
import org.apache.commons.a.a.h;
import org.apache.commons.a.a.m;

public class a
extends g {
    private static final int a = 5;
    private static final int i = 8;
    private static final int j = 5;
    private static final byte[] k = new byte[]{13, 10};
    private static final byte[] l = new byte[]{-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, -1, -1, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25};
    private static final byte[] m = new byte[]{65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 50, 51, 52, 53, 54, 55};
    private static final byte[] n = new byte[]{-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, -1, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32};
    private static final byte[] o = new byte[]{48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86};
    private static final int p = 31;
    private final int q;
    private final byte[] r;
    private final int s;
    private final byte[] t;
    private final byte[] u;

    public a() {
        this(false);
    }

    public a(boolean bl2) {
        this(0, null, bl2);
    }

    public a(int n2) {
        this(n2, k);
    }

    public a(int n2, byte[] arrby) {
        this(n2, arrby, false);
    }

    public a(int n2, byte[] arrby, boolean bl2) {
        super(5, 8, n2, arrby == null ? 0 : arrby.length);
        if (bl2) {
            this.t = o;
            this.r = n;
        } else {
            this.t = m;
            this.r = l;
        }
        if (n2 > 0) {
            if (arrby == null) {
                throw new IllegalArgumentException("lineLength " + n2 + " > 0, but lineSeparator is null");
            }
            if (this.n(arrby)) {
                String string = org.apache.commons.a.a.m.f(arrby);
                throw new IllegalArgumentException("lineSeparator must not contain Base32 characters: [" + string + "]");
            }
            this.s = 8 + arrby.length;
            this.u = new byte[arrby.length];
            System.arraycopy(arrby, 0, this.u, 0, arrby.length);
        } else {
            this.s = 8;
            this.u = null;
        }
        this.q = this.s - 1;
    }

    @Override
    void a(byte[] arrby, int n2, int n3, h h2) {
        if (h2.f) {
            return;
        }
        if (n3 < 0) {
            h2.f = true;
        }
        for (int i2 = 0; i2 < n3; ++i2) {
            byte by2;
            byte by3;
            if ((by3 = arrby[n2++]) == 61) {
                h2.f = true;
                break;
            }
            byte[] arrby2 = this.a(this.q, h2);
            if (by3 < 0 || by3 >= this.r.length || (by2 = this.r[by3]) < 0) continue;
            h2.h = (h2.h + 1) % 8;
            h2.b = (h2.b << 5) + (long)by2;
            if (h2.h != 0) continue;
            arrby2[h2.d++] = (byte)(h2.b >> 32 & 0xFFL);
            arrby2[h2.d++] = (byte)(h2.b >> 24 & 0xFFL);
            arrby2[h2.d++] = (byte)(h2.b >> 16 & 0xFFL);
            arrby2[h2.d++] = (byte)(h2.b >> 8 & 0xFFL);
            arrby2[h2.d++] = (byte)(h2.b & 0xFFL);
        }
        if (h2.f && h2.h >= 2) {
            byte[] arrby3 = this.a(this.q, h2);
            switch (h2.h) {
                case 2: {
                    arrby3[h2.d++] = (byte)(h2.b >> 2 & 0xFFL);
                    break;
                }
                case 3: {
                    arrby3[h2.d++] = (byte)(h2.b >> 7 & 0xFFL);
                    break;
                }
                case 4: {
                    h2.b >>= 4;
                    arrby3[h2.d++] = (byte)(h2.b >> 8 & 0xFFL);
                    arrby3[h2.d++] = (byte)(h2.b & 0xFFL);
                    break;
                }
                case 5: {
                    h2.b >>= 1;
                    arrby3[h2.d++] = (byte)(h2.b >> 16 & 0xFFL);
                    arrby3[h2.d++] = (byte)(h2.b >> 8 & 0xFFL);
                    arrby3[h2.d++] = (byte)(h2.b & 0xFFL);
                    break;
                }
                case 6: {
                    h2.b >>= 6;
                    arrby3[h2.d++] = (byte)(h2.b >> 16 & 0xFFL);
                    arrby3[h2.d++] = (byte)(h2.b >> 8 & 0xFFL);
                    arrby3[h2.d++] = (byte)(h2.b & 0xFFL);
                    break;
                }
                case 7: {
                    h2.b >>= 3;
                    arrby3[h2.d++] = (byte)(h2.b >> 24 & 0xFFL);
                    arrby3[h2.d++] = (byte)(h2.b >> 16 & 0xFFL);
                    arrby3[h2.d++] = (byte)(h2.b >> 8 & 0xFFL);
                    arrby3[h2.d++] = (byte)(h2.b & 0xFFL);
                    break;
                }
                default: {
                    throw new IllegalStateException("Impossible modulus " + h2.h);
                }
            }
        }
    }

    @Override
    void b(byte[] arrby, int n2, int n3, h h2) {
        if (h2.f) {
            return;
        }
        if (n3 < 0) {
            h2.f = true;
            if (0 == h2.h && this.h == 0) {
                return;
            }
            byte[] arrby2 = this.a(this.s, h2);
            int n4 = h2.d;
            switch (h2.h) {
                case 0: {
                    break;
                }
                case 1: {
                    arrby2[h2.d++] = this.t[(int)(h2.b >> 3) & 0x1F];
                    arrby2[h2.d++] = this.t[(int)(h2.b << 2) & 0x1F];
                    arrby2[h2.d++] = 61;
                    arrby2[h2.d++] = 61;
                    arrby2[h2.d++] = 61;
                    arrby2[h2.d++] = 61;
                    arrby2[h2.d++] = 61;
                    arrby2[h2.d++] = 61;
                    break;
                }
                case 2: {
                    arrby2[h2.d++] = this.t[(int)(h2.b >> 11) & 0x1F];
                    arrby2[h2.d++] = this.t[(int)(h2.b >> 6) & 0x1F];
                    arrby2[h2.d++] = this.t[(int)(h2.b >> 1) & 0x1F];
                    arrby2[h2.d++] = this.t[(int)(h2.b << 4) & 0x1F];
                    arrby2[h2.d++] = 61;
                    arrby2[h2.d++] = 61;
                    arrby2[h2.d++] = 61;
                    arrby2[h2.d++] = 61;
                    break;
                }
                case 3: {
                    arrby2[h2.d++] = this.t[(int)(h2.b >> 19) & 0x1F];
                    arrby2[h2.d++] = this.t[(int)(h2.b >> 14) & 0x1F];
                    arrby2[h2.d++] = this.t[(int)(h2.b >> 9) & 0x1F];
                    arrby2[h2.d++] = this.t[(int)(h2.b >> 4) & 0x1F];
                    arrby2[h2.d++] = this.t[(int)(h2.b << 1) & 0x1F];
                    arrby2[h2.d++] = 61;
                    arrby2[h2.d++] = 61;
                    arrby2[h2.d++] = 61;
                    break;
                }
                case 4: {
                    arrby2[h2.d++] = this.t[(int)(h2.b >> 27) & 0x1F];
                    arrby2[h2.d++] = this.t[(int)(h2.b >> 22) & 0x1F];
                    arrby2[h2.d++] = this.t[(int)(h2.b >> 17) & 0x1F];
                    arrby2[h2.d++] = this.t[(int)(h2.b >> 12) & 0x1F];
                    arrby2[h2.d++] = this.t[(int)(h2.b >> 7) & 0x1F];
                    arrby2[h2.d++] = this.t[(int)(h2.b >> 2) & 0x1F];
                    arrby2[h2.d++] = this.t[(int)(h2.b << 3) & 0x1F];
                    arrby2[h2.d++] = 61;
                    break;
                }
                default: {
                    throw new IllegalStateException("Impossible modulus " + h2.h);
                }
            }
            h2.g += h2.d - n4;
            if (this.h > 0 && h2.g > 0) {
                System.arraycopy(this.u, 0, arrby2, h2.d, this.u.length);
                h2.d += this.u.length;
            }
        } else {
            for (int i2 = 0; i2 < n3; ++i2) {
                int n5;
                byte[] arrby3 = this.a(this.s, h2);
                h2.h = (h2.h + 1) % 5;
                if ((n5 = arrby[n2++]) < 0) {
                    n5 += 256;
                }
                h2.b = (h2.b << 8) + (long)n5;
                if (0 != h2.h) continue;
                arrby3[h2.d++] = this.t[(int)(h2.b >> 35) & 0x1F];
                arrby3[h2.d++] = this.t[(int)(h2.b >> 30) & 0x1F];
                arrby3[h2.d++] = this.t[(int)(h2.b >> 25) & 0x1F];
                arrby3[h2.d++] = this.t[(int)(h2.b >> 20) & 0x1F];
                arrby3[h2.d++] = this.t[(int)(h2.b >> 15) & 0x1F];
                arrby3[h2.d++] = this.t[(int)(h2.b >> 10) & 0x1F];
                arrby3[h2.d++] = this.t[(int)(h2.b >> 5) & 0x1F];
                arrby3[h2.d++] = this.t[(int)h2.b & 0x1F];
                h2.g += 8;
                if (this.h <= 0 || this.h > h2.g) continue;
                System.arraycopy(this.u, 0, arrby3, h2.d, this.u.length);
                h2.d += this.u.length;
                h2.g = 0;
            }
        }
    }

    @Override
    public boolean a(byte by2) {
        return by2 >= 0 && by2 < this.r.length && this.r[by2] != -1;
    }
}

