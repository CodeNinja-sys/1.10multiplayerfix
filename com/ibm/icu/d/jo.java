/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.d;

import com.ibm.icu.d.jd;
import java.io.DataInputStream;
import java.io.DataOutputStream;

class jo {
    private int[] b = new int[6];
    static final /* synthetic */ boolean a;

    public jo() {
    }

    public jo(DataInputStream dataInputStream) {
        for (int i2 = 0; i2 < this.b.length; ++i2) {
            this.b[i2] = dataInputStream.readInt();
        }
    }

    public void a(DataOutputStream dataOutputStream) {
        for (int i2 = 0; i2 < this.b.length; ++i2) {
            dataOutputStream.writeInt(this.b[i2]);
        }
    }

    public boolean a(jo jo2) {
        for (int i2 = 0; i2 < this.b.length; ++i2) {
            if (this.b[i2] == jo2.b[i2]) continue;
            return false;
        }
        return true;
    }

    public void a(int n2) {
        int n3 = n2 / 32;
        int n4 = 1 << (n2 & 0x1F);
        if (!a && n3 >= this.b.length * 4 * 4) {
            throw new AssertionError();
        }
        int n5 = n3;
        this.b[n5] = this.b[n5] | n4;
    }

    public void b(jo jo2) {
        for (int i2 = 0; i2 < this.b.length; ++i2) {
            int n2 = i2;
            this.b[n2] = this.b[n2] | jo2.b[i2];
        }
    }

    public void c(jo jo2) {
        for (int i2 = 0; i2 < this.b.length; ++i2) {
            int n2 = i2;
            this.b[n2] = this.b[n2] & jo2.b[i2];
        }
    }

    public void b(int n2) {
        int n3;
        int n4 = n2 / 32;
        int n5 = 1 << (n2 & 0x1F);
        if (!a && n4 >= this.b.length * 4 * 4) {
            throw new AssertionError();
        }
        for (n3 = 0; n3 < n4; ++n3) {
            this.b[n3] = 0;
        }
        int n6 = n4;
        this.b[n6] = this.b[n6] & n5;
        for (n3 = n4 + 1; n3 < this.b.length; ++n3) {
            this.b[n3] = 0;
        }
    }

    public void a() {
        for (int i2 = 0; i2 < this.b.length; ++i2) {
            this.b[i2] = -1;
        }
    }

    public void b() {
        for (int i2 = 0; i2 < this.b.length; ++i2) {
            this.b[i2] = 0;
        }
    }

    public int c() {
        int n2 = 0;
        for (int i2 = 0; i2 < this.b.length; ++i2) {
            for (int i3 = this.b[i2]; i3 != 0; i3 &= i3 - 1) {
                ++n2;
            }
        }
        return n2;
    }

    static {
        a = !jd.class.desiredAssertionStatus();
    }
}

