/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.b;

import a.a.a.a.b.ci;
import a.a.a.a.f;
import java.io.Serializable;
import java.util.Arrays;

final class cl
implements f,
Serializable {
    private static final long a = -7046029254386353129L;

    private cl() {
    }

    public int a(long[] arrl) {
        return Arrays.hashCode(arrl);
    }

    public boolean a(long[] arrl, long[] arrl2) {
        return Arrays.equals(arrl, arrl2);
    }

    /* synthetic */ cl(ci ci2) {
        this();
    }
}

