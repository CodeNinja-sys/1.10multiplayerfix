/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opencl;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.util.ArrayList;
import java.util.List;
import org.lwjgl.BufferUtils;
import org.lwjgl.a;
import org.lwjgl.o;
import org.lwjgl.opencl.CL10;
import org.lwjgl.opencl.CallbackUtil;
import org.lwjgl.opencl.a.b;
import org.lwjgl.opencl.a.c;
import org.lwjgl.opencl.ab;
import org.lwjgl.opencl.ac;
import org.lwjgl.opencl.ad;
import org.lwjgl.opencl.ae;
import org.lwjgl.opencl.au;
import org.lwjgl.opencl.bk;
import org.lwjgl.opencl.bm;
import org.lwjgl.opencl.ce;
import org.lwjgl.opencl.d;
import org.lwjgl.opengl.eh;
import org.lwjgl.x;

final class bo
extends bk
implements ac {
    private bo() {
    }

    protected int a(ab ab2, int n2, ByteBuffer byteBuffer, x x2) {
        return CL10.a(ab2, n2, byteBuffer, x2);
    }

    public List a(ab ab2) {
        x x2;
        int n2;
        ab2.c();
        if (org.lwjgl.opencl.x.a((au)((au)ab2.m())).c) {
            n2 = this.a(ab2, 4227);
        } else {
            x2 = d.g();
            CL10.a(ab2, 4225, null, x2);
            n2 = (int)(x2.d(0) / (long)x.c());
        }
        x2 = d.b(n2);
        CL10.a(ab2, 4225, x2.a(), null);
        ArrayList<ae> arrayList = new ArrayList<ae>(n2);
        for (int i2 = 0; i2 < n2; ++i2) {
            arrayList.add(((au)ab2.m()).b(x2.d(i2)));
        }
        return arrayList.size() == 0 ? null : arrayList;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public ab a(au au2, List list, ad ad2, eh eh2, IntBuffer intBuffer) {
        int n2 = 2 + (eh2 == null ? 0 : 4) + 1;
        x x2 = d.b(n2 + list.size());
        x2.a(4228L).a(au2);
        if (eh2 != null) {
            eh2.a(x2);
        }
        x2.a(0L);
        x2.a(n2);
        for (ae ae2 : list) {
            x2.a(ae2);
        }
        long l2 = org.lwjgl.opencl.x.n;
        a.a(l2);
        if (intBuffer != null) {
            a.a(intBuffer, 1);
        } else if (org.lwjgl.d.i) {
            intBuffer = d.b();
        }
        long l3 = ad2 == null || ad2.d() ? 0L : CallbackUtil.a(ad2);
        ab ab2 = null;
        try {
            ab2 = new ab(CL10.nclCreateContext(o.a((Buffer)x2.a()), list.size(), o.a(x2, n2), ad2 == null ? 0L : ad2.a(), l3, o.b(intBuffer), l2), au2);
            if (org.lwjgl.d.i) {
                ce.a(intBuffer.get(0));
            }
            ab ab3 = ab2;
            return ab3;
        }
        finally {
            if (ab2 != null) {
                ab2.f(l3);
            }
        }
    }

    public ab a(au au2, long l2, ad ad2, eh eh2, IntBuffer intBuffer) {
        int n2 = 2 + (eh2 == null ? 0 : 4) + 1;
        x x2 = d.b(n2);
        x2.a(4228L).a(au2);
        if (eh2 != null) {
            eh2.a(x2);
        }
        x2.a(0L);
        x2.k();
        return CL10.a(x2, l2, ad2, intBuffer);
    }

    public List a(ab ab2, long l2, int n2, c c2) {
        IntBuffer intBuffer = d.b();
        CL10.a(ab2, l2, n2, null, intBuffer);
        int n3 = intBuffer.get(0);
        if (n3 == 0) {
            return null;
        }
        ByteBuffer byteBuffer = BufferUtils.a(n3 * 8);
        CL10.a(ab2, l2, n2, byteBuffer, null);
        ArrayList<b> arrayList = new ArrayList<b>(n3);
        for (int i2 = 0; i2 < n3; ++i2) {
            int n4 = n3 * 8;
            b b2 = new b(byteBuffer.getInt(n4), byteBuffer.getInt(n4 + 4));
            if (c2 != null && !c2.a(b2)) continue;
            arrayList.add(b2);
        }
        return arrayList.size() == 0 ? null : arrayList;
    }

    /* synthetic */ bo(bm bm2) {
        this();
    }
}

