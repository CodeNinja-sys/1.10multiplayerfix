/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.d;

import com.ibm.icu.d.iv;

public final class la
implements iv {
    private static boolean[] an = new boolean[]{false, true, true, true, true, true, true, true, true, false, false, true, true, false, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false};
    private static boolean[] ao = new boolean[]{false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false, false, false, false, false, false, false, false, false, false, false, false};
    private int ap = 0;
    private int[] aq = new int[8];
    private int ar = 0;
    private int[] as = new int[256];
    private int[] at = new int[8];
    private int au = 0;

    public la() {
        this.a();
    }

    public static byte[] a(String string) {
        return la.a(string.toCharArray(), 0, string.length());
    }

    public static byte[] a(char[] arrc, int n2, int n3) {
        la la2 = new la();
        int n4 = Math.max(4, 3 * (n3 - n2) + 1);
        byte[] arrby = new byte[n4];
        int n5 = la2.a(arrc, n2, n3, null, arrby, 0, n4);
        byte[] arrby2 = new byte[n5];
        System.arraycopy(arrby, 0, arrby2, 0, n5);
        return arrby2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public int a(char[] arrc, int n2, int n3, int[] arrn, byte[] arrby, int n4, int n5) {
        int n6 = n4;
        int n7 = n2;
        int n8 = -1;
        int n9 = -1;
        int n10 = -1;
        int n11 = -1;
        int n12 = 0;
        int n13 = 0;
        int n14 = 0;
        if (arrby.length < 4 || n5 - n4 < 4) {
            throw new IllegalArgumentException("byteBuffer.length < 4");
        }
        block4: while (n7 < n3 && n6 < n5) {
            block45: {
                block46: {
                    switch (this.ar) {
                        case 0: {
                            break;
                        }
                        case 1: {
                            break block46;
                        }
                    }
                    while (n7 < n3 && n6 < n5) {
                        n8 = arrc[n7++];
                        n10 = n7 < n3 ? arrc[n7] : -1;
                        if (n8 < 128) {
                            n14 = n8 & 0xFF;
                            if (an[n14]) {
                                if (n6 + 1 >= n5) {
                                    --n7;
                                    break block4;
                                }
                                arrby[n6++] = 1;
                            }
                            arrby[n6++] = (byte)n14;
                            continue;
                        }
                        if (this.a(n8, this.ap)) {
                            arrby[n6++] = (byte)(n8 - this.aq[this.ap] + 128);
                            continue;
                        }
                        if (!la.b(n8)) {
                            if (n10 != -1 && la.b(n10)) {
                                if (n6 + 2 >= n5) {
                                    --n7;
                                    break block4;
                                }
                                arrby[n6++] = 14;
                                arrby[n6++] = (byte)(n8 >>> 8);
                                arrby[n6++] = (byte)(n8 & 0xFF);
                                continue;
                            }
                            if (n6 + 3 >= n5) {
                                --n7;
                                break block4;
                            }
                            arrby[n6++] = 15;
                            n13 = n8 >>> 8;
                            n14 = n8 & 0xFF;
                            if (ao[n13]) {
                                arrby[n6++] = -16;
                            }
                            arrby[n6++] = (byte)n13;
                            arrby[n6++] = (byte)n14;
                            this.ar = 1;
                        } else {
                            n12 = this.c(n8);
                            if (n12 != -1) {
                                n11 = n7 + 1 < n3 ? arrc[n7 + 1] : -1;
                                if (this.a(n10, n12) && this.a(n11, n12)) {
                                    if (n6 + 1 >= n5) {
                                        --n7;
                                        break block4;
                                    }
                                    arrby[n6++] = (byte)(16 + n12);
                                    arrby[n6++] = (byte)(n8 - this.aq[n12] + 128);
                                    this.at[n12] = ++this.au;
                                    this.ap = n12;
                                    continue;
                                }
                                if (n6 + 1 >= n5) {
                                    --n7;
                                    break block4;
                                }
                                arrby[n6++] = (byte)(1 + n12);
                                arrby[n6++] = (byte)(n8 - this.aq[n12] + 128);
                                continue;
                            }
                            n12 = la.d(n8);
                            if (n12 != -1 && !la.b(n10, n12)) {
                                if (n6 + 1 >= n5) {
                                    --n7;
                                    break block4;
                                }
                                arrby[n6++] = (byte)(1 + n12);
                                arrby[n6++] = (byte)(n8 - am[n12]);
                                continue;
                            }
                            int n15 = n9 = la.a(n8);
                            this.as[n15] = this.as[n15] + 1;
                            n11 = n7 + 1 < n3 ? arrc[n7 + 1] : -1;
                            if (this.as[n9] > 1 || n9 == la.a(n10) && n9 == la.a(n11)) {
                                if (n6 + 2 >= n5) {
                                    --n7;
                                    break block4;
                                }
                                n12 = this.b();
                                arrby[n6++] = (byte)(24 + n12);
                                arrby[n6++] = (byte)n9;
                                arrby[n6++] = (byte)(n8 - al[n9] + 128);
                                this.aq[n12] = al[n9];
                                this.ap = n12;
                                this.at[n12] = ++this.au;
                                continue;
                            }
                            if (n6 + 3 >= n5) {
                                --n7;
                                break block4;
                            }
                            arrby[n6++] = 15;
                            n13 = n8 >>> 8;
                            n14 = n8 & 0xFF;
                            if (ao[n13]) {
                                arrby[n6++] = -16;
                            }
                            arrby[n6++] = (byte)n13;
                            arrby[n6++] = (byte)n14;
                            this.ar = 1;
                        }
                        break block45;
                    }
                    break block45;
                }
                while (n7 < n3 && n6 < n5) {
                    n8 = arrc[n7++];
                    n10 = n7 < n3 ? arrc[n7] : -1;
                    if (!la.b(n8) || n10 != -1 && !la.b(n10)) {
                        if (n6 + 2 >= n5) {
                            --n7;
                            break block4;
                        }
                        n13 = n8 >>> 8;
                        n14 = n8 & 0xFF;
                        if (ao[n13]) {
                            arrby[n6++] = -16;
                        }
                        arrby[n6++] = (byte)n13;
                        arrby[n6++] = (byte)n14;
                        continue;
                    }
                    if (n8 < 128) {
                        n14 = n8 & 0xFF;
                        if (n10 != -1 && n10 < 128 && !an[n14]) {
                            if (n6 + 1 >= n5) {
                                --n7;
                                break block4;
                            }
                            n12 = this.ap;
                            arrby[n6++] = (byte)(224 + n12);
                            arrby[n6++] = (byte)n14;
                            this.at[n12] = ++this.au;
                            this.ar = 0;
                            break;
                        }
                        if (n6 + 1 >= n5) {
                            --n7;
                            break block4;
                        }
                        arrby[n6++] = 0;
                        arrby[n6++] = (byte)n14;
                        continue;
                    }
                    n12 = this.c(n8);
                    if (n12 != -1) {
                        if (this.a(n10, n12)) {
                            if (n6 + 1 >= n5) {
                                --n7;
                                break block4;
                            }
                            arrby[n6++] = (byte)(224 + n12);
                            arrby[n6++] = (byte)(n8 - this.aq[n12] + 128);
                            this.at[n12] = ++this.au;
                            this.ap = n12;
                            this.ar = 0;
                            break;
                        }
                        if (n6 + 2 >= n5) {
                            --n7;
                            break block4;
                        }
                        n13 = n8 >>> 8;
                        n14 = n8 & 0xFF;
                        if (ao[n13]) {
                            arrby[n6++] = -16;
                        }
                        arrby[n6++] = (byte)n13;
                        arrby[n6++] = (byte)n14;
                        continue;
                    }
                    int n16 = n9 = la.a(n8);
                    this.as[n16] = this.as[n16] + 1;
                    n11 = n7 + 1 < n3 ? arrc[n7 + 1] : -1;
                    if (this.as[n9] > 1 || n9 == la.a(n10) && n9 == la.a(n11)) {
                        if (n6 + 2 >= n5) {
                            --n7;
                            break block4;
                        }
                        n12 = this.b();
                        arrby[n6++] = (byte)(232 + n12);
                        arrby[n6++] = (byte)n9;
                        arrby[n6++] = (byte)(n8 - al[n9] + 128);
                        this.aq[n12] = al[n9];
                        this.ap = n12;
                        this.at[n12] = ++this.au;
                        this.ar = 0;
                        break;
                    }
                    if (n6 + 2 >= n5) {
                        --n7;
                        break block4;
                    }
                    n13 = n8 >>> 8;
                    n14 = n8 & 0xFF;
                    if (ao[n13]) {
                        arrby[n6++] = -16;
                    }
                    arrby[n6++] = (byte)n13;
                    arrby[n6++] = (byte)n14;
                }
            }
        }
        if (arrn != null) {
            arrn[0] = n7 - n2;
        }
        return n6 - n4;
    }

    public void a() {
        int n2;
        this.aq[0] = 128;
        this.aq[1] = 192;
        this.aq[2] = 1024;
        this.aq[3] = 1536;
        this.aq[4] = 2304;
        this.aq[5] = 12352;
        this.aq[6] = 12448;
        this.aq[7] = 65280;
        for (n2 = 0; n2 < 8; ++n2) {
            this.at[n2] = 0;
        }
        for (n2 = 0; n2 <= 255; ++n2) {
            this.as[n2] = 0;
        }
        this.au = 0;
        this.ap = 0;
        this.ar = 0;
    }

    private static int a(int n2) {
        if (n2 >= 192 && n2 < 320) {
            return 249;
        }
        if (n2 >= 592 && n2 < 720) {
            return 250;
        }
        if (n2 >= 880 && n2 < 1008) {
            return 251;
        }
        if (n2 >= 1328 && n2 < 1424) {
            return 252;
        }
        if (n2 >= 12352 && n2 < 12448) {
            return 253;
        }
        if (n2 >= 12448 && n2 < 12576) {
            return 254;
        }
        if (n2 >= 65376 && n2 < 65439) {
            return 255;
        }
        if (n2 >= 128 && n2 < 13312) {
            return n2 / 128 & 0xFF;
        }
        if (n2 >= 57344 && n2 <= 65535) {
            return (n2 - 44032) / 128 & 0xFF;
        }
        return 0;
    }

    private boolean a(int n2, int n3) {
        return n2 >= this.aq[n3] && n2 < this.aq[n3] + 128;
    }

    private static boolean b(int n2, int n3) {
        return n2 >= am[n3] && n2 < am[n3] + 128;
    }

    private static boolean b(int n2) {
        return n2 < 13312 || n2 >= 57344;
    }

    private int c(int n2) {
        for (int i2 = 7; i2 >= 0; --i2) {
            if (!this.a(n2, i2)) continue;
            int n3 = i2;
            this.at[n3] = this.at[n3] + 1;
            return i2;
        }
        return -1;
    }

    private static int d(int n2) {
        for (int i2 = 7; i2 >= 0; --i2) {
            if (!la.b(n2, i2)) continue;
            return i2;
        }
        return -1;
    }

    private int b() {
        int n2 = Integer.MAX_VALUE;
        int n3 = -1;
        for (int i2 = 7; i2 >= 0; --i2) {
            if (this.at[i2] >= n2) continue;
            n2 = this.at[i2];
            n3 = i2;
        }
        return n3;
    }
}

