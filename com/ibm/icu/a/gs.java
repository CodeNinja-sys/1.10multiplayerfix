/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a;

import com.ibm.icu.a.gg;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public final class gs
extends gg {
    gs() {
    }

    public static gs b(InputStream inputStream) {
        return (gs)gg.a(inputStream);
    }

    public final int a(int n2) {
        if (n2 >= 0) {
            if (n2 < 55296 || n2 > 56319 && n2 <= 65535) {
                int n3 = this.b[n2 >> 5];
                n3 = (n3 << 2) + (n2 & 0x1F);
                char c2 = this.b[n3];
                return c2;
            }
            if (n2 <= 65535) {
                int n4 = this.b[2048 + (n2 - 55296 >> 5)];
                n4 = (n4 << 2) + (n2 & 0x1F);
                char c3 = this.b[n4];
                return c3;
            }
            if (n2 < this.j) {
                int n5 = 2080 + (n2 >> 11);
                n5 = this.b[n5];
                n5 += n2 >> 5 & 0x3F;
                n5 = this.b[n5];
                n5 = (n5 << 2) + (n2 & 0x1F);
                char c4 = this.b[n5];
                return c4;
            }
            if (n2 <= 0x10FFFF) {
                char c5 = this.b[this.k];
                return c5;
            }
        }
        return this.i;
    }

    public int a(char c2) {
        int n2 = this.b[c2 >> 5];
        n2 = (n2 << 2) + (c2 & 0x1F);
        char c3 = this.b[n2];
        return c3;
    }

    public int a(OutputStream outputStream) {
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
        int n2 = 0;
        n2 += this.a(dataOutputStream);
        for (int i2 = 0; i2 < this.f; ++i2) {
            dataOutputStream.writeChar(this.b[this.c + i2]);
        }
        return n2 += this.f * 2;
    }

    public int b() {
        return 16 + (this.a.c + this.f) * 2;
    }

    int a(int n2, int n3, int n4) {
        int n5 = n2;
        int n6 = 0;
        int n7 = 0;
        block0: while (n5 < n3) {
            int n8;
            if (n5 < 55296 || n5 > 56319 && n5 <= 65535) {
                n7 = 0;
                n6 = this.b[n5 >> 5] << 2;
            } else if (n5 < 65535) {
                n7 = 2048;
                n6 = this.b[n7 + (n5 - 55296 >> 5)] << 2;
            } else if (n5 < this.j) {
                n8 = 2080 + (n5 >> 11);
                n7 = this.b[n8];
                n6 = this.b[n7 + (n5 >> 5 & 0x3F)] << 2;
            } else {
                if (n4 != this.b[this.k]) break;
                n5 = n3;
                break;
            }
            if (n7 == this.g) {
                if (n4 != this.h) break;
                n5 += 2048;
                continue;
            }
            if (n6 == this.l) {
                if (n4 != this.h) break;
                n5 += 32;
                continue;
            }
            n8 = n6 + (n5 & 0x1F);
            int n9 = n6 + 32;
            for (int i2 = n8; i2 < n9; ++i2) {
                if (this.b[i2] == n4) continue;
                n5 += i2 - n8;
                break block0;
            }
            n5 += n9 - n8;
        }
        if (n5 > n3) {
            n5 = n3;
        }
        return n5 - 1;
    }
}

