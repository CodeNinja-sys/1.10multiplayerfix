/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.d;

import com.ibm.icu.a.ag;
import com.ibm.icu.d.o;
import com.ibm.icu.d.p;
import com.ibm.icu.d.r;
import com.ibm.icu.d.s;
import java.io.DataInputStream;
import java.io.InputStream;
import java.text.CharacterIterator;

class n {
    private o a;
    private r[] b;
    private static final byte[] c = new byte[]{84, 114, 68, 99};

    private r a(int n2) {
        return this.b[n2];
    }

    public n(InputStream inputStream) {
        ag.a(inputStream, c, null);
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        this.a = new o();
        this.a.a = dataInputStream.readInt();
        this.a.b = dataInputStream.readInt();
        this.a.c = dataInputStream.readShort();
        this.a.d = dataInputStream.readShort();
        this.a(dataInputStream);
    }

    private void a(DataInputStream dataInputStream) {
        int n2;
        for (n2 = 0; n2 < this.a.c; ++n2) {
            dataInputStream.readInt();
        }
        this.b = new r[this.a.c];
        this.b[0] = new r();
        for (n2 = 1; n2 < this.a.c; ++n2) {
            int n3;
            boolean bl2;
            this.b[n2] = new r();
            this.b[n2].a = dataInputStream.readShort();
            int n4 = this.b[n2].a & 0xFFF;
            if (n4 == 0) continue;
            boolean bl3 = bl2 = (this.b[n2].a & 0x1000) != 0;
            if (bl2) {
                this.b[n2].c = new s();
                this.b[n2].c.a = dataInputStream.readShort();
                this.b[n2].c.b = new char[n4];
                for (n3 = 0; n3 < n4; ++n3) {
                    this.b[n2].c.b[n3] = dataInputStream.readChar();
                }
                continue;
            }
            this.b[n2].b = new p[n4];
            for (n3 = 0; n3 < n4; ++n3) {
                this.b[n2].b[n3] = new p(dataInputStream.readChar(), dataInputStream.readShort());
            }
        }
    }

    public int a(CharacterIterator characterIterator, int n2, int[] arrn, int[] arrn2, int n3) {
        r r2 = this.a(this.a.d);
        int n4 = 0;
        char c2 = characterIterator.current();
        int n5 = 0;
        boolean bl2 = false;
        block0: while (r2 != null) {
            int n6;
            p[] arrp;
            int n7;
            if (n3 > 0 && (r2.a & 0x2000) != 0) {
                arrn[n4++] = n5;
                --n3;
            }
            if (n5 >= n2 || (n7 = r2.a & 0xFFF) == 0) break;
            if ((r2.a & 0x1000) != 0) {
                arrp = r2.c;
                for (n6 = 0; n6 < n7 && n5 < n2; ++n5, ++n6) {
                    if (c2 != arrp.b[n6]) {
                        bl2 = true;
                        break;
                    }
                    characterIterator.next();
                    c2 = characterIterator.current();
                }
                if (bl2) break;
                r2 = this.a(arrp.a);
                continue;
            }
            arrp = r2.b;
            n6 = 0;
            int n8 = n7 - 1;
            r2 = null;
            while (n8 >= n6) {
                int n9 = n8 + n6 >>> 1;
                if (c2 == arrp[n9].a) {
                    r2 = this.a(arrp[n9].b);
                    characterIterator.next();
                    c2 = characterIterator.current();
                    ++n5;
                    continue block0;
                }
                if (c2 < arrp[n9].a) {
                    n8 = n9 - 1;
                    continue;
                }
                n6 = n9 + 1;
            }
        }
        arrn2[0] = n4;
        return n5;
    }
}

