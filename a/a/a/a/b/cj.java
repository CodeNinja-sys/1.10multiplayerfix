/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.b;

import a.a.a.a.b.ch;
import a.a.a.a.b.cq;
import java.util.Arrays;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

final class cj
implements Callable {
    final /* synthetic */ AtomicInteger a;
    final /* synthetic */ int b;
    final /* synthetic */ LinkedBlockingQueue c;
    final /* synthetic */ long[] d;
    final /* synthetic */ int[] e;
    final /* synthetic */ boolean f;
    final /* synthetic */ int[] g;

    cj(AtomicInteger atomicInteger, int n2, LinkedBlockingQueue linkedBlockingQueue, long[] arrl, int[] arrn, boolean bl2, int[] arrn2) {
        this.a = atomicInteger;
        this.b = n2;
        this.c = linkedBlockingQueue;
        this.d = arrl;
        this.e = arrn;
        this.f = bl2;
        this.g = arrn2;
    }

    public Void a() {
        int[] arrn = new int[256];
        int[] arrn2 = new int[256];
        while (true) {
            int n2;
            cq cq2;
            if (this.a.get() == 0) {
                int n3 = this.b;
                while (n3-- != 0) {
                    this.c.add(ch.b);
                }
            }
            if ((cq2 = (cq)this.c.take()) == ch.b) {
                return null;
            }
            int n4 = cq2.a;
            int n5 = cq2.b;
            int n6 = cq2.c;
            int n7 = n6 % 8 == 0 ? 128 : 0;
            int n8 = (7 - n6 % 8) * 8;
            int n9 = n4 + n5;
            while (n9-- != n4) {
                int n10 = (int)(this.d[this.e[n9]] >>> n8 & 0xFFL ^ (long)n7);
                arrn[n10] = arrn[n10] + 1;
            }
            n9 = -1;
            int n11 = n4;
            for (n2 = 0; n2 < 256; ++n2) {
                if (arrn[n2] != 0) {
                    n9 = n2;
                }
                arrn2[n2] = n11 += arrn[n2];
            }
            if (this.f) {
                n2 = n4 + n5;
                while (n2-- != n4) {
                    int n12 = (int)(this.d[this.e[n2]] >>> n8 & 0xFFL ^ (long)n7);
                    int n13 = arrn2[n12] - 1;
                    arrn2[n12] = n13;
                    this.g[n13] = this.e[n2];
                }
                System.arraycopy(this.g, n4, this.e, n4, n5);
                n11 = n4;
                for (n2 = 0; n2 <= n9; ++n2) {
                    if (n6 < 7 && arrn[n2] > 1) {
                        if (arrn[n2] < 1024) {
                            ch.a(this.e, this.d, n11, n11 + arrn[n2], this.f);
                        } else {
                            this.a.incrementAndGet();
                            this.c.add(new cq(n11, arrn[n2], n6 + 1));
                        }
                    }
                    n11 += arrn[n2];
                }
                Arrays.fill(arrn, 0);
            } else {
                n2 = n4 + n5 - arrn[n9];
                int n14 = -1;
                for (n11 = n4; n11 <= n2; n11 += arrn[n14]) {
                    int n15 = this.e[n11];
                    n14 = (int)(this.d[n15] >>> n8 & 0xFFL ^ (long)n7);
                    if (n11 < n2) {
                        while (true) {
                            int n16 = n14;
                            int n17 = arrn2[n16] - 1;
                            arrn2[n16] = n17;
                            int n18 = n17;
                            if (n17 <= n11) break;
                            int n19 = n15;
                            n15 = this.e[n18];
                            this.e[n18] = n19;
                            n14 = (int)(this.d[n15] >>> n8 & 0xFFL ^ (long)n7);
                        }
                        this.e[n11] = n15;
                    }
                    if (n6 < 7 && arrn[n14] > 1) {
                        if (arrn[n14] < 1024) {
                            ch.a(this.e, this.d, n11, n11 + arrn[n14], this.f);
                        } else {
                            this.a.incrementAndGet();
                            this.c.add(new cq(n11, arrn[n14], n6 + 1));
                        }
                    }
                    arrn[n14] = 0;
                }
            }
            this.a.decrementAndGet();
        }
    }

    public /* synthetic */ Object call() {
        return this.a();
    }
}

