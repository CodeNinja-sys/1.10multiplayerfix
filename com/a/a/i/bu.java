/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.i;

import com.a.a.b.cl;
import com.a.a.i.by;
import java.io.InputStream;

final class bu
extends InputStream {
    final /* synthetic */ by a;

    bu(by by2) {
        this.a = by2;
    }

    @Override
    public int read() {
        return this.a.a();
    }

    @Override
    public int read(byte[] arrby, int n2, int n3) {
        cl.a(arrby);
        cl.a(n2, n2 + n3, arrby.length);
        if (n3 == 0) {
            return 0;
        }
        int n4 = this.read();
        if (n4 == -1) {
            return -1;
        }
        arrby[n2] = (byte)n4;
        for (int i2 = 1; i2 < n3; ++i2) {
            int n5 = this.read();
            if (n5 == -1) {
                return i2;
            }
            arrby[n2 + i2] = (byte)n5;
        }
        return n3;
    }

    @Override
    public void close() {
        this.a.b();
    }
}

