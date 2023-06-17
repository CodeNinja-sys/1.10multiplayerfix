/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.a;

import a.a.a.a.a.ci;
import a.a.a.a.f;
import java.io.Serializable;
import java.util.Arrays;

final class cl
implements f,
Serializable {
    private static final long a = -7046029254386353129L;

    private cl() {
    }

    public int a(int[] arrn) {
        return Arrays.hashCode(arrn);
    }

    public boolean a(int[] arrn, int[] arrn2) {
        return Arrays.equals(arrn, arrn2);
    }

    /* synthetic */ cl(ci ci2) {
        this();
    }
}

