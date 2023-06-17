/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opencl;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.util.ArrayList;
import java.util.List;
import org.lwjgl.opencl.CL10;
import org.lwjgl.opencl.a.c;
import org.lwjgl.opencl.ae;
import org.lwjgl.opencl.au;
import org.lwjgl.opencl.av;
import org.lwjgl.opencl.bk;
import org.lwjgl.opencl.bm;
import org.lwjgl.opencl.d;
import org.lwjgl.x;

final class bt
extends bk
implements av {
    private bt() {
    }

    protected int a(au au2, int n2, ByteBuffer byteBuffer, x x2) {
        return CL10.a(au2, n2, byteBuffer, x2);
    }

    public List a(c c2) {
        IntBuffer intBuffer = d.b();
        CL10.a(null, intBuffer);
        int n2 = intBuffer.get(0);
        if (n2 == 0) {
            return null;
        }
        x x2 = d.b(n2);
        CL10.a(x2, null);
        ArrayList<au> arrayList = new ArrayList<au>(n2);
        for (int i2 = 0; i2 < n2; ++i2) {
            au au2 = au.a(x2.d(i2));
            if (c2 != null && !c2.a(au2)) continue;
            arrayList.add(au2);
        }
        return arrayList.size() == 0 ? null : arrayList;
    }

    public List a(au au2, int n2, c c2) {
        au2.c();
        IntBuffer intBuffer = d.b();
        CL10.a(au2, (long)n2, null, intBuffer);
        int n3 = intBuffer.get(0);
        if (n3 == 0) {
            return null;
        }
        x x2 = d.b(n3);
        CL10.a(au2, (long)n2, x2, null);
        ArrayList<ae> arrayList = new ArrayList<ae>(n3);
        for (int i2 = 0; i2 < n3; ++i2) {
            ae ae2 = au2.b(x2.d(i2));
            if (c2 != null && !c2.a(ae2)) continue;
            arrayList.add(ae2);
        }
        return arrayList.size() == 0 ? null : arrayList;
    }

    /* synthetic */ bt(bm bm2) {
        this();
    }
}

