/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.d;

import java.io.DataInputStream;
import java.io.DataOutputStream;

class jr {
    int a;
    byte[] b = new byte[4];
    int c;
    int d;
    int e;
    int f;
    int g;
    int h;
    int i;
    int j;
    int k;
    int l;
    int m;
    int n;
    int o;
    int p;
    int q;
    int[] r = new int[15];

    public jr() {
    }

    public jr(DataInputStream dataInputStream) {
        int n2;
        this.a = dataInputStream.readInt();
        for (n2 = 0; n2 < this.b.length; ++n2) {
            this.b[n2] = dataInputStream.readByte();
        }
        this.c = dataInputStream.readInt();
        this.d = dataInputStream.readInt();
        this.e = dataInputStream.readInt();
        this.f = dataInputStream.readInt();
        this.g = dataInputStream.readInt();
        this.h = dataInputStream.readInt();
        this.i = dataInputStream.readInt();
        this.j = dataInputStream.readInt();
        this.k = dataInputStream.readInt();
        this.l = dataInputStream.readInt();
        this.m = dataInputStream.readInt();
        this.n = dataInputStream.readInt();
        this.o = dataInputStream.readInt();
        this.p = dataInputStream.readInt();
        this.q = dataInputStream.readInt();
        for (n2 = 0; n2 < this.r.length; ++n2) {
            this.r[n2] = dataInputStream.readInt();
        }
    }

    public void a(DataOutputStream dataOutputStream) {
        int n2;
        dataOutputStream.writeInt(this.a);
        for (n2 = 0; n2 < this.b.length; ++n2) {
            dataOutputStream.writeByte(this.b[n2]);
        }
        dataOutputStream.writeInt(this.c);
        dataOutputStream.writeInt(this.d);
        dataOutputStream.writeInt(this.e);
        dataOutputStream.writeInt(this.f);
        dataOutputStream.writeInt(this.g);
        dataOutputStream.writeInt(this.h);
        dataOutputStream.writeInt(this.i);
        dataOutputStream.writeInt(this.j);
        dataOutputStream.writeInt(this.k);
        dataOutputStream.writeInt(this.l);
        dataOutputStream.writeInt(this.m);
        dataOutputStream.writeInt(this.n);
        dataOutputStream.writeInt(this.o);
        dataOutputStream.writeInt(this.p);
        dataOutputStream.writeInt(this.q);
        for (n2 = 0; n2 < this.r.length; ++n2) {
            dataOutputStream.writeInt(this.r[n2]);
        }
    }
}

